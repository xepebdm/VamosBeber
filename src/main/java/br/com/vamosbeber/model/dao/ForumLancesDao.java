package br.com.vamosbeber.model.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import br.com.vamosbeber.model.bean.ForumLancesBean;

@Repository
public class ForumLancesDao {

	@PersistenceContext
	private EntityManager em;

	public void adiciona(ForumLancesBean forum) {
		em.persist(forum);
	}

	public void atualiza(ForumLancesBean forum, int id) {
		ForumLancesBean otherForum = forum;
		otherForum.setId(id);
		em.persist(otherForum);
	}

	public List<ForumLancesBean> getLances() {
		return em.createQuery("from FORUM_LANCES f where f.cancelado = false", ForumLancesBean.class).setMaxResults(5).getResultList();
	}
}
