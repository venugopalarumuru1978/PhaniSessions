import { useState } from "react";

function Login()
{
    const [user, setUser] = useState('');
    const [pwd, setPwd] = useState('');
    const [msg, setMsg] = useState('');

   
    const ButtonAction = () =>{
        
        if(user==="Orbit" && pwd==="p@123")
            setMsg(user + "<====>" + pwd);
        else
            setMsg("Please check username / password");
    }
    return(
        <div>
            <h1>This is Login Component</h1>
            <input type="text"  name="txtUser"  placeholder="Username" onChange={(event)=>{setUser(event.target.value)}} />            
            <br /><br />
            <input type="password"  name="txtPass"  placeholder="Password" onChange={(event)=>{setPwd(event.target.value)}} />
            <br /><br />
            <input type="button"  value="Login Here" onClick={ButtonAction}/>
            <h2>{msg}</h2>
        </div>
    );

}

export default Login;