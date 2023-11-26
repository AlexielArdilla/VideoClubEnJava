package presentacion;

import java.util.Scanner;

import servicio.CatalogoPeliculas;
import servicio.CatalogoPeliculasImpl;

public class CatalogoPeliculasPresentacion {

	public static void main(String[] args) {

		var opcion = -1;

		var scanner = new Scanner(System.in);

		CatalogoPeliculas catalogo = new CatalogoPeliculasImpl();

		while (opcion != 0) {

			System.out.println("Elija una opcion" + "1. Iniciar catalogo de peliculas \n" + "2. Agregar pelicula\n"
					+ "3. Listar peliculas\n" + "4.Buscar pelicula" + "0. Salir");
			try {

				opcion = Integer.parseInt(scanner.nextLine());

			} catch (Exception ex) {

				ex.printStackTrace();
				System.out.println("Ingresó un valor no listado");
			}

			switch (opcion) {

			case 1:
				catalogo.iniciarCatalogoPeliculas();
				break;
			case 2:
				System.out.println("Ingrese el nombre de la película");
				var nombrePelicula = scanner.nextLine();
				catalogo.agregarPelicula(nombrePelicula);
				break;
			case 3:
				catalogo.listarPeliculas();
				break;
			case 4:
				System.out.println("Ingrese el nombre de la pelicula buscada");
				var nombre = scanner.nextLine();
				catalogo.buscarPelicula(nombre);
				break;
			case 0:
				System.out.println("Gracias por usar el videoclub!!!");
				break;
			default:
				System.out.println("Ingreso una opcion no valida");
			}
		}
		
		scanner.close();
	}

}
