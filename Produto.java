public abstract class Produto {
    private int codigo;
    private String nome;
    private double precoVenda;
    private double precoCompra;
    private String descricao;
    
    public Produto (int codigo, String nome, double precoVenda, double precoCompra, String descricao) {
        this.codigo = codigo;
        this.nome = nome;
        this.precoVenda = precoVenda;
        this.precoCompra = precoCompra;
        this.descricao = descricao;
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
    
    public double getPrecoVenda () {
        return this.precoVenda;
    }
    
    public void setPrecoVenda (double precoVenda) {
        this.precoVenda = precoVenda;
    }
    
    public double getPrecoCompra () {
        return this.precoCompra;
    }
    
    public void setPrecoCompra (double precoCompra) {
        this.precoCompra = precoCompra;
    }
    
    public String getDescricao () {
        return this.descricao;
    }
    
    public void setDescricao (String descricao) {
        this.descricao = descricao;
    }
    
    public void listaProduto () {
        System.out.println("Código: " + this.codigo);
        System.out.println("Nome: " + this.nome);
        System.out.println("Preço: " + this.precoVenda);
        System.out.println("Descrição: " + this.descricao);
    }
}