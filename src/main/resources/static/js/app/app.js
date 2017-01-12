'use strict'

var app = angular.module('app', [
        'ngRoute',
        'ui.bootstrap',
        'ngCookies',
        'toggle-switch'
    ])
    .config(function ($routeProvider) { // 用于页面跳转

        $routeProvider.when('', {
            templateUrl: 'a.html',
            controller: ''
        })
    })

    .controller('InitCtrl', function ($scope, $http, $rootScope, optionUrl, $cookies, $interval) {
        // console.log('app init...'); 会导致ie9停止运行
        if (window.console) { // 检查是否为ie9此种奇葩版本浏览器
            var startMsg = 'app initializing...\n';
            startMsg = startMsg + '\n' +
                '                  _oo8oo_\n' +
                '                 o8888888o\n' +
                '                 88" . "88\n' +
                '                 (| -_- |)\n' +
                '                 0\\  =  /0\n' +
                '               ___/\'===\'\\___\n' +
                '             .\' \\\\|     |// \'.\n' +
                '            / \\\\|||  :  |||// \\\n' +
                '           / _||||| -:- |||||_ \\\n' +
                '          |   | \\\\\\  -  /// |   |\n' +
                '          | \\_|  \'\'\\---/\'\'  |_/ |\n' +
                '          \\  .-\\__  \'-\'  __/-.  /\n' +
                '        ___\'. .\'  /--.--\\  \'. .\'___\n' +
                '     ."" \'<  \'.___\\_<|>_/___.\'  >\' "".\n' +
                '    | | :  `- \\`.:`\\ _ /`:.`/ -`  : | |\n' +
                '    \\  \\ `-.   \\_ __\\ /__ _/   .-` /  /\n' +
                '=====`-.____`.___ \\_____/ ___.`____.-`=====\n' +
                '                  `=---=`\n' +
                '\n' +
                '\n' +
                '~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n' +
                '\n' +
                '      佛祖保佑     永不宕机     永无臭虫\n' +
                '      上帝保佑     程序员们     身体健康';
            console.log(startMsg);
        }
        $rootScope.positiveIntReg = /^\+?[1-9]\d*$/;
        $rootScope.loadDivVisible = true;
    })
