/**
 * Created by TreVi1732721 on 2018-01-29.
 */
public abstract class Guerrier extends Personnages {
    protected int nbForce;

    public void attaque(Personnages perso, Personnages attaquer){
        perso.setNbVie(perso.getNbVie()-(nbForce*2-perso.getNbDeff()));
        if(perso instanceof Paladin){
            System.out.println("Le Paladin attaque... ");
        }if(perso instanceof Barbare){
            System.out.println("Le Barbare attaque... ");
        }if(perso instanceof MageNoir){
            System.out.println("Le mage noir attaque... ");
        }if(perso instanceof MageRouge){
            System.out.println("Le mage rouge attaque... ");
        }
    }
}
