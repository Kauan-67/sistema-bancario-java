public class ContaCorrente extends Conta implements Pagamento {
    public ContaCorrente(int numero, String titular, double saldo, Agencia agencia) {
        super(numero, titular, saldo, agencia);
    }

    @Override 
    public void pagar(double valor) {
        if (valor >0) {
            if (getSaldo()>= valor) {
                setSaldo(getSaldo()- valor);
                System.out.println("Pagamento realizado com sucesso!");
                System.out.println("Saldo atual: R$ " + getSaldo());
                
            }else{
                System.out.println("Saldo insuficiente!");
            }
            
            
        }else{
            System.out.println("Valor invalido!");
        }
        
    }

    public void pagar(double valor, String chavePix){
        if (valor >0) {
            if (getSaldo()>= valor) {
                setSaldo(getSaldo()- valor);
                System.out.println("Pix realizado!");
                System.out.println("Chave Pix: " + chavePix);
                System.out.println("Saldo atual: R$ " + getSaldo());
            
                
            }else{
                System.out.println("Saldo insuficiente!");
            }
            
        }else{
            System.out.println("Valor invalido! ");
        }
    }

    public void pagar(double valor, int parcelas){
        if (valor >0) {
            if (parcelas > 0 && getSaldo() >= valor) {
                double valorParcela = valor / parcelas;
                setSaldo(getSaldo()-valor );
                System.out.println("Pagamento realizado com sucesso! ");
                System.out.println("Quantidades de parcelas: " + parcelas);
                System.out.println("Valor de cada parcelas: " + valorParcela);
                System.out.println("Saldo atual: R$ " +getSaldo());
                
            }else{
                System.out.println("Saldo insuficientes ou parcelas invalidas");
            }
            
        }else{
            System.out.println("Valor invalido!");
        }
    }
    
}
