package personnages;
import sorts.*;
import personnages.Mage;

/**
 * Created by TreVi1732721 on 2018-01-29.
 */
public class MageRouge extends Mage {
    public MageRouge(){
        ptSorts = 40;
        listeSorts[0]= new Poison();
        listeSorts[1]= new Mort();
    }
}
