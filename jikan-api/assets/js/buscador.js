const formulario = document.querySelector("form");

formulario.addEventListener("submit", (e) =>{
    e.preventDefault();
    /* console.log("Boton presionado"); */

    const busqueda = document.querySelector("input").value
    /* console.log(busqueda); */

    window.location.href = `busquedas.html?nombre=${busqueda}`
})

