import { useParams } from 'react-router-dom';
import { trainers } from './TrainersMock';

export default function TrainerDetail() {
  const { id } = useParams();               
  const tr = trainers.find(t => t.id === +id);

  if (!tr) return <p>Trainer not found.</p>;

  return (
    <div>
      <h2>{tr.name}</h2>
      <p><strong>Email:</strong> {tr.email}</p>
      <p><strong>Phone:</strong> {tr.phone}</p>
      <p><strong>Stream:</strong> {tr.stream}</p>
      <p><strong>Skills:</strong> {tr.skills.join(', ')}</p>
    </div>
  );
}
