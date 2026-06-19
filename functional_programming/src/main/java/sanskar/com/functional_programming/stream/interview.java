package sanskar.com.functional_programming.stream;

import javax.swing.text.html.Option;
import java.util.*;
import java.util.stream.Collectors;

import static java.util.Arrays.stream;

class Employe{
    private int id;
    private String name;
    private int age;

    public Employe(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employe{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
public class interview {

    public static void main(String[] args) {

        List<Employe> employee = Arrays.asList(
          new Employe(1,"abc",30),
          new Employe(2,"edf",95),
          new Employe(3,"xyz",77),
          new Employe(4,"jlkvndv",30)
        );

//        Group employees By age
//       Map<Integer,List<Employe>> map= employee.stream()
//                .collect(Collectors.groupingBy(employe -> employe.getAge()));

//       map.forEach((key,value)->{
//           System.out.print("Age: " + key);
////           System.out.println("List of employees: " + value);
//           value.forEach(emp->
//           System.out.println(emp.getName()));
//       });

        employee.stream().forEach(emp-> System.out.println(emp.getName()));

        System.out.println("------------------------------------------------");

      List<String> l =   employee.stream().map(e->e.getName()).collect(Collectors.toList());
        System.out.println(l);
        System.out.println("----------------------------------------------");
      employee.stream().filter(e->e.getAge()>30).forEach(System.out::println);
        System.out.println("----------------------------------------------");
        long a = employee.stream().filter(e->e.getAge()>30).count();
        System.out.println(a);
        System.out.println("--------------------------------------------");

//      From grouped map, print only names age-wise
       Map<Integer,List<Employe>> ans = employee.stream().collect(Collectors.groupingBy(e->e.getAge()));
        ans.forEach((age, list) -> {
            System.out.print("Age " + age + " -> ");
            list.forEach(e -> System.out.print(e.getName() + ", "));
            System.out.println();
        });
        System.out.println("-----------------------------------------");
        Map<Integer,Long> map =  employee.stream().collect(Collectors.groupingBy(e->e.getAge(),Collectors.counting()));
        System.out.println(map);
        System.out.println("--------------------------------------------");
       Optional<Employe>employe= employee.stream().filter(e->e.getAge()>30).findFirst();
        System.out.println(employe);
        employe.ifPresent(e -> System.out.println(e.getName()));
        System.out.println("------------------------------------------");

        List<String>st=employee.stream().map(e->e.getName()).collect(Collectors.toList());
        System.out.println(st);

//        Get employee with maximum age
//(learn max() + Comparator)
        System.out.println("-----------------------------------------------");
        Optional<Employe> maxEmployee =  employee.stream().min(Comparator.comparing(Employe::getAge)
        );
        maxEmployee.ifPresent(e-> System.out.println(e.getName()));
        System.out.println("----------------------------------------");
//  sort using comparator with specific field --> by default assending
       List<Employe>employes= employee.stream().sorted(Comparator.comparing(Employe::getAge)).collect(Collectors.toList());
        System.out.println(employes);
        System.out.println("--------------------------------------------");
        //keep decending order
        List<Employe> employeList =  employee.stream().sorted(Comparator.comparing(Employe::getAge).reversed()).collect(Collectors.toList());
        System.out.println(employeList);

        System.out.println("-------------------------------------");

    }
}
