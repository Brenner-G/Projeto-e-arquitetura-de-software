public class Pessoa {
    private final String cpf;
    private final String nome;
    private String endereco;
    private String telefone;

    public Pessoa(String cpf, String nome){
        this.cpf = cpf;
        this.nome = nome;
    }

    public Pessoa(String cpf, String nome, String endereco, String telefone){
        this(cpf,nome);
        this.endereco = endereco;
        this.telefone = telefone;
   }


   public String getCpf(){
    return cpf;
   }

   public String getNome(){
    return nome;
   }


   public String getEndereco(){
    return endereco;
   }

   public String getTelefone(){
    return telefone;
   }

   public void setEndereco(String endereco){
    this.endereco = endereco;
   }

   public void setTelefone(String telefone){
    this.telefone = telefone;
   }

}