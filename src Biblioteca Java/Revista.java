/**
 * @author Luiz Henrique Cherri
 */
public class Revista extends Publicacoes {
    private String editora;
    private String ISSN;

    public void setEditora(String neditora){
        editora = neditora;
    }
    public void setIssn(String nissn){
        ISSN = nissn;
    }
    public String getEditora (){
        return (editora);
    }
    public String getIssn (){
        return (ISSN);
    }
    
    @Override
    public void imprimir() {
        System.out.println("\nDados da Revista");
        System.out.println("Codigo      : " + codigo);
        System.out.println("Disp.       : " + disp);
        System.out.println("Num. de pag.: " + npag);
        System.out.println("Editora     : " + editora);
        System.out.println("ISSN        : " + ISSN);
    }
}
