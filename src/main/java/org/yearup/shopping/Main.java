package org.yearup.shopping;

public class Main {

    public static void main(String[] args) {

        System.out.println(
                "Hello Human here is your list");


        Fruit[] allTheFruits = {
                new Fruit(Size.LARGE, "orange"),
                new Fruit(Size.SMALL, "orange"),
                new Fruit(Size.LARGE, "apple"),
                new Fruit(Size.SMALL, "apple"),
                new Fruit(Size.MEDIUM, "watermelon")
        };

        printItemCount(allTheFruits.length);

        for (Fruit fruit : allTheFruits) {
            System.out.println(fruit.size() + " " + fruit.name());
        }

        System.out.println(
                "Enjoy your list!");

        Receipt receipt = new Receipt("Paul", 25);

        printReceipt(receipt);
    }

    public static void printReceipt(Receipt r) {

        System.out.println(
                "Thank you " + r.name() + " you owe " + r.amount()
        );
    }

    public static void printItemCount(int n) {

        System.out.println(
                "You have " + n + " items");

    }


}
