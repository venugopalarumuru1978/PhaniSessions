import { useContext } from "react";
import { onlineStore } from "./Store";

function ViewProducts()
{
    const [shop, setShop] = useContext(onlineStore);

    return (
        <div>
            <table width="100%" border="1">
                <thead>
                    <tr>
                        <th>BrandName</th>
                        <th>Stock</th>
                    </tr>
                </thead>
                <tbody>
                    {
                        shop.map((shp)=>{
                            return(
                                <tr>
                                    <td>{shp.brandName}</td>
                                    <td>{shp.stock}</td>
                                </tr>
                            );
                        })
                    }
                </tbody>
            </table>
        </div>
    );

}

export default ViewProducts();