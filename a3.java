// Superclass
class Superclass {
    int number = 56;
}

// Child class or subclass or derived class
class Subclass extends Superclass {
    /* The same variable num is declared in the subclass
    * which is already present in the Superclass
    */

    int number = 96;
    void printNumber() {
        System.out.println(number);
        // To access the number variable of the superclass, we can use the super keyword
        // System.out.println(super.number);    
    }
}

class Main2 {
    public static void main(String[] args) {
        Subclass sub = new Subclass();
        sub.printNumber();
    }
}