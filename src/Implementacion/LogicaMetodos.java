package Implementacion;

import java.util.ArrayList;
import java.util.List;

import Dominio.Autos;
import Interface.Metodos;
import Interface.Metodos2;

public class LogicaMetodos implements Metodos, Metodos2 {

	private List<Autos> registros = new ArrayList<Autos>();

	// Validar: que el modelo no se repita, caso contrario guardar
	@Override
	public void guardar(Autos auto) {
		// TODO Auto-generated method stub

		// 1--Ciclo
		// 2---Condicional
		// 3---Banderas---cuando no existe
		boolean bandera = false;

		for (Autos a : registros) {
			if (a.getModelo().equals(auto.getModelo())) {
				System.out.println("No se pudo guardar, ya existe");
				bandera = true;
				break;
			}
		}

		if (bandera == false) {
			registros.add(auto);
			System.out.println("Se guardo con exito");
		}

	}

	@Override
	public List<Autos> mostrar() {
		// TODO Auto-generated method stub
		return registros;
	}

	@Override
	public Autos buscarXindice(int indice) {
		// TODO Auto-generated method stub
		return registros.get(indice);
	}

	@Override
	public void editar(int indice, Autos auto) {
		// TODO Auto-generated method stub
		registros.set(indice, auto);
	}

	@Override
	public void eliminar(int indice) {
		// TODO Auto-generated method stub
		registros.remove(indice);
	}

	@Override
	public Autos buscarXmodelo(String modelo) {
		// TODO Auto-generated method stub

		return null;
	}

}
