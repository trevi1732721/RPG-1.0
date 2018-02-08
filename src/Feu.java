/**
 * Created by TreVi1732721 on 2018-01-29.
 */
public class Feu extends Sorts{
    public void Feu(){
        coût = 5;
        nom = "Boule de Feu";
    }

    public void lancerSorts(Mage attaque, Personnages blessé){
        if(attaque.getPtSorts()>=5){
            attaque.setPtSorts(attaque.getPtSorts()-coût);
            blessé.setNbVie(blessé.getNbVie()-5);
            System.out.print("IL lance le sort Boule de feu !");
            if(blessé instanceof Paladin){
                System.out.println("Le Paladin perd 5 vies... ");
            }if(blessé instanceof Barbare){
                System.out.println("Le Barbare perd 5 vies... ");
            }if(blessé instanceof MageNoir){
                System.out.println("Le mage noir perd 5 vies... ");
            }if(blessé instanceof MageRouge){
                System.out.println("Le mage rouge perd 5 vies... ");
            }
        }
    }
}
