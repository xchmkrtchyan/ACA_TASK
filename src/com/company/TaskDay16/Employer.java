package com.company.TaskDay15;

public class Employer {
    String name;
    int age;
    String workPlace;
    double salary;

    Employer(){

    }

    public Employer(String name, int age, String workPlace, double salary) {
        this.name = name;
        this.age = age;
        this.workPlace = workPlace;
        this.salary = salary;
    }
    void printEmployerParameters(){
        System.out.print(name + " " + age + " " + workPlace + " " + salary);
    }
}
