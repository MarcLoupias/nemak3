/**
 * Created with IntelliJ IDEA.
 * User: marco
 * Date: 06/07/13
 * Time: 14:14
 * To change this template use File | Settings | File Templates.
 */

var login = angular.module('loginModule', []);
login.factory('LoginService', function($http) {

    var user = function(data) {
        angular.extend(this, data);
    };

    user.doLogin = function(user) {
        return $http.post('login', user);
    };

    return user;
});