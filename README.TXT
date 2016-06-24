------------------------------------------------------------------------
This is the project README file. Here, you should describe your project.
Tell the reader (someone who does not know anything about this project)
all he/she needs to know. The comments should usually include at least:
------------------------------------------------------------------------

PROJECT TITLE:
PURPOSE OF PROJECT:
VERSION or DATE:
HOW TO START THIS PROJECT:
AUTHORS:
USER INSTRUCTIONS:
    
Operações:
   
    - Funcionário realiza consulta ao estoque da loja
        Caso não haja o item no estoque, funcionário pode solicitar à URE
        
    - Loja solicitar produto para URE
        Produto deve ser solicitado para URE mais próxima
        
    - URE comprar produto de fornecedor
        Só o Gerente de Estoque de cada unidade pode realizar compras
        Só realiza compra se o produto não estiver disponível em outra URE
        Uma URE pode comprar um mesmo tipo de item, de vários fornecedores, com preços diferenciados
        
    - Listar os produtos de uma loja
        Lojas não possuem estoque próprio, só os itens da prateleira
    
    - Informar o total de itens nas UREs e seus valores
    
    - Informar o lucro de cada loja
    
Classes:
    Rede
        Atributos:
        Métodos:    - Cadastrar produto
                        Tipos de produtos: bebidas, mercearia, limpeza, higiene & perfumaria, e feira
                        Cada item de um determinado produto possui os atributos necessários para a adminstração das Filiais
                        
        Produto (abstrata) -> bebidas, mercearia, limpeza, higiene & perfumaria, e feira
            Atributos:
            Métodos:

        URE
            Atributos:
            Métodos:    - Transferir itens de produtos entre UREs
                            Deve dar prioridade a URE mais próxima
                            Cada URE não pode ter menos de 100 itens de cada tipo de produto
                            
                        - Transferir itens de produtos de UREs pra lojas
                            Loja deve ter uma fila de prioridade para ser abastecida pelas UREs, ordenada por distância
            
            Gerente de Estoque:
                Atributos:
                Métodos:
        
        Loja
            Atributos:
            Métodos:
            
            Funcionário:
                Atributos:
                Métodos:
            
    Fornecedor
            Atributos:
            Métodos:
            
    Cliente:
            Atributos:
            Métodos:    - Cliente realiza compra