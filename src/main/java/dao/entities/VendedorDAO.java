package dao.entities;

import javax.persistence.TypedQuery;

import dao.generic.DAO;
import model.entities.Vendedor;
import model.exceptions.DomainException;

public class VendedorDAO extends DAO<Vendedor> {

	public VendedorDAO() {
		super(Vendedor.class);
	}
	
	public Vendedor findByCpf(String cpf) throws DomainException{
		if(Vendedor.class == null) {
			throw new DomainException("Classe Nula!");
		}
		TypedQuery<Vendedor> query = getEm().createQuery("select v from Vendedor v where v.cpf = :number", Vendedor.class);
		Vendedor vendedor = query.setParameter("number", cpf).getSingleResult();
		return vendedor;
	}
}
