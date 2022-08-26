package model.services;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Seller;

public class SellerService {
	
	SellerDao dao = DaoFactory.createSellerDao();
	
	public List<Seller> findAll(){
		return dao.findAll();
	}
	
	public void saveOrUpdate (Seller obj) {
		if (obj.getId() == null) {	//Se o Seller nao tem ID significa que � um department novo
			dao.insert(obj);
		}
		else {						//Se o Seller j� tiver um ID ent�o ele j� existe e so vai atualizar
			dao.update(obj);
		}
	}
	
	public void remove (Seller obj) {
		dao.deleteById(obj.getId());
	}
}
