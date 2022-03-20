import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Sistema {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opcao=0;
		String agencia, conta,  nome,  email,  telefone = "";
		float saldo;
		ArrayList<CadastroCliente> cadastroClientes = new ArrayList();
		Scanner teclado = new Scanner(System.in);
		
		while (opcao < 1 || opcao > 5) { 
			System.out.println("================================");
			System.out.println("Escolha uma das opções abaixo:");
			System.out.println("1 –  Cadastrar Clientes");
			System.out.println("2 –  Listar Clientes");
			System.out.println("3 –  Gravar em arquivo texto");
			System.out.println("4 –  Consultar arquivo texto");
			System.out.println("5 - Sair");
			System.out.println("================================");
			System.out.println("Entre com a opção :");
			opcao = teclado.nextInt();
	
			switch (opcao) { 
			case 1:
				CadastroCliente cadastroCliente = new CadastroCliente ("0000-1", "1234567-8", "José Silva", "jpse.s@email.com", "(11) 1234-5678", 1000);;
				cadastroClientes.add(cadastroCliente);
				System.out.println("cadastrado com sucesso!");
			/*System.out.println("Cadastrar Cliente");
				System.out.println("Entre com a agência");
				agencia = teclado.nextLine();
				System.out.println("Entre com o Número da Conta");
				conta = teclado.nextLine();
				System.out.println("Entre com o nome");
				nome = teclado.nextLine();
				System.out.println("Entre com o email:");
				email = teclado.nextLine();
				System.out.println("Entre com o telefone");
				telefone = teclado.nextLine();*/
				for(CadastroCliente c:cadastroClientes) {
					System.out.println(c.getNome());
				}
				break;
			case 2:
				for(CadastroCliente c:cadastroClientes) {
					System.out.println(c.getNome());
				}
				
				break;
			case 3:
				FileWriter arquivo = new FileWriter("C:\\Users\\samsung\\Documents\\projetos-front\\gama\\java\\cadastrocliente.txt");
				PrintWriter gravarArquivo =new PrintWriter(arquivo);
				
				gravarArquivo.printf("Registro Funcionários %n");;
				
				for (int contador = 0; contador<4; contador ++) {
					gravarArquivo.printf();
					arquivo.close();	
					System.out.print(
							"Local arquivo: C:\\\\Users\\\\samsung\\\\Documents\\\\projetos-front\\\\gama\\\\java\\\\cadastrocliente.txt");
				break;*/
			case 4:
				String mostra="";
				String nomeArq="C:\\Users\\samsung\\Documents\\projetos-front\\gama\\java\\cadastrocliente.txt"; 
				String linha="";
				File arq = new File(nomeArq);
				
				if(arq.exists()) {
					mostra="Arquivo - "+arq+",aberto com sucesso";
					mostra="Tamanho do Arquivo - "+Long.toString(arq.length())+" Bytes \n";
					
				
					try {
					FileReader reader = new FileReader(nomeArq);
					
					BufferedReader leitor = new BufferedReader(reader);
					while(true) {
						linha=leitor.readLine();
						System.out.println(linha);
					if(linha==null)
						break;
					mostra+=linha+"\n";
					}
					}
					catch(Exception erro) {}
					JOptionPane.showMessageDialog(null, mostra, "Arquivo...",1);
				}
				else
					JOptionPane.showMessageDialog(null, "Arquivo Inexistente","Erro",0);
				break;
			case 5:
				System.out.println("Saindo...");
				break;
			default:
				System.out.println("Opção inválida. Tente novamente!");	
			}
		}
	}

}
