import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Предложение пользователю ввести данные
        System.out.println("Let's solve two equations!");
        System.out.println("First, input X, Y and Z:");
        // Ввод трех переменных - X, Y & Z
        double varX = input.nextDouble();

        // Проверка логарифма на положительное значение

        while (Math.log10(2 + Math.exp(varX)) < 0) {
            System.out.println("That's an error, please other value of X");
            varX = input.nextDouble();
        }

        double varY = input.nextDouble();
        double varZ = input.nextDouble();
        // Определяем переменную для одинакового подвыражения
        double varSameDivision = Math.cos(2 * varZ - 1);

        // Проверка на область допустимых значений

        while (1 + varSameDivision == 0) {

            System.out.println("That's an error. Please input other value of Z");
            varZ = input.nextDouble();
            varSameDivision = Math.cos(2 * varZ - 1);
        }

        // Решаем и показываем решение уравнения А

        double SolutionA = (Math.log10(2 + Math.exp(varX)) + Math.pow((8 + varY), (1 / 3))) / (1 + varSameDivision);
        System.out.println("Solution to equation A is = " + SolutionA);

        // Решаем и показываем решение уравнения B

        double SolutionB = varSameDivision + Math.exp(varX);
        System.out.println("Solution to equation B is = " + SolutionB);


    }
}
