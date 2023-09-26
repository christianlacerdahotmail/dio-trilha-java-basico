package desafiocontrolefluxo;

import java.util.Scanner;

public class Contador {
 public static void main(String[] args) {
     Scanner terminal = new Scanner(System.in);
     System.out.println("Digite o primeiro parâmetro");
     int parametroUm = terminal.nextInt();
     System.out.println("Digite o segundo parâmetro");
     int parametroDois = terminal.nextInt();

     try {
         // Chamando o método contendo a lógica de contagem
         contar(parametroUm, parametroDois);

     } catch (ParametrosInvalidosException e) {
         // Imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
         e.printStackTrace();
    	 System.out.println("O segundo parâmetro deve ser maior que o primeiro");
     }
 }

 static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
     // Validar se parametroUm é MAIOR que parametroDois e lançar a exceção
     if (parametroUm >= parametroDois) {
         throw new ParametrosInvalidosException();
     }

     int contagem = parametroDois - parametroUm + 1; // Adicionar 1 para incluir o valor final
     // Realizar o for para imprimir os números com base na variável contagem
     for (int i = 1; i <= contagem; i++) {
         System.out.println("Imprimindo o número " + i);
     }
 }
}
