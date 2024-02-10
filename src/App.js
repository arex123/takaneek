import logo from './logo.svg';
import './App.css';
import Count from './components/HOC/Count';
import Hover from './components/HOC/Hover';

function App() {
  return (
    <div className="App">
     <Count/>
     <Hover/>
    </div>
  );
}

export default App;
