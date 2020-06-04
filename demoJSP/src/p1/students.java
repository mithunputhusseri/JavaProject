package p1;

import java.util.ArrayList;
import java.util.List;

public class students {

	private int s_id;
	private static List<User> users = new ArrayList<>();
    static{
        users.add(new User(1,"John","thillenkeri"));
        users.add(new User(2,"Mithun","delhi"));
        users.add(new User(3,"Jacob","bombay"));
        users.add(new User(4,"Bill","thrissur"));
        users.add(new User(5,"Charles","tvm"));
    }
	public students(int s_id) {
		// TODO Auto-generated constructor stub
		this.s_id = s_id;
	}
	public String student_name(int id) {
		
		String name = null;
		String place = null;
		for(int i=0;i<users.size();i++)
		{
			if(users.get(i).getId() == id)
			{
				name = users.get(i).getName();
				place = users.get(i).getPlace();
			}
		}
		return  "\n"+ "ID: "+id +"\n" + "Name: "+name+"\n"+ "Place: "+place;
		
	}

}
