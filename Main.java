import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      
        libro libro1 = new libro("el libro de la vida", "la catrina", 6, 4);

        
        libro libro2 = new libro( "sendokay", "guillermo sanches", 10, 2);
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Ingrese título del libro2: ");
            libro2.setTitulo(sc.nextLine());

            System.out.print("Ingrese autor del libro2: ");
            libro2.setAutor(sc.nextLine());

            System.out.print("Ingrese número de ejemplares: ");
            libro2.setNumEjemplares(sc.nextInt());

            System.out.print("Ingrese número de ejemplares prestados: ");
            libro2.setNumPrestados(sc.nextInt());
        }

       
        System.out.println("\n=== Información de libros ===");
        System.out.println(libro1);
        System.out.println(libro2);

      
        if (libro1.prestamo()) {
            System.out.println("Se prestó un ejemplar de libro1");
        } else {
            System.out.println("No quedan ejemplares disponibles de libro1");
        }

        if (libro1.devolucion()) {
            System.out.println("Se devolvió un ejemplar de libro1");
        } else {
            System.out.println("No hay ejemplares prestados para devolver en libro1");
        }

        System.out.println("\n=== Estado final de libro1 ===");
        System.out.println(libro1);
    }
}

