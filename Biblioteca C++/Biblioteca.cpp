/*
********************************************************************************
   
                         SEGUNDO TRABALHO DE P.O.O
________________________________________________________________________________       
                         
                   Luiz Henrique Cherri     NUSP: 5991829
               
             Para utilizar somente siga as instrucoes dos menus
              
               Qualquer duvida avise-me: luizcherri@gmail.com
________________________________________________________________________________

 OBS: Os codigos foram compilados no windowsXP utilizando o compilador da GNU
      DEV-C++ 4.9.9.2
 
********************************************************************************
*/

#include <iostream>
#include "Item.h"
#include "Livro.h"
#include "Revista.h"
#include "Publicacao.h"
#include "Midia.h"
#include "Cd.h"
#include "Dvd.h"
#include "Vector.h"
#include <string.h>

using namespace std;

int main () {
    Vector *v = new Vector();
    int end = true;
    int opc;
    int opc2;
    
    int x;
    char a[30];
    char *b;
    
    
    do {
        printf ("1 - Inserir\n");
        printf ("2 - Buscar \n");
        printf ("3 - Listar \n");
        printf ("0 - Sair   \n>> ");
        scanf ("%d",&opc) ;
        
        switch (opc) {
                case 1:
                    printf ("\nO que?:   \n");
                    printf ("1 - Livro   \n");
                    printf ("2 - Revista \n");
                    printf ("3 - CD      \n");
                    printf ("4 - DVD     \n>> ");
                    scanf ("%d",&opc2);
                    
                  
                    if (opc2 == 1){
                       Livro *r = new Livro();
                       
                       printf ("\nCodigo >> ");
                       scanf ("%d", &x);
                       r->setCod(x);
                       
                       printf ("Disponibilidade >> ");
                       fflush(stdin);
                       gets (a);
                       r->setDispo(a);
                       a[0] = '\0';
                       
                       printf ("Numero de paginas >> ");
                       scanf ("%d", &x);
                       r->setNpag(x);
                       
                       printf ("Autor >> ");
                       fflush(stdin);
                       gets (a);
                       r->setAutor(a);
                       a[0] = '\0';
                  
                       printf ("ISBN >> ");
                       fflush(stdin);
                       gets (a);
                       r->setIsbn(a);
                       a[0] = '\0';
                       
                       v->add(r);
                    }            
                    if (opc2 == 2) {
                       Revista *r = new Revista();
                       v->add(r);
                       
                       printf ("\nCodigo >> ");
                       scanf ("%d", &x);
                       r->setCod(x);
                       
                       printf ("Disponibilidade >> ");
                       fflush(stdin);
                       gets (a);
                       r->setDispo(a);
                       a[0] = '\0';
                       
                       printf ("Numero de paginas >> ");
                       scanf ("%d", &x);
                       r->setNpag(x);
                       
                       printf ("Editora >> ");
                       fflush(stdin);
                       gets (a);
                       r->setEditora(a);
                       a[0] = '\0';
                       
                       printf ("ISSN >> ");
                       fflush(stdin);
                       gets (a);
                       r->setIssn(a);
                       
                       a[0] = '\0';
                    }
                    if (opc2 == 3) {
                       Cd *r = new Cd();
                       
                       printf ("\nCodigo >> ");
                       scanf ("%d", &x);
                       r->setCod(x);
                       
                       printf ("Disponibilidade >> ");
                       fflush(stdin);
                       gets (a);
                       r->setDispo(a);
                       a[0] = '\0';
                       
                       printf ("Conteudo >> ");
                       fflush(stdin);
                       gets (a);
                       r->setConteudo(a);
                       a[0] = '\0';
                       
                       printf ("Dual Layer >> ");
                       fflush(stdin);
                       gets (a);
                       r->setDul(a);
                       
                       printf ("Duracao >> ");
                       fflush(stdin);
                       gets (a);
                       r->setDuration(a);
                       a[0] = '\0';

                       v->add(r);
                    }
                    if (opc2 == 4) {
                       Dvd *r = new Dvd();
                       
                       printf ("\nCodigo >> ");
                       scanf ("%d", &x);
                       r->setCod(x);
                       
                       printf ("Disponibilidade >> ");
                       fflush(stdin);
                       gets (a);
                       r->setDispo(a);
                       a[0] = '\0';
                       
                       printf ("Conteudo >> ");
                       fflush(stdin);
                       gets (a);
                       r->setConteudo(a);
                       a[0] = '\0';
                       
                       printf ("Dual Layer >> ");
                       fflush(stdin);
                       gets (a);
                       r->setDul(a);
                       
                       printf ("Numero de Trilhas >> ");
                       fflush(stdin);
                       gets (a);
                       r->setTrilhas(a);
                       a[0] = '\0';
                       
                       v->add(r);
                    }                                   
                               
                    break;
                    
                case 2: 
                     printf ("\n\nDigite o codigo que deseja buscar >> ");
                     scanf ("%d", &x);
                     for (int i = 0 ; i < v->size() ; i++) {
                         if (x == v->get(i)->getCodigo()) {
                              v->get(i)->imprimir();
                         }        
                     }
                     break;
                     
                case 3:
                     
                     for (int i = 0 ; i < v->size() ; i++) {
                         v->get(i)->imprimir();
                     }
                      
                     break;
                     
        }     

    }while (opc != 0);
    
    delete (v);
    
    getchar();    
}
