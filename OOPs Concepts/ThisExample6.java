// Using this as an argument in constructor call
class B;

class A {
    A(B obj) {
        System.out.println("Class A constructor called");
    }
}

class B {
    void display() {
        A obj = new A(this); // Passing current class instance
    }

    public static void main(String args[]) {
        B obj = new B();
        obj.display();
    }
}
