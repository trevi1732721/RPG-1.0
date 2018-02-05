/**
 * Created by TreVi1732721 on 2018-01-29.
 */
public abstract class Mage extends Personnages {
    protected int ptSorts, nbDeff = 1, nbVie = 60, random;
    protected Sorts[]listeSorts = new Sorts[2];

    public void attaque(Personnages perso){
        random= (int) Math.random();
        listeSorts[random].lancerSorts();
    }
}
