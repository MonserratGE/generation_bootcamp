// IMPORTAR

const {palindrome} = require('../para-probar');

// Primer test unitario
test('palindrome de generation', () =>{
    const resultado = palindrome('generation');
    expect(resultado).toBe('noitareneg');
});

test('palindrome de string vacio', () =>{
    const resultado = palindrome('');
    expect(resultado).toBe('');
});

test('palindrome usando undefined', () =>{
    const resultado = palindrome();
    expect(resultado).toBe(undefined);
});
