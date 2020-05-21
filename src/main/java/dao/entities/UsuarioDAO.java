package dao.entities;

import javax.persistence.TypedQuery;

import dao.generic.DAO;
import model.entities.Usuario;
import model.exceptions.DomainException;

public class UsuarioDAO extends DAO<Usuario> {

	public UsuarioDAO() {
		super(Usuario.class);
	}
	
	public Usuario findByNameUserEmail(String nomeUsuarioEmail) throws DomainException{
		if(Usuario.class == null) {
			throw new DomainException("Classe Nula!");
		}
		TypedQuery<Usuario> query = getEm().createQuery("select u from UsuarioLogin u where u.nomeUsuario = :number or u.email =:number", Usuario.class);
		Usuario usuario = query.setParameter("number", nomeUsuarioEmail).getSingleResult();
		return usuario;
	}
}
