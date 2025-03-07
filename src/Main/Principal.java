package Main;

import java.util.Scanner;

import Dominio.Autos;
import Implementacion.LogicaMetodos;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Declarar las variables
		Scanner lectura = null;

		System.out.println("Se elimina 3 lineas de codigo");

		String marca;
		String modelo;
		float precio;
		int stock, menuPrinc, subMenu, indice;

		Autos auto = null;

		LogicaMetodos imp = new LogicaMetodos();

		// Menu principal
		do {
			System.out.println("MENU PRINCIPAL");
			System.out.println("1---ALTA");
			System.out.println("2---MOSTRAR");
			System.out.println("3---BUSCAR");
			System.out.println("4---EDITAR");
			System.out.println("5---ELIMINAR");
			System.out.println("6---BUSCAR POR MODELO");
			System.out.println("7---BUSCAR POR MARCA");
			System.out.println("8---CALCULAR DINERO INVERTIDO");
			System.out.println("9---EDITAR BUSCANDO POR MODELO");// EDITAR EL STOCK
			System.out.println("10---ELIMINAR BUSCANDO POR MODELO");
			System.out.println("11---SALIR");

			lectura = new Scanner(System.in);
			menuPrinc = lectura.nextInt();

			switch (menuPrinc) {
			case 1:
				try {
					System.out.println("Ingrese la marca");
					lectura = new Scanner(System.in);
					marca = lectura.nextLine();

					System.out.println("Ingrese el modelo");
					lectura = new Scanner(System.in);
					modelo = lectura.nextLine();

					System.out.println("Ingrese el precio");
					lectura = new Scanner(System.in);
					precio = lectura.nextFloat();

					System.out.println("Ingrese el stock");
					lectura = new Scanner(System.in);
					stock = lectura.nextInt();

					// Crear el objeto
					auto = new Autos(marca, modelo, precio, stock);

					// Guardar a la lista
					imp.guardar(auto);

				} catch (Exception e) {
					// TODO: handle exception
					System.out.println("Error al guardar " + e.toString());
				}
				break;
			case 2:
				System.out.println(imp.mostrar());
				break;
			case 3:
				try {
					System.out.println("Ingrese el indice del registro a buscar");
					lectura = new Scanner(System.in);
					indice = lectura.nextInt();

					// Buscar
					auto = imp.buscarXindice(indice);
					System.out.println("Se encontro " + auto);

				} catch (Exception e) {
					// TODO: handle exception
					System.out.println("Error al buscar " + e.getMessage());
				}
				break;
			case 4:
				// Para editar hay que buscar
				try {
					System.out.println("Ingrese el indice del registro a editar");
					lectura = new Scanner(System.in);
					indice = lectura.nextInt();

					// Buscar
					auto = imp.buscarXindice(indice);
					System.out.println("Se encontro " + auto);

					// submenu para editar: marca y precio
					do {
						System.out.println("SUBMENU PARA EDITAR");
						System.out.println("1---MARCA");
						System.out.println("2---PRECIO");
						System.out.println("3---REGRESAR M.P.");

						lectura = new Scanner(System.in);
						subMenu = lectura.nextInt();

						switch (subMenu) {
						case 1:
							System.out.println("Ingrese la nueva marca");
							lectura = new Scanner(System.in);
							marca = lectura.nextLine();

							// Actualizar el objeto
							auto.setMarca(marca);
							// Actualizar a la lista
							imp.editar(indice, auto);
							System.out.println("Se edito");
							break;
						case 2:
							System.out.println("Ingrese el nuevo precio");
							lectura = new Scanner(System.in);
							precio = lectura.nextFloat();

							// Actualizar
							auto.setPrecio(precio);
							imp.editar(indice, auto);
							System.out.println("Se edito");
							break;
						case 3:
							break;
						}

					} while (subMenu < 3);

				} catch (Exception e) {
					// TODO: handle exception
					System.out.println("Error al editar " + e.getMessage());
				}
				break;
			case 5:
				try {
					System.out.println("Ingrese el indice a eliminar");
					lectura = new Scanner(System.in);
					indice = lectura.nextInt();

					// Eliminar
					imp.eliminar(indice);
					System.out.println("Se elimino");

				} catch (Exception e) {
					// TODO: handle exception
					System.out.println("Error al eliminar " + e.getMessage());
				}
				break;
			case 6:

				break;
			case 7:
				break;
			case 8:
				break;
			}

		} while (menuPrinc < 11);

	}

}
