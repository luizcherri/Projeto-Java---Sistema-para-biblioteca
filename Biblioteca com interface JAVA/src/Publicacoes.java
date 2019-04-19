/**
 * @author Luiz Henrique Cherri
 */
public abstract class Publicacoes extends Item {
    private int npag;

    public void setNpag (int nnpag){
        npag = nnpag;
    }
    public int getNpag () {
        return (npag);
    }

}
