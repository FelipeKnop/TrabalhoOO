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
}