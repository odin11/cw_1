package ru.skypro;

//task1
public class Employee {

    private String fullName;
    //public int[] arrayDepartment = {1,2,3,4,5};
    private int salary;
    private int department;

    //task2
    public int id;
    public int countID;

    //task3
    public Employee(String fullName, int department, int salary) {
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
        //this.id = id;
        //this.countID = countID;
    }



    //task4
    public String getFullName() {
        return this.fullName;
    }
    public int getSalary() {
        return this.salary;
    }
    public int getID() {
        return this.id;
    }
    public int getCountID() {
        return this.countID;
    }
    public int getDepartment() {
        return this.department;
    }

//task5

    public void setFullName() {
        this.fullName = fullName;
    }
    public void setSalary() {
        this.salary = salary;
    }
    public void setID() {
        this.id = id;
    }
    public void setCountID() {
        this.countID = countID;
    }
    public void setDepartment() {
        this.department = department;
    }

    //task8a
    public static Employee addEmployee(String fullName, int department, int salary){
        Employee a = new Employee(fullName, department, salary);
        return a;
    }

    public static void listEmployee (Employee[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].toString());
        }
    }

    @Override
    public String toString() {
        return "Employee: " +
                "fullName='" + fullName + '\'' +
                ", department=" + department +
                ", salary=" + salary;
    }

    //task8be
    public static void salaryCap (Employee[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i].salary;
        }
        var averageSalary = sum / arr.length;                   //task8e
        System.out.println("salaryCap = " + sum);
        System.out.println("averageSalary = " + averageSalary); //task8e
        //return sum;
    }

    //task8cd
    public static void findPoorAndRichMan (Employee[] arr) {
        int min = arr[0].getSalary();
        int max = 0;
        int current = 0;
        String whomin = "";
        String whomax = "";
        for (int i = 0; i < arr.length; i++) {
            current = arr[i].getSalary();
            if (current > max) {
                max = current;
                whomax = arr[i].getFullName();
            }
            if (current < min) {
                min = current;
                whomin = arr[i].getFullName();

            }
        }
        System.out.println("whomax = " + whomax);
        System.out.println("whomin = " + whomin);
    }

    //task8f
    public static void listEmployeeFullName (Employee[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].getFullName().toString());
        }
    }


}