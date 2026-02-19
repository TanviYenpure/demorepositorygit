package in.core.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

import in.core.bean.Employee;

public class Mainclass
{
public static void main(String[] args)
{
	List <Employee> listemp=new ArrayList<Employee>();
	listemp.add(new Employee("Nilkanth", "1234", "CEO", 189999.00));
	listemp.add(new Employee("Keshav", "2345", "Manager", 80000.00));
	listemp.add(new Employee("NarayanSwarup", "5678", "HR", 67900.00));
	listemp.add(new Employee("Gunatit", "8979", "Financemanager", 78900.00));
	listemp.add(new Employee("Nayan", "1234", "Developer", 89999.00));
	
	HashSet<Employee> hsemp=new HashSet<Employee>();
	hsemp.addAll(listemp);
	
	List<Employee> sortedList = new ArrayList<>(hsemp);
	Collections.sort(sortedList); 

	for (Employee emp : sortedList)
	{
	    System.out.println(emp);
	}
	
}
}
}
