import { useEffect, useState } from "react";
import { useNavigate } from "react-router-dom";

function EmpData()
{
  const navigate = useNavigate();  
   const [data, setData] = useState([]);
  const [isLoading, setIsLoading] = useState(true);
  const [error, setError] = useState(null);
  const [cnt, setCnt] = useState(0);
  useEffect(() => {
    const fetchData = async () => {
      try {
        const response = await fetch('http://localhost:1234/employee')
        if (!response.ok) {
          throw new Error(`HTTP error! status: ${response.status}`);
        }
        const result = await response.json();
        setData(result);
        setError(null);
      } catch (err) {
        setError(err.message);
      } finally {
        setIsLoading(false);
      }
    };

    fetchData();
  }, [cnt]); // Empty dependency array ensures this runs once when the component mounts

  if (isLoading) {
    return <div>Loading...</div>;
  }

  if (error) {
    return <div>Error: {error}</div>;
  }

  const deleteemp = async (id) =>{
    try {
      const response = await fetch('http://localhost:1234/employee/' + id, {
        method: 'DELETE',
        headers: {
          'Content-Type': 'application/json; charset=UTF-8',
        },
        body: null,
      });

      if (!response.ok) {
        throw new Error(`HTTP error! Status: ${response.status}`);
      }

      const data = await response.json();      
      console.log(data);
      //alert("Employee is Added....");
      //navigate('/viewall');
      setCnt(cnt+1);

    } catch (error) {      
      console.error('Error:', error);
    }

  }

  const UptEmp = (id) =>{
    navigate('/uptemp/' + id);
  }

  return (
    <div>

      <div className="row">
        <div className="col-md-1"></div>
        <div className="col-md-10">
             <table className="table table-success table-striped">
            <thead>
                <tr>
                    <th>Emp ID</th>
                    <th>Emp Name</th>
                    <th>Emp Job</th>
                    <th>Emp Salary</th>        
                    <th>Operations</th>            
                </tr>
                </thead>
                <tbody>
                {
                    data.map((emp)=>{
                        return(
                        <tr key={emp.id}>
                            <td>{emp.id}</td>
                            <td>{emp.ename}</td>
                            <td>{emp.job}</td>
                            <td>{emp.salary}</td>
                            <td>
                              <input type="button"  value="Delete Emp" className="btn btn-danger" onClick={()=>{deleteemp(emp.id)}} />
                              &nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;&nbsp;
                              <input type="button"  value="Update Emp" className="btn btn-warning" onClick={()=>{UptEmp(emp.id)}} />
                            </td>
                        </tr>
                    )})
                }
            </tbody>
        </table>
        </div>
        <div className="col-md-1"></div>
      </div>
    </div>
  );
}

export default EmpData;