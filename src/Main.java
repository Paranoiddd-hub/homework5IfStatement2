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

        if (clientOS2 == 0) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        } else if (clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        System.out.println();


        //Task 3
        int year = 2021;

        if (year % 400 == 0) {
            System.out.printf("Год %d високосный, потому что он 400-ый %n", year);
        } else if (year % 100 == 0) {
            System.out.printf("Год %d невисокосный, потому что он 100-ый %n", year);
        } else if (year % 4 == 0) {
            System.out.printf("Год %d високосный, потому что он 4-ый %n", year);
        } else {
            System.out.printf("Год %d невисокосный, потому что не 4-ый или 400-ый %n", year);
        }

        System.out.println();


        //Task 4
        int deliveryDistance = 95;
        int days = 0;

        if (deliveryDistance > 0) {
            days++;
            if (deliveryDistance > 20) {
                days++;
                if (deliveryDistance > 60) {
                    days++;
                    if (deliveryDistance > 100) {
                        days = 0;
                    }
                }
            }
        }

        System.out.printf(days != 0 ? "Потребуется %d дней доставки %n" : "Доставки нет", days);
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