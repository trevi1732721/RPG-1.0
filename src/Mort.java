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
        }
        }
    }
}
