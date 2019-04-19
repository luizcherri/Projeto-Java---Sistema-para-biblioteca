/**
 * @author Luiz Henrique Cherri
 */
public class Livro extends Publicacoes {
    private String autor;
    private String ISBN;

    public void setAutor(String nautor){
        autor = nautor;
    }
    public void setIsbn(String nisbn){
        ISBN = nisbn;
    }
    public String getAutor (){
        return (autor);
    }
    public String getIsbn (){
        return (ISBN);
    }

    @Override
    public void imprimir() {
        System.out.println("\nDados do Livro");
        System.out.println("Codigo      : " + codigo);
        System.out.println("Disp        : " + disp);
        System.out.println("Num. de pag.: " + npag);
        System.out.println("Autor       : " + autor);
        System.out.println("ISBN        : " + ISBN);
    }

}
