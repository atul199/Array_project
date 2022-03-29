import java.util.*;

public class List {
	public static void main(String args[]) {
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		Employee e3 = new Employee();
		
		e1.setName("Amit");
		e1.setDept("IT");
		e1.setSalary(13000);
		
		e2.setName("Rahul");
		e2.setDept("CS");
		e2.setSalary(20000);
		
		e3.setName("Amir");
		e3.setDept("EC");
		e3.setSalary(50000);
		
		ArrayList<Employee> al1 = new ArrayList();
		al1.add(e1);
		al1.add(e2);
		al1.add(e3);
		
		System.out.println(al1);
		
	}

}
