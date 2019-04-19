#ifndef _DVD_H_
#define _DVD_H_

#include <stdlib.h>
#include <string.h>
#include "Midia.h"


class Dvd : public Midia{
      private:
      protected:
              char * trilhas;
              
      public :
              Dvd() {
                     trilhas = NULL;           
              }
              ~Dvd() {
                     delete (trilhas);
              }
              
              void setTrilhas (char * d) {
                   trilhas = new char[strlen(d)+1];
                   strcpy (trilhas, d);
              }
              
              char * getTrilhas () {
                  return (trilhas);    
              }
              
              void imprimir () {
                   printf ("Dados do DVD\n"); 
                   printf ("Codigo: %d\n", codigo);
                   printf ("Disponibilidade: %s\n", disp);
                   printf ("Conteudo: %s\n", conteudo);
                   printf ("Dual Layer: %s\n", dul);
                   printf ("Num. e trilhas: %s\n\n", trilhas);
              }    
};

#endif
