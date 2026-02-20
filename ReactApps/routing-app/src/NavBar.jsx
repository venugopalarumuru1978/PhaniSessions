import { Link } from "react-router-dom";

function NavBar()
{
return(
    <>
    <div>
        <p style={{textAlign:"center"}}>
            <Link to="/home">Home</Link>
            &nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
            <Link to="/login">Login</Link>
            &nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
            <Link to="/contact">Contact</Link>
             &nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
            <Link to="/test">Test Page</Link>
        </p>
    </div>
    </>
);
}

export default NavBar;