import java.util.*;

//PARTE1

//  lER DO CONSOLE UM NOME DE PESSOA SEPARADO POR VÍRGULA,
//SEPARAR OS VALORES LIDOS E GUARDAR EM UMA VARÍAVEL,
//ORDENAR ESSA VARIÁVEL E IMPRIMIR NO CONSOLE.

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Oi, você quer fazer a parte 1 ou a parte 2 do exercício? (Responda com 1 ou 2)");
        int respotas = s.nextInt();

        while ((respotas == 1) || (respotas == 2)) {
            if (respotas == 1) {
                System.out.println("******* PARTE 1 ******");
                commaSepareted();
            } else {
                System.out.println("******* PARTE 2 ******");
                dashSepareted();
            }

            System.out.println("E agora, você quer fazer a parte 1 ou a parte 2 do exercício? (Responda com 1 ou 2 - Para sair, digite 0)");
            respotas = s.nextInt();
        }
    }

    ;

    private static void commaSepareted() {
        Scanner s = new Scanner(System.in);
        System.out.println("Insira alguns nomes separados por vírgula");
        String names = s.nextLine().toLowerCase();

        String[] namesList = names.split(",");
        Arrays.sort(namesList);

        System.out.println(Arrays.toString(namesList));
    }


    //          PARTE2
// LER DO CONSOLE UM NOME E O SEXO DESSA PESSOA SEPARADO POR
// UM TRAÇO, EX "MICHAEL-MASCULINO, LUIZA-FEMININO"
// SEPARAR POR GRUPOS DE GÊNEROS (DUAS LISTAS), E IMPRIMIR NO
// CONSOLE AS DUAS LISTAS EM SEPARADO
    private static void dashSepareted() {
        Scanner s = new Scanner(System.in);
        System.out.println("Insira os nomes com o sexo separado por traço. Use F ou M para o sexo. Ex.[Michael-M] ou [Luiza-F]: ");
        String names = s.nextLine().toLowerCase();

        String[] namesArray = names.split(",");
        int numerosElementos = namesArray.length;

        List<String> listaDeDivisaoPorSexoMasculino = new ArrayList<>();
        List<String> listaDeDivisaoPorSexoFeminino = new ArrayList<>();

        for (int i = 0; i < numerosElementos; i++) {
            String[] dividoPorDash = namesArray[i].split("-");
            String nomePorElemento = dividoPorDash[0];

            if (dividoPorDash[1].equalsIgnoreCase("m")) {
                listaDeDivisaoPorSexoMasculino.add(nomePorElemento);
            } else if (dividoPorDash[1].equalsIgnoreCase("f")) {
                listaDeDivisaoPorSexoFeminino.add(nomePorElemento);
            }
        }

        System.out.println("Essa é a lista de nomes masculina:  " + listaDeDivisaoPorSexoMasculino);
        System.out.println("Essa é a lista nomes Feminino:  " + listaDeDivisaoPorSexoFeminino);


    }


}