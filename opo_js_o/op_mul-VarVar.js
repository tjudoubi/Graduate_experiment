

load("./resources/binary-op-test.js");



var opName = "mul";
var op = "*";

load("./resources/binary-op-values.js");

tests = [];
generateBinaryTests(tests, opName, op, "VarVar", values, values);

run();
