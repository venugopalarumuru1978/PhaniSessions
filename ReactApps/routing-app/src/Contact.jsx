import { useEffect, useState } from "react";

function Contact(props)
{
 const [seconds, setSeconds] = useState(0);

  useEffect(() => {
    const intervalId = setInterval(() => {
      setSeconds(prevSeconds => prevSeconds + 1);
    }, 1000);

    // The cleanup function
    return () => clearInterval(intervalId);
  }, []);
 
    return(
        <>
        <div>
            <h2>Contact Component</h2>
            <h3>Person Name : {props.pname}</h3>
            <h3>Person Age : {props.age}</h3>

            <p>Seconds: {seconds}</p>
        </div>
        </>
    );
}

export default Contact;