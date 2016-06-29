
//home
angular.module('hello', [ 'ngRoute' ]) // ... omitted code

.config(function($routeProvider, $httpProvider) {

	$routeProvider.when('/', {
		templateUrl : 'home.html',
		controller : 'home'
	}).when('/login', {
		templateUrl : 'login.html',
		controller : 'navigation'
	}).otherwise('/');

  $httpProvider.defaults.headers.common["X-Requested-With"] = 'XMLHttpRequest';

})
.controller('home', function($scope, $http) {
	//$scope.userdata = {content: 'ddddddd'}
	$http.get('/data/userdata/?first=kkk').success(function(data) {
		$scope.userdata = data;
	})
})

.controller('navigation', function($rootScope, $scope, $http, $location) {

  
});