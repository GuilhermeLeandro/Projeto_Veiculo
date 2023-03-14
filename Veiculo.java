public class Veiculo{
    
    //atributos
    private int peso;
    private int velocmax;
    private int preco;

    //construtor
    public Veiculo(int peso, int velocmax, int preco) {
        this.peso = peso;
        this.velocmax = velocmax;
        this.preco = preco;
    }
    
    //get and set
    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getVelocmax() {
        return velocmax;
    }

    public void setVelocmax(int velocmax) {
        this.velocmax = velocmax;
    }

    public int getPreco() {
        return preco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }

    
}