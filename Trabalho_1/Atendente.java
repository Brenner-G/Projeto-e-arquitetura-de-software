public class Atendente extends Pessoa{
    private Double salario;


    public Atendente(String cpf, String nome){
        super(cpf,nome);
    }

    public Atendente(String cpf, String nome, String endereco, String telefone, Double salario){
        super(cpf,nome,endereco,telefone);
        this.salario = salario;
    }

    public Double getSalario(){
        return salario;
    }

    public void setSalario(Double salario){
        this.salario = salario;
    }

}
