public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }

    public static void task1 () {
        System.out.println("Задача 1");
        int iOS = 0;
        int android = 1;
        int clientOS = android;
        switch (clientOS) {
            case 0:
             System.out.println("Установите версию приложения для iOS по ссылке");
             break;
            case 1:
                System.out.println("Установите версию приложения для Android по ссылке");
                break;
        }

    }

    public static void task2 () {
        System.out.println("Задача 2");
        int iOS = 0;
        int android = 1;
        int clientOS = iOS;
        int clientDeviceYear = 2017;
        if (clientOS == iOS) {
            System.out.println("Установите версию приложения для iOS по ссылке");
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }
        } else if (clientOS == android) {
            System.out.println("Установите версию приложения для Android по ссылке");
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        }

    }
    public static void task3 () {
        System.out.println("Задача 3");
        int year = 2021;
        int Year = year % 4;
        int year100 = year % 100;
        int year400 = year % 400;
         if (Year == 0 && year100 != 0 ) {
             System.out.println(year + " год является високосным");
         } else if (year400 == 0) {
             System.out.println(year + " год является високосным");
         } else {
             System.out.println(year + " год не является високосным");
         }
    }
    public static void task4 () {
        System.out.println("Задача 4");
        int deliveryDistance = 95;
        byte deliveryTime1 = 1;
        byte deliveryTime2 = 2;
        byte deliveryTime3 = 3;
        if (deliveryDistance < 20) {
            System.out.println("Потребуется дней: " + deliveryTime1);
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            System.out.println("Потребуется дней: " + deliveryTime2);
        } else if (deliveryDistance >= 60 && deliveryDistance < 100) {
            System.out.println("Потребуется дней: " + deliveryTime3);
        } else {
            System.out.println("Доставки нет");
        }
    }
    public static void task5 () {
        System.out.println("Задача 5");
        byte monthNumber = 12;
        switch (monthNumber) {
            case 1:
                System.out.println("1-й месяц (он же январь) принадлежит к сезону зима");
                break;
            case 2:
                System.out.println("2-й месяц (он же февраль) принадлежит к сезону зима");
                break;
            case 3:
                System.out.println("3-й месяц (он же март) принадлежит к сезону весна");
                break;
            case 4:
                System.out.println("4-й месяц (он же апрель) принадлежит к сезону весна");
                break;
            case 5:
                System.out.println("5-й месяц (он же май) принадлежит к сезону весна");
                break;
            case 6:
                System.out.println("6-й месяц (он же июнь) принадлежит к сезону лето");
                break;
            case 7:
                System.out.println("7-й месяц (он же июль) принадлежит к сезону лето");
                break;
            case 8:
                System.out.println("8-й месяц (он же август) принадлежит к сезону лето");
                break;
            case 9:
                System.out.println("9-й месяц (он же сентябрь) принадлежит к сезону осень");
                break;
            case 10:
                System.out.println("10-й месяц (он же октябрь) принадлежит к сезону осень");
                break;
            case 11:
                System.out.println("11-й месяц (он же ноябрь) принадлежит к сезону осень");
                break;
            case 12:
                System.out.println("12-й месяц (он же декабрь) принадлежит к сезону зима");
                break;
            default:
                System.out.println("Нет такого месяца");
        }
        }

}
