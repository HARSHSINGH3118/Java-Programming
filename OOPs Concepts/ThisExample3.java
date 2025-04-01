// Using this to invoke the current class constructor

class Example {
    Example() {
        this(10); // Calling the parameterized constructor
        System.out.println("Default Constructor");
    }

    Example(int x) {
        System.out.println("Parameterized Constructor: " + x);
    }

    public static void main(String args[]) {
        Example obj = new Example();
    }
}
