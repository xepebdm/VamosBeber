package br.com.vamosbeber.model.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import br.com.vamosbeber.model.bean.EnderecoBean;

/**
 * Classe de persistencia do endereco da pessoa
 * 
 * @author Alexsandre Rodrigues
 *
 */

@Repository
public class EnderecoDao {
	
	@PersistenceContext
	private EntityManager em;


	public void adiciona(EnderecoBean endereco) {
		em.persist(endereco);
	}

	public void atualiza(EnderecoBean endereco) {
		em.merge(endereco);
	}
}