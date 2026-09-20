public class Conta {
    private int numero;
    private String titular;
    private double saldo;
    private Agencia agencia;
    public Conta(int numero, String titular, double saldo, Agencia agencia) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
        this.agencia = agencia;
    }
    public int getNumero() {
        return numero;
    }
    public String getTitular() {
        return titular;
    }
    public double getSaldo() {
        return saldo;
    }
    public Agencia getAgencia() {
        return agencia;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public void setTitular(String titular) {
        this.titular = titular;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public void setAgencia(Agencia agencia) {
        this.agencia = agencia;
    }
    public void depositar(double valor){
        if (valor > 0) {
            saldo = saldo + valor;
            System.out.println("Deposito realizado! ");
            System.out.println("Novo saldo: R$" + saldo);
            
        }else{
            System.out.println("Valor do deposito invalido");
        }
    }

    public double consultarSaldo(){
        return saldo;
    }

    public void exibirDados(){
        System.out.println("==Info da conta==");
        System.out.println("Numero da conta: " + numero);
        System.out.println("Titular: " + titular);
        System.out.println("Saldo: R$ " + saldo);

        agencia.exibirDados();
    }
}