    //* function bubble
    project_function_bubble = {
        init: function(){
            var SoapBubbleMachineNumber1 = $('fn').BubbleEngine({
                particleSizeMin:            0,
                particleSizeMax:            20,
                particleSourceX:            $(window).width()/2-50,
                particleSourceY:            420,
                particleAnimationDuration:  5000,
                particleDirection:          'center',
                particleAnimationDuration:  2000,
                particleAnimationVariance:  500,
                particleScatteringX:        50,
                particleScatteringY:        100,
                gravity:                    -85
            });
            // start icon
            SoapBubbleMachineNumber1.addBubbles(5);
        } 
    },

    //* function reload page phone
    project_function_reloadPhone = {
        init: function(){
            // start page http://getbootstrap.com
            $('#iframe').attr('data', 'http://getbootstrap.com');
            $('#go-url').click(function(){
                // add url in data
                $('#iframe').attr('data', $('#url').val());
                // reload iframe
                $('#iframe').contentWindow.location.reload(true);
            });
        }
    };