var listInvestmentsTypesService = angular.module('listInvestmentsTypesService', []);
listInvestmentsTypesService.factory('ListInvestmentsTypesService', function() {

    var investmentsTypes = [
        {label:"Blindage", value:"blindage"},

        {label:"Efficacité Guerriers", value:"effGuer"},
        {label:"Efficacité Diplomates", value:"effDipl"},
        {label:"Efficacité Savants", value:"effSava"},
        {label:"Efficacité Espions", value:"effEspi"},
        {label:"Efficacité Ouvriers", value:"effOuvr"},
        {label:"Efficacité Coopérants", value:"effCoop"},
        {label:"Efficacité Artificiers", value:"effArti"},
        {label:"Efficacité Commandos", value:"effComm"},
        {label:"Efficacité Ingénieurs", value:"effInge"},
        {label:"Efficacité Rangers", value:"effRang"},

        {label:"Efficacité Navettes", value:"effNav"},
        {label:"Efficacité Lasers", value:"effLas"},
        {label:"Efficacité Missiles", value:"effMiss"},

        {label:"Technologie guerrière", value:"techGuerr"},
        {label:"Technologie défensive", value:"techDef"},
        {label:"Technologie combinatoire", value:"techCombi"},

        {label:"Propagande", value:"propagande"},
        {label:"Contre-espionnage", value:"contreEspi"},
        {label:"Pacification", value:"paci"},
        {label:"Développement", value:"deve"}
    ];

    return {
        listInvestmentsTypes : function() {
            return investmentsTypes;
        }
    };
});