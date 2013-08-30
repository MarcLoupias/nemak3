var listGamesCtrl = angular.module('publicGamesCtrl', []);

gameRadarCtrl.controller('PublicGamesCtrl', function($scope, PublicGamesService) {
    $scope.games = PublicGamesService.listPublicGames();
});
