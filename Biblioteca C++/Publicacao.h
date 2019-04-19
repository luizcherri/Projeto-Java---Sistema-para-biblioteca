#ifndef _PUBLICACAO_H_
#define _PUBLICACAO_H_
#include "Item.h"

class Publicacao : public Item {
      private:
      protected:
              int npag;
              
      public :
              void setNpag (int nnpag) {
                   npag = nnpag;     
              }
              int getNpag () {
                  return (npag);    
              }
              
              
                   
};

#endif
