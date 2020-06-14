package p1;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloWorldController {
@GetMapping("/welcome")
public String welcome() {
	return "welcome";
}
@Autowired
Empdao empdao;
@GetMapping("/emp")
public Map<String,EmpPojo> f2(){
	return empdao.f1();
}
@GetMapping("/emp/{id}")
public EmpPojo f3(@PathVariable String id) {
	return empdao.f2(id);
}

@GetMapping("/empdelete/{id}")
public Map<String,EmpPojo> f4(@PathVariable String id) {
	return empdao.f3(id);
}
@PostMapping("/empinsert")
public String f5(@RequestBody EmpPojo ob) {
	return empdao.f4(ob);
}
}
