import React, {Component}  from 'react'
import logo from '../../images/logo.svg'
import '../css/App.css'

class SecondHome extends Component {
    render() {
        return (
            <div className="App">
                <div className="App-header">
                    <img src={logo} className="App-logo" alt="logo" />
                    <h2>Welcome to React Second Home</h2>
                </div>
            </div>
        );
    }
}

export default SecondHome;