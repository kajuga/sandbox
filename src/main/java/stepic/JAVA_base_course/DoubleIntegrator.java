package stepic.JAVA_base_course;

/*
Реализуйте метод, выполняющий численное интегрирование заданной функции на заданном интервале по формуле левых прямоугольников.
Функция задана объектом, реализующим интерфейс java.util.function.DoubleUnaryOperator.
Его метод applyAsDouble() принимает значение аргумента и возвращает значение функции в заданной точке.
Интервал интегрирования задается его конечными точками a и b, причем a<=b.
Для получения достаточно точного результата используйте шаг сетки не больше 10^(−6).
 */

import java.util.function.DoubleUnaryOperator;

public class DoubleIntegrator {

    public static double integrate(DoubleUnaryOperator f, double a, double b) {
        double eps = 0.0000001;
        double result = 0;
        while (a < b){
            result += f.applyAsDouble(a) * eps;
            a += eps;
        }
        return result;
    }
}