package application;

import java.time.LocalDate;
import java.time.Month;

import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {

		Department d1 = new Department(1, "TI");
		System.out.println(d1);

		Seller seller = new Seller(1, "Bob", "bob@gmail.com", LocalDate.of(1984, Month.JANUARY, 25), 3000.0, d1);
		System.out.println(seller);

	}

}
