package model.entities;

import java.io.Serializable;
import java.util.Date;

public class Usuario implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer id;
	
	private String nomeUsuario;
	private String email;
	private String senha;
	private Date dataCadastro;
	
	public Usuario() {
	}

	public Usuario(Integer id, String nomeUsuario, String email, String senha) {
		this.id = id;
		this.nomeUsuario = nomeUsuario;
		this.email = email;
		this.senha = senha;
		this.dataCadastro = new Date();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNomeUsuario() {
		return nomeUsuario;
	}

	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Date getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}
}
