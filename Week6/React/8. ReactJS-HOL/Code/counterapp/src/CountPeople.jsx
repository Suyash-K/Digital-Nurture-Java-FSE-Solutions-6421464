import React, { Component } from 'react';

export default class CountPeople extends Component {
  constructor(props) {
    super(props);
    this.state = {
      entryCount: 0,
      exitCount: 0,
    };
  }

  updateEntry = () => {
    this.setState(prevState => ({
      entryCount: prevState.entryCount + 1
    }));
  }

  updateExit = () => {
    this.setState(prevState => ({
      exitCount: prevState.exitCount + 1
    }));
  }

  render() {
    const { entryCount, exitCount } = this.state;
    return (
      <div style={{ padding: '1rem', border: '1px solid #ccc' }}>
        <h2>Mall Counter</h2>
        <p>People Entered: <strong>{entryCount}</strong></p>
        <p>People Exited:  <strong>{exitCount}</strong></p>
        <button onClick={this.updateEntry}>Login</button>
        <button onClick={this.updateExit} style={{ marginLeft: '1rem' }}>
          Exit
        </button>
      </div>
    );
  }
}
