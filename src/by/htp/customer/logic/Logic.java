package by.htp.customer.logic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import by.htp.customer.entity.Customer;
import by.htp.customer.entity.CustomerList;

public class Logic {

	public List<Customer> alfavit(List<Customer> list) {
		List<Customer> res = new ArrayList<Customer>();

		Collections.sort(list, new CustSortAlf());

		return list;
	}

	public List<Customer> cardNum(CustomerList list, int firstNum, int secondNum) {
		List<Customer> result = new ArrayList<Customer>();

		List<Customer> customers;
		customers = list.getCustomersList();

		for (int i = 0; i < customers.size(); i++) {
			Customer c = customers.get(i);
			int s = c.getNumCrCard();
			if (firstNum <= s & s <= secondNum) {
				result.add(customers.get(i));
			}

		}

		return result;
	}

}
