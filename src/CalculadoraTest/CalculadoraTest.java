package CalculadoraTest;

public class CalculadoraTest {

    public static void main(String[] args) {
        Soma c = new Soma();
        Subtracao ca = new Subtracao();
        Multiplicacao cal = new Multiplicacao();
        Divisao calc = new Divisao();

        //SOMA_______________________________________________________________//
        //Cenario teste 1: Soma de dois valores
        int soma = c.somar(6, 6);
        System.out.println(soma);

        //Cenario teste 2: Soma de dois valores sendo um zero
        soma = c.somar(6, 0);
        System.out.println(soma);

        //Cenario teste 3: Soma de dois valores sendo que ambos sao zero
        soma = c.somar(0, 0);
        System.out.println(soma);

        //Cenario teste 4: Soma de dois valores sendo um negativo
        soma = c.somar(6, -6);
        System.out.println(soma);

        //SUBTRACAO__________________________________________________________//
        //Cenario teste 1: Subtracao de dois valores
        int subtracao = ca.subtrair(12, 6);
        System.out.println(subtracao);

        //Cenario teste 2: Subtracao de dois valores sendo um zero
        subtracao = ca.subtrair(6, 0);
        System.out.println(subtracao);

        //Cenario teste 3: Subtracao de dois valores sendo que ambos sao zero
        subtracao = ca.subtrair(0, 0);
        System.out.println(subtracao);

        //Cenario teste 4: Subtracao de dois valores sendo um negativo
        subtracao = ca.subtrair(-12, 6);
        System.out.println(subtracao);

        //MULTIPLICACAO______________________________________________________//
        //Cenario teste 1: Multiplicacao de dois valores
        int multiplicacao = cal.multiplicar(6, 6);
        System.out.println(multiplicacao);

        //Cenario teste 2: Multiplicacao de dois valores sendo um zero
        multiplicacao = cal.multiplicar(6, 0);
        System.out.println(multiplicacao);

        //Cenario teste 3: Multiplicacao de dois valores sendo que ambos sao zero
        multiplicacao = cal.multiplicar(0, 0);
        System.out.println(multiplicacao);

        //Cenario teste 4: Multiplicacao de dois valores sendo um negativo
        multiplicacao = cal.multiplicar(6, -6);
        System.out.println(multiplicacao);

        //DIVISAO____________________________________________________________//
        //Cenario teste 1: Divisao de dois valores
        int divisao = calc.dividir(6, 6);
        System.out.println(divisao);
        
        //DIVISAO POR ZERO EM JAVA NAO E POSSIVEL, UMA MANEIRA DE TRATAR O ERRO E EVITAR QUE O CALCULO ACONTECA E ENVIAR
        //UMA MENSAGEM AVISANSO AO USUARIO QUE DIVISOES POR ZERO NAO SAO PERMITIDOS E PROSSEGUIR COM OS DEMAIS CALCULOS.
        /*//Cenario teste 2: Divisao de dois valores sendo um zero
        divisao = calc.dividir(6, 0);
        System.out.println(divisao);

        //Cenario teste 3: Divisao de dois valores sendo que ambos sao zero
        divisao = calc.dividir(0, 0);
        System.out.println(divisao);*/

        //Cenario teste 4: Divisao de dois valores sendo um negativo
        divisao = calc.dividir(6, -6);
        System.out.println(divisao);
        
        //QUANDO UMA CONTA TRAS UM RESULTADO QUE NAO E UM INTEIRO MAS A VARIAVEL E UM INTEIRO O JAVA PODE DAR ERRO OU TRAZER
        //UM RESULTADO ERRADO AO USUARIO, PARA CORRIGIR BASTA TROCAR A VARIAVEL POR UM FLOAT OU DOUBLE.
        //Cenario teste 5: Divisao de dois valores porem o resultado final nao e um inteiro
        divisao = calc.dividir(6, 8);
        System.out.println(divisao);
    }
}