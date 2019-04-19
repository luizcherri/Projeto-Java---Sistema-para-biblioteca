#ifndef _VECTOR_H_
#define _VECTOR_H_

#include <iostream>
#include "Item.h"

using namespace std;

class Vector {
	private:
		Item **elementos;
		int tamanho;

	public:
		Vector() {
			elementos = NULL;
			tamanho = 0;
		}

		void add(Item* item) {
			elementos = (Item**) realloc (elementos,
					sizeof(Item *) * (tamanho+1));
			elementos[tamanho++] = item;
		}

		Item *get(int posicao) {
			return elementos[posicao];
		}

		int size() {
			return tamanho;
		}

		void remove(int i) {
			if (i > 0 && i < tamanho) {
				elementos[i] = elementos[tamanho-1];
				tamanho--;
			}
		}
};

#endif
