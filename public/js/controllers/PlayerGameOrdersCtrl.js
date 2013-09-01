var playerGameOrdersCtrl = angular.module('playerGameOrdersCtrl', []);

playerGameOrdersCtrl.controller('PlayerGameOrdersCtrl', function(
    $scope, ListCrewTypesService, ListInvestmentsTypesService
    ) {

    $scope.gridDataOrdersMissions = [
        {star:"REHAK", missionCode: "PILL", shuttleQty: 300, inspection: "O", warriors:null, lasers:null, missiles:null},
        {star:"REHAK", missionCode: "PILL", shuttleQty: 300, inspection: "O", warriors:null, lasers:null, missiles:null},
        {star:"REHAK", missionCode: "PILL", shuttleQty: 300, inspection: "O", warriors:null, lasers:null, missiles:null},
        {star:"REHAK", missionCode: "INVA", shuttleQty: null, inspection: "N", warriors:10000, lasers:20000, missiles:null},
        {star:"REHAK", missionCode: "PILL", shuttleQty: 300, inspection: "O", warriors:null, lasers:null, missiles:null},
        {star:"REHAK", missionCode: "PILL", shuttleQty: 300, inspection: "O", warriors:null, lasers:null, missiles:null},
        {star:"REHAK", missionCode: "PILL", shuttleQty: 300, inspection: "O", warriors:null, lasers:null, missiles:null},
        {star:"REHAK", missionCode: "INVA", shuttleQty: null, inspection: "N", warriors:10000, lasers:20000, missiles:null},
        {star:"REHAK", missionCode: "PILL", shuttleQty: 300, inspection: "O", warriors:null, lasers:null, missiles:null}
    ];

    $scope.gridMissionsOptions = {
        data: 'gridDataOrdersMissions',
        enableCellSelection: true,
        enableRowSelection: false,
        enableCellEditOnFocus: true,
        columnDefs: [
            {field:'star', displayName:'Etoile', enableCellEdit:false},
            {field:'missionCode', displayName:'Mission'},
            {field:'shuttleQty', displayName:'Navettes'},
            {field:'inspection', displayName:'Inspection'},
            {field:'warriors', displayName:'Guerriers'},
            {field:'lasers', displayName:'Lasers'},
            {field:'missiles', displayName:'Missiles'}
        ]
    };

    $scope.crewTypes1 = ListCrewTypesService.listCrewTypes();
    $scope.crewTypes2 = ListCrewTypesService.listCrewTypes();

    $scope.investmentTypes1 = ListInvestmentsTypesService.listInvestmentsTypes();
    $scope.investmentTypes2 = ListInvestmentsTypesService.listInvestmentsTypes();

});