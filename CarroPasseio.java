public class CarroPasseio extends Veiculo {
    
    //atributos
    private String cor;
    private String modelo;
    
    
    //construtor
    public CarroPasseio(int peso, int velocmax, int preco, String cor, String modelo) {
        super(peso, velocmax, preco);
        this.cor = cor;
        this.modelo = modelo;
    
    }
    //get and set
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
