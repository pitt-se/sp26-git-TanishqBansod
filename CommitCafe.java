public class CommitCafe {

    private static String barista = "Tanishq Bansod";
    private static String nickname = "The Coffee Master"; // STUDENT_TODO_1B: Add a nickname or title for the barista

    private static int cups = 0;

    public static void brew(String drink) {
        // STUDENT_TODO_2A: Implement - add 1 to cups & print a message
            cups++;
            System.out.println(barista + " brewed a cup of " + drink + ". Total cups: " + cups);
        // STUDENT_TODO_2B: Add a second brew-related improvement
            if (drink.equals("Espresso")) {
                System.out.println("That was espressoly made for you");
            } else if (drink.equals("Latte")) {
                System.out.println("Better latte than never");
            }
    }

    public static void printSummary() {
        System.out.println("[SUMMARY] " + nickname + " brewed " + cups + " cups today.");
    }

    public static void main(String[] args) {
        brew("Espresso");
        brew("Latte");
        printSummary();
    }
}