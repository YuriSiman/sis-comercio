package model.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Compra implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	@ManyToOne
	private Fornecedor fornecedor;
	
	@ManyToOne
	private Comprador comprador;
	
	private Integer totalProdutosComprados;
	private Double valorTotal;
	private Date dataCompra;
	
	@OneToMany(mappedBy="compra", fetch=FetchType.EAGER)
	private List<ItemCompra> itensCompra;
	
	public Compra() {
	}

	public Compra(Fornecedor fornecedor, Comprador comprador, Integer totalProdutosComprados,
			Double valorTotal) {
		this.fornecedor = fornecedor;
		this.comprador = comprador;
		this.totalProdutosComprados = totalProdutosComprados;
		this.valorTotal = valorTotal;
		this.dataCompra = new Date();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Fornecedor getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}

	public Comprador getComprador() {
		return comprador;
	}

	public void setComprador(Comprador comprador) {
		this.comprador = comprador;
	}

	public Integer getTotalProdutosComprados() {
		return totalProdutosComprados;
	}

	public void setTotalProdutosComprados(Integer totalProdutosComprados) {
		this.totalProdutosComprados = totalProdutosComprados;
	}

	public Double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(Double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public Date getDataCompra() {
		return dataCompra;
	}

	public void setDataCompra(Date dataCompra) {
		this.dataCompra = dataCompra;
	}

	public List<ItemCompra> getItensCompra() {
		return itensCompra;
	}
}
