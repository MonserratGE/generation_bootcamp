
const button = document.getElementById("invertir");
const inputText = document.getElementById("textInput").value;

button.addEventListener("click", validarPalindromo(inputText));


function validarPalindromo(palabra){
    let palabraInvertida = "";
    for(let i = palabra.length - 1; i >= 0; i--){
        palabraInvertida += palabra[i];
    }
    if(palabraInvertida === palabra){
        return true;
    }else{
        return false;
    }
}
