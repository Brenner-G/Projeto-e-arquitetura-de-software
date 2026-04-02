public class Paciente extends Pessoa{


    public Paciente(String cpf, String nome){
        super(cpf,nome);
    }

    public Paciente(String cpf, String nome, String endereco, String telefone){
        super(cpf,nome,endereco,telefone);
    }
}
