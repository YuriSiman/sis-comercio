package model.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class Venda implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer id;
	
	private Cliente cliente;
	
	private Vendedor vendedor;
	
	private String formaPagamento;
	private Integer totalProdutosVendidos;
	private Double valorTotal;
	private Date dataVenda;
	
	private List<ItemVenda> itensVenda;
	
	public Venda() {
	}

	public Venda(Cliente cliente, Vendedor vendedor, String formaPagamento, Integer totalProdutosVendidos,
			Double valorTotal) {
		super();
		this.cliente = cliente;
		this.vendedor = vendedor;
		this.formaPagamento = formaPagamento;
		this.totalProdutosVendidos = totalProdutosVendidos;
		this.valorTotal = valorTotal;
		this.dataVenda = new Date();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Vendedor getVendedor() {
		return vendedor;
	}

	public void setVendedor(Vendedor vendedor) {
		this.vendedor = vendedor;
	}

	public String getFormaPagamento() {
		return formaPagamento;
	}

	public void setFormaPagamento(String formaPagamento) {
		this.formaPagamento = formaPagamento;
	}

	public Integer getTotalProdutosVendidos() {
		return totalProdutosVendidos;
	}

	public void setTotalProdutosVendidos(Integer totalProdutosVendidos) {
		this.totalProdutosVendidos = totalProdutosVendidos;
	}

	public Double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(Double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public Date getDataVenda() {
		return dataVenda;
	}

	public void setDataVenda(Date dataVenda) {
		this.dataVenda = dataVenda;
	}

	public List<ItemVenda> getItensVenda() {
		return itensVenda;
	}
}
