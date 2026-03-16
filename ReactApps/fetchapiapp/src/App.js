import { BrowserRouter, Link, Route, Routes } from 'react-router-dom';
import AddEmp from './AddEmp';
import './App.css';
import EmpData from './EmpData';
import UpdateEmp from './UpdateEmp';

function App() {
  return (
    <div className="App">
      <img src='pic1.jpg' width="100%" height="200" alt="None" />
      <hr />
      <h1 style={{textAlign:"center"}}>Employee App - CURD Operations using Fetch API</h1>
      <hr />
      <BrowserRouter>
        <Link to="/viewall">All Employees</Link>
        &nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
        <Link to="/newemp">New Employee</Link>
        
        <Routes>
          <Route path="/"  exact Component={EmpData} />
          <Route path="/viewall"  exact Component={EmpData} />
          <Route path="/newemp"  exact Component={AddEmp} />
          <Route path="/uptemp/:id"  exact Component={UpdateEmp} />
        </Routes>
      </BrowserRouter>
      </div>
  );
}

export default App;
