package org.uebungsblatt.lv1.warenkorb;

import java.util.Comparator;

public class AnonymeCpmparator implements Comparator<Cart> {

	public AnonymeCpmparator() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int compare(Cart o1, Cart o2) {
		if((o1.getTotalAmount()/o1.getToalltems()) < (o2.getTotalAmount()/o2.getToalltems())) {
			return 1;
		}
		if((o1.getTotalAmount()/o1.getToalltems()) > (o2.getTotalAmount()/o2.getToalltems())) {
			return -1;
		}
		return 0;
	}

}
