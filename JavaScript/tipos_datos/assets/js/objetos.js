const nombre = "Jonathan";

const nombre2 = new String("Amanda");

console.log(nombre);
console.log(nombre2);

const persona = new Object();
persona.nombre = "Monse";
persona.apellido = "García";
persona.edad = "18";

console.log(persona);

const nuevaPersona = {
  /* Atributos o propiedades*/
  nombreCompleto: {
    nombre: "Amanda",
    apellido: "Espinoza",
  },
  edad: 18,
  pasatiempos: ["jugar", "leer"],
  tieneTrabajo: false,
  /* Método */
  saludar: function () {
    console.log("Hola");
  },
  sumar: function(n1,n2){
      console.log(`El resultado de la suma es ${n1 + n2}`);
  }
};

"Hola".length /* Atributo */
"Hola".toLowerCase(); /* Método */


console.log(nuevaPersona.edad);
console.log(nuevaPersona.nombreCompleto);
console.log(nuevaPersona.pasatiempos[0]);

nuevaPersona.saludar();
nuevaPersona.sumar(5,10);

/* Para cambiar el valor */
nuevaPersona.edad = 10;
console.log(nuevaPersona);

/* Agregar nuevo atributo */
nuevaPersona.colorFavorito = "Morado";
console.log(nuevaPersona.colorFavorito);

console.log(nuevaPersona.hasOwnProperty("edad"));

console.log(Object.keys(nuevaPersona));
console.log(Object.values(nuevaPersona));

const Monserrat ={
    nombreCompleto: {
        nombre: "Monse",
        apellido: "García"
    },
    edad: 19,
    pasatiempos: ["jugar", "leer"]
}