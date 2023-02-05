import java.util.Scanner;
import java.util.logging.*;

public class task3 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите число a: ");
        int a = iScanner.nextInt();
        System.out.printf("Введите число b: ");
        int b = iScanner.nextInt();
        System.out.printf("Введите операцию: ");
        char symbol = iScanner.next().charAt(0);
        if (symbol == '+') {
            int result = a + b;
            System.out.print(result);
        }
        else {
            if (symbol == '-') {
                int result = a - b;
                System.out.print(result);
            }
            else {
                if (symbol == '*') {
                    int result = a * b;
                    System.out.print(result);
                } 
                else {
                    if (symbol == '/') {
                        int result = a / b;
                        System.out.print(result);
                    }
                    else {
                        System.out.println("Несуществующая операция");
                    }
                }
            }
        }
        iScanner.close();

        Logger logger = Logger.getLogger(task3.class.getName());
        logger.setLevel(Level.INFO);
        ConsoleHandler ch = new ConsoleHandler();
        logger.addHandler(ch);
        SimpleFormatter sFormat = new SimpleFormatter();
        ch.setFormatter(sFormat);
        logger.log(Level.WARNING, "Тестовое логирование");
        logger.info("Тестовое логирование 2");
    }
}