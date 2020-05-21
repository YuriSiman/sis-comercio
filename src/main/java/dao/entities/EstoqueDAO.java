package dao.entities;

import dao.generic.DAO;
import model.entities.Estoque;

public class EstoqueDAO extends DAO<Estoque> {

	public EstoqueDAO() {
		super(Estoque.class);
	}
}
