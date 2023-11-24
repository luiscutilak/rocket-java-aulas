package primeirasAulas;
class EstruturasRepeticao {

    public static void main(String[] args) {

        int dadoDoTipoInt = 10;
        double dadoDoTipoDouble = 3.14;
        float dadoDoTipoFloat = 3.14f;
        long dadoDoTipoLong = 89879847324823L;
        String dadDOTipoString = "Colocar o meu texto";
        boolean dadoDoTipoBoolean = false;

        if (dadoDoTipoInt == 10) {
            System.out.println("entrou no if");
        } else if(dadoDoTipoInt < 12){
            System.out.println("entrou no if do 12");
        } else {
            System.out.println("Entrou no Else");
        }

        //While (Enquanto While for verdadeiro)
        int valorInicial = 0;
        while (valorInicial < 3) {
            System.out.println("o valor inicial é menor que 3");
            valorInicial++;
        }
        System.out.println("Saiu do While");

        //For
        System.out.println("iniciando o for");
        for(int i = 0; i < 4; i++) {
            System.out.println("O valor do i é: " +i);
        }

        System.out.println("finalizando o for");

    }

}