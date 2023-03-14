public class Caminhao extends Veiculo {
    
    //atributos
    private int toneladas;
    private int alturamax;
    private int comprimento;
    
    //construtor
    public Caminhao(int peso, int velocmax, int preco, int toneladas, int alturamax, int comprimento) {
        super(peso, velocmax, preco);
        this.toneladas = toneladas;
        this.alturamax = alturamax;
        this.comprimento = comprimento;
    }

    //get and set
    public int getToneladas() {
        return toneladas;
    }
    public void setToneladas(int toneladas) {
        this.toneladas = toneladas;
    }
    public int getAlturamax() {
        return alturamax;
    }
    public void setAlturamax(int alturamax) {
        this.alturamax = alturamax;
    }
    public int getComprimento() {
        return comprimento;
    }
    public void setComprimento(int comprimento) {
        this.comprimento = comprimento;
    }
    
}
