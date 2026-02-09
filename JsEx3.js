function Fact(x)
{
    let ft = 1;
    while(x>0)
    {
        ft = ft*x;
        x--;
    }
    return ft;
}

let n = 5, r=3;
if(n>r)
{
    let ncr = (Fact(n) / (Fact(r)*Fact(n-r)));
    console.log("NCR Value is : ", ncr)
}
else
    console.log("N value must be greater to R Value")
