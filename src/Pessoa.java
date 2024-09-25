import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class Pessoa {

    //Criando Classe Pessoa
    String name;
    double altura;
    LocalDate  dataDeNascimento;

    //Criando um metodo consturtor de Pessoa para inicializar alguns atributos que vou utilizar
    public Pessoa(String name, double altura, LocalDate  dataDeNascimento) {
        this.name = name;
        this.altura = altura;
        this.dataDeNascimento = dataDeNascimento;

    }

    //Criando metodo CriarEmail aonde ele utiliza dos atributos nome e sobrenome para criar e retornar um email
    String CriarEmail() {
        System.out.println(dataDeNascimento);
        String[] names = this.name.split(" ");
        return names[0] + "." + names[1] + "@gmail.com";
    }

}