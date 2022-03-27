import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Cliente heitor = new Cliente();
		heitor.setNome("Heitor");
		
		Conta cc = new ContaCorrente(heitor);
		Conta poupanca = new ContaPoupanca(heitor);

        cc.investimento (30);
        poupanca.investimento (50);
        
		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
		
		
		Random random = new Random();
        try (var leitor = new Scanner(System.in)) {
			System.out.println("Deseja criar uma chave pix? (S/N)");
			char pix = leitor.next().charAt(0);


			if (pix == 's' || pix == 'S') {
			    System.out.println(random.nextInt(1000000000));

			} else {
				
			    System.out.println("Chave Pix não gerada");
			}
		}


    }

}