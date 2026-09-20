public class Agencia {
    private String nome;
    private int numero;
    public Agencia(String nome, int numero) {
        this.nome = nome;
        this.numero = numero;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public void exibirDados(){
        System.out.println("Numero da agencia: "+numero);
        System.out.println("Nome da agencia: "+nome);
    }
    
    
}
