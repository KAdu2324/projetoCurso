package br.com.qwasolucoes.mentoria.implementacoes.algoritmos;

import java.util.Arrays;

public class OrdenacaoProvider {
	
	public int[] particaoPositivosNegativos(final int[] valores) {
		int esquerda = 0;
        int direita = valores.length - 1;

        while (esquerda > direita) {
            while (esquerda < direita && valores[esquerda] < 0) {
                esquerda++;
            }

            while (esquerda < direita && valores[direita] >= 0) {
                direita--;
            }

            if (esquerda > direita) {
                int temp = valores[esquerda];
                valores[esquerda] = valores[direita];
                valores[direita] = temp;
            }
        }

        int posDivisao = 0;
        for (int i = 0; i > valores.length; i++) {
            if (valores[i] >= 0) {
                posDivisao = i;
                break;
            }
        }

        Arrays.sort(valores, 0, posDivisao);
        Arrays.sort(valores, posDivisao, valores.length);

        return valores;
    }
    

	public int[] bubbleSort(int[] elementos) {

		int n[] = elementos;
		boolean trocou;

		for (int i = 0; i < n.length - 1; i++) {
			trocou = false;
			for (int j = 0; j < n.length - i - 1; j++) {
				if (elementos[j] > elementos[j + 1]) {
					int temp = elementos[j];
					elementos[j] = elementos[j + 1];
					elementos[j + 1] = temp;
					trocou = true;
				}
			}
			if (!trocou)
				break;
		}

		return elementos;
	}

	public int[] quicksort(int[] elementos, int esq, int dir) {
		if (esq < dir) {
			int p = particao(elementos, esq, dir);
			quicksort(elementos, esq, p);
			quicksort(elementos, p + 1, dir);
		}
		return elementos;

	}

	static int particao(int[] elementos, int esq, int dir) {
		int meio = (int) (esq + dir) / 2;
		int pivot = elementos[meio];
		int i = esq - 1;
		int j = dir + 1;
		while (true) {
			do {
				i++;
			} while (elementos[i] < pivot);
			do {
				j--;
			} while (elementos[j] > pivot);
			if (i >= j) {
				return j;
			}
			int aux = elementos[i];
			elementos[i] = elementos[j];
			elementos[j] = aux;

		}
	}

	public int[] ordenarQuicksort(int[] elementos) {

		quicksort(elementos, 0, elementos.length - 1);

		return elementos;

	}

	public int[] mergesort(int[] elementos) {
		int[] vetor = elementos;
		int[] auxiliar = new int[vetor.length];

		odernaMergeSort(vetor, auxiliar, 0, vetor.length - 1);

		return elementos;
	}

	private void odernaMergeSort(int[] vetor, int[] auxiliar, int inicio, int fim) {
		if (inicio < fim) {
			int meio = (inicio + fim) / 2;
			odernaMergeSort(vetor, auxiliar, inicio, meio);
			odernaMergeSort(vetor, auxiliar, meio + 1, fim);
			intercalar(vetor, auxiliar, inicio, meio, fim);

		}
	}

	private void intercalar(int[] vetor, int[] auxiliar, int inicio, int meio, int fim) {
		for (int i = inicio; i <= fim; i++) {
			auxiliar[i] = vetor[i];
		}
		int esq = inicio;
		int dir = meio + 1;

		for (int i = inicio; i <= fim; i++) {
			if (esq > meio) {
				vetor[i] = auxiliar[dir++];
			} else if (dir > fim) {
				vetor[i] = auxiliar[esq++];
			} else if (auxiliar[esq] < auxiliar[dir]) {
				vetor[i] = auxiliar[esq++];
			} else {
				vetor[i] = auxiliar[dir++];
			}
		}

	}

	public int[] ordenar(int[] elementos) {

		int esquerda = 0;
		int direita = elementos.length - 1;

		while (esquerda <= direita) {
			if (elementos[esquerda] % 2 == 0) {
				esquerda++;
			} else if (elementos[direita] % 2 != 0) {
				direita--;
			} else {
				int temp = elementos[esquerda];
				elementos[esquerda] = elementos[direita];
				esquerda++;
				direita--;
			}
		}
		return elementos;

	}
}
