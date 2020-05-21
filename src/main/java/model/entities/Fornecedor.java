package model.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("FR")
public class Fornecedor extends Pessoa implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String cnpj;
	private String razaoSocial;
	private Double custo;
	private Integer tempoFidelidade;
	private Integer totalVendas;
	
	public Fornecedor() {
	}

	public Fornecedor(String nome, String cpf, String email, String celular, String telefone, String sexo,
			Date dataNascimento, String cnpj, String razaoSocial, Double custo, Integer tempoFidelidade, Integer totalVendas) {
		super(nome, cpf, email, celular, telefone, sexo, dataNascimento);
		this.cnpj = cnpj;
		this.razaoSocial = razaoSocial;
		this.custo = custo;
		this.tempoFidelidade = tempoFidelidade;
		this.totalVendas = totalVendas;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public Double getCusto() {
		return custo;
	}

	public void setCusto(Double custo) {
		this.custo = custo;
	}

	public Integer getTempoFidelidade() {
		return tempoFidelidade;
	}

	public void setTempoFidelidade(Integer tempoFidelidade) {
		this.tempoFidelidade = tempoFidelidade;
	}

	public Integer getTotalVendas() {
		return totalVendas;
	}

	public void setTotalVendas(Integer totalVendas) {
		this.totalVendas = totalVendas;
	}
}
