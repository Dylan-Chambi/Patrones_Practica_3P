package ejercicio1.exercise;

public enum TipoArma implements Objeto {
    ESPADA {
        @Override
        public void showInfo() {
            System.out.println("Esta es una espada de hierro");
        }
    },
    HACHA {
        @Override
        public void showInfo() {
            System.out.println("Esta es una hacha de acero");
        }
    },
    ESCOPETA {
        @Override
        public void showInfo() {
            System.out.println("Esta es una escopeta de doble cañón");
        }
    }
}
