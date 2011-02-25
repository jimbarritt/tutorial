var multiview = multiview || {};


multiview.controller = function(dom,
                                readOnlyDisplayId,
                                manualTextBoxId,
                                automaticTextBoxAId,
                                automaticTextBoxBId) {

    var model = multiview.model("Type something here");
    multiview.readOnlyDisplayView(model, readOnlyDisplayId);
    multiview.manualTextBoxView(model, manualTextBoxId);
    multiview.automaticTextBoxView(model, automaticTextBoxAId);
    multiview.automaticTextBoxView(model, automaticTextBoxBId);

}

multiview.model = function(defaultText) {

    var text = defaultText;

    var self = {
        onChange : function() { /* abstract */ },

        setText : function(newText) {
            if (text !== newText) {
                fireOnChangeEvent();
            }
        }
    }

    function fireOnChangeEvent() {
        self.onChange();
    }

    return self;
}

multiview.automaticTextBoxView = function(automaticTextBoxView) {

}

multiview.readOnlyDisplayView = function(readOnlyDisplayId, model, dom) {

    var rootElement = dom.getElementById(readOnlyDisplayId);

    var self =  {

    }

    var init = function() {
        model.onChange = updateUI();
    }

    var updateUI = function() {
        paragraphElement.innerHTML = model.getText();
    }
    return self;
}