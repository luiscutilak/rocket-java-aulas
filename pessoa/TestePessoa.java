package pessoa;

public class TestePessoa {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.cpf = "324324342432";
        pessoa.idade = 34;
        pessoa.nome = "Luis";

        System.out.println(pessoa.imprimirDadosDaPessoa());

        Pessoa pessoa1 = new Pessoa();
        pessoa1.cpf = "3928748937";
        pessoa1.idade = 37;    
        pessoa1.nome = "Roberto";

        System.out.println(pessoa1.imprimirDadosDaPessoa());
    };
    

};
