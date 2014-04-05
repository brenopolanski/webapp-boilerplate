/* ------------------------------------------------------------------------------------------------------------------
    Description : Functions JavaScript Web App Boilerplate
    Version     : 1.0        
    Last Update : 25 August, 2013
    Author      : Breno Polanski - breno.polanski@gmail.com - www.brenopolanski.com
                  Alysson Thiago - autscc@gmail.com
---------------------------------------------------------------------------------------------------------------------

SUBTILES:

    0. GLOBAL
    1. MISCELLANEOUS

--------------------------------------------------------------------------------------------------------------------- */

// ----- 0. GLOBAL ----- //

    //* function main
    project_fn_main = {
        init: function() {
            //* bubble sort
            project_fn_bubble.init();
            //* reload page phone
            project_fn_reloadPhone.init();
            //* scrollBottom
            project_fn_scrollBottom.init();
            //* buttom download
            project_fn_down.sdk();
            project_fn_down.apk();
            //* hover image github
            project_fn_hoverImgGitHub.breno();
            project_fn_hoverImgGitHub.alysson();
        }
    };

// ----- 1. MISCELLANEOUS ----- //

    //* bubble sort
    project_fn_bubble = {
        init: function(){
            var SoapBubbleMachineNumber1 = $('fn').BubbleEngine({
                particleSizeMin           : 0,
                particleSizeMax           : 20,
                particleSourceX           : $(window).width()/2-50,
                particleSourceY           : 420,
                particleAnimationDuration : 5000,
                particleDirection         : 'center',
                particleAnimationDuration : 2000,
                particleAnimationVariance : 500,
                particleScatteringX       : 50,
                particleScatteringY       : 100,
                gravity                   : -85
            });
            // start icon
            SoapBubbleMachineNumber1.addBubbles(5);
        } 
    };

    //* reload page phone
    project_fn_reloadPhone = {
        init: function(){
            // start page http://getbootstrap.com
            $('#iframe').attr('data', 'http://brenopolanski.github.io/webapp-boilerplate/');
            $('#go-url').click(function(){
                if ($('#url').val() === '') {
                } else {
                    // add url in data
                    $('#iframe').attr('data', $('#url').val());
                    // reload iframe
                    $('#iframe').contentWindow.location.reload(true);
                }
            });
        }
    };

    //* scrollBottom
    project_fn_scrollBottom = {
        init: function(){
            $('.scroll').click(function(){
                var el = $(this),
                    i  = el.attr('step');
                $('html, body').animate({
                    scrollTop: $('#step-'+i).offset().top
                }, 1000);
            });
        }
    };

    //* buttom download
    project_fn_down = {
        sdk: function() {
            $('#down-sdk').click(function(){
                $(location).attr('href', 'http://developer.android.com/sdk/index.html');
            });
        },
        apk: function() {
            $('#down-apk').click(function(){
                $(location).attr('href', 'https://github.com/brenopolanski/webapp-boilerplate/zipball/gh-download/');
            });
        }
    };

    //* hover image github
    project_fn_hoverImgGitHub = {
        breno: function(){
            $('#git-breno').hover(
                function(){
                    $('#img-breno').hide();
                    $('#img-git-breno').removeClass();
                },
                function(){
                    $('#img-breno').show();
                    $('#img-git-breno').addClass('hide');
                }
            );
        },
        alysson: function(){
            $('#git-alysson').hover(
                function(){
                    $('#img-alysson').hide();
                    $('#img-git-alysson').removeClass();
                },
                function(){
                    $('#img-alysson').show();
                    $('#img-git-alysson').addClass('hide');
                }
            );
        }

    };
