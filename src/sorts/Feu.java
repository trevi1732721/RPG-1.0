package sorts;

import personnages.*;

/**
 * Created by TreVi1732721 on 2018-01-29.
 */
public class Feu extends Sorts {
    public void Feu(){
        coût = 5;
        nom = "Boule de sorts.Feu";
    }

    public void lancerSorts(Mage attaque, Personnages blessé){
        if(attaque.getPtSorts()>=5){
            attaque.setPtSorts(attaque.getPtSorts()-coût);
            blessé.setNbVie(blessé.getNbVie()-(5+attaque.getArme().magie()));
            }
        }
    }
