package com.company;

public class Main {

    public static void main(String[] args) {
        listEmployees();
    }

    private static void listEmployees(){
        Employees[] arrEmployees = new Employees[5];
        arrEmployees[0] = new Employees("Ivanov", 45, "ivanov@mail.ru", "директор","89552632255","80000");
        arrEmployees[1] = new Employees("Ivanov1",36,"ivanov1@mail.ru", "менеджер","89552632256","25000");
        arrEmployees[2] = new Employees("Ivanov2",52,"ivanov2@mail.ru", "менеджер","89552632257","23000");
        arrEmployees[3] = new Employees("Ivanov3",27,"ivanov3@mail.ru", "менеджер","89552632258","30000");
        arrEmployees[4] = new Employees("Ivanov4",48,"ivanov4@mail.ru", "менеджер","89552632259","29000");
        for (int i = 0; i < arrEmployees.length; i++) {
            if(arrEmployees[i].getAge() > 40){
                arrEmployees[i].printInfo();
            }
        }
    }
}
