import java.util.ArrayList;
import java.util.concurrent.LinkedBlockingQueue;

public class Main {
    public static void main(String[] args) {
        LinkedBlockingQueue<Cliente> fila = new LinkedBlockingQueue<>();

        ArrayList<Atendente> atendentes = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            Atendente a = new Atendente(i, fila);
            atendentes.add(a);
            a.start();
        }

        int clienteId = 1;
        for (int i = 0; i < 30; i++) {
            Cliente c = new Cliente(clienteId++);
            fila.add(c);
            System.out.println("Cliente " + c.getId() + " entrou na fila");
            //espera dois segundos
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        for (Atendente a : atendentes) {
            a.interrupt();
        }
        try {
            for (Atendente a : atendentes) {
                a.join();
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        for (Atendente a : atendentes) {
            System.out.println("Atendente " + a.getId() + " realizou " + a.getContador() + " atendimentos");
        }
    }
}