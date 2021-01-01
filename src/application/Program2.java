package application;

import java.util.List;
import java.util.Scanner;

import db.DB;
import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {

		DepartmentDao depDao = DaoFactory.createDepartmentDao();
		Scanner sc = new Scanner(System.in);

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

		System.out.println("\n=== TEST 5: Delete update ====");
		dep = depDao.findById(1);
		dep.setName("TI");
		depDao.update(dep);
		System.out.println("Update Completed!");
		
//		System.out.println("\n=== TEST 6: Seller delete ====");
//		System.out.print("Enter ID for delete test: ");
//		int id = sc.nextInt();
//		sellerDao.deleteById(id);
//		System.out.println("Delete Seller: ");
		
		System.out.println("\n=== TEST 6: Department delete ====");
		System.out.print("Enter ID for delete test: ");
		int id = sc.nextInt();
		depDao.deleteById(id);
		System.out.println("Delete Department");

		sc.close();
		DB.closeConnection();

	}

}
