package ejercicio3.exercise;

public class Client {
    public static void main (String []args){
        Archivo archivo1 = new Archivo("Archivo 1", "Esta es la informacion del archivo 1");
        Archivo archivo2 = new Archivo("Archivo 2", "Texto de ejemplo para el archivo 2");
        Archivo archivo3 = new Archivo("Archivo 3", "public class Client");

        Composite folder1 = new Composite("Folder 1");
        folder1.add(archivo1);
        folder1.add(archivo3);

        Composite folder2 = new Composite("Folder 2");
        folder2.add(archivo1);
        folder2.add(archivo2);
        folder2.add(archivo3);

        Composite unidadDisco1 = new Composite("Unidad de disco 1");
        unidadDisco1.add(folder1);
        unidadDisco1.add(folder2);

        System.out.println("---------------------Unidad de disco 1---------------------");
        unidadDisco1.showInfo();

        folder2.remove(archivo1);

        System.out.println("---------------------Unidad de disco 1---------------------");
        unidadDisco1.showInfo();
    }
}
