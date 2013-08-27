/**
 * Created with IntelliJ IDEA.
 * User: marco
 * Date: 30/06/13
 * Time: 20:40
 * To change this template use File | Settings | File Templates.
 */

var navbarDirective = angular.module('navbar', ['loginModule']);

navbarDirective.directive('navbar', function factory($rootScope, $location, LoginService) {
    return {
        templateUrl: 'assets/modules/navbar/navbarTemplate.html',
        /*replace: true,*/
        restrict: 'E',
        controller: function ($rootScope, $scope, $element, $attrs, $transclude, LoginService) {
            $scope.navClass = function (page) {
                var currentRoute = $location.path().substring(1);
                return page === currentRoute ? 'active' : '';
            };

            $scope.doLogin = function(login, pwd) {
                /*var user = {};
                user.login = login;
                user.pwd = pwd;

                var loginPromise = LoginService.doLogin(user);
                loginPromise.then(function(response) {
                    if(response.data === ''){
                        $rootScope.user = undefined;
                    } else {
                        $rootScope.user = response.data;
                    }
                });*/
                var user = {};
                user.login = "toto";
                user.pwd = "";
                $rootScope.user = user;
            };

            $scope.doLogout = function() {
                $rootScope.user = undefined;
            };
        },
        link: function postLink(scope, iElement, iAttrs) {

        }
    };
});