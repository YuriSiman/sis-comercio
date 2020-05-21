package model.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("CP")
public class Comprador extends Funcionario implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer totalCompras;
	
	public Comprador() {
	}

	public Comprador(String nome, String cpf, String email, String celular, String telefone, String sexo,
			Date dataNascimento, String departamento, String nivel, Double salario, Date dataAdmissao, Integer totalCompras) {
		super(nome, cpf, email, celular, telefone, sexo, dataNascimento, departamento, nivel, salario, dataAdmissao);
		this.totalCompras = totalCompras;
	}

	public Integer getTotalCompras() {
		return totalCompras;
	}

	public void setTotalCompras(Integer totalCompras) {
		this.totalCompras = totalCompras;
	}
}
