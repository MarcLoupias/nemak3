var publicGamesService = angular.module('playerGameClassementsService', []);
publicGamesService.factory('PlayerGameClassementsService', function() {

    var classNbStars = [
        {pos:"01", name:"Player 1", pts:45},
        {pos:"02", name:"Player 2", pts:42},
        {pos:"03", name:"Player 3", pts:34},
        {pos:"04", name:"Player 4", pts:33},
        {pos:"05", name:"Player 5", pts:31},
        {pos:"06", name:"Player 6", pts:28},
        {pos:"07", name:"Player 7", pts:26},
        {pos:"08", name:"Player 8", pts:26},
        {pos:"09", name:"Player 9", pts:24},
        {pos:"10", name:"Player 10", pts:21}
    ];

    var classAutorite = [
        {pos:"01", name:"Player 1", pts:40987},
        {pos:"02", name:"Player 2", pts:38765},
        {pos:"03", name:"Player 3", pts:36897},
        {pos:"04", name:"Player 4", pts:35410},
        {pos:"05", name:"Player 5", pts:33098},
        {pos:"06", name:"Player 6", pts:22358},
        {pos:"07", name:"Player 7", pts:22989},
        {pos:"08", name:"Player 8", pts:22356},
        {pos:"09", name:"Player 9", pts:20988},
        {pos:"10", name:"Player 10", pts:19087}
    ];

    return {
        getClassNbStars : function() {
            return classNbStars;
        },
        getClassAutorite : function() {
            return classAutorite;
        }
    };
});