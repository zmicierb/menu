define(['./module'], function (controllers) {
    'use strict';
    controllers.controller('AddUserController', function ($scope, $http, $location) {
        $scope.createUser = function () {
            $http.post("api/user/", $scope.user).success(
                function (response) {
                    $location.path("/viewUsers");
                }
            );
        }
    });
});