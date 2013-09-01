var listCrewTypesService = angular.module('listCrewTypesService', []);
listCrewTypesService.factory('ListCrewTypesService', function() {

    var crewTypes = [
        {label:"Guerriers", value:"guerr"},
        {label:"Diplomates", value:"dipl"},
        {label:"Savants", value:"sava"},
        {label:"Espions", value:"espi"},
        {label:"Ouvriers", value:"ouvr"},
        {label:"Coopérants", value:"coop"},
        {label:"Artificiers", value:"arti"},
        {label:"Commandos", value:"comm"},
        {label:"Ingénieurs", value:"inge"},
        {label:"Rangers", value:"rang"}
    ];

    return {
        listCrewTypes : function() {
            return crewTypes;
        }
    };
});