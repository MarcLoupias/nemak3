function ListGamesCtrl($scope, GamesService) {
    /*$scope.items = [
        "The first choice!",
        "And another choice for you.",
        "but wait! A third!"
    ];*/

    $scope.games = GamesService.listGames();
}