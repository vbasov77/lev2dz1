package dz1.sample;

import dz1.regular.Decorator;
import dz1.regular.OtherClass;
import dz1.regular.HelloClass;

/**
 * Основной класс приложения. Здесь мы можем описать
 * его основное назначение и способы взаимодействия с ним.
 */
public class Main {

    /**
     * Точка входа в программу, с неё всегда всё начинается
     *
     * @param args стандартные аргументы командной строки
     */
    public static void main(String[] args) {

        String name = "Медвед";
        HelloClass.hello(name);

        int result = OtherClass.add(2, 4);
        System.out.println(Decorator.decorate(result));

        result = OtherClass.sub(2, 4);
        System.out.println(Decorator.decorate(result));

        result = OtherClass.mul(2, 4);
        System.out.println(Decorator.decorate(result));

        result = OtherClass.div(2, 4);
        System.out.println(Decorator.decorate(result));
    }
}
