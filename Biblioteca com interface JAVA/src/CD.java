/**
 * @author Luiz Henrique Cherri
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CD extends Midia {
    private String duracao;

    private JTextField tf1;
    private JTextField tf2;
    private JTextField tf3;
    private JTextField tf4;

    private JFrame j;

    @Override
    public void print(JTextArea txt) {
        txt.append("::CD\n");
        txt.append("Codigo          : "+this.getCodigo()  +"\n");
        txt.append("Disponibilidade : "+this.getDisp()    +"\n");
        txt.append("Conteudo        : "+this.getConteudo()+"\n");
        txt.append("Duração         : "+this.duracao      +"\n\n");
    }
    public void read(){
        j = new JFrame();
        FlowLayout lay = new FlowLayout(0);
        j.setTitle(":: Lendo dados do CD");
        j.setSize(470, 280);
        j.setLayout(lay);

        tf1 = new JTextField(40);
        tf2 = new JTextField(40);
        tf3 = new JTextField(40);
        tf4 = new JTextField(40);
        JLabel l1 = new JLabel("Codigo : ");
        JLabel l2 = new JLabel("Disponibilidade : ");
        JLabel l3 = new JLabel("Conteudo : ");
        JLabel l4 = new JLabel("Duracao : ");

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

        j.add (ok);
        j.add(cancel);
        j.setVisible(true);

        ok.addActionListener(this);
        cancel.addActionListener(this);

    }

    public void actionPerformed (ActionEvent e) {
        if (e.getActionCommand().equals("Ok")){
            this.setCodigo( Integer.parseInt(tf1.getText()) );
            this.setDisp( tf2.getText() );
            this.setConteudo(  tf3.getText() );
            this.duracao = tf4.getText();
            j.dispose();
            JOptionPane.showMessageDialog(j, "Dados Armazenados", "Comfirmação", 1);

        }
        else if (e.getActionCommand().equals("Cancelar")){
            j.dispose();
        }
    }

}
