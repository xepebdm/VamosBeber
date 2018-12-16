package br.com.vamosbeber.model.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import br.com.vamosbeber.model.bean.PessoaBean;

/**
 * Classe de persistencia do objeto Pessoa no banco de dados
 * 
 * @author Alexsandre Rodrigues
 *
 */

@Repository
public class PessoaDao {
	
	@PersistenceContext
	private EntityManager em;
	
	public void adiciona(PessoaBean pessoa) {
		em.persist(pessoa);
	}

	public void atualiza(PessoaBean pessoa) {
		em.merge(pessoa);
	}

}