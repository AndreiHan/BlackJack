//@author AndreiHan
package backj;

import java.util.Scanner;

public class BackJ {

    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);

        System.out.println("Enter username");
        String userName = myObj.nextLine();

        String Restart = "R";
        while (Restart.equals("R")) {

            Deck Pachet = new Deck();
            Pachet.Suffle();
            Pachet.Suffle();

            int Player = 0, Dealer = 0, Carte = 0;

            System.out.println("----------------------------------------");

            System.out.println("Dealer: " + Pachet.deck[Carte]);
            Dealer += Integer.parseInt(Pachet.deck[Carte].substring(0, Pachet.deck[Carte].indexOf(" ")));
            Carte++;

            System.out.println("----------------------------------------");

            System.out.println(userName + ": " + Pachet.deck[Carte]);
            Player += Integer.parseInt(Pachet.deck[Carte].substring(0, Pachet.deck[Carte].indexOf(" ")));
            Carte++;

            System.out.println("----------------------------------------");

            String Situatie = "H";

            while (Situatie.equals("H")) {
                System.out.println("(S)tand or (H)it ?");
                Situatie = myObj.nextLine();
                if (Situatie.equals("H")) {
                    if (Integer.parseInt(Pachet.deck[Carte].substring(0, Pachet.deck[Carte].indexOf(" "))) == 1 && Player >= 11) {
                        Player += 1;
                        Carte++;
                    } else {

                        System.out.println(userName + ": " + Pachet.deck[Carte]);
                        Player += Integer.parseInt(Pachet.deck[Carte].substring(0, Pachet.deck[Carte].indexOf(" ")));
                        System.out.println("----------------------------------------");
                        System.out.println("Total = " + Player);
                        Carte++;
                    }
                }

                if (Player > 21) {
                    System.out.println("Over! You lost!");
                    Player = 0;
                    break;
                }
            }

            while (Dealer <= 17) {

                if (Integer.parseInt(Pachet.deck[Carte].substring(0, Pachet.deck[Carte].indexOf(" "))) == 1 && Dealer >= 7) {
                    Dealer += 1;
                    Carte++;
                } else {
                    Dealer += Integer.parseInt(Pachet.deck[Carte].substring(0, Pachet.deck[Carte].indexOf(" ")));
                }

            }

            System.out.println(" ");

            if (Player > Dealer) {
                System.out.println("Total Dealer: " + Dealer);
                System.out.println("You win");
            }

            if (Dealer >= Player) {
                System.out.println("Total Dealer: " + Dealer);
                System.out.println("You lost!");
            }

            System.out.println("  ");
            System.out.println("Play again? Enter R");
            Restart = myObj.nextLine();
        }

    }

}
