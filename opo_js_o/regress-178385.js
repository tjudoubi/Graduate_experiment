

var exception;
try {
    var str0 = new String('@hBg');
    var collat3 = new Intl.Collator();
    str10 = str0.padEnd(0x7FFFFFFC, 1);
    Object.defineProperty(collat3, Symbol.toStringTag, { value: str10 });
    collat3.toLocaleString();
} catch (e) {
    exception = e;
}

if (exception != "Error: Out of memory")
    throw "FAILED";
