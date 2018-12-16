package br.com.vamosbeber.model.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import br.com.vamosbeber.model.bean.ForumEventosMsgBean;

/**
 * Classe de persistencia do Forum_Eventos_Msg
 * @author Alexsandre Rodrigues
 *
 */

@Repository
public class ForumEventosMsgDao {
	
	@PersistenceContext
	private EntityManager em;

	
	public void adiciona(ForumEventosMsgBean forumMSg) {
		em.persist(forumMSg);
	}
	
	public void atualiza(ForumEventosMsgBean forumMsg) {
		em.merge(forumMsg);
	}

}