public class Material {
    private final int codigo;
    private final String nome;
    private String unidadeMedida;
    private Double custoUnitario;
    private int quantidadeEstoque;


    public Material(int codigo, String nome){
        this.codigo = codigo;
        this.nome = nome;
    }
    public Material(int codigo, String nome, String unidadeMedida, Double custoUnitario, int quantidadeEstoque){
        this(codigo,nome);
        this.unidadeMedida = unidadeMedida;
        this.custoUnitario = custoUnitario;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public int getCodigo(){
        return codigo;
    }

    public String getNome(){
        return nome;
    }

    public String getUnidadeMedida(){
        return unidadeMedida;
    }
    
    public Double getCustoUnitario(){
        return custoUnitario;
    }

    public int getQuantidadeEstoque(){
        return quantidadeEstoque;
    }

    public void setUnidadeMedida(String unidadeMedida){
        this.unidadeMedida = unidadeMedida;
    }

    public void setCustoUnitario(Double custoUnitario){
        this.custoUnitario = custoUnitario;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque){
        this.quantidadeEstoque = quantidadeEstoque;
    }

}
