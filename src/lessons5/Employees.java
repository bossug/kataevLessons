package com.company;

public class Employees {
    private String fio;
    private int age;
    private String email;
    private String position;
    private String phone;
    private String  price;

    public Employees(String fio, int age, String email, String position, String phone, String price){
        this.fio = fio;
        this.age = age;
        this.email = email;
        this.position = position;
        this.phone = phone;
        this.price = price;
    }


    public int getAge() {
        return this.age;
    }


    public void printInfo(){
        System.out.println(String.format("ФИО %s\n\rДолжность %s\n\rEmail %s\n\rВозраст %s\n\rТелефон %s\n\rЗарплата %s",this.fio, this.position, this.email, this.age, this.phone, this.price));
        System.out.println();
    }
}
