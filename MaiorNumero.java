package maiornumerochatgpt;

import java.util.Scanner;

public class MaiorNumeroChatGpt {
    public static void main(String[] args) {
        Scanner sys = new Scanner(System.in);
        
        System.out.print("Digite o primeiro valor: ");
        double num1 = sys.nextDouble();
        System.out.print("Digite o segundo valor: ");
        double num2 = sys.nextDouble();
        
        if (num1 > num2){
            System.out.printf("\nO número %.4f é maior", num1);
        }
        else{
            System.out.printf("\nO número %.4f é maior", num2);
        }
    }   
}
