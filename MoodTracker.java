import java.util.Scanner;

public class MoodTracker {

    public static void main(String[] args) {

        Scanner ob = new Scanner(System.in);

        System.out.println("=================================");
        System.out.println("       DAILY MOOD TRACKER");
        System.out.println("=================================");

        System.out.println("\nHow are you feeling today?");
        System.out.println("1. Happy 😊");
        System.out.println("2. Calm 😌");
        System.out.println("3. Tired 😴");
        System.out.println("4. Stressed 😤");
        System.out.println("5. Emotional 🥹");

        System.out.print("\nEnter your choice (1-5): ");

        if (ob.hasNextInt()) {

            int choice = ob.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("Your mood: Happy 😊");
                    System.out.println("Yay! Keep enjoying your day! ✨");
                    break;

                case 2:
                    System.out.println("Your mood: Calm 😌");
                    System.out.println("Take it easy and enjoy the peaceful moment. 🌿");
                    break;

                case 3:
                    System.out.println("Your mood: Tired 😴");
                    System.out.println("Maybe you deserve a little rest today. 💤");
                    break;

                case 4:
                    System.out.println("Your mood: Stressed 😤");
                    System.out.println("Take a breath. One thing at a time. 🫶");
                    break;

                case 5:
                    System.out.println("Your mood: Emotional 🥹");
                    System.out.println("It's okay to feel emotional sometimes. 💗");
                    break;

                default:
                    System.out.println("Invalid choice. Please choose a number from 1 to 5.");
            }

        } else {
            System.out.println("Invalid choice. Please enter a number from 1 to 5.");
        }
    }
}
