import { useEffect, useState } from "react";
import axios from "axios";
import { useNavigate } from "react-router-dom";


function EmpApp()
{
    const [empdata, setEmpData]  = useState([]);
    const [cnt, setcnt] = useState(0);
    const navigate = useNavigate();
    useEffect(()=>{
        axios.get("http://localhost:1234/employee")
        .then((res)=>{            
            setEmpData(res.data);            
        },[cnt]);        
    });


    const DeleteEmp = (id) =>{
        axios.delete('http://localhost:1234/employee/' + id)
        .then((res)=>{
                setcnt(cnt+1);
        })
        .catch((err)=>{
            console.log(err);
        });
    }

    const GetEmpInfo = (id) =>{
        navigate('/uptemp/' + id);
    }
return(
    <>
     
        <table width="100%" border={1}>
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
                    empdata.map((emp)=>{
                        return(
                        <tr key={emp.id}>
                            <td>{emp.id}</td>
                            <td>{emp.ename}</td>
                            <td>{emp.job}</td>
                            <td>{emp.salary}</td>
                            <td><input type="button" value="Delete Emp" onClick={()=>{DeleteEmp(emp.id)}} />
                            &nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
                            <input type="button" value="Update Emp"  onClick={()=>{GetEmpInfo(emp.id)}} /></td>
                        </tr>
                    )})
                }
            </tbody>
        </table>
    </>
);
}

export default EmpApp;