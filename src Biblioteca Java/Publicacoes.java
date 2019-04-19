/**
 * @author Luiz Henrique Cherri
 */
public abstract class Publicacoes extends Item {
    protected int npag;

    public void setNpag (int nnpag){
        npag = nnpag;
    }
    public int getNpag () {
        return (npag);
    }

}
