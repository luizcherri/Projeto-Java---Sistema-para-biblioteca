/**
 * @author Luiz Henrique Cherri
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Revista extends Publicacoes {
    private String editora;
    private String ISSN;

    private JTextField tf1;
    private JTextField tf2;
    private JTextField tf3;
    private JTextField tf4;
    private JTextField tf5;

    private JFrame j;
 
    @Override
    public void print(JTextArea txt) {
        txt.append("::REVISTA\n");
        txt.append("Codigo          : "+this.getCodigo()+"\n");
        txt.append("Disponibilidade : "+this.getDisp()  +"\n");
        txt.append("Num. de Paginas : "+this.getNpag()  +"\n");
        txt.append("Autor           : "+this.editora    +"\n");
        txt.append("ISBN            : "+this.ISSN       +"\n\n");

    }

    public void read ()  {
        j = new JFrame();
        FlowLayout lay = new FlowLayout(0);
        j.setTitle(":: Lendo dados da revista");
        j.setSize(470, 330);
        j.setLayout(lay);

        tf1 = new JTextField(40);
        tf2 = new JTextField(40);
        tf3 = new JTextField(40);
        tf4 = new JTextField(40);
        tf5 = new JTextField(40);
        JLabel l1 = new JLabel("Codigo : ");
        JLabel l2 = new JLabel("Disponibilidade : ");
        JLabel l3 = new JLabel("Nº de Paginas : ");
        JLabel l4 = new JLabel("Editora : ");
        JLabel l5 = new JLabel("ISSN : ");

        JButton ok = new JButton ("Ok");
        JButton cancel = new JButton ("Cancelar");

        j.add(l1);
        j.add(tf1);
        j.add(l2);
        j.add(tf2);
        j.add(l3);
        j.add(tf3);
        j.add(l4);
        j.add(tf4);
        j.add(l5);
        j.add(tf5);

        j.add (ok);
        j.add(cancel);
        j.setVisible(true);

        ok.addActionListener(this);
        cancel.addActionListener(this);

    }

    public void actionPerformed(ActionEvent e) {
        
        if (e.getActionCommand().equals("Ok")){
            this.setCodigo( Integer.parseInt(tf1.getText()) );
            this.setDisp( tf2.getText() );
            this.setNpag( Integer.parseInt(tf3.getText()) );
            this.editora = tf4.getText();
            this.ISSN = tf5.getText();
            j.dispose();
            JOptionPane.showMessageDialog(j, "Dados Armazenados", "Comfirmação", 1);

        }
        else if (e.getActionCommand().equals("Cancelar")){
            j.dispose();
        }
    }
}
