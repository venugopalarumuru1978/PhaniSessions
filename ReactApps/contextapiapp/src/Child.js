import { useContext } from "react";
import { userinfo } from "./Parent";

function Child()
{
    const [user, setUser] = useContext(userinfo);
    return(
        <div>
            <h1>User ID : {user.id}</h1>
            <h1>Username : {user.name}</h1>
        </div>
    );
}

export default Child;