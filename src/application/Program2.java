package application;

import java.util.List;

import db.DB;
import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {

		DepartmentDao depDao = DaoFactory.createDepartmentDao();

		System.out.println("=== TEST 1: Department findById ====");
		Department dep = depDao.findById(4);
		System.out.println(dep);

		System.out.println("\n=== TEST 3: Department findAll ====");
		List<Department> list = depDao.findAll();
		list.forEach(System.out::println);

		System.out.println("\n=== TEST 4: Department insert ====");
		Department newDep = new Department(null, "Tools");
		System.out.println(newDep);
		depDao.insert(newDep);
		System.out.println("Inserted!");
		System.out.println(newDep);

		DB.closeConnection();

	}

}
