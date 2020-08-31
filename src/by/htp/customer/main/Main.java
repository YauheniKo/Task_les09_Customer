package by.htp.customer.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import by.htp.customer.entity.Customer;
import by.htp.customer.entity.CustomerList;
import by.htp.customer.logic.Logic;
import by.htp.customer.print.Print;

//(int id, String firstName, String 
//lasttName, String adress, int numCrCard, int numBankCard
public class Main {
	public static void main(String[] args) {
		CustomerList customerList = new CustomerList();
		List<Customer> list = new ArrayList<Customer>();

		customerList.add(new Customer(5, "AnDron", "ADronov", "Vinsk", 40, 342));
		customerList.add(new Customer(1, "Bob", "Bobikov", "Minsk", 10, 20));
		customerList.add(new Customer(2, "Jhon", "Jhonov", "Pinsk", 20, 25));
		customerList.add(new Customer(3, "Dron", "Dronov", "Vinsk", 50, 342));

		Logic logic = new Logic();
		List<Customer> alfaList = logic.alfavit(customerList.getCustomersList());

		Print print = new Print();
		print.printCust(alfaList);

		List<Customer> cardNum = logic.cardNum(customerList, 0, 30);
		print.printCust(cardNum);
		print.printCust(customerList.getCustomersList());

	}

}
