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
        }

    }