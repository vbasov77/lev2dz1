package dz1.regular;

/**
 * Калькулятор
 */

public class OtherClass {

    /**
     * Функция суммирования двух чисел
     * @param a первое слагаемое
     * @param b  второе слагаемое
     * @return сумма a и b
     */
    public static int add(int a, int b) {
        return a + b;
    }

    /**
     * Функция деления двух чисел
     * @param a делимое
     * @param b  делитель
     * @return частное a и b
     */
    public static int div(int a, int b) {
        return b == 0 ? a : a / b;
    }

    /**
     * Функция произведение двух чисел
     * @param a 1 множитель
     * @param b 2 множитель
     * @return произведение a и b
     */

    public static int mul(int a, int b) {
        return a * b;
    }

    /**
     * Функция вычитания двух чисел
     * @param a уменьшаемое
     * @param b вычитаемое
     * @return разность a и b
     */

    public static int sub(int a, int b) {
        return a - b;
    }

}

