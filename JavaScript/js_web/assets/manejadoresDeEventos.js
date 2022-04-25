
addEventListener('load', function(){
    this.alert('Se ha terminado de cargar la página');
});

function saludar() {
    alert('Hola');
}

/* Manejador de eventos semántico */
const $botonSemantico = document.getElementById('evento-semantico');

$botonSemantico.onclick = saludar;

$botonSemantico.onclick = function(e){
    
    console.log(e.target);
}

/* Manejador de ventos múltiples */
const $botonMultiple = document.getElementById('evento-multiple');

$botonMultiple.addEventListener('click', function(){
    alert('Hola desde manejador múltiple');
})

$botonMultiple.addEventListener('click', function(e){
    console.log(e.target);
});

function saludarMultiple(){
    alert('Hola desde manejador múltiple');
}