/**
 * Created by TreVi1732721 on 2018-01-29.
 */
public abstract class Guerrier extends Personnages {
    protected int nbForce;

    public void attaque(Personnages perso){
        perso.setNbVie(perso.getNbVie()-(nbForce*2-perso.getNbDeff()));
    }
}
