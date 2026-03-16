import { useParams } from "react-router-dom";

function Params()
{
  const {eno} = useParams();
    return(
        <>
        <div>
            <h2>Params Component</h2>          
            <h2>Parameter value : {eno}</h2>
        </div>
        </>
    );
}

export default Params;