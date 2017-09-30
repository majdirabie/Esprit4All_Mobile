package levels;


import models.Employee;
import utils.Data;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Level3 {
	public static void main(String[] args) {
        List<Employee> employees = Data.employees();
		
	/* TO DO 1: Retourner une chaine de caractére qui contient tous les noms des employés */	
	String names = employees.stream().map(e->e.getName()).reduce("", (a,b)->a+b);
						
	/* TO DO 2: Retourner une chaine de caractére qui contient tous les noms des employés en majuscule separés par # */	
        String namesMajSplit = employees.stream().map(e->e.getName()).map(String::toUpperCase).collect(Collectors.joining("#"));
        System.out.println("---"+namesMajSplit);

	/* TO DO 3: Retourner une set d'employés*/
	Set<Employee> emps = employees.stream().collect(Collectors.toSet());

	/* TO DO 4: Retourner une TreeSet d'employ�s (tri par nom) */
	TreeSet<Employee> emps2 = employees.stream()
          .collect(Collectors.toCollection(()-> new TreeSet<Employee>((a,b)->a.getName().compareTo(b.getName()))));

	/* TO DO 5: Retourner une Map qui regroupe les employés par salaire */
	Map<Integer, List<Employee>> map = employees.stream().
          collect(Collectors.groupingBy(Employee::getSalary));
			
	/* TO DO 6: Retourner une Map qui regroupe les nom des employés par salaire */
	Map<Integer, String> map2 = employees.stream().collect(Collectors.toMap(Employee::getSalary, Employee::getName, (n1,n2) -> n1 +" -- "+n2));
		System.out.println("map2"+map2);
	/* TO DO 7: Retourner le  min, max,average, sum,count des salaires */
	String s = employees.stream().collect(Collectors.summarizingInt(Employee::getSalary)).toString();
				
	}
}
