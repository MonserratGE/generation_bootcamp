package com.pokemon;

public class TipoPlanta extends Pokemon{
//atributos
	int numeroHojas;
//constructor
	public TipoPlanta(int id, int edad,int nivel, String nombre, boolean evolucion, int numeroHojas){
		super(id,edad,nivel,nombre,evolucion);
		this.numeroHojas = numeroHojas;
	}
	

	//metodos
	public void paralizar() {
		System.out.println(getNombre() + " esta paralizando");
	}

	public void envenenar() {
		System.out.println(getNombre() + " esta envenenado");
	}
	
	public void atacar() {
		System.out.println(getNombre() + " tipo planta esta atacando");
	}

	//getter y setter

	public int getNumeroHojas() {
		return numeroHojas;
	}

	public void setNumeroHojas(int numeroHojas) {
		this.numeroHojas = numeroHojas;
	}


	@Override
	public void saludar(String mensaje) {
		System.out.println(mensaje);
	}


}
