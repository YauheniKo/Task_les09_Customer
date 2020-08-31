package by.htp.customer.logic;

import java.util.Comparator;

import by.htp.customer.entity.Customer;

public class CustSortAlf implements Comparator<Customer> {

	@Override
	public int compare(Customer o1, Customer o2) {
		int x = o1.getLasttName().compareTo(o2.getLasttName());
		return x;
	}

}
