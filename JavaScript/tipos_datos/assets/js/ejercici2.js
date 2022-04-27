const Monserrat ={
    nombreCompleto: {
        nombre: "Monse",
        apellido: "García"
    },
    edad: 19,
    pasatiempos: ["jugar", "leer"]
}

const angel = {
	nombreCompleto: {
	nombre:"Angel",
	apellido: "Lopez"
	},
	edad : 23,
	pasatiempos: ["cine", "correr", "dibujar"]
}

const Pedro = {
    nombreCompleto: {
        nombre: "Antonio",
        apellido: "Castañón"
    },
    edad: 18,
    pasatiempos: ["jugar","salir","series"],
}

const manuManito = {
    nombreCompleto: {
    nombre: "Manuel",
    apellido: "Carrillo"
},
    edad: 29,
    pasatiempos: ['Leer', 'Tomar cafésito', 'Estar en casa', 'Echar chismecito']
}

const cohorte12 = [manuManito,Pedro,angel,Monserrat]



for(let i=0; i<cohorte12.length; i++){
    if(cohorte12[i].pasatiempos.includes("leer")){
        console.log(cohorte12[i].nombreCompleto.nombre);
    }
}