import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        Agencia agencia =new Agencia("Agencia Xtreme", 123);

        ContaCorrente conta = new ContaCorrente(1002, "Kaua", 1500.00, agencia);

        int op;
        do{
            System.out.println("\n== Banco ==");
            System.out.println("1- Exibir dados da conta");
            System.out.println("2- Consultar saldo");
            System.out.println("3- Depositar");
            System.out.println("4- Pagamento em dinheiro");
            System.out.println("5- Pagamento via Pix");
            System.out.println("6- Pagamento com Cartao");
            System.out.println("0- Sair");
            System.out.println("Escolha uma opcão:");

            op = sc.nextInt();

            switch (op) {
                case 1:
                    conta.exibirDados();
                    break;
                case 2:
                    System.out.println("Saldo atual: R$ " + conta.consultarSaldo());
                    break;
                case 3:
                    System.out.println("Digite o valor do deposito: ");
                    double deposito = sc.nextDouble();
                    conta.depositar(deposito);
                    break;
                case 4:
                    System.out.println("Digite o valor do pagamento: ");
                    double pagamento = sc.nextDouble();
                    conta.pagar(pagamento);
                    break;
                case 5:
                    System.out.println("Digite o valor do Pix: ");
                    double pix = sc.nextDouble();

                    sc.nextLine();

                    System.out.println("Digite a chave Pix: ");
                    String chavePix = sc.nextLine();
                    conta.pagar(pix, chavePix);
                    break;
                case 6:
                    System.out.println("Digite o valor da compra: ");
                    double compra = sc.nextDouble();

                    System.out.println("digite a quantidade de parcelas: ");
                    int parcelas = sc.nextInt();

                    conta.pagar(compra, parcelas);
                    break;
                case 0:
                    System.out.println("Sistema encerrado..");
                    break;
                default:
                    System.out.println("Opcao inavalida!");
            }
        }while (op != 0); {
            
        }
    sc.close();
    }
    
}
