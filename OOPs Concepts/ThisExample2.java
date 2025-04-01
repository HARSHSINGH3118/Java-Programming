// Using this to invoke the current class method


class Example {
    void show() {
        System.out.println("Show method called");
    }

    void display() {
        this.show();  // Invoking the current class method
    }

    public static void main(String args[]) {
        Example obj = new Example();
        obj.display();
    }
}
