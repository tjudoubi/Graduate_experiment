




function shouldEqual(testId, actual, expected) {
    if (actual != expected) {
        throw testId + ": ERROR: expect " + expected + ", actual " + actual;
    }
}

var exception = undefined;

s2 = 'x'.repeat(0x3fffffff);
r0 = /((?=\S))/giy;

try {
    s2.replace(r0, '')
} catch (e) {
    exception = e;
}

shouldEqual(10000, exception, "Error: Out of memory");
