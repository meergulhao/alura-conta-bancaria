import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Adicionando o Scanner para poder coletar informações do usuário
        Scanner scanner = new Scanner(System.in);

        // Declarando as variáveis
        String separador = "*********************************************"; // Separador para deixar bonitinho
        String nomeCliente = "Guilherme Mergulhão";
        String tipoConta = "Corrente";
        double saldo = 2500.00;
        int operacao = 0;
        String menu = """
                
                Operações
                1. Consultar saldo
                2. Depositar valor
                3. Sacar valor
                4. Sair
                
                Digite a opção desejada:
                """;

        System.out.println(separador);
        System.out.println("Dados iniciais do cliente:\n");
        System.out.println("Nome:\t\t\t\t" + nomeCliente);
        System.out.println("Tipo conta:\t\t\t" + tipoConta);
        System.out.println("Saldo em conta:\t\tR$ " + saldo);

        // Loop para as operações
        while (operacao != 4) {
            System.out.println(separador);
            System.out.println(menu);
            operacao = scanner.nextInt();
            // Na aula, foi feito com if. Como eram muitas opções, preferi fazer com o switch
            switch (operacao) {
                case 1: // Só mostra o saldo
                    System.out.println("O saldo atual da conta é: R$ " + saldo);
                    break;
                case 2: // Permite um depósito, somando o valor ao saldo
                    System.out.println("Informe o valor a depositar:");
                    saldo += scanner.nextInt();
                    System.out.println("Depósito realizado com sucesso!");
                    System.out.println("Saldo atualizado: R$ " + saldo);
                    break;
                case 3: // Permite saque, subtraindo o valor do saldo
                    System.out.println("Informe o valor do saque:");
                    double valorSaque = scanner.nextInt();
                    if (valorSaque > saldo) { // Não permite que o valor do saque seja maior que o saldo disponível
                        System.out.println("Você não tem saldo suficiente. O saldo é de: R$ " + saldo);
                    } else {
                        saldo -= valorSaque;
                        System.out.println("Saque realizado com sucesso!");
                        System.out.println("Saldo atualizado: R$ " + saldo);
                    }
                    break;
                case 4: // Encerra
                    System.out.println("Obrigado e volte sempre!");
                    break;
                default: // Alerta opção inválida caso diferente das disponíveis
                    System.out.println("Opção inválida!");
                    break;
            }
        }
    }
}