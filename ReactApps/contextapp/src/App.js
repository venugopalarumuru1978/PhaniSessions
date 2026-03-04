
import './App.css';
import { createContext, useState } from 'react';
import ShowPrds from './ShowPrds';
import CountPrds from './CountPrds';
export const newstore = createContext();

function App() {
  const [shop, setShop] = useState([
    {
      brandName:"Nokia", stock:30
    }, 
    {
      brandName:"Samsung", stock:35
    },
    {
      brandName:"OnePlus", stock:26
    }]
  );

  return (
    <div className="App">
      <newstore.Provider value={[shop, setShop]}>
        <ShowPrds />
        <CountPrds />
      </newstore.Provider>
    </div>
  );
}

export default App;
