package p1;

import java.util.ArrayList;
import java.util.List;

public class AddEmployee {
	private static List<Employee> users = new ArrayList<>();
    static{
        users.add(new Employee(1,"John","thillenkeri"));
        users.add(new Employee(2,"Mithun","delhi"));
        users.add(new Employee(3,"Jacob","bombay"));
        users.add(new Employee(4,"Bill","thrissur"));
        users.add(new Employee(5,"Charles","tvm"));
    }
	public String getEmployee(int id) {
		
		String name = "null null";
		String place = null;
		for(int i=0;i<users.size();i++)
		{
			if(users.get(i).getId() == id)
			{
				name = users.get(i).getName();
				place = users.get(i).getPlace();
				name = name;
			}
		}
		return name;
		
	}
	public void addEmployee(int id,String name,String city) {
		
		users.add(new Employee(id,name,city));
	}
}
