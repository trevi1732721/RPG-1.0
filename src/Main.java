import java.util.Scanner;

/**
 * Created by TreVi1732721 on 2018-01-29.
 */
public class Main {
    public static void main(String[] args) {
        Personnages[] perso = new Personnages[2];
        int choix;
        boolean choix2 = true;
        for (int i = 0; i < 2; i++) {
            while(choix2){
                choix2 = false;
                System.out.print("Quel est la classe du joueur 1?\n" +
                        "1- Barbare\n" +
                        "2- Paladin\n" +
                        "3- Mage noir\n" +
                        "4- Mage Rouge");
                Scanner sc = new Scanner(System.in);
                choix = sc.nextInt();
                switch (choix) {
                    case 1:
                        perso[i] = new Barbare();
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                    case 4:
                        break;
                    default:choix2 = true;
                }
            }
        }
    }
}

