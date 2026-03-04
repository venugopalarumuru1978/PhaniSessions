import { useContext, React } from "react";
import { onlineStore } from "./App";

function CountProducts()
{
    const [shop, setShop] = useContext(onlineStore);
    return (
        <div>           
            <h1>No of Products : {shop.length}</h1>
        </div>
    );

}

export default CountProducts();