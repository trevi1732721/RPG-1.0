package personnages;

import personnages.Barbare;

/**
 * Created by TreVi1732721 on 2018-01-29.
 */
public abstract class Guerrier extends Personnages {
    protected int nbForce;

    public void attaque( Personnages attaquer){
        attaquer.setNbVie(attaquer.getNbVie()-(nbForce*2-attaquer.getNbDeff()));
    }
}
