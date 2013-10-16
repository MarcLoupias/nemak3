'use strict';

/* Services */

var myServices = angular.module('nemak3.services',
        [
            'playerGamesService',
            'publicGamesService',
            'playerGameClassementsService',
            'listCrewTypesService',
            'listInvestmentsTypesService'
        ]
    ).
  value('version', '0.1');





