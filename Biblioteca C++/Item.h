#ifndef _ITEM_H_
#define _ITEM_H_

#include <string.h>
#include <stdlib.h>

class Item {
      private:
      protected:
              int codigo;
              char * disp;
              
      public :
              Item() {
                   disp = NULL;     
              }
              ~Item() {
                    delete (disp);      
              }
              void setCod (int ncodigo) {
                   codigo = ncodigo;     
              }
              void setDispo (char *ndisp) {
                   disp = new char[strlen(ndisp) + 1];
                   strcpy(disp , ndisp);   
              }
              
              int getCodigo () {
                  return (codigo);    
              }
              
              virtual void imprimir (){}
              
              
};

#endif
