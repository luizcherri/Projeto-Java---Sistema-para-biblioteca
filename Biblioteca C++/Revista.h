#ifndef _EDITORA_H_
#define _EDITORA_H_

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "Publicacao.h"


class Revista : public Publicacao{
      private:
      protected:
              char *editora;
              char *issn;
              
      public :
              Revista() {
                     issn = NULL;
                     editora = NULL;
                              
              }
              ~Revista() {
                     delete (issn);
                     delete (editora);          
              }
              void setIssn (char *nissn) {
                   issn = new char[strlen(nissn) + 1];
                   strcpy (issn, nissn);   
              }
              void setEditora (char *neditora) {
                   editora = new char[strlen(neditora) + 1];
                   strcpy (editora, neditora);   
              }
              
              char * getIssn () {
                  return (issn);    
              }
              
              char * getEditora () {
                  return (editora);    
              }
              
  
              void imprimir() {
                   printf ("Dados da revista\n"); 
                   printf ("codigo: %d\n", codigo);
                   printf ("Disponibilidade: %s\n", disp);
                   printf ("Num. de Paginas: %d\n", npag);
                   printf ("Editora: %s\n", editora);
                   printf ("ISSN: %s\n\n", issn);
              }
              
                   
};

#endif
