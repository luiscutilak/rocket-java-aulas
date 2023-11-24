package pessoa;

public class Pessoa {

   private String nome;
   private String cpf;
   private int idade;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    String imprimirDadosDaPessoa(int indice) {
        return "O nome é " + nome + " a idade é " + idade + " e o CPF é " + cpf; 
    }
};




// "o nome da pessoa é " + nome + " a idade é " + idade + " o CPF é : " + cpf;    