/**
 * @author Luiz Henrique Cherri
 */
import javax.swing.*;
import java.awt.event.*;


public abstract class Item implements ActionListener {
    
       private int codigo;
       private String disp;
       Item (){
            codigo = -1;
       }

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

       public abstract void print(JTextArea txt);
       public abstract void read();

}