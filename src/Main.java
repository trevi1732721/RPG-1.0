import java.util.Scanner;

/**
 * Created by TreVi1732721 on 2018-01-29.
 */
public class Main {
    protected int joueur;
    public static void main(String[] args) {
        Personnages[] perso = new Personnages[2];
        boolean mort= false;
        int attaque=0, fin=0;
        //choix
        perso[0] = choix(1);
        perso[1] = choix(2);
        //combat
        while(!mort){
            perso[0].attaque(perso[1]);
            fin = vérifier(perso[0],perso[1]);
            if(fin!= 1 ||fin!= 2 ){
                mort=true;
            }
            perso[1].attaque(perso[0]);
            fin = vérifier(perso[1],perso[0]);
            if(fin!= 1 ||fin!= 2 ){
                mort=true;
            }
        }
        if(fin==1){
            System.out.print("Le personnage de "+perso[attaque%2].getClass()+" à gagné!");
        }if(fin==2){
            System.out.print("match null, il n'y a plus de magie!");
    }
    }
    public static Personnages choix(int joueur){
        int choix;
        boolean choix2 = true;
        choix2 = false;
        System.out.print("Quelle est la classe du joueur " + joueur + "?\n" +
                "1- Barbare\n" +
                "2- Paladin\n" +
                "3- Mage noir\n" +
                "4- Mage Rouge");
        Scanner sc = new Scanner(System.in);
        choix = sc.nextInt();
        switch (choix) {
            case 1:
                return new Barbare();
            case 2:
                return new Paladin();
            case 3:
                return new MageNoir();
            case 4:
                return new MageRouge();
            default: return new Barbare();
        }
    }
    public static int vérifier(Personnages one,Personnages two){
        if(one.getNbVie()<=0){
            return 1;
        }else if(one instanceof Mage && two instanceof Mage){
            if(((Mage)one).getPtSorts()<=0 &&((Mage)two).getPtSorts()<=0 ){
                return 2;
            }
            else{
                return 0;
            }
        }else{
            return 0;
        }
    }
}

