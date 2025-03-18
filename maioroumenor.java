import java.util.Scanner;

public class maioroumenor {
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in); 
        int num;

        System.out.println("Digite Sua Idade: ");
        num = entrada.nextInt();

        if(num >17){
            System.out.println(num + " Maior de Idade.");
        }else{
            System.out.println(num + " Menor de Idade");
        }
        entrada.close(); 
    }
   
}

