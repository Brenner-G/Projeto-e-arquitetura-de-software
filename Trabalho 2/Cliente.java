import java.util.Random;
public class Cliente {
    private final int id;
    private int tempoAtendimento;

    
    public Cliente(int id) {
        this.id = id;
        Random random = new Random();
        this.tempoAtendimento = random.nextInt(11) + 5;
    }

    public int getId(){
        return id;
    }

    public int getTempoAtendimento(){
        return tempoAtendimento;
    }
}
