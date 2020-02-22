package org.tarjeta.digital.service;

import java.util.List;

import javax.jws.WebService;

import org.tarjeta.digital.model.Tarjeta;
import org.tarjeta.digital.repository.TarjetaRepository;
import org.tarjeta.digital.repository.TarjetaRepositoryImpl;

@WebService(endpointInterface = "org.tarjeta.digital.service.TarjetaService")
public class TarjetaServiceImpl implements TarjetaService {
	
	
	TarjetaRepository tarjetaRepository = new TarjetaRepositoryImpl();

	@Override
	public Tarjeta creartargeta(Tarjeta tarjeta) {		
		tarjetaRepository.crearTarjeta(tarjeta);
		return tarjeta;
	}

	@Override
	public List<Tarjeta> obtenerTodas() {
		return tarjetaRepository.obtenerTodas();
	}

	@Override
	public void eliminarTarjeta(String numeroTarjeta) {
		tarjetaRepository.eliminarTarjeta(numeroTarjeta);
		
	}

	@Override
	public Tarjeta obtenerTarjeta(String numeroTarjeta) {
		return tarjetaRepository.obtenerTarjeta(numeroTarjeta);
	}

	
}
