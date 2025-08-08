import React, { Component } from 'react';

export default class Cart extends Component {
  render() {
    const { Itemname, Price } = this.props;
    return (
      <div style={{ border: '1px solid #ccc', padding: '8px', margin: '4px' }}>
        <h4>{Itemname}</h4>
        <p>Price: ₹{Price}</p>
      </div>
    );
  }
}
