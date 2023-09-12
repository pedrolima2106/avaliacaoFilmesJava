//Programa feito apenas para estudar as estrururas do java
//Classe main é a classe principal do codigo
public class Main {
    //o medoto construtor da classe main
    public static void main(String[] args) {

        // Apenas texto que aparecen no terminal
        // Usar \n serve para pular paragrafos
        System.out.println("F4 Filmes");
        System.out.println("Uso o F4 nesse Filme?");
        System.out.println("\nFilme:Missão Imposivel");

        //Criando uma variavel do tipo inteiro
        //Adicionar um + e o nome da varivel serve para concatenar o resultado da variavel ao texto
        int anoDeLancamento = 1996;
        System.out.println("Ano do lançamento:" + anoDeLancamento);

        //Crindo uma variavel que possa usar numeros quebrados
        double notaFilme = 8.5;
        System.out.println("Nota:" + notaFilme);

        //Crindo uma variavel de verdadeiro ou falso
        boolean incluidoNoPlano = false;

        //Variavel armasenando o valor de um calculo
        double media = (9 + 8.5 + 4)/3;
        System.out.println("\nMedia Desse Filme: " + media);

        //Criando uma variavel do tipo texto
        //O uso de 3 aspas facilita a formataçao do texto
        //{Deven ser usados juntos
        // O formatted e o format sever para mesmsa coisa de formas diferentes
        //%d numeros inteiros %s texto %.2f numeros com duas casa decimais = servem para adicionar as variaveis ao texto
        //}
        String sinopse;
        sinopse = """
                
                Sinopse:
                Missão Impossível é uma série de filmes de ação e 
                espionagem baseada na série de televisão de mesmo nome,
                exibida de 1966 a 1973. A trama central dos filmes gira 
                em torno do agente secreto Ethan Hunt,
                 
                Ano de lançamento:%d
                """.formatted(anoDeLancamento);
        System.out.println(sinopse);

        String protagonista = "Ethan Hunt";

        System.out.println(String.format("Agente secreto:%s",protagonista));

        //Coverção do tipo int para o double Casting implícito
        //Coverção do tipo double para int Casting explícito
        int avaliacao = (int) (media/2);
        System.out.println(String.format("Avaliação do Filme é: %d",avaliacao));

        int x = 10;
        double y = x;
        System.out.println("\nCasting implícito: " + y);

        double w = 10.5;
        int e = (int) w;
        System.out.println("\nCasting explícito: " + e);


        /*//loop padrao de 1 a 5
        for (int i = 1; i <= 5; i++) {

            System.out.println("i = " + i);
        }*/
    }
}