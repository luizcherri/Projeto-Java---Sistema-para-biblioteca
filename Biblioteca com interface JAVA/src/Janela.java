import javax.swing.*;


import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class Janela extends JFrame implements ActionListener {
    Vector<Item> v = new Vector<Item>();
    private String title;
	private JTextField tf1, tf2;
	private JTextArea txt01;
	private Vector<Item> items;
    private JComboBox ich;
    private JTextArea txt = new JTextArea(20, 40);

	public Janela(String title) {
		this.title = title;
		this.items = new Vector();
	}



	public void build() {
        GridBagLayout grid = new GridBagLayout();
        GridBagConstraints c = new GridBagConstraints();
        this.setTitle(this.title);

		this.setSize(700, 500);
        this.setLayout(grid);
        c.fill = GridBagConstraints.BOTH;
        
        this.ich = new JComboBox();
            ich.addItem (" Livro    ");
            ich.addItem (" Revista  ");
            ich.addItem (" CD       ");
            ich.addItem (" DVD      ");

        JButton insert = new JButton("Inserir");
        JButton search = new JButton("Buscar");
        JButton remove = new JButton("Remover");
        JButton print  = new JButton("Imprimir");
        JButton exit   = new JButton("Sair");
        
        tf1 = new JTextField(20);
        tf2 = new JTextField(20);

        txt.setLineWrap( true );
        txt.setEditable(false);
        txt.setFont(new Font("Courier", Font.PLAIN , 12));
        JScrollPane scrlVisor = new JScrollPane( txt ); //para dar rolagem a janela


        grid.setConstraints(ich  , c);
        c.gridwidth = GridBagConstraints.REMAINDER;
        grid.setConstraints(insert, c);
        c.gridwidth = GridBagConstraints.RELATIVE;

        c.gridwidth = GridBagConstraints.REMAINDER;
        grid.setConstraints(print , c);
        c.gridwidth = GridBagConstraints.RELATIVE;

        grid.setConstraints(tf2  , c);
        c.gridwidth = GridBagConstraints.REMAINDER;
        grid.setConstraints(remove, c);
        c.gridwidth = GridBagConstraints.RELATIVE;

        grid.setConstraints(tf1  , c);
        c.gridwidth = GridBagConstraints.REMAINDER;
        grid.setConstraints(search, c);
        c.gridwidth = GridBagConstraints.RELATIVE;

        c.gridwidth = GridBagConstraints.REMAINDER;
        grid.setConstraints(scrlVisor, c);
        grid.setConstraints(exit  , c);

        insert.addActionListener(this);
        search.addActionListener(this);
        print.addActionListener(this);
        exit.addActionListener(this);
        remove.addActionListener(this);
        
        this.add(ich);
		this.add(insert);
        this.add(print);
        this.add(new JLabel("Codigo: "));
        this.add(tf2);
        this.add(remove);
        this.add(new JLabel("Codigo: "));
        this.add(tf1);
        this.add(search);
        this.add(scrlVisor );
        this.add(exit);

        
        
    }

	public void actionPerformed(ActionEvent e) {

        if ((v.size()>0)&&(v.lastElement().getCodigo() == -1)){ v.remove(v.size()-1);} // Corrige o problema do cancelar

		if (e.getActionCommand().equals("Inserir")) {
            if (ich.getSelectedIndex() == 0) {
                v.add(new Livro());
            }
            else if (ich.getSelectedIndex() == 1) {
                v.add(new Revista());
            }
            else if (ich.getSelectedIndex() == 2) {
                v.add(new CD());
            }
            else if (ich.getSelectedIndex() == 3) {
                v.add(new DVD());
            }
            v.lastElement().read();
            
            
        }
        


        else if (e.getActionCommand().equals("Imprimir")){
            txt.setText("");
            for (int i = 0 ; i < v.size() ; i++){
                v.get(i).print(txt);
            }
            if (v.size()==0){
                txt.setText("...Nenhum registro encontrado...");
            }
        }

        else if (e.getActionCommand().equals("Remover")){
            txt.setText("");
            boolean flag = false;
            for (int i = 0 ; i < v.size() ; i++){
                if (v.get(i).getCodigo() == Integer.parseInt(tf2.getText())){
                    txt.append("Item(s) removido(s): \n");
                    v.get(i).print(txt);
                    v.remove(i);
                    flag = true;
                }
            }
            if (flag == false) {
                    txt.setText("...Registro inexistente...");
            }
        }

        else if (e.getActionCommand().equals("Buscar")){
            txt.setText("");
            boolean flag = false;
            for (int i = 0 ; i < v.size() ; i++){
                if (v.get(i).getCodigo() == Integer.parseInt(tf1.getText())){
                    v.get(i).print(txt);
                    flag = true;
                }
            }
            if (flag == false) {
                txt.setText("...Nada encontrado...");
            }
        }
        else if (e.getActionCommand().equals("Sair")){
            System.exit(0);
        }
        

        
       
        
	}
}
