package com.sapient.problem2;

import java.util.Scanner;

public class main_method {
	
	public static void main(String[] args) {
		int[] array = {12,34,56,7};
		Command_Line1 cl1 = new Command_Line1();
		cl1.setData(array);
		cl1.calData();
		cl1.displayData();
		KeyRead_Line2 kl2 = new KeyRead_Line2();
		kl2.read();
		kl2.display();
		kl2.sort();
		kl2.find(5);
		kl2.display();
		figure_words.convert_to_words("132".toCharArray());
	}
	
}
