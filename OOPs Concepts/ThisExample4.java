// Using this to return the current class instance


class Example {
    Example getObject() {
        return this; // Returning current class instance
    }

    void show() {
        System.out.println("Method called using returned object");
    }

    public static void main(String args[]) {
        Example obj = new Example();
        obj.getObject().show();
    }
}
