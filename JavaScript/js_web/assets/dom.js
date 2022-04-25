/* Algunas cosas que podemos hacer con DOM */

console.log(window.document);
console.log(document);
console.log(document.head); // Regresa el head
console.log(document.body); // Regresa el body
console.log(document.documentElement); //Reegresa todo el HTML
console.log(document.doctype);
console.log(document.charset);
console.log(document.links);
console.log(document.images);
console.log(document.styleSheets); // Regresa los CSS
console.log(document.scripts); // Regresa las etiquetas Scripts

setTimeout(() => {
    console.log(document.getSelection().toString());
}, 3000);

document.write('Hola mundo desde document write');
document.write('<h2>Hola mundo desde document write</h2>');

