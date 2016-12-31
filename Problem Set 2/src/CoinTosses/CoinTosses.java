package CoinTosses;

import java.util.Scanner;

public class CoinTosses {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("For each coin toss enter either h for heads or t for tails.\n");
        int heads = 0, tails = 0, num = 1, toss = 8; // Initializing all my variables
        for (toss = 8; toss > 0; toss--) {
            System.out.print("Toss " + num + ": ");
            num++;
            String coinFlip = keyboard.next();
            int h = coinFlip.indexOf('h'), t = coinFlip.indexOf('t');	//my way of finding out if
            if (h != -1) {						// the coin flip is a heads or tails.
                heads++;
            } else {
                tails++;
            }
        }
        double resultA = heads / .08, resultB = tails / .08;	//dividing to get my results
        System.out.print("Number of heads: " + heads + "\nNumber of tails: "
                + tails + "\nPercent heads: " + resultA + "\nPercent tails: " + resultB);
    }
}
