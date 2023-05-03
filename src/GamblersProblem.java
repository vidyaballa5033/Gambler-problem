import java.util.Scanner;

public class GamblersProblem {
        public static void main(String[] args) {
            System.out.println("Enter the time you want to stimulate");
            Scanner sc = new Scanner(System.in);
            int n=sc.nextInt();
            int loss = 0;
            int win = 0;
            for (int i = 0 ; i<n ; i++){
                int startingAmount = 100;
                int bettingAmount = 1;
                int count = 0;
                while (startingAmount > 0 && startingAmount < 200) {
                    int chance = (int) (Math.random() * 10) % 2;
                    if (chance == 0) {
                        startingAmount = startingAmount - bettingAmount;
                    } else {
                        startingAmount = startingAmount + bettingAmount;
                    }
                    count++;
                }
                System.out.println("");
                System.out.println("Number of games played = " + count);
                System.out.println("Gambler Amount = " + startingAmount);
                if (startingAmount == 0) {
                    System.out.println("Gambler Lost");
                    loss++;
                } else {
                    System.out.println("Gambler Won");
                    win++;
                }
            }
            System.out.println("");
            System.out.println("Gambler won = " +win);
            System.out.println("Gamler lost = "+ loss);

        }
    }

