public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
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
    public static void task4() {
        System.out.println("Задание 4");

        int deliveryDistance = 70;
        if (deliveryDistance <= 19) {
            System.out.println("Потребуется дней: 1");}
        if (deliveryDistance <= 59 && deliveryDistance > 19) {
            System.out.println("Потребуется дней: 2");
        } else if (deliveryDistance <= 100 && deliveryDistance > 59){
            System.out.println("Потребуется дней: 3");
        }
    }
    public static void task5() {
        System.out.println("Задание 5");

        int monthNumber = 7;

        switch (monthNumber) {
            case (1):
            case (2):
            case (12):
                System.out.println("Зима");
                break;
            case (3):
            case (4):
            case (5):
                System.out.println("Весна");
                break;
            case (6):
            case (7):
            case (8):
                System.out.println("Лето");
                break;
            case (9):
            case (10):
            case (11):
                System.out.println("Осень");
                break;
            default:
                System.out.println("Нет такого месяца");
        }
    }
}