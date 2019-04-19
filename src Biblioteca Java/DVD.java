/**
 * @author Luiz Henrique Cherri
 */
public class DVD extends Midia {
    private int tracks;

    public void setTracks (int ntracks) {
           tracks = ntracks;
    }
    public int getTracks () {
           return (tracks);
    }

    @Override
    public void imprimir() {
        System.out.println("\nDados do DVD");
        System.out.println("Codigo        : " + codigo);
        System.out.println("Disp.         : " + disp);
        System.out.println("Dual layer    : " + dul);
        System.out.println("Conteudo      : " + conteudo);
        System.out.println("Num. de Faixas: " + tracks);
    }
}
