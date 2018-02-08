/**
 * Created by TreVi1732721 on 2018-01-29.
 */
public class Glace extends Sorts {
    public void Glace(){
        coût = 5;
        nom = "Pic de Glace";
    }
    public void lancerSorts(Mage attaque, Personnages blessé){
        if(attaque.getPtSorts()>=5){
            attaque.setPtSorts(attaque.getPtSorts()-coût);
            blessé.setNbVie(blessé.getNbVie()-(7-blessé.getNbDeff()));
            System.out.print("IL lance le sort Pic de glace !");
            if(blessé instanceof Paladin){
                System.out.println("Le Paladin perd "+ (7-blessé.getNbDeff()) +" vies... ");
            }if(blessé instanceof Barbare){
                System.out.println("Le Barbare perd "+ (7-blessé.getNbDeff()) +" vies... ");
            }if(blessé instanceof MageNoir){
                System.out.println("Le mage noir perd "+ (7-blessé.getNbDeff()) +" vies... ");
            }if(blessé instanceof MageRouge){
                System.out.println("Le mage rouge perd "+ (7-blessé.getNbDeff()) +" vies... ");
            }
        }
    }
}
