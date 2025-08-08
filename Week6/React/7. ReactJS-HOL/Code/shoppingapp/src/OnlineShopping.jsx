import React, { Component } from 'react';
import Cart from './Cart';

export default class OnlineShopping extends Component {
  render() {
    const items = [
      { Itemname: 'Apple iPhone',      Price: 79900 },
      { Itemname: 'Samsung Galaxy',    Price: 65999 },
      { Itemname: 'OnePlus Nord',      Price: 31999 },
      { Itemname: 'Google Pixel',      Price: 61999 },
      { Itemname: 'Xiaomi Redmi Note', Price: 14999 },
    ];

    return (
      <div>
        <h2>My Shopping Cart</h2>
        {items.map((item, idx) => (
          <Cart
            key={idx}
            Itemname={item.Itemname}
            Price={item.Price}
          />
        ))}
      </div>
    );
  }
}
