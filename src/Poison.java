/**
 * Created by TreVi1732721 on 2018-01-29.
 */
public class Poison extends Sorts{
    private int repetition = 0;
    public void Poison(){
        coût = 2;
        nom = "Empoisonnement";
    }
    public void lancerSorts(Mage attaque, Personnages blessé){
        if(attaque.getPtSorts()>=2){
            repetition = repetition+2;
            attaque.setPtSorts(attaque.getPtSorts()-coût);
            blessé.setNbVie(blessé.getNbVie()-(repetition));
            System.out.print("IL lance le sort Empoisonnement !");
            if(blessé instanceof Paladin){
                System.out.println("Le Paladin perd "+ (repetition) +" vies... ");
            }if(blessé instanceof Barbare){
                System.out.println("Le Barbare perd "+ (repetition) +" vies... ");
            }if(blessé instanceof MageNoir){
                System.out.println("Le mage noir perd "+ (repetition) +" vies... ");
            }if(blessé instanceof MageRouge){
                System.out.println("Le mage rouge perd "+ (repetition) +" vies... ");
            }
        }

    }
}
