package br.com.vamosbeber.model.dao;

import java.util.Collections;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import br.com.vamosbeber.model.bean.ForumCervejasBean;

@Repository
public class ForumCervejasDao {

	@PersistenceContext
	private EntityManager em;

	private List<ForumCervejasBean> forumCervejas;

	public void adiciona(ForumCervejasBean forum) {
		em.persist(forum);
	}

	public void atualiza(ForumCervejasBean forum) {
		em.merge(forum);
	}

	public List<ForumCervejasBean> lista() {

		try {
			forumCervejas = em.createQuery("from FORUM_CERVEJAS fcb where fcb.cancelado = false", ForumCervejasBean.class)
					.setMaxResults(5)
					.getResultList();
		} catch (NoResultException e) {

			System.out.println("Não existe forum de cervejas ativos");
			e.printStackTrace();
			
		} catch (Exception e) {
			
			System.out.println("Ocorreu um erro");
			e.printStackTrace();
			
		}
		return Collections.unmodifiableList(forumCervejas);
	}

}