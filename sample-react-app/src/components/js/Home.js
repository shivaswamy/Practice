import React, {Component}  from 'react'
import logo from '../../images/logo.svg'
import {Link} from 'react-router'
import '../css/App.css'

class Home extends Component {
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
                <a onClick={() => this.setState({count: count + 1})}>Click to Increment</a>
                <Link to='/secondhome'>Go to Second Home</Link>

            </div>
        );
    }
}

export default Home;