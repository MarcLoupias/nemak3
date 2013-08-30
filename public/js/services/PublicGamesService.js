var publicGamesService = angular.module('publicGamesService', []);
publicGamesService.factory('PublicGamesService', function() {

    var games = [];
    var game1 = {id:1, name:"Seshwan Test", gameMaster:"Marco", nbPlayers:34, scale:"Normale"};
    var game2 = {id:2, name:"La partie de Tibo", gameMaster:"Tibo", nbPlayers:76, scale:"Normale"};
    var game3 = {id:3, name:"Nemak 3", gameMaster:"Marco", nbPlayers:278, scale:"Grande"};

    games.push(game1);
    games.push(game2);
    games.push(game3);

    return {
        listPublicGames : function() {
            return games;
        }
    };
});