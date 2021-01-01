package application;

import java.util.List;

import db.DB;
import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {

		DepartmentDao depDao = DaoFactory.createDepartmentDao();

		System.out.println("=== TEST 1: Seller findById ====");
		Department dep = depDao.findById(4);
		System.out.println(dep);

		System.out.println("\n=== TEST 3: Seller findAll ====");
		List<Department> list = depDao.findAll();
		list.forEach(System.out::println);

		DB.closeConnection();

	}

}
