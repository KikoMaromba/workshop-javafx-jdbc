package model.services;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class DepartmentService {
	
	private DepartmentDao dao = DaoFactory.createDepartmentDao();
	
	public List<Department> findALL() {
		return dao.findAll();
	}

	public void SaveOrUpdate(Department obj) {
		if (obj.getId() == null) {
			dao.insert(obj);
		}
		else {
			dao.upDate(obj);
		}
	}
	
	public void remove(Department dep) {
			dao.deletById(dep.getId());
	}
}
