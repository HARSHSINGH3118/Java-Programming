// Using this as a parameter in method call
class Example {
    void show(Example obj) {
        System.out.println("Method called using this as parameter");
    }

    void display() {
        show(this); // Passing current class instance
    }

    public static void main(String args[]) {
        Example obj = new Example();
        obj.display();
    }
}
