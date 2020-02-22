package org.tarjeta.digital.service;

import java.util.List;

import javax.jws.WebService;

import org.tarjeta.digital.model.Tarjeta;

/**
 * Clase servicio para invocar repository.
 * 
 * @author eduardocastillo
 *
 */
@WebService
public interface TarjetaService {

	/**
	 * Serivico para crear tarjeta por medio de repository.
	 * 
	 * @param tarjeta
	 * @return Tarjeta creada
	 */
	public Tarjeta creartargeta(Tarjeta tarjeta);

	/**
	 * Metodo para obtener todas las tarjetas atravez de repository.
	 * 
	 * @return List de tarjetas.
	 */
	public List<Tarjeta> obtenerTodas();

	/**
	 * Elimina tarjeta atravez de un numero
	 * 
	 * @param numeroTarjeta numero de tarjeta
	 */
	public void eliminarTarjeta(String numeroTarjeta);

	/**
	 * Obtener tarjeta por medio del repository
	 * 
	 * @param numeroTarjeta numero de tarjeta a eliminar.
	 * @return Tarjeta a eliminar.
	 */
	public Tarjeta obtenerTarjeta(String numeroTarjeta);

}
