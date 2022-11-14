public class Main {
    public static void main(String[] args) {
        Carros car = new Carros();

        System.out.println("Numero de la matricula: "+car.getMatricula());
        System.out.println("Año del vehiculo: "+car.getAnio());
        System.out.println("Modelo del vehiculo: "+car.getModelo());
        System.out.println("Color del vehiculo: "+car.getColor());
        System.out.println("");

        System.out.println("\t Tipos de Musica");
        Musica mu = new Musica();
        System.out.println("Nombre de la Cancion: "+mu.getNom_can());
        System.out.println("Nombre del Artista: "+mu.getNom_artis());
        System.out.println("Año de Estreno: "+mu.getAnio());

    }
}