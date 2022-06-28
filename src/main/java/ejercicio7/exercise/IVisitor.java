package ejercicio7.exercise;

public interface IVisitor {
    void elegirKitHerramientas(Computadora computadora);

    void elegirKitHerramientas(Tablet tablet);

    void elegirKitHerramientas(Laptop laptop);

}
