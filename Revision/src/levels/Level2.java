package levels;



import models.Employee;
import utils.Data;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Level2 {

    public static void main(String[] args) {
        
        List<Employee> employees = Data.employees();



        /* TO DO 1: Retourner le nombre des employés dont le nom commence avec n */
        long nbr = employees.stream().filter(e -> e.getName().startsWith("n")).count();

        /* TO DO 2: Retourner la somme des salaires de tous les employés (hint: mapToInt) */
        long sum = employees.stream().mapToInt(e -> e.getSalary()).sum();

        /* TO DO 3: Retourner la moyenne des salaires des employées dont le nom commence avec s */
        double average = employees.stream().mapToInt(e -> e.getSalary()).average().getAsDouble();

        /* TO DO 4: Retourner la liste de tous les employés  */
        List<Employee> emps = employees.stream().collect(Collectors.toList());

        /* TO DO 5: Retourner la liste des employés dont le nom commence par s */
        List<Employee> emps2 = employees.stream().filter(e -> e.getName().startsWith("s")).collect(Collectors.toList());

        /* TO DO 6: Retourner true si il y a au min un employés dont le salaire > 1000, false si non
         */
        boolean test = employees.stream().anyMatch(e -> e.getSalary() > 1000);

        /* TO DO 7: Afficher le premier employé dont le nom commence avec s avec deux maniéres différentes */
        /*First way*/
        employees.stream().filter(e -> e.getName().startsWith("s")).limit(1).forEach(e -> System.out.println(e));
        /*Second way*/
        employees.stream().filter(e -> e.getName().startsWith("s")).findFirst().ifPresent(System.out::println);
                
        /* TO DO 8: Afficher le second employé dont le nom commence avec s */
        employees.stream().filter(e -> e.getName().startsWith("s")).skip(1).limit(1).forEach(System.out::println);
		

    }
}
