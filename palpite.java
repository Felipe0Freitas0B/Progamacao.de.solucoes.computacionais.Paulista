import java.util.Scanner;

public class palpite {
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in); 
		int palpite;

        System.out.println("Digite seu palpite: ");
        palpite = entrada.nextInt();

        if(palpite == 15){
            System.out.println("ACERTOU!!!");
            }else if (palpite < 15){
            System.out.println("Seu palpite está abaixo!");
            }else {
            System.out.println("Seu palpite está acima");
        }
        entrada.close();
    }
}
 

