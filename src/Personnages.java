/**
 * Created by TreVi1732721 on 2018-01-29.
 */
public abstract class Personnages {
    protected int nbVie;
    protected int nbDeff;
    protected String nom;
    public abstract void attaque();

    public int getNbVie() {
        return nbVie;
    }

    public int getNbDeff() {
        return nbDeff;
    }

    public String getNom() {
        return nom;
    }
}
