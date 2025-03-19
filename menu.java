import java.util.Scanner;

public class menu {
    public static void main(String[] args){
        
        System.out.println("<======== Menu de Opções ========>");
        System.out.println("<==== 1 - Cadastrar Produtos ====>");
        System.out.println("<==== 2 - Lista de Produtos =====>");
        System.out.println("<===== 3 - Sair do Sistema ======>");
        System.out.println("<====== Escolha uma Opção =======>");
        
        Scanner entrada = new Scanner(System.in);
        
        int menu = entrada.nextInt();
        
        switch(menu){
            case 1:
                System.out.println("Voce escolheu 1");
                System.out.println("Cadastrar Produtos");
                break;
            
            case 2: 
                System.out.println("Voce escolheu 2");
                System.out.println("Lista de Produtos");
                break;
                
            case 3:
                System.out.println("Voce escolheu 3");
                System.out.println("Sair do Sistema");
                break;
                
            default:
                System.out.println("Invalido");
        }
            entrada.close();
    }
}
 


 

