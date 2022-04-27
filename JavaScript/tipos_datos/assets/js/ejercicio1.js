/* let enter = document.getElementById("btn");
enter.addEventListener('click', btnenter);


function btnenter(){
  let edad = document.getElementById("year").value;
  total = 2022 - edad;
  document.write("Tu edad es: " + total);
} */

/* Nivel 1 */

/* const anhioNacimiento = parseInt(prompt("Escribe tu año de nacimiento: "));
const anhioActual = 2022;

console.log(anhioNacimiento);
console.log(`Tienes ${anhioActual - anhioNacimiento} años`); */

/* Nivel 2 */

/* Opción 1 */
/* 
const anhioActual = 2022;

function calcularEdad() {
  const anhioNacimiento = parseInt(document.getElementById("year").value);
  console.log(anhioNacimiento);
  console.log(`Tienes ${anhioActual - anhioNacimiento} años`);
}
 */
/* Opción 2 */

/* const boton = document.getElementById("calcular");
console.log(boton);

boton.addEventListener("clic", () =>{
  const anhioNacimiento = parseInt(document.getElementById("year").value);
  console.log(anhioNacimiento);
  console.log(`Tienes ${anhioActual - anhioNacimiento} años`);
}); */


/* Nivel 3 */

const fecha = new Date();

const anhioActual = fecha.getFullYear();
console.log(anhioActual);

const mesActual = fecha.getMonth() + 1;
console.log(mesActual);

const diaActual = fecha.getDate();
console.log(diaActual);



/* const anhioActual = 2022;
const mesActual = 4;
const diaActual = 27; */

function mostrarDatos(){
  const anhioNacimiento = document.getElementById("year").value;
  console.log(anhioNacimiento);

  const nacimientoDivi = anhioNacimiento.split("-");
  console.log(nacimientoDivi);

  const anhio = parseInt(nacimientoDivi[0]);
  const mes = parseInt(nacimientoDivi[1]);
  const dia = parseInt(nacimientoDivi[2]);
  console.log(anhio,mes,dia);

  if (mes <= mesActual && dia <= diaActual) {
    console.log(`Tienes ${anhioActual - anhio} años`);
  } else{
    console.log(`Tienes ${anhioActual - anhio - 1} años`);
  }
}



