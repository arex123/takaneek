import logo from './logo.svg';
import './App.css';
import Count from './components/HOC/Count';
import Hover from './components/HOC/Hover';
import Classcomponent from './components/Lifecycle/Classcomponent';

function App() {

  return (
    <div className="App">

      {/* HOC */}
     {/* <Count/>
     <Hover/> */}


     <Classcomponent/>

     
    </div>
  );
}

export default App;
