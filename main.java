import javax.swing.text.html.HTMLDocument.HTMLReader.PreAction;

public class main {
    
    public static void main(String[] args) {
         
        CarroPasseio gm =  new CarroPasseio(700, 120, 12000, "preto", "corsa");
        Caminhao mercedes = new Caminhao(5000, 100, 100000, 1000, 3, 15);

        System.out.println(gm);
    }
}
