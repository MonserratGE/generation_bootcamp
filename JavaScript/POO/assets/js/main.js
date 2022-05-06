class Persona {
  // Atributos
  #id = 0;
  static #contador = 0;
  #nombre = "";
  #edad = 0;
  #correo = "";

  constructor(nombre, edad, correo) {
    this.#nombre = nombre;
    this.#edad = edad;
    this.#correo = correo;
    this.#id = ++Persona.#contador;
  }

  //Setters & getters
  // set & get
  // fijar & obtener
  get getnombre() {
    return this.#nombre;
  }

  set setnombre(nombre) {
    this.#nombre = nombre;
  }


  get getedad() {
    return this.#edad;
  }

  set setedad(edad) {
    this.#edad = edad;
  }


  get getcorreo() {
    return this.#correo;
  }

  set setcorreo(correo) {
    this.#correo = correo;
  }

  // Métodos

  cambiarNombre(nombre){
      this.#nombre =  nombre;
  }

  #saludar(){
      let mensaje = `Hola mi nombre es ${this.#nombre}`
      return mensaje;
  }

  mostrarSaludo(){
      return this.#saludar();
  }

  static mostrarContador(){
      return Persona.#contador;
  }
}

// Instancia de la clase persona
const persona1 = new Persona("Pedro", 30, "pedro@gmail.com");
const persona2 = new Persona("Gabriel", 25, "gabriel@gmail.com");
const persona3 = new Persona('Martin', 40, "martin@gmail.com");

persona1.setnombre = "Jose";

persona1.cambiarNombre("Antonio");

console.log(persona1);
console.log(persona2);
console.log(persona3);

/* console.log(persona1.saludar()); */
console.log(persona2.mostrarSaludo());

/* console.log(Persona.contador); */

console.log(Persona.mostrarContador());