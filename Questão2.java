public class Questão2 {
    
    public static void insertionSort(int vect[]) {  
        int n = vect.length;  
        for (int j = 1; j < n; j++) {  
            int elemento = vect[j];  
            int i = j-1;  
            while ( (i > -1) && ( vect [i] > elemento ) ) {  
                vect [i+1] = vect [i];  
                i--;  
            }  
            vect[i+1] = elemento;  
        }  
    }  
    public static void main(String a[]){    
        int[] vect1 = {34, 8, 64, 51, 32, 21, 4, 12, 67, 19, 78, 45, 34, 88, 29, 57, 83, 92, 6, 11};    
        System.out.println("Array inicial");    
        for(int i :vect1){    
            System.out.print(i+" ");    
        }    
        System.out.println();    
        insertionSort(vect1);
        System.out.println("Array final");    
        for(int i: vect1){    
            System.out.print(i+" ");    
        }    
    }    
}
