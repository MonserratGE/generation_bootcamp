const catApi = "https://api.thecatapi.com/v1/images/search";
const gato = document.getElementById('gatos');

const btn = document.getElementById('boton');

btn.addEventListener("click", () =>{
        fetch(catApi).then(respuesta => respuesta.json()).then(datos =>{
            console.log(datos[0].url);
            gato.src = datos[0].url;
        })
})
