package model.entities;

import java.io.Serializable;
import java.util.Date;

public class Vendedor extends Funcionario implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer totalVendas;
	private Double metaMensal;
	
	public Vendedor() {
	}

	public Vendedor(String nome, String cpf, String email, String celular, String telefone, String sexo,
			Date dataNascimento, String departamento, String nivel, Double salario, Date dataAdmissao, Integer totalVendas, Double metaMensal) {
		super(nome, cpf, email, celular, telefone, sexo, dataNascimento, departamento, nivel, salario, dataAdmissao);
		this.totalVendas = totalVendas;
		this.metaMensal = metaMensal;
	}

	public Integer getTotalVendas() {
		return totalVendas;
	}

	public void setTotalVendas(Integer totalVendas) {
		this.totalVendas = totalVendas;
	}

	public Double getMetaMensal() {
		return metaMensal;
	}

	public void setMetaMensal(Double metaMensal) {
		this.metaMensal = metaMensal;
	}
}
