package controlefluxo;

public class CalculoSaldo {
    public static void main(String[] args) {
        double saldo = 1000.0; //Substitua pelo seu saldo inicial
        double percentual = 10.0; //Substitua pelo percentual desejado
        int anos = 5; //Substitua pelo número de anos desejado
        
        double resultado = (saldo - (saldo * (percentual / 100))) / (anos * 12);
        
        System.out.println("O resultado é: " + resultado);
    }
}
