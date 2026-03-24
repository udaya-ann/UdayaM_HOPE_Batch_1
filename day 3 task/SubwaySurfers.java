import java.util.Scanner;
import java.util.Random;

public class SubwaySurfers{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int choice;
        int damage = 0;

        System.out.println("Subway Surfers Mini Game");

        do {
            int obstacle = rand.nextInt(3) + 1; 
            // 1 = Train, 2 = Barrier, 3 = Wall

            System.out.println("\nObstacle Ahead!");

            switch (obstacle) {
                case 1:
                    System.out.println("Train! (Jump)");
                    break;
                case 2:
                    System.out.println("Barrier! (Slide)");
                    break;
                case 3:
                    System.out.println("Wall! (Move Left/Right)");
                    break;
            }

            System.out.println("\nChoose Action:");
            System.out.println("1 - Move Left");
            System.out.println("2 - Move Right");
            System.out.println("3 - Jump");
            System.out.println("4 - Slide");

            choice = sc.nextInt();

            boolean correct = false;

            switch (obstacle) {
                case 1:
                    if (choice == 3) correct = true;
                    break;
                case 2:
                    if (choice == 4) correct = true;
                    break;
                case 3:
                    if (choice == 1 || choice == 2) correct = true;
                    break;
            }

            if (correct) {
                System.out.println("Safe move!");
            } else {
                damage++;
                System.out.println("You got hit! Damage = " + damage);
            }

            if (damage >= 3) {
                System.out.println("Game Over! Too much damage!");
                break;
            }

        } while (true);

        sc.close();
    }
}