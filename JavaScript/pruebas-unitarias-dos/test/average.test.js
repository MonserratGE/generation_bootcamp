const {average} = require('../para-probar');


describe('average', () =>{
    test('Ingresar un solo valor', () =>{
        expect(average([1])).toBe(1);
    })

    test('Usando multiples valores', () =>{
        expect(average([1,2,3,4,5,6])).toBe(3.5);
    })

    test("usando un valor undefined",()=>{
        expect(average()).toBe(undefined)
    })

    test("usando un array vacio",()=>{
        expect(average([])).toStrictEqual([])
    })

})