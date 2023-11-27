package excecoes;

import pessoa.Pessoa;

public class Exececoes {
    
    //Checked exceptions(vão extends throws Exception ) -(conseguimos prever) Compilador do java exige que tratamos o erro

    //Unchecked exceptions(vão extends RUN TIME EXCEPTION) - (não temos controle, o compilador nao consegue saber si vai dar erro)

    public static void main(String[] args) throws Exception {
       // Checked exceptions
        
        try {
            
            validarNumero();
            
        } catch (Exception e) {
           System.out.println("Deu ruim");
           e.printStackTrace();
        }
    }

    public static void validarNumero() throws Exception {
       int numero = 10;
       if (numero < 100) {
            throw new Exception("O número é menor que 100");
       }
    }
}
