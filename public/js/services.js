'use strict';

/* Services */

var myServices = angular.module('nemak3.services',
        [
            'playerGamesService',
            'publicGamesService',
            'loginModule'
        ]
    ).
  value('version', '0.1');





