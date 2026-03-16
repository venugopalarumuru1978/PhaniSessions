import { useEffect, useState } from "react";
import { useNavigate, useParams } from "react-router-dom";

function UpdateEmp()
{
    const {id} = useParams();
    const navigate = useNavigate();
    const [errorMessage, setErrorMessage] = useState(null);
    const [empdata, setEmpData] = useState({});
    const [isLoading, setIsLoading] = useState(true);
    const [error, setError] = useState(null);

    useEffect(() => {
        const fetchData = async () => {
          try {
            const response = await fetch('http://localhost:1234/employee/' + id)
            if (!response.ok) {
              throw new Error(`HTTP error! status: ${response.status}`);
            }
            const result = await response.json();
            setEmpData(result);            
          } catch (err) {
            setError(err.message);
          } finally {
            setIsLoading(false);
          }
        };
    
        fetchData();
      }, []); // Empty dependency array ensures this runs once when the component mounts
    
if (isLoading) {
    return <div>Loading...</div>;
  }

  if (error) {
    return <div>Error: {error}</div>;
  }
  
    const UpdateEmp =  async (e) =>{        
    e.preventDefault(); // Prevent default form submission   

    try {
      const response = await fetch('http://localhost:1234/employee/' + id, {
        method: 'PUT',
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
            <form name="frmuPT">
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

                <br /><br /><input type="button"  value="Modify Emp" onClick={UpdateEmp} />
            </p>
            </form>
    </div>);
}

export default UpdateEmp;