public class Questão1 {  
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
    public static void main(String[] args) {  
        int[] vect = {34, 8, 64, 51, 32, 21, 4, 12, 67, 19, 78, 45, 34, 88, 29, 57, 83, 92, 6, 11};         
        System.out.println("Array inicial:");
        for (int num : vect) {  
            System.out.print(num + " ");  
        }  
        System.out.println();
        selectionSort(vect);  
        System.out.println("Array final:");  
        for (int num : vect) {  
            System.out.print(num + " ");  
        }  
    }  
}  
