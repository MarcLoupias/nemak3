var listGamesCtrl = angular.module('listGamesCtrl', []);

gameRadarCtrl.controller('ListGamesCtrl', function($scope, PlayerGamesService) {
    $scope.games = PlayerGamesService.listGames();
});
