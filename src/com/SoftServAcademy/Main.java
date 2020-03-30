package com.SoftServAcademy;


public class Main {
    static void printContinent (String s) {
        switch (s) {
            case "Uganda":
            case "Kenya":
            case "Zambiya":
            case "Chad":
                System.out.println(Continent.AFRICA);
                break;
            case "USA":
            case "Brazil":
            case "Mexico":
            case "Argentina":
                System.out.println(Continent.AMERICA);
                break;
            case "Spain":
            case "Germany":
            case "italy":
                System.out.println(Continent.EUROASIA);
                break;
            default:
                System.out.println("Country not found");
        }
    }

    static void dayOfTheWeek (int i) {
        switch (i) {
            case 1:
                System.out.println("Monday, Понедельник, Понеділок");
                break;
            case 2:
                System.out.println("Tuesday, Вторник, Вівторок");
                break;
            case 3:
                System.out.println("Wensday, Среда, Середа");
                break;
                default:
                    System.out.println("No day of week");
        }
    }
    static void oddOrNot (int i) {
            if (i % 2 != 0) {
                System.out.println("number " + i + " is odd.");
            } else {
                System.out.println("number " + i + " is even");
            }
        }

    public static void main(String[] args) {
        // #1
        oddOrNot(13);
        oddOrNot(12);
        oddOrNot(783);
        // #2
        dayOfTheWeek(1);
        dayOfTheWeek(2);
        dayOfTheWeek(3);
        dayOfTheWeek(144);
        // #3
        printContinent("Spain");
        printContinent("Kenya");
        printContinent("Norway");
        // #4
        Product product1 = new Product("Fish", 3, 33);
        Product product2 = new Product("Meat", 1000, 12);
        Product product3 = new Product("Milk", 99, 30);
        Product product4 = new Product("Chocolate", 40, 160);
        Product.mostExpensive(product1, product2, product3, product4);
        Product.mostAvailable(product1, product2, product3, product4);

    }
}
