package controller;

public class Test01 {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 20; j++) {
                System.out.println(i + " " + j);
            }
        }
    }
}
