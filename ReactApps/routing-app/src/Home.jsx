import { useEffect, useState } from "react";

function Home()
{
    const [count, setCount] = useState(0);

    useEffect(()=>{
        document.title = `You clicked ${count} times`;
    },[count]);

    return(
        <>
        <div>
            <h2>Home Component</h2>
             <p>You clicked {count} times</p>
            <button onClick={() => setCount(count + 1)}>
                    Click me
            </button>
        </div>
        </>
    );
}

export default Home;