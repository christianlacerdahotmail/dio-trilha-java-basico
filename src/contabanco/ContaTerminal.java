package contabanco;

import java.util.Scanner;
import java.text.DecimalFormat;

public class ContaTerminal {
    private String numeroAgencia;
    private int numeroConta;
    private String nome;
    private double saldo;

    // Construtor da classe
    public ContaTerminal(String numeroAgencia, int numeroConta) {
        this.numeroAgencia = numeroAgencia;
        this.numeroConta = numeroConta;
        this.nome = "Mario Andrade Barreto";
        this.saldo = 520.50;
    }

    // Método para exibir informações da conta
    public void exibirInformacoes() {
        //Importar a classe Decimal Format para exibir 2 casas decimais
        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        String saldoFormatado = decimalFormat.format(saldo);

        //Exibir a mensagem conta criada
        System.out.print("Olá " + nome + ", obrigado por criar uma conta em nosso banco,");
        System.out.print(" sua agência é " + numeroAgencia + ", conta " + numeroConta);
        System.out.print(" e seu saldo R$ " + saldoFormatado + " já está disponível para saque.");
    }

    public static void main(String[] args) throws Exception{
        //Conhecer e importar a classe Scanner
        Scanner scanner = new Scanner(System.in);

        //Exibir as mensagens para o nosso usuário
        System.out.print("Por favor, digite o número da Agência: ");
        String agencia = scanner.next();

        System.out.print("Agora digite o número da Conta: ");
        int conta = scanner.nextInt();

        // Criar uma instância da classe ContaTerminal com agência e conta
        ContaTerminal contaTerminal = new ContaTerminal(agencia, conta);

        // Exibir informações da conta
        System.out.println("\nInformações da Conta:");
        contaTerminal.exibirInformacoes();


        scanner.close();
    }
}