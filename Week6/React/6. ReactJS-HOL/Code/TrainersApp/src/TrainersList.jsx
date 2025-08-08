import { Link } from 'react-router-dom';
import { trainers } from './TrainersMock';

export default function TrainersList() {
  return (
    <div>
      <h2>Our Trainers</h2>
      <ul>
        {trainers.map(tr => (
          <li key={tr.id}>
            <Link to={`/trainers/${tr.id}`}>{tr.name}</Link>
          </li>
        ))}
      </ul>
    </div>
  );
}