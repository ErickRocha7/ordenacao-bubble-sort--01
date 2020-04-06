package bubble_sort;

import java.util.Scanner;

public class Bubble_Sort {

    public static void main(String[] args) {
        int X[] = new int[5];
        int n, i, aux;
        Scanner entrada = new Scanner(System.in);
        
        //Carregando os numeros no vetor
        for(i=0; i<=4; i++){
            System.out.println("Digite o " + (i+1) + "° numero: ");
            X[i] = entrada.nextInt();
        }
        
        // ordenando de forma crescente
        // laço com a quantidade de elementos do vetor
        for(n=1; n<=5; n++){
            // laço que percorre da primeira á
            // penultima posição do vetor
            for(i=0; i<=3; i++){
                if(X[i] > X[i+1]){
                    aux = X[i];
                    X[i] = X[i+1];
                    X[i+1] = aux;
                }
            }
        }
        // monstrando o vetor ordenado
        for(i=0; i<=4; i++){
            System.out.println((i+1) + "° numero: " + X[i]);
        }
    }
    
}
