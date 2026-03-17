package exercicio2aula1;

import java.util.Scanner;

public class Exercicio2Aula1 {
    public static void main(String[] args){
        Scanner sys = new Scanner(System.in);
    
        System.out.print("Digite o nome do aluno: ");
        String nome = sys.nextLine();
    
        System.out.print("\nDigite a primeira nota do aluno: ");
        float n1 = sys.nextFloat();
        
        System.out.print("Digite a segunda nota do aluno: ");
        float n2 = sys.nextFloat();
        
        System.out.print("Digite a terceira nota do aluno: ");
        float n3 = sys.nextFloat();
        
        float media = (n1+n2+n3)/3;
        
        System.out.println("\nAluno: " + nome);
        System.out.printf("Média do aluno: %.1f", media);
        
        
    }
}