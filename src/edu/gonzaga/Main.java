package edu.gonzaga;

class Adder {
    int val1;
    int val2;

    public Adder(int new_val1, int new_val2) {
        val1 = new_val1;
        val2 = new_val2;
    }


}

public class Main {
    public static void main(String args[]) {
        System.out.println("Starting app");
        Adder adder = new Adder(10, 20);
        Sysrem.out.println("Sup dude. This is a new print line.")

        System.out.println("App finished.");
    }
}