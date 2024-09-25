public class Produto {
    //Criando Classe Produto
    String name;
    String marca;
    double preco;
    double precoVenda;

    //Criando um metodo construtor para inicializar algumas variaveis que vou utilizar
    public Produto(String name, String marca, double preco, double precoVenda) {
        this.name = name;
        this.marca = marca;
        this.preco = preco;
        this.precoVenda = precoVenda;
    }
    //Criando metodo que calcula e valida utilizando operador ternário para me retornar se ocorreu Lucro, Défice ou nenhum dos dois
    String CalculaLucro() {
        double resultLucro = precoVenda - preco;
        return  resultLucro <0 ? "Seu Défice é R$: " + resultLucro : resultLucro > 0 ?"Seu lucro é R$:" + resultLucro :"Sem Défice R$:" + resultLucro ;

    }

}