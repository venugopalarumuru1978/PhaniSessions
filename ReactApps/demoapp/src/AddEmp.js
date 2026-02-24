import { useState } from "react";
import axios from "axios";
function AddEmp()
{
    const [empdata, setEmpData] = useState({
        "id":0,
        "ename":"",
        "job":"",
        "salary":0.0
    });

    const AddNewEmp = () =>{
        console.log(empdata);
        axios.post("http://localhost:1234/employee", empdata)
        .then((response)=>{
            alert("Emp Added...");
        })
        .catch((err)=>{
            console.log(err);
        })
    }

    return(
        <div>
            
            <form name="frmReg">
            <p style={{textAlign:"center"}}>

                <label>Emp ID</label> <br />
                <input type="text"  name="txtEid" onChange={(e)=>{setEmpData({...empdata, id:e.target.value})}}/>

                <br /><label>Emp Name</label> <br />
                <input type="text"  name="txtEname" onChange={(e)=>{setEmpData({...empdata, ename:e.target.value})}} />

                <br /><label>Emp Job</label> <br />
                <input type="text"  name="txtEJob" onChange={(e)=>{setEmpData({...empdata, job:e.target.value})}} />

                <br /><label>Emp Salary</label> <br />
                <input type="text"  name="txtEsal" onChange={(e)=>{setEmpData({...empdata, salary:e.target.value})}} />

                <br /><br /><input type="button"  value="Add Emp" onClick={AddNewEmp} />
            </p>
            </form>
        </div>
    );
}

export default AddEmp;