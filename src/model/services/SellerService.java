package model.services;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Seller;

public class SellerService {
	
	private SellerDao dao = DaoFactory.createSellerDao();
	
	public List<Seller> findALL() {
		return dao.findAll();
	}

	public void SaveOrUpdate(Seller obj) {
		if (obj.getId() == null) {
			dao.insert(obj);
		}
		else {
			dao.upDate(obj);
		}
	}
	
	public void remove(Seller seller) {
			dao.deleteById(seller.getId());
	}
}
