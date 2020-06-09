package comsortedexampletest;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] tab = new int[3];
        tab[0] = 30;
        tab[1] = 4;
        tab[2] = -1;

        Arrays.sort(tab);
        //System.out.println(tab[0]);
        //System.out.println(tab[1]);
        //System.out.println(tab[2]);

        Employee[] employees = new Employee[4];
        employees[0] = new Employee(2000);
        employees[1] = new Employee(344);
        employees[2] = new Employee(45678);
        employees[3] = new Employee(21);

        for (Employee e: employees){
            System.out.println(e.getSalary());
        }
        Arrays.sort(employees);
        System.out.println(employees[0].compareTo(employees[1]));
        for (Employee e: employees){
            System.out.println(e.getSalary());
        }

    }
}

class Employee implements Comparable{
    double salary;

    Employee(double salary){
        this.salary = salary;
    }

    double getSalary(){
        return this.salary;
    }

    @Override
    public int compareTo(Object o) {
        Employee sent = (Employee)o;
        if (this.salary < sent.salary){
            return -1;
        } else if (this.salary > sent.salary){
            return 1;
        }
        return 0;
    }
}
