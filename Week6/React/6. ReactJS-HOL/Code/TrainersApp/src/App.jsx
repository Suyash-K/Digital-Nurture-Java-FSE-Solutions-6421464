import Nav from './Nav';
import { Routes, Route, Navigate } from 'react-router-dom';
import Home from './Home';
import TrainersList from './TrainersList';
import TrainerDetail from './TrainerDetail';

function App() {
  return (
    <>
      <Nav />
      <Routes>
        <Route path="/" element={<Home />} />
        <Route path="/trainers" element={<TrainersList />} />
        <Route path="/trainers/:id" element={<TrainerDetail />} />
        <Route path="*" element={<Navigate to="/" replace />} />
    </Routes>
    </>
  );
}


export default App;