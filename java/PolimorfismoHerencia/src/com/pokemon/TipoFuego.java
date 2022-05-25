package com.pokemon;

public interface TipoFuego {
	
	//Atributos constantes
	int nivelFuego = 10;
	
	//Métodos abstractos
	public abstract void lanzallamas();
	
	//En una interfaz el metodo vacio ya viene con public abstract
	void aranhar();
}
