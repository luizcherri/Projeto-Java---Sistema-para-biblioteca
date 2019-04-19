/**
 * SEGUNDO TRABALHO DE P.O.O.
 * @author Luiz Henrique Cherri
 * @NUSP 5991829
 *
 * Para utilizar, somente siga os menus...
 *
 * Feito no windowsXP, compilado no NetBeans IDE 6.5.1
 *
 * Qualquer problema avise-me: luizcherri@gmail.com
 */

import java.util.*;
import java.io.*;
import java.lang.String;
public class Biblioteca {


    public static void main(String[] args) {
        
        Vector<Item> v = new Vector<Item>();
        int opc;
        int itype;
        int x;
        String s;

        Scanner sc = new Scanner (System.in);
        do {
            System.out.println ("\n--- BIBLIOTECA ---");
            System.out.println ("1 - Inserir");
            System.out.println ("2 - Buscar ");
            System.out.println ("3 - Listar ");
            System.out.println ("0 - Sair   ");
            
            opc = sc.nextInt(); sc.nextLine();

            switch (opc){
                case 1 :
                    System.out.println ("\nInserir o que?");
                    System.out.println ("1 - Livro  ");
                    System.out.println ("2 - Revista");
                    System.out.println ("3 - CD     ");
                    System.out.println ("4 - DVD    ");
                    itype = sc.nextInt(); sc.nextLine();
                    switch (itype){
                        case 1 :
                            Livro l = new Livro();
                            System.out.print ("Codigo >> ");
                            x = sc.nextInt(); sc.nextLine();
                            l.setCodigo(x);

                            System.out.print ("Disponibilidade >> ");
                            s = sc.nextLine();
                            l.setDisp(s);

                            System.out.print ("Numero de pagina >> ");
                            x = sc.nextInt(); sc.nextLine();
                            l.setNpag(x);

                            System.out.print ("Autor >> ");
                            s = sc.nextLine();
                            l.setAutor(s);

                            System.out.print ("ISBN >> ");
                            s = sc.nextLine();
                            l.setIsbn(s);
                            v.add (l);
                            break;
                        case 2 :
                            Revista r = new Revista();
                            System.out.print ("Codigo >> ");
                            x = sc.nextInt(); sc.nextLine();
                            r.setCodigo(x);

                            System.out.print ("Disponibilidade >> ");
                            s = sc.nextLine();
                            r.setDisp(s);

                            System.out.print ("Numero de pagina >> ");
                            x = sc.nextInt(); sc.nextLine();
                            r.setNpag(x);

                            System.out.print ("Editora >> ");
                            s = sc.nextLine();
                            r.setEditora(s);

                            System.out.print ("ISSN >> ");
                            s = sc.nextLine();
                            r.setIssn(s);
                            v.add (r);
                            break;
                        case 3 :
                            CD c = new CD();
                            System.out.print ("Codigo >> ");
                            x = sc.nextInt(); sc.nextLine();
                            c.setCodigo(x);

                            System.out.print ("Disponibilidade >> ");
                            s = sc.nextLine();
                            c.setDisp(s);

                            System.out.print ("Conteudo >> ");
                            s = sc.nextLine();
                            c.setConteudo(s);

                            System.out.print ("Dual Layer >> ");
                            s = sc.nextLine();
                            c.setDul(s);

                            System.out.print ("Duracao >> ");
                            s = sc.nextLine();
                            c.setDuracao(s);




                            v.add (c);
                            break;
                        case 4 :
                            DVD d = new DVD();

                            System.out.print ("Codigo >> ");
                            x = sc.nextInt(); sc.nextLine();
                            d.setCodigo(x);

                            System.out.print ("Disponibilidade >> ");
                            s = sc.nextLine();
                            d.setDisp(s);

                            System.out.print ("Conteudo >> ");
                            s = sc.nextLine();
                            d.setConteudo(s);

                            System.out.print ("Dual Layer >> ");
                            s = sc.nextLine();
                            d.setDul(s);

                            System.out.print ("Numero de Fixas >> ");
                            x = sc.nextInt(); sc.nextLine();
                            d.setTracks(x);

                            v.add (d);
                            break;
                    }
                    break;

                case 2 : // BUSCAR
                    System.out.print ("Digite o codigo >> ");
                    x = sc.nextInt(); sc.nextLine();
                    for (int i = 0 ; i < v.size() ; i++){
                        if (x == v.elementAt(i).getCodigo()){
                            
                            v.elementAt(i).imprimir();
                        }

                    }
                    break;
                
                case 3 : // LISTAR
                    for (int i = 0 ; i < v.size() ; i++){
                        v.elementAt(i).imprimir();
                    }
                    break;

            }
        } while (opc != 0);
    }
}
