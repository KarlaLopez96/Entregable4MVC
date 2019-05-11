package com.uca.capas.entities;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Size;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;

public class Producto {
	
	@NotEmpty(message = "Este campo no puede estar vacio")
	@Size(message = "Longitud debe de ser no más de 30 caracteres", max = 30)
	private String nombre;
	
	@NotEmpty(message = "Este campo no puede estar vacio")
	@Size(message = "Longitud debe de ser no más de 30 caracteres", max = 30)
	private String marca;
	
	@NotEmpty(message = "Este campo no puede estar vacio")
	@Size(message = "Longitud debe de ser no más de 30 caracteres", max = 30)
	private String descripcion;
	
	@NotEmpty(message = "Este campo no puede estar vacio")
	@Size(message = "Longitud debe de ser no más de 30 caracteres", max = 30)
	private String categoria;
	
	@NotEmpty(message = "Este campo no puede estar vacio")
	@DecimalMin( message = "No puedes ingresar valores negativos", value = "0")
	private String precio;
	
	@NotEmpty(message = "Este campo no puede estar vacio")
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private String fechaV;
	
	public Producto() {
		super();
	}

	public Producto(String nombre, String marca, String descripcion, String categoria, String precio, String fechaV) {
		super();
		this.nombre = nombre;
		this.marca = marca;
		this.descripcion = descripcion;
		this.categoria = categoria;
		this.precio = precio;
		this.fechaV = fechaV;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public String getPrecio() {
		return precio;
	}
	public void setPrecio(String precio) {
		this.precio = precio;
	}
	public String getFechaV() {
		return fechaV;
	}
	public void setFechaV(String fechaV) {
		this.fechaV = fechaV;
	}

	@Override
	public String toString() {
		return "Producto [nombre=" + nombre + ", marca=" + marca + ", descripcion=" + descripcion + ", categoria="
				+ categoria + ", precio=" + precio + ", fechaV=" + fechaV + "]";
	}
}
