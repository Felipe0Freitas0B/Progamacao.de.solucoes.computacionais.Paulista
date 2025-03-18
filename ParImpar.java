import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);
        int num;

        System.out.println("Digite um número inteiro: ");
        num = entrada.nextInt();

        if((num % 2.0)==0){
            System.out.println(num + " é par.");
        }else{
            System.out.println(num + " é ímpar.");
        }
        entrada.close(); 
    }
   
}

