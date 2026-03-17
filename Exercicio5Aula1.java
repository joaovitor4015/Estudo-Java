package exercicio5aula1;

import java.util.Scanner;

public class Exercicio5Aula1 {

    public static void main(String[] args) {
        Scanner sys = new Scanner(System.in);
        
        System.out.print("Digite um número maior que zero: ");
        double num = sys.nextDouble();
        
        if (num<0){
            while (num<=0){
                System.out.println("O numero não é maior que zero. Tente novamente!");
                System.out.print("Digite um número maior que zero: ");
                num = sys.nextDouble();
            }
        } 
        else{ 
            System.out.printf("\nResultado de %.2f ao quadrado: %.2f\n",num, Math.pow(num, 2));
            System.out.printf("Resultado de %.2f ao cubo: %.2f\n", num, Math.pow(num, 3));
            System.out.printf("Raíz quadrada de %.2f: %.2f\n", num, Math.sqrt(num));
            System.out.printf("Raíz cúbica de %.2f: %.2f\n", num, Math.cbrt(num));
        }
    }   
}
