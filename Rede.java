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
    
    public void cadastraURE (double[] posicao, String cidade) {
        int size = this.UREs.size();
        if (size < 5) {
            URE ure = new URE(size, posicao, cidade);
            this.UREs.add(ure);
        } else {
            throw new RuntimeException("Não é possível adicionar mais UREs");
        }
    }
    
    public void cadastraProdutoURE (int codigoProduto, int codigoURE) {
        Produto produto = getProduto(codigoProduto);
        URE ure = getURE(codigoURE);
        ure.cadastraProduto(produto);
    }
    
    public void cadastraGerenteDeEstoque (String nome) {
        int size = this.gerentesDeEstoque.size();
        if (size < 5) {
            GerenteDeEstoque gerenteDeEstoque = new GerenteDeEstoque(this.gerentesDeEstoque.size(), nome);
            this.gerentesDeEstoque.add(gerenteDeEstoque);
        } else {
            throw new RuntimeException("Não é possível adicionar mais gerentes de estoque");
        }
    }
    
    public void cadastraLoja (double[] posicao) {
        int size = this.lojas.size();
        if (size < 5) {
            Loja loja = new Loja(this.lojas.size(), posicao);
            this.lojas.add(loja);
        } else {
            throw new RuntimeException("Não é possível adicionar mais lojas");
        }
    }
    
    public void cadastraProdutoLoja (int codigoProduto, int codigoLoja) {
        Produto produto = getProduto(codigoProduto);
        Loja loja = getLoja(codigoLoja);
        loja.cadastraProduto(produto);
    }
       
    public void cadastraCliente (String nome) {
        Cliente cliente = new Cliente(this.clientes.size(), nome);
        this.clientes.add(cliente);
    }
    
    public void cadastraFornecedor (String nome) {
        Fornecedor fornecedor = new Fornecedor(this.fornecedores.size(), nome);
        this.fornecedores.add(fornecedor);
    }
    
    public void cadastraProdutoFornecedor (int codigoProduto, int codigoFornecedor, double precoCompra) {
        Produto produto = getProduto(codigoProduto);
        Fornecedor fornecedor = getFornecedor(codigoFornecedor);
        produto.setPrecoCompra(precoCompra);
        fornecedor.cadastraProduto(produto);
    }
    
    public void cadastraProduto (String nome, double precoVenda, String descricao, String tipo) {
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
    
    public void cadastraFuncionario (String nome) {
        Funcionario funcionario = new Funcionario(this.funcionarios.size(), nome);
        this.funcionarios.add(funcionario);
    }
    
    public void listaProdutosUREs () {
        for (int i = 1; i <= lojas.size(); i++) {
            System.out.println("---------");
            System.out.println("Produtos da URE " + i + "\n");
            getURE(i-1).listaProdutos();
            System.out.println("---------");
        }
    }
    
    public void listaProdutosURE (int codigoURE) {
        URE ure = getURE(codigoURE);
        ure.listaProdutos();
    }
    
    public void listarLucroLojas () {
        for (int i = 1; i <= lojas.size(); i++) {
            System.out.format("Lucro loja " + i + ": R$%.2f%n", getLoja(i-1).getLucro());
        }
    }
    
    public void listaLucroLoja (int codigoLoja) {
        System.out.format("Lucro loja " + (codigoLoja+1) + ": R$%.2f%n", getLoja(codigoLoja).getLucro());
    }
    
    public void listaProdutosLojas () {
        for (Loja loja : lojas) {
            System.out.println("---------");
            loja.listaProdutos();
            System.out.println("---------");
        }
    }
    
    public void listaProdutosLoja (int codigoLoja) {
        Loja loja = getLoja(codigoLoja);
        loja.listaProdutos();
    }
    
    public void consultaEstoque (int codigoLoja, int codigoFuncionario, int codigoProduto) {
        Loja loja = getLoja(codigoLoja);
        if (loja != null) {
            loja.consultaEstoque(codigoFuncionario, codigoProduto);
        } else {
            throw new IllegalArgumentException("Loja inválida");
        }
    }
}