package dao.generic;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import model.exceptions.DomainException;

public class DAO<E> {

	private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("db-sis-comercio");
	private EntityManager em;
	private Class<E> classe;
	
	public DAO() {
		this(null);
	}
	
	public DAO(Class<E> classe) {
		this.classe = classe;
		em = emf.createEntityManager();
	}
	
	public void save(E entidade) {
		try {
			em.getTransaction().begin();
			em.persist(entidade);
			em.getTransaction().commit();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			em.getTransaction().rollback();
		} finally {
			em.close();
		}
	}
	
	public List<E> findAll() throws DomainException{
		if(classe == null) {
			throw new DomainException("Classe Nula!");
		}
		TypedQuery<E> query = em.createQuery("select e from "+classe.getName()+" e", classe);
		return query.getResultList();
	}

	public E findById(Integer id) {
		E entidade = null;
		try {
			entidade = em.find(classe, id);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			em.close();
		}
		return entidade;
	}

	public void update(E entidade) {
		try {
			em.getTransaction().begin();
			em.merge(entidade);
			em.getTransaction().commit();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			em.getTransaction().rollback();
		} finally {
			em.close();
		}
	}

	public void delete(Integer id) {
		E entidade = null;
		try {
			entidade = em.find(classe, id);
			if (entidade != null) {
				em.getTransaction().begin();
				em.remove(entidade);
				em.getTransaction().commit();
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			em.getTransaction().rollback();
		} finally {
			em.close();
		}
	}
	
	public List<E> returnQuantity(Integer qtd) throws DomainException{
		if(classe == null) {
			throw new DomainException("Classe Nula!");
		}
		TypedQuery<E> query = em.createQuery("select e from "+classe.getName()+" e", classe);
		query.setMaxResults(qtd);
		return query.getResultList();
	}
	
	public List<E> sortByName() throws DomainException{
		if(classe == null) {
			throw new DomainException("Classe Nula!");
		}
		TypedQuery<E> query = em.createQuery("select e from "+classe.getName()+" e order by e.nome", classe);
		return query.getResultList();
	}
	
	public static EntityManagerFactory getEmf() {
		return emf;
	}

	public static void setEmf(EntityManagerFactory emf) {
		DAO.emf = emf;
	}

	public EntityManager getEm() {
		return em;
	}

	public void setEm(EntityManager em) {
		this.em = em;
	}

	public Class<E> getClasse() {
		return classe;
	}

	public void setClasse(Class<E> classe) {
		this.classe = classe;
	}
}
