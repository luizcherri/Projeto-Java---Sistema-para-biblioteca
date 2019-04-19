/**
 * @author Luiz Henrique Cherri
 */
public abstract class Midia extends Item {

    protected String dul;
    protected String conteudo;

    public void setDul (String ndul) {
        dul = ndul;
    }
    public void setConteudo (String nconteudo) {
        conteudo = nconteudo;
    }
    public String getDul () {
        return (dul);
    }
    public String getConteudo () {
        return (conteudo);
    }

}
