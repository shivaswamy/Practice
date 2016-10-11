import React, {Component} from 'react'
import {Router, Route, hashHistory} from 'react-router'
import logo from '../../images/logo.svg'
import '../css/App.css'
import Home from './Home'

class App extends Component {
  constructor(props) {
    super(props)
    this.state = {count: 0}
  }

  render() {
    const {count} = this.state
    return (
      <div className="App">
        <div className="App-header">
          <img src={logo} className="App-logo" alt="logo" />
          <h2>Welcome to React</h2>
        </div>
        <p className="App-intro">
          To get started, edit <code>src/components/js/App.js</code> and save to reload.
        </p>
        <div className={`clicks-${count}`}>
          {count} clicks
        </div>
        <a onClick={() => this.setState({count: count + 1})}>Increment</a>
      </div>
    );
  }
}

export default App;
