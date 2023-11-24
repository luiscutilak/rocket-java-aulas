package contaBancaria;

public class TesteContaBancaria {
    public static void main(String[] args) {
       ContaBancaria contabancaria1 = new ContaBancaria();

       contabancaria1.setNumero("1234");
       contabancaria1.setTitular("Joao");

       contabancaria1.depositar(200);
       contabancaria1.sacar(50);

    }
}
