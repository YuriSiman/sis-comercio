package model.entities;

import java.io.Serializable;
import java.util.Date;

public class Funcionario extends Pessoa implements Serializable {

	private static final long serialVersionUID = 1L;

	private String departamento;
	private String nivel;
	private Double salario;
	private Date dataAdmissao;
	
	public Funcionario() {
	}

	public Funcionario(String nome, String cpf, String email, String celular, String telefone, String sexo,
			Date dataNascimento, String departamento, String nivel, Double salario, Date dataAdmissao) {
		super(nome, cpf, email, celular, telefone, sexo, dataNascimento);
		this.departamento = departamento;
		this.nivel = nivel;
		this.salario = salario;
		this.dataAdmissao = dataAdmissao;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public String getNivel() {
		return nivel;
	}

	public void setNivel(String nivel) {
		this.nivel = nivel;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public Date getDataAdmissao() {
		return dataAdmissao;
	}

	public void setDataAdmissao(Date dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}
}
