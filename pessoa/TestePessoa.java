package pessoa;

public class TestePessoa {
    public static void main(String[] args) {

        Professor professor = new Professor();
        professor.setCpf("334556789");
        professor.setNome("Daniele");
        professor.setIdade(33);
        professor.setSalario(15000);
        
        System.out.println(professor.imprimirDadosDaPessoa());
        
        Aluno aluno = new Aluno();
        aluno.setNome("Luis");
        aluno.setCpf("35457159817");
        aluno.setIdade(37);
        aluno.setMatricula("333");

        System.out.println(aluno.imprimirDadosDaPessoa());

    };
    
};


// Pessoa pessoa1 = new Pessoa();
//         pessoa1.cpf = "324324342432";
//         pessoa1.idade = 34;
//         pessoa1.nome = "Luis";

//         System.out.println(pessoa1.imprimirDadosDaPessoa());

//         Pessoa pessoa2 = new Pessoa();
//         pessoa2.cpf = "3928748937";
//         pessoa2.idade = 37;    
//         pessoa2.nome = "Roberto";

//         System.out.println(pessoa2.imprimirDadosDaPessoa());