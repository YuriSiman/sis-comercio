package model.entities;

import java.io.Serializable;

public class Estoque implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Integer id;
	
	private String coluna;
	private Integer prateleira;

	public Estoque() {
	}

	public Estoque(String coluna, Integer prateleira) {
		this.coluna = coluna;
		this.prateleira = prateleira;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getColuna() {
		return coluna;
	}

	public void setColuna(String coluna) {
		this.coluna = coluna;
	}

	public Integer getPrateleira() {
		return prateleira;
	}

	public void setPrateleira(Integer prateleira) {
		this.prateleira = prateleira;
	}
}
