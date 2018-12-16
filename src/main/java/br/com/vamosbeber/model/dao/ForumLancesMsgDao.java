package br.com.vamosbeber.model.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import br.com.vamosbeber.model.bean.ForumLancesMsgBean;

/**
 * Classe de persistencia do Forum_Lances_Msg
 * @author Alexsandre Rodrigues
 *
 */


@Repository
public class ForumLancesMsgDao {

	@PersistenceContext
	private EntityManager em;


	public void adiciona(ForumLancesMsgBean forumMsg) {
		em.persist(forumMsg);
	}
	
	public void atualiza(ForumLancesMsgBean forumMsg) {
		em.merge(forumMsg);
	}
}
