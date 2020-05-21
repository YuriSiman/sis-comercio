package dao.entities;

import javax.persistence.TypedQuery;

import dao.generic.DAO;
import model.entities.Comprador;
import model.exceptions.DomainException;

public class CompradorDAO extends DAO<Comprador>{

	public CompradorDAO() {
		super(Comprador.class);
	}
	
	public Comprador findByCpf(String cpf) throws DomainException{
		if(Comprador.class == null) {
			throw new DomainException("Classe Nula!");
		}
		TypedQuery<Comprador> query = getEm().createQuery("select c from Comprador c where c.cpf = :number", Comprador.class);
		Comprador comprador = query.setParameter("number", cpf).getSingleResult();
		return comprador;
	}
}
