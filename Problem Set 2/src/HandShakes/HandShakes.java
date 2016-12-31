package HandShakes;

import java.util.Scanner;

public class HandShakes {

    public static void main(String[] args) {
        System.out.println("How many guests are invited to the party: ");
        Scanner keyboard = new Scanner(System.in);
        int guests = keyboard.nextInt();
        int guestS = 1, handshakes = 1, total = 1;// initializing my variables

        for (int handShakes = 1; guests >= handShakes; handShakes += 1) {
            System.out.println("When Guest " + guestS + " arrives, Handshakes=" + 
                                handshakes + ", Total Handshakes=" + total);
            guestS++;
            handshakes++;
            total = guestS + total;
        }
    }
}
