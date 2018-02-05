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
        }

    }
}
