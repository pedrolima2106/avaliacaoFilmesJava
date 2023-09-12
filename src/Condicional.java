// crindo uma classe para poder tester de uma forma mais limpa os metodos de decisao
public class Condicional {
    public static void main(String[] args) {
        int anoDeLancamento = 1996;
        double notaFilme = 8.5;
        boolean incluidoNoPlano = false;
        String tipoPlano = "plus";

        // || ou, && e, > maior q, < menor q
        if (anoDeLancamento >= 2023){
            System.out.println("Filme do Ano");
        }else {
            System.out.println("Vale a pena ver de novo");
        }
        // .equals() Serve para comparar uma string
        if (incluidoNoPlano == true || tipoPlano.equals("plus")){
            System.out.println("Filme liberado");
        }else{
            System.out.println("Deve pagar pra Ver");
        }


        int estrelas = 5;
        String numeroEstrelas;

        switch (estrelas){
            case 1:
                numeroEstrelas = "fraco";
                break;
            case 2:
                numeroEstrelas = "Medio";
                break;
            case 3:
                numeroEstrelas = "Bom";
                break;
            case 4:
                numeroEstrelas = "Otimo";
                break;
            case 5:
                numeroEstrelas = "Exelente";
                break;
            default:
                numeroEstrelas = "sem nota";
                break;
        }

        System.out.println("Esse fime é: " + numeroEstrelas);
    }
}
