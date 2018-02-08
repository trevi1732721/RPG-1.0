/**
 * Created by TreVi1732721 on 2018-01-29.
 */
public class Mort extends Sorts{
    public void Mort(){
        coût = 10;
        nom = "Mort subite";
    }
    public void lancerSorts(Mage attaque, Personnages blessé){
        if(attaque.getPtSorts()>=10){
            attaque.setPtSorts(attaque.getPtSorts()-coût);
            int random = (int)(Math.random()*10);
        if(random==1){
            blessé.setNbVie(0);
            System.out.print("IL lance le sort Empoisonnement !");
            if(blessé instanceof Paladin){
                System.out.println("Le Paladin meurt... ");
            }if(blessé instanceof Barbare){
                System.out.println("Le Barbare meurt... ");
            }if(blessé instanceof MageNoir){
                System.out.println("Le mage noir meurt ... ");
            }if(blessé instanceof MageRouge){
                System.out.println("Le mage rouge meurt ... ");
            }
        }
        }
    }
}
