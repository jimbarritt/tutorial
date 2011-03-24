var multiview = multiview || {};


multiview.controller = function(dom) {
    var self = {
        connectToDom : function() {
            console.log("Controller.init");
            var model = multiview.model("I have been initialised by the javascript!");
            initReadOnlyDisplayViews(model, dom);
            initManualTextBoxViews(model, dom);
            initAutomaticTextBoxViews(model, dom);
        }
    }

    function initReadOnlyDisplayViews(model, dom) {
        var displayViewElements = dom.getElementsByClassName("display-text");
        for (var i = 0; i < displayViewElements.length; i++) {
            multiview.readOnlyDisplayView(model, dom, displayViewElements[i]);
        }
    }

    function initManualTextBoxViews(model, dom) {
        var manualTextBoxElements = dom.getElementsByClassName("manual-update-text");
        for (var i = 0; i < manualTextBoxElements.length; i++) {
            multiview.manualTextBoxView(model, dom, manualTextBoxElements[i]);
        }
    }

    function initAutomaticTextBoxViews(model, dom) {
        var automaticTextBoxElements = dom.getElementsByClassName("automatic-update-text");
        for (var i = 0; i < automaticTextBoxElements.length; i++) {
            multiview.automaticTextBoxView(model, dom, automaticTextBoxElements[i]);
        }
    }

    return self;
}

var someFunction = function() {
};
multiview.model = function(defaultText) {

    var text = defaultText;
    var listeners = new Array();

    var self = {
        addListener : function(viewCallbackFunction) {
            console.log("Registering listener : " + viewCallbackFunction.name);
            listeners.push(viewCallbackFunction);
        },

        getText : function() {
            return text;
        },

        setText : function(newText) {
            if (text !== newText) {
                text = newText;
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
    var textAreaElement = rootElement.getElementsByTagName('textarea')[0];

    var init = function() {
        console.log("Initialising AutomaticTextBox view");
        updateUI();
        model.addListener(updateUI);
        bindToControls();
    }

    var updateUI = function() {
        if (getText() !== model.getText()) {
            setText(model.getText());
        }
    }

    var updateModel = function() {
        model.setText(getText());
    }

    var setText = function(text) {
        textAreaElement.value = text;
    }

    var getText = function() {
        return textAreaElement.value;
    }

    var bindToControls = function() {
        textAreaElement.onkeyup = updateModel;
    }

    init();
}

multiview.manualTextBoxView = function(model, dom, rootElement) {
    var textAreaElement = rootElement.getElementsByTagName('textarea')[0];
    var updateButton = rootElement.getElementsByTagName('input')[0];

    var init = function() {
        console.log("Initialising ManualTextBox view");
        updateUI();
        model.addListener(updateUI);
        bindToControls();
    }

    var updateUI = function() {
        if (getText() !== model.getText()) {
            setText(model.getText());
        }
    }

    var updateModel = function() {
        model.setText(getText());
    }

    var setText = function(text) {
        textAreaElement.value = text;
    }

    var getText = function() {
        return textAreaElement.value;
    }

    var bindToControls = function() {
        updateButton.onclick = updateModel;
    }

    init();
}

multiview.readOnlyDisplayView = function(model, dom, rootElement) {

    var textElement = rootElement.getElementsByTagName('p')[0];

    var init = function() {
        console.log("Initialising ReadOnlyDisplay view");
        updateUI();
        model.addListener(updateUI);
    }

    var updateUI = function() {
        if (getText() !== model.getText()) {
            setText(model.getText());
        }
    }

    var setText = function(text) {
        textElement.innerHTML = text;
    }

    var getText = function() {
        return textElement.innerHTML;
    }

    init();
}

var controller = multiview.controller(document);
window.onload = controller.connectToDom;
