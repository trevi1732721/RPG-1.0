import java.util.Scanner;

/**
 * Created by TreVi1732721 on 2018-01-29.
 */
public class Main {
    public static void main(String[] args) {
        Personnages[] perso = new Personnages[2];
        choix(perso[0]);
        choix(perso[1]);
    }
    public static void choix(Personnages perso){
        int choix;
        boolean choix2 = true;
        for (int i = 0; i < 2; i++) {
            choix2=true;
            while(choix2){
                choix2 = false;
                System.out.print("Quel est la classe du joueur "+(i+1)+"?\n" +
                        "1- Barbare\n" +
                        "2- Paladin\n" +
                        "3- Mage noir\n" +
                        "4- Mage Rouge");
                Scanner sc = new Scanner(System.in);
                choix = sc.nextInt();
                switch (choix) {
                    case 1:
                        perso = new Barbare();
                        break;
                    case 2:
                        perso = new Paladin();
                        break;
                    case 3:
                        perso = new MageNoir();
                        break;
                    case 4:
                        perso = new MageRouge();
                        break;
                    default:choix2 = true;System.out.print("\nchoix invalide\n");
                }
            }
        }
    }
}

