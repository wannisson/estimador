'use strict';

angular.module('easy-buying')
  .controller('LoginCtrl', function($scope, LoginLogoutSrv) {

    $scope.login = function(email, password) {
      LoginLogoutSrv.login(email, password);
    };

  });
