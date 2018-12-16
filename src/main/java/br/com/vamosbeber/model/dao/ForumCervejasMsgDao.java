package br.com.vamosbeber.model.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import br.com.vamosbeber.model.bean.ForumCervejasMsgBean;


/**
 * Classe de persistencia da tabela Forum_Cervejas_Msg
 * @author Alexsandre Rodrigues
 *
 */

@Repository
public class ForumCervejasMsgDao {
	
	@PersistenceContext
	private EntityManager em;

	
	public void adiciona(ForumCervejasMsgBean forumMsg) {
		em.persist(forumMsg);
	}
	
	public void atualiza(ForumCervejasMsgBean forumMsg) {
		em.merge(forumMsg);
	}

}