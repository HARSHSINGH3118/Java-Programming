class Variables {
    int data = 50; // Instance variable
    static int m = 100; // Static variable

    void method() {
        int n = 90; // Local variable
        System.out.println("Local variable n: " + n);
    }

    public static void main(String[] args) {
        Variables obj = new Variables(); // Creating an object of class A

        // Accessing instance and static variables
        System.out.println("Instance variable data: " + obj.data);
        System.out.println("Static variable m: " + Variables.m);

        // Calling the method
        obj.method();
    }
}

// Output
// Instance variable data: 50
// Static variable m: 100
// Local variable n: 90