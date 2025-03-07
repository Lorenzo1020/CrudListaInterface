package Interface;

import java.util.List;

import Dominio.Autos;

public interface Metodos {
	
	public void guardar(Autos auto);

	public List<Autos> mostrar();

	public Autos buscarXindice(int indice);

	public void editar(int indice, Autos auto);

	public void eliminar(int indice);

}
