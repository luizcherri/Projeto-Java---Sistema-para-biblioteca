/**
 * @author Luiz Henrique Cherri
 */
public class CD extends Midia {
    private String duracao;

    public void setDuracao (String nduracao) {
           duracao = nduracao;
    }

    public String getDuracao () {
           return (duracao);
    }

    @Override
    public void imprimir() {
        System.out.println("\nDados do CD");
        System.out.println("Codigo    : " + codigo);
        System.out.println("Disp.     : " + disp);
        System.out.println("Dual layer: " + dul);
        System.out.println("Conteudo  : " + conteudo);
        System.out.println("Duracao   : " + duracao);
    }
}
