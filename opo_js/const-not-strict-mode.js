function truth() {
    return true;
}
noInline(truth);

function assert(cond) {
    if (!cond)
        throw new Error("broke assertion");
}
noInline(assert);

function shouldThrowTDZ(func) {
    var hasThrown = false;
    try {
        func();
    } catch(e) {
        if (e.name.indexOf("ReferenceError") !== -1)
            hasThrown = true;
    }
    assert(hasThrown);
}
noInline(shouldThrowTDZ);





const NUM_LOOPS = 1000;

;(function() {
function foo() {
    delete x;
    const x = 20;
}
function bar() {
    delete x;
    const x = 20;
    function capX() { return x; }
}

for (var i = 0; i < NUM_LOOPS; i++) {
    shouldThrowTDZ(foo);
    shouldThrowTDZ(bar);
}

})();


;(function() {

function foo() {
    var hadError = false;
    try {
        x;
    } catch(e) {
        hadError = true;
    }
    assert(hadError);

    if (truth()) {
        
        
        
        
        
        
        
        
        
        const x = 40;
        let threw = false;
        try {
            eval("var x = 20;");
        } catch(e) {
            if (e.name.indexOf("TypeError") !== -1 && e.message.indexOf("readonly") !== -1)
                threw = true;
        }
        assert(threw);
        assert(x === 40);
    }
    assert(x === undefined);
}

function bar() {
    var hadError = false;
    try {
        x;
    } catch(e) {
        hadError = true;
    }
    assert(hadError);

    if (truth()) {
        const x = 40;
        function capX() { return x; }
        let threw = false;
        try {
            eval("var x = 20;");
        } catch(e) {
            if (e.name.indexOf("TypeError") !== -1 && e.message.indexOf("readonly") !== -1)
                threw = true;
        }
        assert(threw);
        assert(x === 40);
    }
    assert(x === undefined);
}

function baz() {
    if (truth()) {
        const x = 40;
        eval("const x = 20; assert(x === 20);");
        assert(x === 40);
    }
    if (truth()) {
        const x = 40;
        function capX() { return x; }
        eval("const x = 20; assert(x === 20);");
        assert(x === 40);
    }
}

function baz() {
    
    const x = 20;
    const evalString = "x;";

    assert(eval(evalString) === 20);
    if (truth()) {
        const y = 60;
        assert(eval(evalString) === 20);
        assert(y === 60);
        if (truth()) {
            const y = 50, z = 70, x = 40;
            assert(eval(evalString) === 40);
            assert(y === 50 && z === 70);
        }
    }
}

for (var i = 0; i < NUM_LOOPS; i++) {
    foo();
    bar();
    baz();
}

})();
