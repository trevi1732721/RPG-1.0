package personnages;
import armes.Armes;
import armes.Magique;
import sorts.*;

/**
 * Created by TreVi1732721 on 2018-01-29.
 */
public abstract class Mage extends Personnages {
    protected int ptSorts, nbDeff = 1, nbVie = 60, random;
    protected Sorts[]listeSorts = new Sorts[2];

    public Magique getArme() {
        return (Magique)arme;
    }

    public int getPtSorts() {
        return ptSorts;
    }

    public void setPtSorts(int ptSorts) {
        this.ptSorts = ptSorts;
    }

    public void attaque( Personnages attaquer){
        random= (int) (Math.random()*2);
        listeSorts[random].lancerSorts(this ,attaquer);
    }
}
