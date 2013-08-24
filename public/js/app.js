'use strict';


// Declare app level module which depends on filters, and services
angular.module('nemak3',
[
'nemak3.filters', 'nemak3.services', 'nemak3.directives', 'nemak3.controllers'
]).
  config(['$routeProvider', function($routeProvider) {

    $routeProvider.when('/accueil', {templateUrl: 'assets/partials/accueil.html', controller: 'accueilCtrl'});
    $routeProvider.when('/news', {templateUrl: 'assets/partials/news.html'});
        $routeProvider.when('/regles', {templateUrl: 'assets/partials/regles.html'});
        $routeProvider.when('/apropos', {templateUrl: 'assets/partials/apropos.html'});
    /*$routeProvider.when('/dev', {templateUrl: 'assets/partials/dev.html'});
    $routeProvider.when('/linux', {templateUrl: 'assets/partials/linux.html'});*/



        $routeProvider.otherwise({redirectTo: '/accueil'});

  }]);
