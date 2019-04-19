#ifndef _LIVRO_H_
#define _LIVRO_H_

#include <stdlib.h>
#include <string.h>
#include "Publicacao.h"

class Livro : public Publicacao{
      private:
      protected:
              char *autor;
              char *isbn;
              
      public :
              Livro() {
                     isbn = NULL;
                     autor = NULL;           
              }
              ~Livro() {
                     delete (isbn);
                     delete (autor);          
              }
              void setIsbn (char *nisbn) {
                   isbn = new char[strlen(nisbn) + 1];
                   strcpy (isbn, nisbn);   
              }
              void setAutor (char *nautor) {
                   autor = new char[strlen(nautor) + 1];
                   strcpy (autor, nautor);   
              }
              
              char * getIsbn () {
                  return (isbn);    
              }
              
              char * getAutor () {
                  return (autor);    
              }
              
              void imprimir () {
                   printf ("Dados do livro\n");     
                   printf ("Codigo: %d\n", codigo);
                   printf ("Disponibilidade: %s\n", disp);
                   printf ("Num. de Paginas: %d\n", npag);
                   printf ("Autor: %s\n", autor);
                   printf ("ISBN: %s\n\n", isbn);    
              }
};

#endif
