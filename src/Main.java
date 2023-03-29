public class Main {
    public static void main(String[] args) {
        //hw 5.1
        byte clientOs = 1;
        switch (clientOs) {
            case 0:
                System.out.println("Установите версию приложения для iOS по ссылке.");
            case 1:
                System.out.println("Установите версию приложения для Android по ссылке.");
        }
        // hw 5.2
        int yearPhone = 2014;
        byte clientOs2 = 0;
        if (yearPhone < 2015) {
            if (clientOs2 == 1) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }
        } else if (clientOs2 == 1) {
            System.out.println("Установите версию приложения для Android по ссылке.");
        } else {
            System.out.println("Установите версию приложения для iOS по ссылке.");

        }
        //hw5.3
        int year = 2000;
        if (year % 4 == 0) {
            if ((year % 100 != 0) || (year % 400 == 0)) {
                System.out.println("Год " + year + " является высокосным.");
            } else {
                System.out.println("Год " + year + " не является высокосным.");
            }
        } else {
            System.out.println("Год " + year + " не является высокосным.");
        }
//hw 5.4
        int deliveryDistance = 95;
        int deliveryTime;
        if (deliveryDistance <= 100) {
            if (deliveryDistance > 60) {
                deliveryTime = 3;
            } else if (deliveryDistance > 20) {
                deliveryTime = 2;
            } else {
                deliveryTime = 1;
            }
            System.out.println("Потребуется дней: " + deliveryTime);
        } else {
            System.out.println("Доставки нет");
        }
        //hw 5.5
        int monthNumber = 12;
        switch (monthNumber) {
            case 1:
                System.out.println("Месяц январь принадлежит к сезону зима");
                break;
            case 2:
                System.out.println("Месяц февраль принадлежит к сезону зима");
                break;
            case 3:
                System.out.println("Месяц март принадлежит к сезону весна");
                break;
            case 4:
                System.out.println("Месяц апрель принадлежит к сезону весна");
                break;
            case 5:
                System.out.println("Месяц май принадлежит к сезону весна");
                break;
            case 6:
                System.out.println("Месяц июнь принадлежит к сезону лето");
                break;
            case 7:
                System.out.println("Месяц июль принадлежит к сезону лето");
                break;
            case 8:
                System.out.println("Месяц август принадлежит к сезону лето");
                break;
            case 9:
                System.out.println("Месяц сентябрь принадлежит к сезону осень");
                break;
            case 10:
                System.out.println("Месяц октябрь принадлежит к сезону осень");
                break;
            case 11:
                System.out.println("Месяц ноябрь принадлежит к сезону осень");
                break;
            case 12:
                System.out.println("Месяц декабрь принадлежит к сезону зима");
                break;
            default:
                System.out.println("Такого месяца не существует.");
        }

    }
}