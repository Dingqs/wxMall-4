mall.controller('mallController', function ($rootScope, $scope, $http, $state) {
    $scope.img_host = "http://wxmall.image.alimmdn.com/";
    $scope.user = {};
    $http.get('/admin/user').then(function (response) {
        $scope.user = response.data.data;
    }, function (error) {
        console.log(response);
    });
    $scope.logout = function () {
        $http.post('/admin/logout').then(function (response) {
            $scope.user = {};
            window.location.href = "/admin/login";
        }, function (error) {
            console.log(response);
        });
    }
});
