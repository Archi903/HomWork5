public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1() {
        System.out.println("Задание 1");

        int clientOS = 0;
        int android = 1;
        int iOS = 0;

        if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }

    }
    public static void task2() {
        System.out.println("Задание 2");

        int clientOS = 1;
        int android = 1;
        int iOS = 0;
        int clientDeviceYear = 2014;

        if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        } else if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }
        }
    }
    public static void task3() {
        System.out.println("Задание 3");

        int year = 1600;

        if (year % 4 == 0) {
            if ((year % 100 != 0) || (year % 400 == 0)) {
                System.out.println(+year + " год является високосным");
            }
        }
        if (year % 4 != 0 || year % 100 == 0) {
            if (year % 400 != 0) {
                System.out.println(+year + " год не является високосным");


            }
        }
    }
}