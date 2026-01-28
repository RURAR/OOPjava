import java.io.*;
import java.util.*;

public class MathPuzzleGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.print("Enter difficulty level (1-Easy, 2-Medium, 3-Hard): ");
        int level = sc.nextInt();
        int score = 0;

        try {
            Scanner fr = new Scanner(new File("questions.txt"));
            while (fr.hasNextLine()) {
                String[] p = fr.nextLine().split(",");
                if (p.length != 3) continue;
                if (Integer.parseInt(p[2]) == level) {
                    System.out.print(p[0] + " = ");
                    int ans = sc.nextInt();
                    if (ans == Integer.parseInt(p[1])) score++;
                }
            }
            fr.close();
        } catch (Exception e) {
            System.out.println("Error reading questions file.");
        }

        try {
            FileWriter fw = new FileWriter("scores.txt", true);
            fw.write("Player: " + name + ", Difficulty: " + level + ", Score: " + score + "\n");
            fw.close();
            System.out.println("Score saved successfully.");
        } catch (Exception e) {
            System.out.println("Error writing score file.");
        }
        System.out.println("Thank you for playing!");
    }
}
