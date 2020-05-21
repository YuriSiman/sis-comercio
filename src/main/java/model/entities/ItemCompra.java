package model.entities;

import java.io.Serializable;

public class ItemCompra implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Integer id;
	
	private Compra compra;
	
	private Produto produto;
	
	private Double preco;
	
	public ItemCompra() {
	}

	public ItemCompra(Compra compra, Produto produto) {
		this.setCompra(compra);
		this.setProduto(produto);
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Compra getCompra() {
		return compra;
	}

	public void setCompra(Compra compra) {
		this.compra = compra;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
		if(produto != null && this.preco == null) {
			this.setPreco(produto.getPrecoUnitario());
		}
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

}
