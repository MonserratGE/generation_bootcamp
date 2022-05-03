const db = [
  {
    url: "https://placeimg.com/200/200/animals",
    title: "Animales",
    descrption:
      "Lorem, ipsum dolor sit amet consectetur adipisicing elit. Placeat tenetur ducimus obcaecati hic!",
  },
  {
    url: "https://placeimg.com/200/200/tech",
    title: "Tecnología",
    descrption:
      "Lorem, ipsum dolor sit amet consectetur adipisicing elit. Placeat tenetur ducimus obcaecati hic!",
  },
  {
    url: "https://placeimg.com/200/200/people",
    title: "Personas",
    descrption:
      "Lorem, ipsum dolor sit amet consectetur adipisicing elit. Placeat tenetur ducimus obcaecati hic!",
  },
  {
    url: "https://placeimg.com/200/200/nature",
    title: "Naturaleza",
    descrption:
      "Lorem, ipsum dolor sit amet consectetur adipisicing elit. Placeat tenetur ducimus obcaecati hic!",
  },
  {
    url: "https://placeimg.com/200/200/arch",
    title: "Arquitectura",
    descrption:
      "Lorem, ipsum dolor sit amet consectetur adipisicing elit. Placeat tenetur ducimus obcaecati hic!",
  },
  {
    url: "https://placeimg.com/200/200/animals",
    title: "Animales",
    descrption:
      "Lorem, ipsum dolor sit amet consectetur adipisicing elit. Placeat tenetur ducimus obcaecati hic!",
  }
];

/* console.log(db[0].url); */

const $cards = document.getElementById("cards");
$cards.innerHTML = "";

db.forEach((objeto) => {
  $cards.innerHTML += `
    <div class="col mb-4">
    <div class="card">
      <img src="${objeto.url}" class="card-img-top" alt="...">
      <div class="card-body">
        <h5 class="card-title">${objeto.title}</h5>
        <p class="card-text">${objeto.descrption}</p>
      </div>
    </div>
  </div>
    `;
});


//JSON, stringigy convertir un objetoJSON a string
const dbJSON = JSON.stringify(db);
console.log(dbJSON);

//convertir nuevamente a un JSON
console.log(JSON.parse(dbJSON)); 
//convierte una cadena de texto a un objeto de tipo JSON