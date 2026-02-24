import { useEffect, useState } from "react";
import { useNavigate, useParams } from "react-router-dom";
import axios from "axios";
function UpdateEmp()
{
    const [empdata, setEmpData] = useState({});
    const {id} = useParams();
    const navigate = useNavigate();
    const [cnt, setcnt] = useState(0)


    useEffect(()=>{
        axios.get("http://localhost:1234/employee/" + id)
        .then((res)=>{            
            setEmpData(res.data);            
            console.log(res.data);
        }); 
    }, [cnt]);


    const ModifyEmp = ()=>{
        axios.put("http://localhost:1234/employee/" + id, empdata)
        .then((res)=>{
            navigate('/viewall');    
        })
    }

    return(<div>        
        
            <form name="frmupt">
            <p style={{textAlign:"center"}}>

                <label>Emp ID</label> <br />
                <input type="text"  name="txtEid" 
                value={empdata.id}
                onChange={(e)=>{setEmpData({...empdata, id:e.target.value})}}/>

                <br /><label>Emp Name</label> <br />
                <input type="text"  name="txtEname" 
                value={empdata.ename}
                onChange={(e)=>{setEmpData({...empdata, ename:e.target.value})}} />

                <br /><label>Emp Job</label> <br />
                <input type="text"  name="txtEJob" 
                value={empdata.job}
                onChange={(e)=>{setEmpData({...empdata, job:e.target.value})}} />

                <br /><label>Emp Salary</label> <br />
                <input type="text"  name="txtEsal" 
                value={empdata.salary}
                onChange={(e)=>{setEmpData({...empdata, salary:e.target.value})}} />

                <br /><br /><input type="button"  value="Update Emp" onClick={ModifyEmp} />
            </p>
            </form>
    </div>);
}

export default UpdateEmp;