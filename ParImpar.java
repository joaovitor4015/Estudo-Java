package parimparchatgpt;
import java.util.Scanner;
public class ParImparChatGpt {
    public static void main(String[] args) {
        Scanner sys = new Scanner(System.in);
        System.out.print("Informe um número inteiro: ");
        long num = sys.nextLong();
        
        if (num % 2 == 0){
            System.out.println("O número é par!");
        }
        else{
            System.out.println("O número é ímpar!");
        }              
    }   
}
