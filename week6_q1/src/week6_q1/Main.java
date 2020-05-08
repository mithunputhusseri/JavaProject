package week6_q1;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		business b = new business();
		b.read_student(111,"boby","delhi");
		b.read_student(222, "mithun", "kannur");
		b.read_student(333, "vishnu", "thrissur");
		b.read_student(444, "shirin", "malapuram");
		b.read_student(222, "malavika", "trivandrum");
		b.display();
		b.place_group("kannur");
		b.sort_name();
		b.display();
		b.sort_place();
		b.display();
		b.find_student(222);
		
	}

}
