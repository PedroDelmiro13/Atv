//Os dois tipos de algoritmo possuem complexidade quadrática
//no pior caso e no caso médio, ou seja, o tempo de execução
//cresce proporcionalmente ao quadrado do tamanho da entrada.

//Situações vantajosas para Selection Sort:
//Quando a memória for um fator limitante, por realizar menos trocas
//e ela é mais eficiente em termos de número de trocas.

//Situações vantajosas para usar Insertion Sort:
//Quando o vetor já está quase ordenado.
//Pode ser mais eficiente para pequenos conjuntos de dados, e 
//é mais simples de implementar.

public class Questão5 {
    public static void main(String[] args) {
        int[] tamanhos = {100, 500, 1000};
        for (int tamanho : tamanhos) {
            int[] vetor = gerarArrayAleatorio(tamanho);
            int[] vetorSelection = vetor.clone();
            int[] vetorInsertion = vetor.clone();

            System.out.println("Vetor de tamanho: " + tamanho);
            
            long startTime = System.nanoTime();
            selectionSort(vetorSelection);
            long endTime = System.nanoTime();
            System.out.println("Tempo de execução do Selection Sort: " + (endTime - startTime) + " ns");
            
            startTime = System.nanoTime();
            insertionSort(vetorInsertion);
            endTime = System.nanoTime();
            System.out.println("Tempo de execução do Insertion Sort: " + (endTime - startTime) + " ns");
        }
    }
    public static int[] gerarArrayAleatorio(int tamanho) {
        int[] vect = new int[tamanho];
        for (int i = 0; i < tamanho; i++) {
            vect[i] = (int) (Math.random() * 100); 
        }
        return vect;
    }
    public static void selectionSort(int[] vect) {
        int n = vect.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (vect[j] < vect[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = vect[minIndex];
            vect[minIndex] = vect[i];
            vect[i] = temp;
        }
    }
    public static void insertionSort(int[] vect) {
        int n = vect.length;
        for (int i = 1; i < n; i++) {
            int key = vect[i];
            int j = i - 1;
            while (j >= 0 && vect[j] > key) {
                vect[j + 1] = vect[j];
                j = j - 1;
            }
            vect[j + 1] = key;
        }
    }
}
