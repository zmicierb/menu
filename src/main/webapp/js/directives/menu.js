define(['./module'], function (directives) {
    "use strict";
    directives.directive('menu', function () {
        return {
            restrict: 'A',
            scope: {
                menu: '=menu'
            },
            replace: true,
            template: '<div ng-repeat="item in menu" menu-item="item"></div>',
            link: function (scope, element, attrs) {
                element.addClass(attrs.class);
                element.addClass(scope.cls);
            }
        };
    });
})