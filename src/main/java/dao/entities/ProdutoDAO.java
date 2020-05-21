package dao.entities;

import dao.generic.DAO;
import model.entities.Produto;

public class ProdutoDAO extends DAO<Produto> {

	public ProdutoDAO() {
		super(Produto.class);
	}
}
