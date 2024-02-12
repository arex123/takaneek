import logo from './logo.svg';
import './App.css';
import Count from './components/HOC/Count';
import Hover from './components/HOC/Hover';
import Classcomponent from './components/Lifecycle/Classcomponent';
import Counter from './components/Lifecycle/Counter';

function App() {

  return (
    <div className="App">

      {/* HOC */}
     {/* <Count/>
     <Hover/> */}


     <Classcomponent defaultName="ADTITYA"/>
     {/* <Counter/> for shouldComponetUpdate() demo */}

     
    </div>
  );
}

export default App;
