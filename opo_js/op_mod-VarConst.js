

load("./resources/binary-op-test.js");


var opName = "mod";
var op = "%";

load("./resources/binary-op-values.js");

tests = [];
generateBinaryTests(tests, opName, op, "VarConst", values, values);

run();
