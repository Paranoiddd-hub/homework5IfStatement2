public class Main {
    public static void main(String[] args) {
        //Task 1
        int clientOS = 0;

        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        System.out.println();


        //Task 2
        int clientOS2 = 0;
        int clientDeviceYear = 2015;

        switch (clientOS2) {
            case 0:
                if (clientDeviceYear < 2015) {
                    System.out.println("Установите облегченную версию приложения для iOS по ссылке");
                } else {
                    System.out.println("Установите версию приложения для iOS по ссылке");
                }
                break;
            case 1:
                if (clientDeviceYear < 2015) {
                    System.out.println("Установите облегченную версию приложения для Android по ссылке");
                } else {
                    System.out.println("Установите версию приложения для Android по ссылке");
                }
        }

        System.out.println();


        //Task 3
        int year = 2021;

        if (!(year > 1584)) {
            System.out.println("Год должен быть больше 1584");
            return;
        }
        if ((year % 4 == 0 &&  year % 100 != 0) || year % 400 == 0) {
            System.out.printf("Год %d високосный %n", year);
            return;
        }
        System.out.printf("Год %d невисокосный %n", year);

        System.out.println();


        //Task 4
        int deliveryDistance = 95;
        int days = 0;

        if (0 < deliveryDistance && deliveryDistance < 20) {
            days += 1;
        } else if (20 <= deliveryDistance && deliveryDistance < 60) {
            days += 2;
        } else if (60 <= deliveryDistance && deliveryDistance < 100) {
            days += 3;
        } else {
            System.out.println("Доставки нет");
        }

        if (days != 0) {
            System.out.printf("Потребуется %d дней доставки %n", days);
        }
        System.out.println();


        //Task 5
        int monthNumber = 12;

        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Это зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Это весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Это лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Это осень");
                break;
            default:
                System.out.println("Это неправильный номер месяца");
        }

    }
}