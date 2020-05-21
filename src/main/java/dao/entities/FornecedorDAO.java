package dao.entities;

import java.util.List;

import javax.persistence.TypedQuery;

import dao.generic.DAO;
import model.entities.Fornecedor;
import model.exceptions.DomainException;

public class FornecedorDAO extends DAO<Fornecedor> {

	public FornecedorDAO() {
		super(Fornecedor.class);
	}
	
	public List<Fornecedor> custoCresc() throws DomainException{
		if(Fornecedor.class == null) {
			throw new DomainException("Classe Nula!");
		}
		TypedQuery<Fornecedor> query = getEm().createQuery("select f from Fornecedor f order by f.custo", Fornecedor.class);
		return query.getResultList();
	}
	
	public List<Fornecedor> custoDecresc() throws DomainException{
		if(Fornecedor.class == null) {
			throw new DomainException("Classe Nula!");
		}
		TypedQuery<Fornecedor> query = getEm().createQuery("select f from Fornecedor f order by f.custo desc", Fornecedor.class);
		return query.getResultList();
	}
	
	public Fornecedor findByCnpj(String cnpj) throws DomainException{
		if(Fornecedor.class == null) {
			throw new DomainException("Classe Nula!");
		}
		TypedQuery<Fornecedor> query = getEm().createQuery("select f from Fornecedor f where f.cnpj = :number", Fornecedor.class);
		Fornecedor fornecedor = query.setParameter("number", cnpj).getSingleResult();
		return fornecedor;
	}
}
