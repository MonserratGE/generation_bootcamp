const expresiones = {
  usuario: /^[a-zA-Z0-9\_\-]{4,16}$/, // Letras, numeros, guion y guion_bajo
  nombre: /^[a-zA-ZÀ-ÿ\s]{1,40}$/, // Letras y espacios, pueden llevar acentos.
  password: /^.{4,12}$/, // 4 a 12 digitos.
  email: /^[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\.[a-zA-Z0-9-.]+$/,
  telefono: /^\d{7,14}$/, // 7 a 14 numeros.
};

/* const correoValido = ["gmail.com","hotmail.com"] */


  
  
const formulario = document.querySelector("form");
console.log(formulario);

const nombreError = document.querySelector("#errorNombre");
const apellidoError = document.querySelector("#errorApellido");
const emailError = document.querySelector("#errorEmail");
const passwordError = document.querySelector("#errorPassword");
const telError = document.querySelector("#errorTel");

/* console.log(apellidoError); */

/* console.log(inputs);
 */



const inputs = document.querySelectorAll("input");

const statusInf = {
	nombre: false,
	apellido: false,
	email: false,
	password: false,
	telefono: false
}


inputs.forEach((inp) => {
  /* console.log(inp); */
  inp.addEventListener("keyup", (e) => {
    /* console.log(e.target.name); */

    switch (e.target.name) {
      case "nombre":
        /* console.log(e.target.value); */
		if(expresiones.nombre.test(e.target.value)){
			statusInf.nombre = true;
			nombreError.textContent = "";
		}
		else{
			statusInf.nombre = false;
			nombreError.textContent = "Error";
		}
        break;
      case "apellido":
        if(expresiones.nombre.test(e.target.value)){
			statusInf.apellido = true;
			apellidoError.textContent = "";
		}
		else{
			statusInf.apellido = false;
			apellidoError.textContent = "Error";
		}
        break;
      case "email":
        if(expresiones.email.test(e.target.value)){
			statusInf.email = true;
			emailError.textContent = "";
		}
		else{
			statusInf.email = false;
			emailError.textContent = "Error";
		}
        break;
      case "password":
        if(expresiones.password.test(e.target.value)){
			statusInf.password = true;
			passwordError.textContent = "";
		}
		else{
			statusInf.password = false;
			passwordError.textContent = "Error";
		}
        break;
      case "telefono":
        if(expresiones.telefono.test(e.target.value)){
			statusInf.telefono = true;
			telError.textContent = "";
		}
		else{
			statusInf.telefono = false;
			telError.textContent = "Error";
		}
        break;
    }
  });
});


formulario.addEventListener("submit", (e) => {
	e.preventDefault();
/* 	
	console.log(Object.values(statusInf));
	console.log(Object.values(statusInf).includes(false)); */

	const check = document.querySelector("#terminos").checked;
	/* console.log(check); */
	if(!Object.values(statusInf).includes(false) && check == true){
		/* console.log("Enviado"); */
		document.querySelector(".alert-danger").style.display = "none"
		const datos = Object.fromEntries(
			new FormData(e.target)
		)
		console.log(datos);
		formulario.reset();
	}
	else{
		/* console.log("No enviado"); */
		document.querySelector(".alert-danger").style.display = "block"

	}
  });
