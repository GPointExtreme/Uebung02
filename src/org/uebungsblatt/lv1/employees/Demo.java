package org.uebungsblatt.lv1.employees;

import java.util.Arrays;

public class Demo {

	public static void main(String[] args) {
		
		Employee[] array = new Employee[3];
		array[0] = new Employee(1, "David", 3000, "CHEF");
		array[1] = new Employee(3, "David", 3000, "CHEF");
		array[2] = new Employee(2, "David", 3000, "CHEF");
		
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		
		System.out.println("---------------------------------------------------------------------");
		Arrays.sort(array);
		
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}

	}

}
