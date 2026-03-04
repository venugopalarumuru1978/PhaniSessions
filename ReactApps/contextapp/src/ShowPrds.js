import { useContext, useState } from "react";
import { newstore } from "./App";

function ShowPrds()
{
    const [shop, setShop] = useContext(newstore);
    const [bname, setBname] = useState('');
    const [stk, setStk] = useState(0);

    const AddItem = () =>{
        setShop(...shop, {brandName:bname, stock:stk});
    }

    return(
        <div>
            <table width="100%" border="1">
                <thead>
                    <tr>
                        <th>BrandName</th>
                        <th>Stock</th>
                        <th>Operations</th>
                    </tr>
                </thead>
                <tbody>
                    {
                        shop.map((shp)=>(                            
                                <tr>
                                    <td>{shp.brandName}</td>
                                    <td>{shp.stock}</td>
                                    <td></td>
                                </tr>
                            
                        ))
                    }
                    <tr>
                        <td>
                            <input type="text"  name="txtBname" placeholder="Brand Name" onChange={(e)=>{setBname(e.target.value)}} />
                        </td>
                        <td>
                            <input type="text"  name="txtstk" placeholder="Stock"  onChange={(e)=>{setStk(e.target.value)}}/>
                        </td>
                        <td>
                            <input type="button"  value="Add Prodcut" onClick={AddItem}/>
                        </td>
                    </tr>
                </tbody>
            </table>
        </div>
    );
}

export default ShowPrds;