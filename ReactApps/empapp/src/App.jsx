import { useState } from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from '/vite.svg'
import './App.css'
import GetAllEmp from './GetAllEmp'

function App() {
  const [count, setCount] = useState(0)

  return (
    <>
      <div>
        <GetAllEmp />
      </div>
    </>
  )
}

export default App
