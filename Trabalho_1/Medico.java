import java.util.ArrayList;

public class Medico extends Pessoa{
    private Double salario;
    private ArrayList<String> especialidades;


    public Medico(String cpf, String nome){
        super(cpf,nome);
    }

    public Medico(String cpf, String nome, String endereco, String telefone, Double salario,ArrayList<String> especialidades){
        super(cpf,nome,endereco,telefone);
        this.salario = salario;
        this.especialidades = especialidades;
    }

    public Double getSalario(){
        return salario;
    }

    public ArrayList<String> getEspecialidades(){
        return especialidades;
    }

    public void setSalario(Double salario){
        this.salario = salario;
    }

    public void setEspecialidades(ArrayList<String> especialidades){
        this.especialidades = especialidades;
    }

}
