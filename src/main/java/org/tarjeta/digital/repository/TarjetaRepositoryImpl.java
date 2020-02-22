package org.tarjeta.digital.repository;

import java.util.ArrayList;
import java.util.List;

import org.tarjeta.digital.model.Tarjeta;

public class TarjetaRepositoryImpl implements TarjetaRepository {

	private static List<Tarjeta> tarjetasDigitales = new ArrayList<>();

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Tarjeta crearTarjeta(Tarjeta tarjeta) {
		System.out.println("Registrando tarjeta: " + tarjeta);
		tarjetasDigitales.add(tarjeta);
		return tarjeta;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<Tarjeta> obtenerTodas() {
		System.out.println("Obtener todas las tarjetas");
		return tarjetasDigitales;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void eliminarTarjeta(String numeroTarjeta) {
		System.out.println("Eliminar tarjeta");
		tarjetasDigitales.remove(
				tarjetasDigitales.stream().filter(td -> td.getNumeroTarjeta().equals(numeroTarjeta)).findFirst().get());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Tarjeta obtenerTarjeta(String numeroTarjeta) {
		System.out.println("Obtener Tarjeta" + numeroTarjeta);
		return tarjetasDigitales.stream().filter(td -> td.getNumeroTarjeta().equals(numeroTarjeta)).findFirst().get();
	}

}
