import { useRef, useState } from "react";
import { useNavigate } from "react-router-dom";

function Login()
{
    //const [uname, setUname] = useState('');
    //const [pwd, setPwd] = useState('');
    const uname = useRef('');
    const pwd = useRef('');


    const navigate = useNavigate();

    const LoginCheck = () =>{
            if(uname.current.value==="Venugopal"  && pwd.current.value==="v@123")
                navigate('/wel');
            else
                alert("Please check username/password");
    }
    return(
        <>
        <div>
            <h2 style={{textAlign:"center"}}>Logn Component</h2>
            <hr />
            <p style={{textAlign:"center"}}>
                <input type="text"  name="txtUname" placeholder="Username" ref = {uname} />
                <br /><br />
                <input type="password"  name="txtPass" placeholder="Password" ref={pwd}
                 />
                <br /><br />
                <input type="button"  value="Login Here" onClick={LoginCheck}/>
            </p>
        </div>
        </>
    );
}

export default Login;