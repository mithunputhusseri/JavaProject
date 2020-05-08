package week6_q1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
class Sortbyname implements Comparator<Student> 
{ 
    // Used for sorting in ascending order of 
    // roll number 
    public int compare(Student a, Student b) 
    { 
        return a.name.compareTo(b.name); 
    } 
} 
class Sortbyplace implements Comparator<Student> 
{ 
    // Used for sorting in ascending order of 
    // roll number 
    public int compare(Student a, Student b) 
    { 
        return a.place.compareTo(b.place); 
    } 
}
public class business {
	public ArrayList<Student> ar = new ArrayList<Student>();
	public void read_student(int id,String name, String place)
	{
		ar.add(new Student(id,name,place));
	}
	public void display() {
		// TODO Auto-generated method stub
		System.out.println(".........................");
		for (int i=0; i<ar.size(); i++) 
            System.out.println(ar.get(i).id + " " + ar.get(i).name + " " + ar.get(i).place); 
		System.out.println(".........................");
	}
	public void place_group(String place) {
		// TODO Auto-generated method stub
		System.out.println("The list of students in" + place + "is");
		for(int i =0;i<ar.size();i++)
		{
			if(ar.get(i).place == place)
			{
				System.out.println(ar.get(i).name);
			}
		}
		System.out.println(".........................");
	}
	public void sort_name() {
		// TODO Auto-generated method stub
		Collections.sort(ar, new Sortbyname());
	}
	public void sort_place() {
		// TODO Auto-generated method stub
		Collections.sort(ar, new Sortbyplace());
	}
	public void find_student(int id) {
		// TODO Auto-generated method stub
		for(int i=0;i<ar.size();i++)
		{
			if(id == ar.get(i).id)
			{
				System.out.println("Student found");
				System.out.println(ar.get(i).id + " " + ar.get(i).name + " " + ar.get(i).place);
				return;
			}
		}
		System.out.println("Student not found");
	}
	
}
