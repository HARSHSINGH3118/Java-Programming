// Using this to refer to the current class instance variable

class Student {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;  // 'this' refers to the instance variable
        this.name = name;
    }

    void display() {
        System.out.println("ID: " + id + ", Name: " + name);
    }

    public static void main(String args[]) {
        Student s1 = new Student(101, "John");
        s1.display();
    }
}
