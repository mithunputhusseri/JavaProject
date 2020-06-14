package p1;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

@Service
public class Empdao {
Map<String,EmpPojo> map = new HashMap<>();
Empdao(){
	super();
	EmpPojo ob = new EmpPojo();
	ob.setId("1001");
	ob.setName("mithun");
	map.put("1001",ob);
	EmpPojo ob1 = new EmpPojo();
	ob1.setId("1002");
	ob1.setName("bob");
	map.put("1002",ob1);
	EmpPojo ob2 = new EmpPojo();
	ob2.setId("1003");
	ob2.setName("john");
	map.put("1003",ob2);
	
}
public Map<String,EmpPojo> f1(){
	return map;
}
public EmpPojo f2(String id) {
	return map.get(id);
}
public Map<String,EmpPojo>  f3(String id) {
	map.remove(id);
	return map;
}
public String f4(EmpPojo ob) {
	
	map.put(ob.getId(),ob);
	return "success";
}
}
