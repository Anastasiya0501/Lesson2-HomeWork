import java.util.Scanner;

public class Lesson2 {
    public static void main(String[] args) {

        // задание 1
        Scanner sc = new Scanner(System.in);
        System.out.println("Задание 1.");
        System.out.println("Введите первое число:");
        int a = sc.nextInt();
        System.out.println("Введите второе число:");
        int b = sc.nextInt();
        int c = a + b;
        if (c >= 10 && c <=20 ){
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        // задание 2
        System.out.println("\n" + "Задание 2.");
        System.out.println("Введите любое целое число:");
        long num = sc.nextInt();
        if(num >= 0){
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }

        //заадние 3
        System.out.println("\n" + "Задание 3.");
        System.out.println("Введите любое целое число:");
        int y = sc.nextInt();
        if(y >= 0) {
            System.out.println("false");
        } else {
            System.out.println("true");
        }
        //при всем желании не применимо!! :( т.к. switch только сравнивает
        /*switch (y) {
            case 0:
                System.out.println("false");
                break;
            case 1:
                System.out.println("false");
                break;
            case -1:
                System.out.println("true");
                break;
        }*/

        //задание 4
        System.out.println("\n" + "Задание 4.");
        String line = "Циклы for позволяют многократно выполнять последовательность кода.";
        int count = 4;
        for (int forLine = 0; forLine < count; forLine++) {
            System.out.println(line);
        }

        //задание 5
        /* Написать метод, который определяет, является ли год високосным, и возвращает boolean
        (високосный - true, не високосный - false). Каждый 4-й год является високосным, кроме
        каждого 100-го, при этом каждый 400-й – високосный.*/

        System.out.println("\n" + "Задание 5.");
        System.out.println("Напишите год, чтобы узнать высокостный ли он.");
        int year = sc.nextInt();
        if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}




 