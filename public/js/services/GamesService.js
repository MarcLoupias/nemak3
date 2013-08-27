var gamesService = angular.module('gamesService', []);
gamesService.factory('GamesService', function() {
    var gameService;
    var games = [];
    var game1 = {id:1, name:"game one"};
    var game2 = {id:2, name:"game two"};
    var game3 = {id:3, name:"game three"};
    return {
        listGames : function() {
            games.push(game1);
            games.push(game2);
            games.push(game3);

            return games;
        }
    };
});