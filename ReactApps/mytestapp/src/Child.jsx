
function Child(props)
{

    return(
        <div>
            <h1>Child Component</h1>
            <h2>Person Name : {props.pname}</h2>
            <h2>Person Age : {props.age}</h2>
            <h2>Person Location : {props.location}</h2>
        </div>
    );
}

export default Child;