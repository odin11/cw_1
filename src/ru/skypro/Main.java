package ru.skypro;

public class Main {

    //task8a
    public static Employee addEmployee(String fullName, int department, int salary){
        Employee a = new Employee(fullName, department, salary);
        return a;
    }

    /*public static Employee addEmployee (Employee[] arr){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==null) {
                arr[i] = new Employee();
            }
        }
    }*/

    /*public static void reverseArray(int[] arr2) {
        Employee[] arr2 = new Employee[i];
        for (int i = 0; i < arr2.length; i >= 0; i++) {
            System.out.print(arr2[i]+" ");
        }
    }*/

    public static void listEmployee (Employee[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    //task8be
    public static void getSalarySum (Employee[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i].getSalary();
        }
        var averageSalary = sum / arr.length;                   //task8e
        System.out.println("\nsalaryCap = " + sum);
        System.out.println("averageSalary = " + averageSalary); //task8e
        //return sum;
    }

    //task8cd
    public static void findPoorAndRichMan (Employee[] arr) {
        int min = arr[0].getSalary();
        int max = arr[0].getSalary();                   //fixed
        int current = 0;
        String whomin = "";
        String whomax = "";
        for (int i = 0; i < arr.length; i++) {
            current = arr[i].getSalary();
            if (current > max) {
                max = current;
                //whomax = arr[i].getFullName();
                whomax = arr[i].toString();             //fixed
            }
            if (current < min) {
                min = current;
                //whomin = arr[i].getFullName();
                whomin = arr[i].toString();             //fixed
            }
        }
        System.out.println("\nwhomax = " + whomax);
        System.out.println("whomin = " + whomin);
    }

    //task8f
    public static void listEmployeeFullName (Employee[] arr){
        System.out.println("\nсписок ФИО всех сотрудников");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].getFullName());
        }
    }


    public static void main(String[] args) {
	// write your code here
//task7
        Employee[] employees = new Employee[10];
        employees[0] = addEmployee("tolstoy johan l'vovich",2,1000);
        employees[1] = addEmployee("gustoy pohan petrovich",3,2000);
        employees[2] = addEmployee("prostoy chohan kuzhugetovich",4,3000);
        employees[3] = addEmployee("neprostoy khan bekmambetovich",6,4000);
        employees[4] = addEmployee("kusto polkan aristarkhovich",1,5000);
        employees[5] = addEmployee("kustodiev podpolkan djokovich",2,1500);
        employees[6] = addEmployee("rapsodiev mahno jokich",3,2500);
        employees[7] = addEmployee("zaratustra vano donchich",4,3500);
        employees[8] = addEmployee("astalavista toto ponchich",5,4500);
        employees[9] = addEmployee("colloterrorista yokoono bortich",1,500);
        //employees[10] = Employee.addEmployee("ivanov petr vladimirovich",2,666);

//task8a
        listEmployee(employees);
//task8be
        getSalarySum(employees);
//task8cd
        findPoorAndRichMan(employees);
//task8f
        listEmployeeFullName(employees);


    }
}
