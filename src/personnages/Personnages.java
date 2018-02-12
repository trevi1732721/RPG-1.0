package personnages;

/**
 * Created by TreVi1732721 on 2018-01-29.
 */
public abstract class Personnages {
    protected int nbVie;
    protected int nbDeff;
    protected String nom;

    public void setNbDeff(int nbDeff) {
        this.nbDeff = nbDeff;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setNbVie(int nbVie) {

        this.nbVie = nbVie;
    }

    public abstract void attaque( Personnages attaquer);

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
