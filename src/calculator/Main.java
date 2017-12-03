/**
 * @author Gaidukova Olga
 */
package calculator;
import java.util.Scanner; //подключение внешнего пакета

public class Main { //обьявление нового класса

    public static void main(String[] args) { //обьявление нового метода
        Scanner in = new Scanner(System.in);

        System.out.print("Введите первое дробное число: ");
        Double a = in.nextDouble();

        System.out.print("Введите второе дробное число: ");
        Double b = in.nextDouble();

        Double Sum = a + b;
        System.out.printf("Сумма равна: %.4f \n ", Sum);

    }
}