package mediachatgpt2;

import java.util.Scanner;

public class MediaChatGpt2 {
    public static void main(String[] args) {
        Scanner sys = new Scanner(System.in);
        
        System.out.print("Digite a primeira nota do aluno: ");
        double nota1 = sys.nextDouble();
        
        while(nota1<0 || nota1>10){
            System.out.println("Nota inválida!\n");
            System.out.print("Digite a primeira nota novamente: ");
            nota1 = sys.nextDouble();
        }
        
        System.out.print("Digite a segunda nota do aluno: ");
        double nota2 = sys.nextDouble();
        
        while(nota2<0 || nota2>10){
            System.out.println("Nota inválida!\n");
            System.out.print("Digite a segunda nota novamente: ");
            nota2 = sys.nextDouble();
        }
        System.out.print("Digite a terceira nota do aluno: ");
        double nota3 = sys.nextDouble();
        
        while(nota3<0 || nota3>10){
            System.out.println("Nota inválida!\n");
            System.out.print("Digite a terceira nota novamente: ");
            nota3 = sys.nextDouble();
        }
        double media = (nota1 + nota2 + nota3)/3;
        
        System.out.printf("\nPrimeira nota: %.2f / Segunda nota: %.2f / Terceira nota: %.2f\n", nota1, nota2, nota3);
        System.out.printf("A média do aluno é: %.2f\n", media);
        
        if(media>=6){
            System.out.println("Aluno aprovado!");
        }
        else{
            System.out.println("Aluno reprovado!");
        }
    }
}