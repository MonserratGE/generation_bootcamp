/* FUNCIONES, NOS PERMITE REPETIR CÓDIGO */

function saludar(nombre = "Panchito",apellido = ""){

    //let nombre = 'Monse';
    //console.log("Hola mi nombre es:", nombre, apellido);

    //console.log(`Hola mi nombre es: ${nombre? "Monse": "Desconocido"}`);

    return `Mi nombre es ${nombre} ${apellido}`;
}

/* saludar("Pedro", "Pérez");

let funcionSaludar = saludar('Felipe', 'Maqueda');
console.log(funcionSaludar);

console.log(saludar('Alberto','Hernández').toUpperCase());

console.log(funcionSaludar.toLowerCase()) */;

/* document.write('<h1>Este es un h1</h1>');
console.log('<h1>Este es un h1</h1>'); */

/* Función declarada */
function suma(a,b) {
    return a + b;
}

console.log(suma(10,20));


/* Funciones expresadas | función expresión */

const resta = function(a,b){
    return a - b;
}

console.log(resta(30,10));

// Función flecha

/* const multiplicacion = (a,b) => {
    return a * b;
}

console.log(multiplicacion(40,5)); */

const multiplicacion = (a,b) => a * b;

console.log(multiplicacion(40,5));