package personnages;
import sorts.*;
/**
 * Created by TreVi1732721 on 2018-01-29.
 */
public class MageNoir extends Mage {
    public MageNoir(){
        ptSorts = 50;
        listeSorts[0]= new Feu();
        listeSorts[1]= new Glace();
    }
}
