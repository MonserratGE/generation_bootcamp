class Pokemon{
    //atributos
    #nombre = '';
    #edad = 0;
    #evolucion = '';
    /* #tipo = ''; */
    constructor(nombre, edad , evolucion){
        this.#nombre = nombre;
        this.#edad = edad;
        this.#evolucion = evolucion;
    }

    get nombre(){
        this.#nombre = nombre;
        return this.#nombre;
    }

    atacar(){
        return console.log(`${this.#nombre}, esta atacando`);
    }

    evolucionar(){
        /* const EVOLUCION = this.#evolucion; */

        let mensaje = 'No puedo evolucionar';

        /* if(this.#evolucion){
            mensaje = `${this.#nombre} ha evolucionado a ${this.#evolucion}`
            this.#nombre = this.#evolucion;
        }

        return console.log(mensaje); */

        const $EVOLUCION = this.#evolucion || '';
        let message = '';
        if($EVOLUCION) {
            message = `<h1>${this.#nombre} esta evolucionando a <strong class='bg-warning'>${$EVOLUCION}</strong></h1>`;
            this.#nombre = this.#evolucion;
            //console.log(pickachu);
        } else {
            message = `<h1>${this.#nombre} no evoluciona</h1>`;
        }
        return document.getElementById('evolucion').innerHTML = message;

    }

    
}

/* const charmander = new Pokemon('Charmander', 2, 'Charmeleon', 'Fuego');
const bulbasur = new Pokemon('Bulbasur', 1, 'Ivasur', 'Planta');
console.log(charmander);
console.log(bulbasur);
charmander.atacar();
bulbasur.evolucionar();
console.log(bulbasur); */

class TipoFuego extends Pokemon{
    // Arributos
    #tipo = '';
    constructor(nombre, edad, evolucion){
        super(nombre, edad, evolucion);
        this.#tipo = 'Fuego';
    }

    atacar(){
        return console.log(`${super.nombre}, esta lanzando un ataque de tipo ${this.#tipo}`);
    }
}


let nombre = 'Charmender';
const charmander = new TipoFuego('Charmander', 2, 'Charmeleon');
console.log(charmander);

charmander.atacar();

charmander.evolucionar();