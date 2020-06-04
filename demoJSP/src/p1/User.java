package p1;

public class User {

	private int id;
	private String name;
	private String place;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public User(int i, String string) {
		// TODO Auto-generated constructor stub
		id = i;
		name = string;
	}
	public User(int i, String string, String string2) {
		// TODO Auto-generated constructor stub
		id = i;
		name = string;
		place =string2;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}

}
