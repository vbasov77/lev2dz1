package dz1.regular;

/**
 * Класс приветствия.
 * Поприветствует вас в приложении.
 */

public class HelloClass {

    /**
     *
     * @param name имя юзера
     * @return возвращает строку приветствия
     */
    public static void hello(String name) {

        /**
         * Метод приветствует посетителя в приложении
         */
        System.out.printf("Привет, %s.\n", name);
    }
}