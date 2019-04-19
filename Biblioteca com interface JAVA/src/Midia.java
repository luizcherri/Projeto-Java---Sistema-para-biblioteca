/**
 * @author Luiz Henrique Cherri
 */
public abstract class Midia extends Item {

    private String conteudo;

    public void setConteudo (String nconteudo) {
        conteudo = nconteudo;
    }

    public String getConteudo () {
        return (conteudo);
    }

}
