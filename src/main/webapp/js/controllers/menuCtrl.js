define(['./module'], function (controllers) {
    "use strict"

    controllers.controller('myCtrl', function ($scope, $http) {
        // $scope.menu = [
        //     {
        //         "title": "Home",
        //         "href": "#"
        //     },
        //     {
        //         "title": "About",
        //         "href": "about"
        //     },
        //     {
        //         "title": "History",
        //         "href": "about/history"
        //     },
        //     {
        //         "title": "Contact",
        //         "href": "contact"
        //     },
        //     {
        //         "title": "Other things - in a list. (Click here)",
        //         "submenu": [
        //             {
        //                 "header": "Sample Header"
        //             },
        //             {
        //                 "title": "Some Link",
        //                 "href": "some/place"
        //             },
        //             {
        //                 "title": "Another Link",
        //                 "href": "some/other/place"
        //             },
        //             {
        //                 "divider": "true"
        //             },
        //             {
        //                 "header": "Header 2"
        //             },
        //             {
        //                 "title": "Again...a link.",
        //                 "href": "errrr"
        //             },
        //             {
        //                 "title": "Nest Parent",
        //                 "submenu": [
        //                     {
        //                         "title": "nested again",
        //                         "href": "nested/again"
        //                     },
        //                     {
        //                         "title": "me too",
        //                         "href": "sample/place"
        //                     }
        //                 ]
        //             }
        //         ]
        //     }
        // ];
        $http.get("api/menu").success(function (response) {
            $scope.menu = response.data;
        });
    });
})
