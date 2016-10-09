define(['./module'], function (directives) {
    "use strict";
    directives.directive('menuItem', function ($compile) {
        return {
            restrict: 'A',
            replace: true,
            scope: {
                item: '=menuItem'
            },
            template: '<div><span>{{item.name}}</span></div>',
            link: function (scope, element, attrs) {
                if (scope.item.subMenu) {
                    // element.addClass('dropdown');

                    // var text = element.children('a').text();
                    // element.empty();
                    // var $a = ('<a>' + text + '</a>');
                    // element.append($a);

                    var $submenu = ('<div menu="item.subMenu"></div>');
                    element.addClass("dropdown-toggle");
                    element.append($submenu);
                } else {
                    element.append('<li active-link><a href={{item.href}}>{{item.name}}</a></li>');
                }
                // if (scope.item.click) {
                //     element.find('a').attr('ng-click', 'item.click()');
                // }
                $compile(element.contents())(scope);
            }
        };
    });
})