'use strict';

/* Directives */


angular.module('nemak3.directives', ['navbar', 'panelDirective']).
  directive('appVersion', ['version', function(version) {
    return function(scope, elm, attrs) {
      elm.text(version);
    };
  }]);
