//router-test-helper
import Router from 'react-router'
import Route from 'react-router'
import TestLocation from 'react-router'
import TestUtils from 'react-addons-test-utils'

module.exports = function(React){
    return {
        getRouterComponent: function(targetComponent, mockProps) {
            var component,
                div = document.createElement('div'),
                routes = [
                    React.createFactory(Route)({
                        name: '/',
                        handler: targetComponent
                    })
                ];

            location = new TestLocation('/');
            Router.run(routes, location, function (Handler) {
                var mainComponent = React.render(React.createFactory(Handler)(mockProps), div);
                component = TestUtils.findRenderedComponentWithType(mainComponent, targetComponent);
            });
            return component;
        }
    };
};