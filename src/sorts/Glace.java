package sorts;

import personnages.*;

/**
 * Created by TreVi1732721 on 2018-01-29.
 */
public class Glace extends Sorts {
    public void Glace(){
        coût = 5;
        nom = "Pic de sorts.Glace";
    }
    public void lancerSorts(Mage attaque, Personnages blessé){
        if(attaque.getPtSorts()>=5){
            attaque.setPtSorts(attaque.getPtSorts()-coût);
            blessé.setNbVie(blessé.getNbVie()-(7-blessé.getNbDeff()+attaque.getArme().magie()));
        }
    }
}
