public class variblesnarrowiing { // Class name must match the filename exactly
    public static void main(String[] args) {
        float f = 10.5f;  // Float variable
        // int a = f; // Compile-time error (implicit narrowing not allowed)
        int a = (int) f; // Explicit type casting from float to int

        System.out.println("Float value f: " + f);
        System.out.println("Integer value a (after casting): " + a);
    }
}
