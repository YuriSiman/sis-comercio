package model.entities;

import java.io.Serializable;

public class ItemVenda implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Integer id;
	
	private Venda venda;
	
	private Produto produto;
	
	private Double preco;
	
	public ItemVenda() {
	}

	public ItemVenda(Venda venda, Produto produto) {
		super();
		this.setVenda(venda);
		this.setProduto(produto);
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Venda getVenda() {
		return venda;
	}

	public void setVenda(Venda venda) {
		this.venda = venda;
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
