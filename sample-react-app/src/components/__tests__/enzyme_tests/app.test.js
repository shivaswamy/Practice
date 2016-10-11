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

    it('has a link to Increment', () => {
        const wrapper = mount(<App />)
        const link = wrapper.find('a')
        expect(link.text()).toEqual('Increment')
    })

    it('should increment clicks', () => {
        const wrapper = mount(<App />)
        expect(wrapper.find('.clicks-0').length).toEqual(1)
        wrapper.find('a').simulate('click');
        expect(wrapper.find('.clicks-0').length).toEqual(0)
        expect(wrapper.find('.clicks-1').length).toEqual(1)
    })
})
