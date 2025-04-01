 

public class BreakContinueDemo {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                System.out.println("Skipping iteration 3 (continue)");
                continue;
            }
            if (i == 5) {
                System.out.println("Breaking at iteration 5");
                break;
            }
            System.out.println("Iteration: " + i);
        }
    }
}
