import React from 'react'
import {Router, Route, hashHistory} from 'react-router'
import Home from './Home'
import SecondHome from './SecondHome'

const App = () =>(
    <Router history={hashHistory}>
        <Route path='/' component={Home}/>
        <Route path='/secondhome' component={SecondHome} />
    </Router>
)

export default App;
