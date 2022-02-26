package ru.skypro;

public class Main {

    public static void main(String[] args) {
        // write your code here
//task7
        Employee[] employees = new Employee[10];
        employees[0] = Employee.addEmployee("tolstoy johan l'vovich",2,1000);
        employees[1] = Employee.addEmployee("gustoy pohan petrovich",3,2000);
        employees[2] = Employee.addEmployee("prostoy chohan kuzhugetovich",4,3000);
        employees[3] = Employee.addEmployee("neprostoy khan bekmambetovich",6,4000);
        employees[4] = Employee.addEmployee("kusto polkan aristarkhovich",1,5000);
        employees[5] = Employee.addEmployee("kustodiev podpolkan djokovich",2,1500);
        employees[6] = Employee.addEmployee("rapsodiev mahno jokich",3,2500);
        employees[7] = Employee.addEmployee("zaratustra vano donchich",4,3500);
        employees[8] = Employee.addEmployee("astalavista toto ponchich",5,4500);
        employees[9] = Employee.addEmployee("colloterrorista yokoono bortich",1,500);
        //employees[10] = Employee.addEmployee("ivanov petr vladimirovich",2,666);

//task8a
        Employee.listEmployee(employees);
//task8be
        Employee.salaryCap(employees);
//task8cd
        Employee.findPoorAndRichMan(employees);
//task8f
        Employee.listEmployeeFullName(employees);


    }
}
