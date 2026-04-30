import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

public class Atendente extends Thread {
    
    private final int id;
    private final LinkedBlockingQueue<Cliente> fila;
    private int contador = 0;
    
    public Atendente(int id, LinkedBlockingQueue<Cliente> fila) {
    this.id = id;
    this.fila = fila;
    }

    public int getId(){
        return id;
    }

    public int getContador(){
        return contador;
    }
    
    @Override
    public void run() {
        while (!Thread.currentThread().isInterrupted()) {
            try {
                Cliente cliente = fila.poll(2, TimeUnit.SECONDS);
                if (cliente != null) {
                System.out.println("Começou o atendimento de " + cliente.getId());
                Thread.sleep(cliente.getTempoAtendimento()*1000L);
                System.out.println("terminou o atendimento de " + cliente.getId());
                this.contador += 1;
            }
            } catch (Exception e) {
                Thread.currentThread().interrupt();
            }            
        }            
    }
}