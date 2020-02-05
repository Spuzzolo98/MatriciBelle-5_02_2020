package matriciveremanonquadrate;

import java.util.Scanner;
import java.util.Random;

public class Matriciveremanonquadrate {

    public static void main(String[] args) {
        int colonne = 0, righe = 0;
        Scanner scenario = new Scanner(System.in);
        Random rando = new Random();

        System.out.print("righe? ");
        righe = scenario.nextInt();
        System.out.print("colonne? ");
        colonne = scenario.nextInt();
        int matro[][] = new int[righe][colonne];

        //actual inserimento dei numeri
        for (int i = 0; i < righe; i++) {
            for (int j = 0; j < colonne; j++) {
                matro[i][j] = rando.nextInt(10);
            }
        }

        //parte uno del codice (primo print)
        for (int i = 0; i < righe; i++) {
            for (int j = 0; j < colonne; j++) {
                if (i % 2 == 0) {
                    System.out.print(matro[i][j] + " ");
                }
                if (i % 2 == 1) {
                    if (j % 2 == 0) {
                        System.out.print(matro[i][j] + " ");
                    }
                    if (j % 2 == 1) {
                        System.out.print("  ");
                    }
                }
            }
            System.out.println();
        }
        
        //spazio generico
        System.out.println();

        //seconda parte, è identica alla prima però... più efficiente non si poteva?
        for (int i = 0; i < righe; i++) {
            for (int j = 0; j < colonne; j++) {
                if (i % 2 == 0) {
                    System.out.print("  ");
                }
                if (i % 2 == 1) {
                    if (j % 2 == 0) {
                        System.out.print("  ");
                    }
                    if (j % 2 == 1) {
                        System.out.print(matro[i][j] +" ");
                    }
                }
            }
            System.out.println();
        }
    }
}
