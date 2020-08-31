package by.htp.customer.print;

import java.util.ArrayList;
import java.util.List;

import by.htp.customer.entity.Customer;
import by.htp.customer.entity.CustomerList;

public class Print {

	public void printCust(List<Customer> list) {

		for (Customer lists : list) {
			System.out.print(lists.getFirstName() + " ");
		}
		System.out.println();
	}
}
