import React, { useEffect, useState } from "react";
import axios from "axios";

function GetAllEmp()
{
    const [empdata, setEmpData]  = useState([]);
    
    useEffect(()=>{
        axios.get("http://localhost:3000/employee")
        .then((res)=>{
            console.log(res.data);
            setEmpData(res.data);
            console.log(empdata);
        });        
    },[]);

return(
    <>
        <table width="100%" border={1}>
            <thead>
                <tr>
                    <th>Emp ID</th>
                    <th>Emp Name</th>
                    <th>Emp Job</th>
                    <th>Emp Salary</th>
                </tr>
                {
                    empdata.map((emp)=>{
                        <tr key={emp.id}>
                            <td>{emp.id}</td>
                            <td>{emp.ename}</td>
                            <td>{emp.job}</td>
                            <td>{emp.salary}</td>
                        </tr>
                    })
                }
            </thead>
        </table>
    </>
);
}

export default GetAllEmp;