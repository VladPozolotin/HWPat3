package org.example;

public class Main {
    public static void main(String[] args) {
        for (int r : new Randoms(35, 54)) {
            System.out.println("Случайное число: " + r);
            if (r == 42) {
                System.out.println("Выпало число 42, давайте на этом закончим");
                break;
            }
        }
    }
}