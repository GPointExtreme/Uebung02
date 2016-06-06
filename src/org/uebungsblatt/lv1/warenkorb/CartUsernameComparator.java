package org.uebungsblatt.lv1.warenkorb;

import java.util.Comparator;

public class CartUsernameComparator implements Comparator<Cart> {

	public CartUsernameComparator() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int compare(Cart o1, Cart o2) {
		int i = o1.getUsername().compareTo(o2.getUsername());
		if(i != 0) {
			return i;
		}
		return 0;
	}

}
