#ifndef _MEDIA_H_
#define _MEDIA_H_
#include "Item.h"
#include <string.h>
#include <stdlib.h>

class Midia : public Item {
      private:
      protected:
              char * conteudo;
              char * dul;
              
      public :
              Midia() {
                           conteudo = NULL;
                           dul = NULL;            
              }
              ~Midia() {
                           delete (conteudo);
                           delete (dul);      
              }
              
              void setConteudo (char *nconteudo) {
                   conteudo = new char[strlen(nconteudo) + 1];
                   strcpy (conteudo,nconteudo);     
              }
              void setDul (char *ndul) {
                   dul = new char[strlen(ndul) + 1];
                   strcpy (dul,ndul);   
              }
              
              char * getConteudo () {
                  return (conteudo);    
              }
              char * getDul () {
                  return (dul);    
              }
                   
};

#endif
