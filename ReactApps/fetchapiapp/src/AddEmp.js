import { useState } from "react";
import { useNavigate } from "react-router-dom";

function AddEmp()
{
    const navigate = useNavigate();
     const [errorMessage, setErrorMessage] = useState(null);
        const [empdata, setEmpData] = useState({
        "id":0,
        "ename":"",
        "job":"",
        "salary":0.0
    });

    const AddNewEmp =  async (e) =>{        
    e.preventDefault(); // Prevent default form submission   

    try {
      const response = await fetch('http://localhost:1234/employee', {
        method: 'POST',
        headers: {
          'Content-Type': 'application/json; charset=UTF-8',
        },
        body: JSON.stringify(empdata),
      });

      if (!response.ok) {
        throw new Error(`HTTP error! Status: ${response.status}`);
      }

      const data = await response.json();
      setErrorMessage(null);
      console.log(data);
      //alert("Employee is Added....");
      navigate('/viewall');

    } catch (error) {
      setErrorMessage(error.message);
      console.error('Error:', error);
    }
    };

    if (errorMessage) {
    return <div>Error: {errorMessage}</div>;
      }

    return(<div>

        <div className="row">
            <div className="col-md-2"></div>
            <div className="col-md-8">
                <div className="card bg-primary-subtle">
                    <div className="card-header">
                        <b>New Employee Register</b>
                    </div>
                    <div className="card-body">                    
            <form name="frmReg">

                <div className="row">
                    <div className="col-md-6">
                <label>Emp ID</label>
                <input type="text"  name="txtEid" className="form-control" 
                onChange={(e)=>{setEmpData({...empdata, id:e.target.value})}}/>                        
                    </div>    
                    <div className="col-md-6">
                <label>Emp Name</label>
                <input type="text"  name="txtEname" className="form-control"
                onChange={(e)=>{setEmpData({...empdata, ename:e.target.value})}} />                        
                </div>    
                </div>            

                <div className="row">
                    <div className="col-md-6">
                <label>Emp Job</label>
                <input type="text"  name="txtEJob" className="form-control"
                onChange={(e)=>{setEmpData({...empdata, job:e.target.value})}} />
                    </div>
                    <div className="col-md-6">
                <label>Emp Salary</label>
                <input type="text"  name="txtEsal" className="form-control"
                 onChange={(e)=>{setEmpData({...empdata, salary:e.target.value})}} />
                    </div>
                </div>

                <div className="row">
                    <div className="col-md-12" style={{textAlign:"center"}}>
                    <br /><input type="button"  value="Add Emp" onClick={AddNewEmp} className="btn btn-primary" />
                    </div>
                </div>

                

            </form>
                    </div>
                </div>

            </div>
            <div className="col-md-2"></div>
        </div>
    </div>);
}

export default AddEmp;