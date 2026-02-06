import java.util.Scanner;


public class Calculadora {
    public static void main(String[] args){
        
        Scanner numeros =new  Scanner(System.in);
        
        // MENU 
        
        System.out.println("====Calculadora do Guisso====");
        System.out.println("1. Soma");
        System.out.println("2. Subtracao");
        System.out.println("3. Divisao");
        System.out.println("4. Mutiplicacao");
        
        System.out.println("\n Digite uma das opcoes: ");
        String opcao = numeros.nextLine();
        
        //  OPERAÇÕES
        

        // SOMA

        if (opcao.equals("1")) {
            System.out.println("====Calculadora do Guisso====");
            System.out.println("Digite o primeiro numero:");
            String soma1 = numeros.nextLine();
            System.out.println("Digite o segundo numero:");
            String soma2 = numeros.nextLine();

            Double soma3 = Double.parseDouble(soma1);
            Double soma4 = Double.parseDouble(soma2);
            var soma = (soma3 + soma4);
            System.out.println("Resultado: " + soma);
        }

        // SUBTRACAO

        else if (opcao.equals("2")) {
            System.out.println("====Calculadora do Guisso====");
            System.out.println("Digite o primeiro numero:");
            String subtracao1 = numeros.nextLine();
            System.out.println("Digite o segundo numero:");
            String subtracao2 = numeros.nextLine();

            Double subtracao3 = Double.parseDouble(subtracao1);
            Double subtracao4 = Double.parseDouble(subtracao2);

            var subtracao = subtracao3 - subtracao4;

            System.out.println("Resultado: " + subtracao);
            
        }

        // DIVISAO

        else if (opcao.equals("3")) {
            System.out.println("====Calculadora do Guisso====");
            System.out.println("Digite o primeiro numero:");
            String divisao1 = numeros.nextLine();
            System.out.println("Digite o segundo numero:");
            String divisao2 = numeros.nextLine();

            Double divisao3 = Double.parseDouble(divisao1);
            Double divisao4 = Double.parseDouble(divisao2);

            var divisao = divisao3 / divisao4 ;

            System.out.println("Resultado: " + divisao);
            
        }

        // MULTIPLICACAO

        else if (opcao.equals("4")) {
            System.out.println("====Calculadora do Guisso====");
            System.out.println("Digite o primeiro numero:");
            String multiplicacao1 = numeros.nextLine();
            System.out.println("Digite o segundo numero:");
            String mutiplicacao2 = numeros.nextLine();

            Double multiplicacao3 = Double.parseDouble(multiplicacao1);
            Double multiplicacao4 = Double.parseDouble(mutiplicacao2);

            var multiplicacao = multiplicacao3 * multiplicacao4;

            System.out.println("Resultado: " + multiplicacao);
            
        }

        numeros.close();
    }
}
