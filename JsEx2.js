function DemoFun(x, y)
{
console.log("X value : ", x)
console.log("Y value : ", y)
}

function Square(n)
{
    let sq = n*n
    return sq;
}

DemoFun(100,200);
DemoFun("Orbit", "DSNR");

let res = Square(10)
console.log("10 Sqr Value : ", res)

console.log("5 Sqr Value : ", Square(5))