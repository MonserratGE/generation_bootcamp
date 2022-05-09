const sum = (a,b) =>{
    return a - b;
}

/* console.log(sum(1,3) === 4);
console.log(sum(0,0) === 0); */

const arr = [
    {a:1, b:3, resultado: 4},
    {a:1, b:3, resultado: 0},
    {a:1, b:3, resultado: 19},
    {a:1, b:3, resultado: 40}
]

arr.forEach(prueba => {
    const {a, b, resultado} = prueba;
    console.assert(sum (a,b) === resultado,`Suma de ${a} y ${b} debería ser ${resultado}`);
});

/* console.assert(sum(1,3) === 4, 'El resultado de la suma de 1 y 3 debería ser 4'); */