package org.tarjeta.digital.model;

public class Tarjeta {

	private String nombreEntidad;

	private String numeroTarjeta;

	private String fechaCaudicidad;

	private String nombreTitular;

	private String cvv;

	private MarcaEnum marca;

	public String getNombreEntidad() {
		return nombreEntidad;
	}

	public void setNombreEntidad(String nombreEntidad) {
		this.nombreEntidad = nombreEntidad;
	}

	public String getNumeroTarjeta() {
		return numeroTarjeta;
	}

	public void setNumeroTarjeta(String numeroTarjeta) {
		this.numeroTarjeta = numeroTarjeta;
	}

	public String getFechaCaudicidad() {
		return fechaCaudicidad;
	}

	public void setFechaCaudicidad(String fechaCaudicidad) {
		this.fechaCaudicidad = fechaCaudicidad;
	}

	public String getNombreTitular() {
		return nombreTitular;
	}

	public void setNombreTitular(String nombreTitular) {
		this.nombreTitular = nombreTitular;
	}

	public MarcaEnum getMarca() {
		return marca;
	}

	public void setMarca(MarcaEnum marca) {
		this.marca = marca;
	}

	public String getCvv() {
		return cvv;
	}

	public void setCvv(String cvv) {
		this.cvv = cvv;
	}

}
