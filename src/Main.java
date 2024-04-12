public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        System.out.println("Здача №1");
        int clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Приложение не установится");
        }

        System.out.println("Здача №2");
        int clientDeviceYear = 2012;
        if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для IOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Приложение не установится");
        }

        System.out.println("Задача №3");
        int year = 2024;
        if (year > 1584 && (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)) {
            System.out.printf("%s, год является высокосным\n", year);
        } else {
            System.out.printf("%s, год неявляется высокосным\n", year);
        }

        System.out.println("Задача №4");
        int deliveryDistance = 95;
        int deliveryTimeDay = 1;
        if (deliveryDistance == 20) {
            System.out.println("Потребуется дней" + deliveryTimeDay);
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Потребуется дней" + (deliveryTimeDay + 1));
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется дней" + (deliveryTimeDay + 2));
        } else if (deliveryDistance > 100) {
            System.out.println("Доставки нет");
        }

        System.out.println("Задача №5");
        char monthNumber = 12;
        switch (monthNumber) {
            case 3,4,5 :
                System.out.println("Весна");
                break;
            case 6,7,8:
                System.out.println("Лето");
                break;
            case 9,10,11:
                System.out.println("Осень");
                break;
            case 12,1,2 :
                System.out.println("Зима");
                break;
        }


    }
}
