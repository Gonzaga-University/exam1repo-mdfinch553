package edu.gonzaga;

class Adder {
    int val1;
    int val2;

    public Adder(int new_val1, int new_val2) {
        val1 = new_val1;
        val2 = new_val2;
    }

    public int multiply3Numbers(int one, int two, int three){
        return one * two * three
    }


}

public class Main {
    public static void main(String args[]) {
        System.out.println("Starting app");
        Adder adder = new Adder(10, 20);
        System.out.println("Sup dude. This is a new print line.");

        System.out.println(adder.multiply3Numbers(3,77,28318)); 

        System.out.println("App finished.");
    }
}