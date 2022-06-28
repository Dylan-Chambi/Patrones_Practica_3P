package ejercicio6.exercise;

import java.util.function.Function;

public interface IVisitor {
    void recomendarMantenimiento(Computadora computadora);

    void recomendarMantenimiento(Celular celular);

    void recomendarMantenimiento(Televisor televisor);

}
