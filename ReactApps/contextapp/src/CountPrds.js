import { useContext } from "react";
import { newstore } from "./App";
function CountPrds()
{
    const [shop, setShop] = useContext(newstore);
    return(
        <div>
            <h1>No of Products :{shop.length} </h1>
        </div>
    );
}

export default CountPrds;