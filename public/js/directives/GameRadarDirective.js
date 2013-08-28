var gameRadarDirective = angular.module('GameRadarDirective', []);

gameRadarDirective.directive("gameRadarDirective", function(){
    return {
        restrict: "A",
        link: function(scope, element){
            var ctx = element[0].getContext('2d');

            function drawStar(ctx, name, x, y){
                ctx.beginPath();
                ctx.arc(x, y, 4, 0, Math.PI*2, false);
                ctx.stroke();
                ctx.font="10px Arial";
                ctx.fillText(name,x - 18,y + 14);
            }

            function draw(ctx) {
                drawStar(ctx, "NEMAK", 300, 300);
                drawStar(ctx, "JUHYQ", 100, 130);
                drawStar(ctx, "ZETAH", 240, 432);
                drawStar(ctx, "VYFUH", 362, 342);
            }

            draw(ctx);
        }
    };
});