package br.com.vamosbeber.model.dao;

import java.util.Collections;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import br.com.vamosbeber.model.bean.ForumEventosBean;

/**
 * Classe de persistencia do Forum_Eventos
 * 
 * @author Alexsandre Rodrigues
 *
 */

@Repository
public class ForumEventosDao {

	@PersistenceContext
	private EntityManager em;

	private List<ForumEventosBean> listaEventos;

	public void adiciona(ForumEventosBean forum) {
		em.persist(forum);
	}

	public void atualiza(ForumEventosBean forum) {
		em.merge(forum);
	}

	public List<ForumEventosBean> lista() {

		try {
			listaEventos = em.createQuery("from FORUM_EVENTOS feb where feb.cancelado = false", ForumEventosBean.class)
					.setMaxResults(5)
					.getResultList();

		} catch (NoResultException e) {
			System.out.println("Nenhum resultado para Eventos ativo foi encontrado");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("Erro generico aconteceu");
			e.printStackTrace();
		}

		return Collections.unmodifiableList(listaEventos);
	}
}