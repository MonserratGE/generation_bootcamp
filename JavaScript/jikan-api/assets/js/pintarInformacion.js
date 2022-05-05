const idInfo = window.location.href.split("=").pop();
console.log(idInfo);

const imagenPortada = document.getElementById("imagen-portada");
const informacionAnime = document.getElementById("informacionAnime");

const urlID = `https://api.jikan.moe/v4/anime/${idInfo}`;

fetch(urlID)
  .then((resp) => resp.json())
  .then((datos) => {
    /* console.log(datos.data); */

    const datosNecesarios = {
      id: datos.data.mal_id,
      img: datos.data.images.jpg.large_image_url,
      sipnosis: datos.data.synopsis,
      nombre: datos.data.title,
    };

    /* inseratar imagen */
    const templateImg = `<img src="${datosNecesarios.img}" alt="" class="img-fluid">`;
    imagenPortada.innerHTML = templateImg;
    /* console.log(datosNecesarios); */

    /* Insertar información */
    const templateInfo = `
                <h1>${datosNecesarios.nombre}</h1>
                <p>${datosNecesarios.sipnosis}</p>
                <div class="favorito">
                    <button id="agregarFav" type="button" class="btn btn-dark">Agregar a Favoritos</button>
                </div>
    `;

    informacionAnime.innerHTML = templateInfo;
    const agregarFav = document.getElementById("agregarFav");
    /* console.log(agregarFav); */

    agregarFav.addEventListener("click", () => {
        /* console.log("Agragado"); */
        const datos = {
            id: datosNecesarios.id,
            nombre: datosNecesarios.nombre,
            imagen: datosNecesarios.img
        }

        if (localStorage.getItem("favoritos")) {
            console.log("Existe un elemento");
            const favoritos = JSON.parse(localStorage.getItem("favoritos"));
            favoritos.push(datos);
            localStorage.setItem("favoritos", JSON.stringify(favoritos))
            
        }else{
            /* console.log("No tienes favoritos"); */
            const favoritos = [];
            favoritos.push(datos);
            localStorage.setItem("favoritos", JSON.stringify(favoritos));
        }

        /* JSON.parse(localStorage.getItem("favoritos"));

        localStorage.setItem("favoritos", JSON.strigify(favoritos)); */

    })
  });


