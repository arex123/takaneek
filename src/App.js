import logo from './logo.svg';
import './App.css';
import Count from './components/HOC/Count';
import Hover from './components/HOC/Hover';
import Classcomponent from './components/Lifecycle/Classcomponent';
import Counter from './components/Lifecycle/Counter';
import ErrorBoundary from './components/Lifecycle/ErrorBoundary';
import Products from './components/CustomHook/Products'
function App() {

  return (
    <div className="App">

      {/* HOC */}
      {/* <Count/>
     <Hover/> */}


      {/* <Classcomponent defaultName="ADTITYA"/> */}
      {/* <Counter/> for shouldComponetUpdate() demo */}

      {/* <ErrorBoundary>
        <Counter /> for error handling 
      </ErrorBoundary> */}

      {/* for custom hook */}
      <Products/>


    </div>
  );
}

export default App;
