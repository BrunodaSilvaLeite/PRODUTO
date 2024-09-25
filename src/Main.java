import java.time.LocalDate;
public class Main {
    public static void main(String[] args) {
        //Criando um objeto Produto e passando os valores dos atributos
        Produto produto = new Produto ("Camisa", "Nike", 25, 26);

        //Mostrando na tela os atributos e reotornos do cálculo
        System.out.println(  produto.name +" "+ produto.marca + " " + produto.CalculaLucro());

        //Criando um objeto Produto e passando os valores dos atributos
        Pessoa pessoa = new Pessoa ("Carlos Silva", 1.65, LocalDate.of(1995, 5, 20) );

        //Mostrando e chamando metodo CriarEmail para retornar um email criado
        System.out.println(pessoa.CriarEmail());


    }
}