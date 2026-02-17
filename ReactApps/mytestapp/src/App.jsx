import { useState } from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from '/vite.svg'
import './App.css'
import Home from './Home'
import Login from './Login'
import Child from './Child'

function App() {
  
  let loc = "Hyderabad";
  return (
    <>
      
      <Home />
      <hr />
      <Login />
      <hr />
      <Child pname="Phani Kumar"  age="25"  location={loc} />

    </>
  )
}

export default App
