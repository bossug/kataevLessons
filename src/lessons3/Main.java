import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        guessNumber();
    }
    public static void guessNumber(){
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        do {
            int numComp = random.nextInt(10);
            System.out.println("Угдайте число с 3 попыток от 0 до 9");
            System.out.println("Введите свой ответ:");

            for (int i = 3; i > 0; i--) {
                int questionNum = scanner.nextInt();
                if (questionNum == numComp) {
                    System.out.println("Вы угадали число!");
                    break;
                }
                System.out.println(questionNum > numComp ? "Введенное чилсо больше загаданного " : "Введенное число меньше загаданного");
                System.out.println((i-1) > 0 ? "осталось попыток " + (i-1) : "Вы проиграли. Загаданное число - " + numComp);
            }
            System.out.println("Повторить игру? (1 – да, 0 – нет)");
        }
        while (scanner.nextInt() == 1);
    }
}
