var navigation = navigation || {};


navigation.pageStack = function(parentWindow) {

    var listOfPages = [
        "../javascript-101/index.html",
        "../javascript-101/equals.html",
        "../javascript-101/control.html",
        "../javascript-101/global.html",
        "../javascript-101/namespaces.html",
        "../objects/object_definition.html",
        "../multiple_views/multiple_views_demo.html"
    ];

    var self = {

        next : function() {
            console.log("Navigating to the next");
            parentWindow.location = findNextUrl();
        },

        previous : function() {
            console.log("Navigating to the previous");
            parentWindow.location = findPreviousUrl();
        },

        top : function() {
            parentWindow.location = listOfPages[0];
        }

    };

    var extractFilename = function(url) {
        var lastSlashIndex = url.lastIndexOf("/");
        return url.substring(lastSlashIndex + 1);
    };

    var findNextUrl = function() {
        var currentFileName = extractFilename(parentWindow.location.toString());
        var nextItem = undefined;
        listOfPages.forEach(function(indexItem) {
            var filenameForThisIndex = extractFilename(indexItem);
            console.log("Looking for [" + currentFileName + "] vs " + filenameForThisIndex);
            if (currentFileName === filenameForThisIndex) {
                console.log("Found It!");
                nextItem = itemAfter(indexItem);
            }
        });

        if (nextItem === undefined) {
            throw "Oops, I can't find [" + currentFileName + "] in my index!: " + listOfPages;
        }
        return nextItem;
    }

    var itemAfter = function(currentItem) {
        var indexOfThisPage = listOfPages.indexOf(currentItem);
        var indexOfNextPage = (indexOfThisPage === listOfPages.length - 1) ? 0 : indexOfThisPage + 1;
        return listOfPages[indexOfNextPage];
    }

    var findPreviousUrl = function() {
        var currentFileName = extractFilename(parentWindow.location.toString());
        var previousItem = undefined;
        listOfPages.forEach(function(indexItem) {
            var filenameForThisIndex = extractFilename(indexItem);
            console.log("Looking for [" + currentFileName + "] vs " + filenameForThisIndex);
            if (currentFileName === filenameForThisIndex) {
                console.log("Found It!");
                previousItem = itemBefore(indexItem);
            }
        });

        if (previousItem === undefined) {
            throw "Oops, I can't find [" + currentFileName + "] in my index!: " + listOfPages;
        }
        return previousItem;
    }

    var itemBefore = function(currentItem) {
        var indexOfThisPage = listOfPages.indexOf(currentItem);
        var indexOfNextPage = (indexOfThisPage === 0) ? listOfPages.length - 1 : indexOfThisPage - 1;
        return listOfPages[indexOfNextPage];
    }

    return self;
}

navigation.keyBoardHandler = function() {
    var ctrlIsPressed = false;

    var self = {
        registerWith : function(parentDocument) {
            parentDocument.onkeyup = onKeyUp;
            parentDocument.onkeydown = onKeyDown;
        }
    }

    var onKeyDown = function(e) {
        var keyId = getKeyIdFrom(e);
        switch (keyId) {
            case 17:
                ctrlIsPressed = true;
                break;
        }
    };

    var onKeyUp = function(e) {
        var keyId = getKeyIdFrom(e);
        switch (keyId) {
            case 39:
                if (ctrlIsPressed) {
                    navigation.navigator.next();
                };
                break;
            case 37:
                if (ctrlIsPressed) {
                    navigation.navigator.previous();
                };
                break;
            case 84:
                if (ctrlIsPressed) {
                    navigation.navigator.top();
                };
                break;
            case 17:
                ctrlIsPressed = false;
                break;
        }
    };

    // Using the global event makes it work in IE according to http://www.geekpedia.com/tutorial138_Get-key-press-event-using-JavaScript.html
    var getKeyIdFrom = function(e) {
        return (window.event) ? event.keyCode : e.keyCode;
    }

    return self;
}


navigation.keyBoardHandler().registerWith(document);
navigation.navigator = navigation.pageStack(window);