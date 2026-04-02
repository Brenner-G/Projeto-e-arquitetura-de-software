import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
public class Consulta {
    private final Paciente paciente;
    private LocalDate dia;
    private LocalTime horario;
    private String sala;
    private Double duracao;
    private ArrayList<Material> materiaisUtilizados;
    private Medico medico;

    public Consulta(Paciente paciente,LocalDate dia,LocalTime horario){
        this.paciente = paciente;
        this.dia = dia;
        this.horario = horario;
    }

    public Consulta(Paciente paciente,LocalDate dia,LocalTime horario,String sala,Double duracao,ArrayList<Material> materiaisUtilizados,Medico medico){
        this(paciente,dia,horario);
        this.sala = sala;
        this.duracao = duracao;
        this.materiaisUtilizados = materiaisUtilizados;
        this.medico = medico;
    }

    public Paciente getPaciente(){
        return paciente;
    }

    public LocalDate getDia(){
        return dia;
    }

    public LocalTime getHorario(){
        return horario;
    }

    public String getSala(){
        return sala;
    }

    public Double getDuracao(){
        return duracao;
    }

    public ArrayList<Material> getMateriaisUtilizados(){
        return materiaisUtilizados;
    }

    public Medico getMedico(){
        return medico;
    }

    public void setDia(LocalDate dia){
        this.dia = dia;
    }

    public void setHorario(LocalTime horario){
        this.horario = horario;
    }

    public void setSala(String sala){
        this.sala = sala;
    }

    public void setDuracao(Double duracao){
        this.duracao = duracao;
    }

    public void setMateriaisUtilizados(ArrayList<Material> materiaisUtilizados){
        this.materiaisUtilizados = materiaisUtilizados;
    }

    public void setMedico(Medico medico){
        this.medico = medico;
    }
}
