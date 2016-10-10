import React from 'react';
import {mount} from 'enzyme';

import App from '../../js/App.js'

describe('<App />', () => {
    it('it renders app header', () => {
        const wrapper = mount(<App />)
        const welcome = <h2>Welcome to React</h2>
        expect(wrapper.contains(welcome)).toEqual(true)
        expect(wrapper.find('h2').text()).toEqual('Welcome to React')
    })

    it('has a link to google', () => {
        const wrapper = mount(<App />)
        const link = wrapper.find('a')
        expect(link.prop('href')).toEqual('http://www.google.com')
        link.simulate('click')

    })
})
