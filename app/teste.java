import java.util.Scanner;
public class Main

{
	public static void main(String[] args) {
	    Scanner signos = new Scanner(System.in);
	    int mes = 0;
	    while( mes < 1 || mes > 12){
	    System.out.println("Digite o mês do seu aniversário:");
	    mes = signos.nextInt();
	    
	    switch(mes){
	        case 1:
	            System.out.println("Seu signo é Aquário");
	            break;
	       case 2:
	           System.out.println("Seu signo é Peixes");
	           break;
	       case 3:
	           System.out.println("Seu signo é Áries");
	           break;
	       case 4:
	           System.out.println("Seu signo é Touro");
	           break;
	       case 5:
	           System.out.println("Seu signo é Gêmeos");
	           break;
	       case 6:
	           System.out.println("Seu signo é Câncer");
	           break;
	       case 7:
	           System.out.println("Seu signo é Leão");
	           break;
	       case 8:
	           System.out.println("Seu signo é Virgem");
	           break;
	       case 9:
	           System.out.println("Seu signo é Libra");
	           break;
	       case 10:
	           System.out.println("Seu signo é Escorpião");
	           break;
	       case 11:
	           System.out.println("Seu signo é Sargitário");
	           break;
	       case 12:
	           System.out.println("Seu signo é Capricórnio");
	           break;
	       default:
	           System.out.println("Valor digitado inválido");
	    }
	    }
	           
	}
}