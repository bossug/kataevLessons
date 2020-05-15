import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //объявление переменных
	    int a; char b; double c; boolean d; byte e; float g;
        System.out.println("Результат формулы a*(b+(c/d)):");
        System.out.println(calculate(2,4,5,6));

        //Сравнение суммы чисел
        System.out.println("Сранение двух чисел 3 и 10:");
        System.out.println(compare(3,10));

        //Проверка введенного числа чет/нечет
        Scanner scanner = new Scanner((System.in));
        System.out.println("Введите число");
        int number = scanner.nextInt();
        compareNumber(number);

        System.out.println(isPositive(-1));

        //Указание имени
        nameParam("Вася");

        Year(1976);
    }
    public static float calculate(int a, int b, int c, int d) {
        return a*(b+(c/d));

    }
    public static boolean compare(int x1, int x2) {
        int n = x1 + x2;
        if(n>=10 && n<=20){
            return true;
        } else {
            return false;
        }
    }
    public static void compareNumber(int x) {
        if(x % 2 ==0) {
            System.out.println("Четное число");
        } else {
            System.out.println("Нечетное число");
        }
    }
    public static boolean isPositive(int x){
        if(x < 0){
            return false;
        } else {
            return true;
        }
    }
    public static void nameParam(String name){
        System.out.println("Привет "+ name + "!");
    }
    public static void Year(int y){
        if( (y % 4 == 0 || y % 400 == 0) && y % 100 !=0 ){
            System.out.println("Високосный");
        } else {
            System.out.println("Не високосный");
        }
    }
}
