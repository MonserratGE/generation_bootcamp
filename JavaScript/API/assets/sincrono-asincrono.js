/* let tiempo = 5000; 
let datos;

setTimeout(() =>{
    datos = "Monse"
    console.log(datos);
}, tiempo) 


console.log(datos);
console.log("Hola");
 */

const datos = [
    {
        nombre: "Monserrat",
        edad: 18
    },
    {
        nombre: "Amanda",
        edad: 18
    },
    {
        nombre: "Jonathan",
        edad: 23
    }
]


function obtenerDatos(){
    return new Promise((resolve,reject)=>{
        setTimeout(()=>{
            resolve (datos)
        },3000)
    })
}

console.log(obtenerDatos());

obtenerDatos().then((datos) => {
    console.log(datos);
});

async function obtenerDatosAsync(){
    const datosObtenidos = await obtenerDatos();
    console.log(datosObtenidos);
}

obtenerDatosAsync();