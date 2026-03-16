import React, { useState } from "react";
import './demo.css';
function Home()
{
    const [x, setX] = useState(0);

    const Add = ()=>{setX(x+1)}

    let cities = ["Hyderabad", "Amaravathi", "Bangalore", "Mumbai", "Pune"];

    let stdinfo = [
        {"rollno":1001, "sname":"Phani", "course": "Java FSD"},
        {"rollno":1002, "sname":"Raani", "course": "Java FSD"},
        {"rollno":1003, "sname":"Bhavani", "course": "Java FSD"},
        {"rollno":1004, "sname":"Laxmi", "course": "Java FSD"},
        {"rollno":1005, "sname":"Ramani", "course": "Java FSD"}
    ];

    return(
        <div>
            <h1>This is HTMl Part</h1>
            <h2>X value is : {x}</h2>

            <input type="button"  value="Increment" onClick={Add}/>
            <input type="button"  value="Decremet"  onClick={()=>{setX(x-1)}} />

            <ol type="1" style={{textAlign:"left"}}>
                {
                    cities.map((ct)=>(
                        <li key={ct}>{ct}</li>
                    ))
                }
            </ol>

            <table width="100%" border={1}  className="color">
                <tbody>
                    {
                         cities.map((ct)=>(
                        <tr key={ct}><td style={{textAlign:"left"}}>{ct}</td></tr>
                    ))
                    }
                </tbody>
            </table>
            <hr />
            <table border={1}  width="100%">
                <thead>
                    <tr>
                        <th>Roll Number</th>
                        <th>Student Name</th>
                        <th>Course</th>
                    </tr>
                </thead>

                <tbody>
                    {
                        stdinfo.map((std)=>(
                            <tr key={std.rollno}>
                                <td>{std.rollno}</td>
                                <td>{std.sname}</td>
                                <td>{std.course}</td>
                            </tr>
                        ))
                    }
                </tbody>
            </table>
        </div>
    );
}

export default Home;