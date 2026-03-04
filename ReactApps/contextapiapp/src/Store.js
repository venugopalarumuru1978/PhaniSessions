import { createContext, useState } from "react";
import ViewProducts from "./ViewProducts";

export const onlineStore = createContext([]);
function Store()
{
const [shop, setShop] = useState([
    {
      brandName:"Nokia", stock:30
    }, 
    {
      brandName:"Samsung", stock:35
    },
    {
      brandName:"OnePlus", stock:26
    }]
  );

    return(
        <div>
            <onlineStore.Provider value={[shop, setShop]}>
                <ViewProducts />
            </onlineStore.Provider>
        </div>
    );
}

export default Store;