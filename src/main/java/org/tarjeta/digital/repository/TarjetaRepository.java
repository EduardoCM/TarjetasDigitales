package org.tarjeta.digital.repository;

import java.util.List;

import org.tarjeta.digital.model.Tarjeta;

/**
 * Interface con contratos para administrar las tarjetas.
 * 
 * @author eduardocastillo
 *
 */
public interface TarjetaRepository {

	/**
	 * Metodo para crear una nueva tarjeta
	 * 
	 * @param tarjeta 
	 * @return tarjeta creada
	 */
	public Tarjeta crearTarjeta(Tarjeta tarjeta);

	/**
	 * Metodo para obtener todas las tarjetas
	 * 
	 * @return
	 */
	public List<Tarjeta> obtenerTodas();

	/**
	 * Metodo para eliminar tarjeta por numero de tarjeta
	 * 
	 * @param numeroTarjeta numero de tarjeta eliminada.
	 */
	public void eliminarTarjeta(String numeroTarjeta);

	/**
	 * Metodo para obtener tarjeta por numero de tarjeta.
	 * 
	 * @param numeroTarjeta numero de tarjeta a obtener.
	 * @return tarjeta encontrada.
	 */
	public Tarjeta obtenerTarjeta(String numeroTarjeta);

}
