import { createContext, useState } from "react";
import Child from "./Child";
import Child1 from "./Child1";

export const userinfo = createContext();
function Parent()
{
    const [user, setUser] = useState(
        { 
            name: 'John Doe', 
            id: 1 
        });

    return(
        <div>
        <userinfo.Provider  value={[user, setUser]}>
            <Child />
            <Child1 />
        </userinfo.Provider>
        </div>
    );
}

export default Parent;