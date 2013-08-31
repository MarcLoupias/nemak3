var playerGameClassementsCtrl = angular.module('playerGameClassementsCtrl', []);

playerGameClassementsCtrl.controller('PlayerGameClassementsCtrl', function($scope, PlayerGameClassementsService) {

    $scope.classNbStars = PlayerGameClassementsService.getClassNbStars();
    $scope.classAutorite = PlayerGameClassementsService.getClassAutorite();

});