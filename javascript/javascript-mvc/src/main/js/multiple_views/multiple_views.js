var multiview = multiview || {};


multiview.controller = function(dom) {
    var self = {
        connectToDom : function() {
            console.log("Controller.init");
            var model = multiview.model("I have been initialised by the javascript!");
            initReadOnlyDisplayViews(model, dom);
        }
    }

    function initReadOnlyDisplayViews(model, dom) {
        var displayViewElements = dom.getElementsByClassName("display-text");
        for (var i=0; i<displayViewElements.length; i++) {
            multiview.readOnlyDisplayView(model, dom, displayViewElements[i]);
        };
    }

    return self;
}

multiview.model = function(defaultText) {

    var text = defaultText;
    var listeners = new Array();

    var self = {
        addListener : function(viewCallbackFunction) {
            listeners.push(viewCallbackFunction);
        },

        getText : function() {
            return text;
        },

        setText : function(newText) {
            if (text !== newText) {
                fireOnChangeEvent();
            }
        }
    }

    function fireOnChangeEvent() {
        listeners.forEach(function(viewCallbackFunction) {
            viewCallbackFunction();
        });
    }

    return self;
}

multiview.automaticTextBoxView = function(model, dom, rootElement) {

}

multiview.manualTextBoxView = function(model, dom, rootElement) {

}

multiview.readOnlyDisplayView = function(model, dom, rootElement) {

    var textElement = rootElement.getElementsByTagName('p')[0];

    var self = {

    }

    var init = function() {
        console.log("Initialising ReadOnlyDisplay view");
        updateUI();
        model.addListener(updateUI());
    }

    var updateUI = function() {
        setText(model.getText());
    }

    var setText = function(text) {
        textElement.innerHTML = text;
    }

    init();
    return self;
}

var controller = multiview.controller(document);
window.onload = controller.connectToDom;
