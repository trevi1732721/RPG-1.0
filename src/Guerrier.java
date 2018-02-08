/**
 * Created by TreVi1732721 on 2018-01-29.
 */
public abstract class Guerrier extends Personnages {
    protected int nbForce;

    public void attaque( Personnages attaquer){
        attaquer.setNbVie(attaquer.getNbVie()-(nbForce*2-attaquer.getNbDeff()));
        if(attaquer instanceof Paladin){
            System.out.println("Le Paladin attaque... ");
        }if(attaquer instanceof Barbare){
            System.out.println("Le Barbare attaque... ");
        }if(attaquer instanceof MageNoir){
            System.out.println("Le mage noir attaque... ");
        }if(attaquer instanceof MageRouge){
            System.out.println("Le mage rouge attaque... ");
        }
    }
}
