public class GerenteDeEstoque {
    private int codigo;
    private String nome;
    
    public GerenteDeEstoque (int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }
    
    public int getCodigo () {
        return this.codigo;
    }
    
    public String getNome () {
        return this.nome;
    }
    
    public void setNome (String nome) {
        this.nome = nome;
    }
}