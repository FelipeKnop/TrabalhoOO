import java.util.*;

public class Rede {
    private List<URE> UREs;
    private List<GerenteDeEstoque> gerentesDeEstoque;
    private List<Loja> lojas;
    private List<Cliente> clientes;
    private List<Fornecedor> fornecedores;
    private List<Produto> produtos;
    private List<Funcionario> funcionarios;
    
    public Rede () {
        this.UREs = new ArrayList<URE>(5);
        this.gerentesDeEstoque = new ArrayList<GerenteDeEstoque>(5);
        this.lojas = new ArrayList<Loja>(5);
        this.clientes = new ArrayList<Cliente>();
        this.fornecedores = new ArrayList<Fornecedor>();
        this.produtos = new ArrayList<Produto>();
        this.funcionarios = new ArrayList<Funcionario>();
    }
    
    public URE getURE (int codigo) {
        return UREs.get(codigo);
    }
    
    public GerenteDeEstoque getGerenteDeEstoque (int codigo) {
        return gerentesDeEstoque.get(codigo);
    }
    
    public Loja getLoja (int codigo) {
        return lojas.get(codigo);
    }
    
    public Cliente getCliente (int codigo) {
        return clientes.get(codigo);
    }
    
    public Fornecedor getFornecedor (int codigo) {
        return fornecedores.get(codigo);
    }
    
    public Produto getProduto (int codigo) {
        return produtos.get(codigo);
    }
    
    public Funcionario getFuncionario (int codigo) {
        return funcionarios.get(codigo);
    }
       
    public void cadastrarProduto (String nome, double precoVenda, String descricao, String tipo) {
        Produto produto;
        switch (tipo) {
            case "Feira":
                produto = new Feira(produtos.size(), nome, precoVenda, 0, descricao);
                break;
            case "HigieneEPerfumaria":
                produto = new HigieneEPerfumaria(produtos.size(), nome, precoVenda, 0, descricao);
                break;
            case "Limpeza":
                produto = new Limpeza(produtos.size(), nome, precoVenda, 0, descricao);
                break;
            case "Mercearia":
                produto = new Mercearia(produtos.size(), nome, precoVenda, 0, descricao);
                break;
            case "Bebida":
                produto = new Bebida(produtos.size(), nome, precoVenda, 0, descricao);
                break;
            default:
                throw new IllegalArgumentException("Não existe produto desse tipo");
        }
        produtos.add(produto);
    }
}