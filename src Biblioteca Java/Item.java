/**
 * @author Luiz Henrique Cherri
 */
public abstract class Item {
    
       protected int codigo;
       protected String disp;

       public void setCodigo (int ncodigo) {
           codigo = ncodigo;
       }

       public void setDisp (String ndisp) {
           disp = ndisp;
       }

       public int getCodigo () {
           return (codigo);
       }

       public String getDisp () {
           return (disp);
       }

       public abstract void imprimir();

}