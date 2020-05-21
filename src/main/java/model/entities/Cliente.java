package model.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("CL")
public class Cliente extends Pessoa implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Double limiteCredito;
	private Integer tempoFidelidade;
	private Integer totalCompras;
	
	public Cliente() {
	}

	public Cliente(String nome, String cpf, String email, String celular, String telefone, String sexo,
			Date dataNascimento, Double limiteCredito, Integer tempoFidelidade, Integer totalCompras) {
		super(nome, cpf, email, celular, telefone, sexo, dataNascimento);
		this.limiteCredito = limiteCredito;
		this.tempoFidelidade = tempoFidelidade;
		this.totalCompras = totalCompras;
	}

	public Double getLimiteCredito() {
		return limiteCredito;
	}

	public void setLimiteCredito(Double limiteCredito) {
		this.limiteCredito = limiteCredito;
	}

	public Integer getTempoFidelidade() {
		return tempoFidelidade;
	}

	public void setTempoFidelidade(Integer tempoFidelidade) {
		this.tempoFidelidade = tempoFidelidade;
	}

	public Integer getTotalCompras() {
		return totalCompras;
	}

	public void setTotalCompras(Integer totalCompras) {
		this.totalCompras = totalCompras;
	}
}
