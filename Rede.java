import java.awt.Point;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Rede {
    
    private final ArrayList<URE> UREs;
    private final ArrayList<Loja> lojas;
    private final ArrayList<Cliente> clientes;
    private final ArrayList<Fornecedor> fornecedores;
    private final ArrayList<Funcionario> funcionarios;
    private final ArrayList<GerenteDeEstoque> gerentesDeEstoque;
    private final ArrayList<Produto> produtos;

    public Rede() {
        this.UREs = new ArrayList<>(5);
        this.lojas = new ArrayList<>(5);
        this.clientes = new ArrayList<>();
        this.fornecedores = new ArrayList<>();
        this.funcionarios = new ArrayList<>();
        this.gerentesDeEstoque = new ArrayList<>(5);
        this.produtos = new ArrayList<>();
    }
    
    public URE getURE(int codigoURE) {
        try {
            return UREs.get(codigoURE);
        } catch (IndexOutOfBoundsException e) {
            throw new IllegalArgumentException("Não existe URE com esse código");        
        }
    }
    
    public Loja getLoja(int codigoLoja) {
        try {
            return lojas.get(codigoLoja);
        } catch (IndexOutOfBoundsException e) {
            throw new IllegalArgumentException("Não existe loja com esse código");           
        }
    }
    
    public Cliente getCliente(int codigoCliente) {
        try {
            return clientes.get(codigoCliente);
        } catch (IndexOutOfBoundsException e) {
            throw new IllegalArgumentException("Não existe cliente com esse código");            
        }
    }
    
    public Fornecedor getFornecedor(int codigoFornecedor) {
        try {
            return fornecedores.get(codigoFornecedor);
        } catch (IndexOutOfBoundsException e) {
            throw new IllegalArgumentException("Não existe fornecedor com esse código");           
        }
    }
    
    public Funcionario getFuncionario(int codigoFuncionario) {
        try {
            return funcionarios.get(codigoFuncionario);
        } catch (IndexOutOfBoundsException e) {
            throw new IllegalArgumentException("Não existe funcionario com esse código"); 
        }
    }
    
    public GerenteDeEstoque getGerenteDeEstoque(int codigoGerenteDeEstoque) {
        try {
            return gerentesDeEstoque.get(codigoGerenteDeEstoque);
        } catch (IndexOutOfBoundsException e) {
            throw new IllegalArgumentException("Não existe gerente de estoque com esse código");
        }
    }
    
    public Produto getProduto(int codigoProduto) {
        try {
            return produtos.get(codigoProduto);
        } catch (IndexOutOfBoundsException e) {
            throw new IllegalArgumentException("Não existe produto com esse código");
        }
    }
    
    public void cadastraURE(String cidade, Point posicao) {
        if (UREs.size() < 5) {
            UREs.add(new URE(UREs.size(), cidade, posicao));
        }
    }
    
    public void cadastraLoja(String cidade, Point posicao) {
        if (lojas.size() < 5) {
            lojas.add(new Loja(lojas.size(), cidade, posicao));
        }
    }
    
    public void cadastraCliente(String nome) {
        clientes.add(new Cliente(clientes.size(), nome));
    }
    
    public void cadastraFornecedor(String nome) {
        fornecedores.add(new Fornecedor(fornecedores.size(), nome));
    }
    
    public void cadastraFuncionario(String nome) {
        funcionarios.add(new Funcionario(funcionarios.size(), nome));
    }
    
    public void cadastraGerenteDeEstoque(String nome) {
        if (gerentesDeEstoque.size() < 5) {
            gerentesDeEstoque.add(new GerenteDeEstoque(gerentesDeEstoque.size(), nome));
        }
    }
    
    public void cadastraProduto(String nome, String descricao, double precoCompra, double precoVenda, int codigoFornecedor, String tipo) {
        try {
            Fornecedor fornecedor = getFornecedor(codigoFornecedor);
            Produto produto = null;
            switch(tipo) {
                case "Bebida":
                    produto = new Bebida(produtos.size(), nome, descricao, precoCompra, precoVenda, codigoFornecedor);
                    break;
                case "Feira":
                    produto = new Feira(produtos.size(), nome, descricao, precoCompra, precoVenda, codigoFornecedor);
                    break;
                case "HigieneEPerfumaria":
                    produto = new HigieneEPerfumaria(produtos.size(), nome, descricao, precoCompra, precoVenda, codigoFornecedor);
                    break;
                case "Limpeza":
                    produto = new Limpeza(produtos.size(), nome, descricao, precoCompra, precoVenda, codigoFornecedor);
                    break;
                case "Mercearia":
                    produto = new Mercearia(produtos.size(), nome, descricao, precoCompra, precoVenda, codigoFornecedor);
                    break;
                default:
                    throw new IllegalArgumentException("Não existe produto desse tipo");
            }
            produtos.add(produto);
            fornecedor.addProduto(produto);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void associaFuncionarioLoja(int codigoFuncionario, int codigoLoja) {
        try {
            Loja loja = getLoja(codigoLoja);
            Funcionario funcionario = getFuncionario(codigoFuncionario);
            loja.addFuncionario(funcionario);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void associaGerenteDeEstoqueURE(int codigoGerenteDeEstoque, int codigoURE) {
        try {
            URE ure = getURE(codigoURE);
            GerenteDeEstoque gerenteDeEstoque = getGerenteDeEstoque(codigoGerenteDeEstoque);
            ure.setGerenteDeEstoque(gerenteDeEstoque);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void compraProduto(int codigoGerenteDeEstoque, int codigoProduto, int codigoURE, int quantidade) {
        // TODO: Implementar quantidade
        try {
            URE ure = getURE(codigoURE);
            if (ure.isGerenteDeEstoque(codigoGerenteDeEstoque)) {
                Produto produto = getProduto(codigoProduto);
                ure.aumentaGasto(produto.getPrecoCompra() * quantidade);
                ure.aumentaProdutos(produto, quantidade);
            } else {
                System.out.println("Somente o gerente de estoque da URE pode comprar itens pra ela");
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void encomendaProdutoURE(int codigoUREDestino, int codigoProduto, int quantidade) {
        // TODO: Arrumar a transferência
        try {
            URE ure = getURE(codigoUREDestino);
            Point ponto = ure.getPosicao();
            ArrayList<URE> distancias = geraListaDistancias(ponto);
            for (int i = 1; i < distancias.size(); i++) {
                if (distancias.get(i).isDisponivel(codigoProduto, quantidade)) {
                    transfereProdutoURE(codigoUREDestino, distancias.get(i).getCodigo(), codigoProduto, quantidade);
                } else {
                    continue;
                }
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
    
    private ArrayList<URE> geraListaDistancias (Point ponto) {
        ArrayList<URE> distancias = new ArrayList<>(UREs);
        Collections.sort(distancias, new Comparator<URE>() {
            @Override
            public int compare(URE ure1, URE ure2) {
                return ((Double) ure1.getPosicao().distance(ponto)).compareTo(((Double) ure2.getPosicao().distance(ponto)));
            }
        });
        return distancias;
    }
    
    private void transfereProdutoURE(int codigoUREDestino, int codigoUREOrigem, int codigoProduto, int quantidade) {
        try {
            URE ureDestino = getURE(codigoUREDestino);
            URE ureOrigem = getURE(codigoUREDestino);
            if(ureDestino.getQuantidade(codigoProduto) + quantidade < 100) {
                throw new IllegalArgumentException("Não é possível transferir menos de 100 unidades");
            } else {
                ureOrigem.diminuiProdutos(codigoProduto, quantidade);
                ureDestino.aumentaProdutos(getProduto(codigoProduto), quantidade);
            }
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException(e.getMessage());
        }
    }
}
