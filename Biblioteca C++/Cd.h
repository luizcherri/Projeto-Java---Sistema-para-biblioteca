#ifndef _CD_H_
#define _CD_H_

#include <stdlib.h>
#include <string.h>
#include "Midia.h"


class Cd : public Midia{
      private:
      protected:
              char * duration;
              
      public :
              Cd() {
                     duration = NULL;           
              }
              ~Cd() {
                     delete (duration);     
              }
              
              void setDuration (char * d) {
                   duration = new char[strlen(d)+1];
                   strcpy (duration, d);
              }
              
              char * getDuration () {
                  return (duration);    
              }
              
              void imprimir () {
                   printf ("Dados do CD\n"); 
                   printf ("Codigo: %d\n", codigo);
                   printf ("Disponibilidade: %s\n", disp);
                   printf ("Conteudo: %s\n", conteudo);
                   printf ("Dual Layer: %s\n", dul);
                   printf ("Duracao: %s\n\n", duration);
              }                   
};

#endif
