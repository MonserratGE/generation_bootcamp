
let enter = document.getElementById("btn");
enter.addEventListener('click', btnenter);


function btnenter(){
  let edad = document.getElementById("year").value;
  total = 2022 - edad;
  document.write("Tu edad es: " + total);
}