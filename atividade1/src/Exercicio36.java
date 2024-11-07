/*Nome: Alan Nogueira da Silva
//RA: 2171392321020 
//Objetivo : 36. Faça um programa na Linguagem Java que apresente os valores de 
conversão de graus Celsius em Fahrenheit, de 10 em 10 graus, iniciando a 
contagem em 10 graus Celsius e finalizando em 100 graus Celsius. O programa 
deve apresentar os valores das duas temperaturas.  Conversão: F <-- (9 * C + 160) /5
*
*/

public class Exercicio36 {
    public static void main(String args[]) {

        // Criando variáveis
        float grauCelsius = 0, grauFahrenheit;

        // Criando looping e convertendo graus Celsius para graus Fahrenheit
        while (grauCelsius < 100) {
            grauCelsius += 10;
            grauFahrenheit = (9 * grauCelsius + 160) / 5;
            System.out.println(grauCelsius + " graus Celsius convertido para graus Fahrenheit são: " + grauFahrenheit
                    + " graus Fahrenheit");

        }

    }
}
