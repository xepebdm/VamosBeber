package br.com.vamosbeber.model.bean;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import br.com.vamosbeber.model.tipos.TipoLance;

/**
 * Classe que representa a tabela FORUM_LANCES
 * @author Alexsandre Rodrigues
 *
 */
@Entity(name = "FORUM_LANCES")
public class ForumLancesBean implements Forum{
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name="assunto")
	private String assunto;
	
	@Column(name = "mensagem")
	private String mensagem;
	
	@Column(name = "cancelado")
	private boolean cancelado;
	
	@Column(name = "tipo")
	private TipoLance tipo;
	
	@Column(name="data")
	private LocalDateTime data;

	@ManyToOne
	private PessoaBean pessoa;
	
	@OneToMany(mappedBy = "forum")
	private List<ForumLancesMsgBean> forumMsg;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAssunto() {
		return assunto;
	}

	public void setAssunto(String assunto) {
		this.assunto = assunto;
	}

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

	public boolean getCancelado() {
		return cancelado;
	}

	public void setCancelado(boolean cancelado) {
		this.cancelado = cancelado;
	}

	public TipoLance getTipo() {
		return tipo;
	}

	public void setTipo(TipoLance tipo) {
		this.tipo = tipo;
	}

	public LocalDateTime getData() {
		return data;
	}

	public void setData(LocalDateTime data) {
		this.data = data;
	}

	public PessoaBean getPessoa() {
		return pessoa;
	}

	public void setPessoa_ID(PessoaBean pessoa_ID) {
		this.pessoa = pessoa_ID;
	}

	public List<ForumLancesMsgBean> getForumMsg() {
		return forumMsg;
	}

	public void setForumMsg(List<ForumLancesMsgBean> forumMsg) {
		this.forumMsg = forumMsg;
	}
	
	
}
