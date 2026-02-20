import { useState } from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from '/vite.svg'
import './App.css'
import { BrowserRouter, Route, Routes } from 'react-router-dom'
import NavBar from './NavBar'
import Home from './Home'
import Login from './Login'
import Contact from './Contact'
import Test from './Test'
import Welcome from './Welcome'
import Params from './Params'

function App() {

  return (
    <>
      <div>
        <img src='pic1.jpg' width={"100%"} height={200}  alt='None' />
        <BrowserRouter>
        <NavBar />
        <hr />
        <Routes >
          <Route  path="/" exact Component={Home} />
          <Route  path="/home" exact Component={Home} />
          <Route  path="/login" exact Component={Login} />
          <Route  path="/test" exact Component={Test} />
          <Route  path="/wel" exact Component={Welcome} />
          <Route  path="/params/:eno" exact Component={Params} />
          <Route  path="/contact" element={<Contact pname="Kiran" age={34}/>} />
        </Routes>
        </BrowserRouter>
       
      </div>
    </>
  )
}

export default App
