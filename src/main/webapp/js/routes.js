define(['./app'], function (app) {
    'use strict';
    return app.config(['$routeProvider',
        function ($routeProvider) {
            $routeProvider.when('/addUser', {
                templateUrl: 'views/addUser.html',
                controller: 'AddUserController'
            }).when('/editUser', {
                templateUrl: 'views/editUser.html',
                controller: 'EditUserController'
            }).when('/viewUsers', {
                templateUrl: 'views/viewUsers.html',
                controller: 'UsersController'
            }).otherwise({
                redirectTo: '/viewUsers'
            });
        }]);
});