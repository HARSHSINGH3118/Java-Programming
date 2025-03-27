public class Staticsvariables {
    int data = 50; // Instance variable
    static int m = 100; // Static variable

    void method() {
        int n = 90; // Local variable
        System.out.println("Local variable n: " + n);
    }

    public static void main(String[] args) {
        // Creating an object to access instance variables and methods
        Staticsvariables obj = new Staticsvariables();
        
        // Printing instance and static variables
        System.out.println("Instance variable data: " + obj.data);
        System.out.println("Static variable m: " + Staticsvariables.m);

        // Calling the method to print the local variable
        obj.method();
    }
}
