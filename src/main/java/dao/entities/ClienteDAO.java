package dao.entities;

import java.util.List;

import javax.persistence.TypedQuery;

import dao.generic.DAO;
import model.entities.Cliente;
import model.exceptions.DomainException;

public class ClienteDAO extends DAO<Cliente> {
	
	public ClienteDAO() {
		super(Cliente.class);
	}
	
	public List<Cliente> limiteCreditoCresc() throws DomainException{
		if(Cliente.class == null) {
			throw new DomainException("Classe Nula!");
		}
		TypedQuery<Cliente> query = getEm().createQuery("select c from Cliente c order by c.limiteCredito", Cliente.class);
		return query.getResultList();
	}
	
	public List<Cliente> limiteCreditoDecresc() throws DomainException{
		if(Cliente.class == null) {
			throw new DomainException("Classe Nula!");
		}
		TypedQuery<Cliente> query = getEm().createQuery("select c from Cliente c order by c.limiteCredito desc", Cliente.class);
		return query.getResultList();
	}
	
	public Cliente findByCpf(String cpf) throws DomainException{
		if(Cliente.class == null) {
			throw new DomainException("Classe Nula!");
		}
		TypedQuery<Cliente> query = getEm().createQuery("select c from Cliente c where c.cpf = :number", Cliente.class);
		Cliente cliente = query.setParameter("number", cpf).getSingleResult();
		return cliente;
	}

}
