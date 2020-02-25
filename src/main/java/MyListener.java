import org.antlr.v4.runtime.misc.Interval;

import java.util.ArrayList;

public class MyListener extends ECMAScriptBaseListener {
    public String root_Type;
    public int node_counts;
    static public ArrayList<String> intervals = new ArrayList<>();

    // 开始parse时，打印根结点的type
    @Override
    public void enterProgram(ECMAScriptParser.ProgramContext ctx) {
        super.enterProgram(ctx);
        System.out.println("#03dsds"+ctx.getText());
        //intervals.add(ctx.getText());
    }
    @Override
    public void enterForVarStatement(ECMAScriptParser.ForVarStatementContext ctx) {
        super.enterForVarStatement(ctx);
        intervals.add(ctx.getText());
    }


    // parse结束时，打印一个End
    @Override
    public void exitProgram(ECMAScriptParser.ProgramContext ctx) {
        super.exitProgram(ctx);
        System.out.println("End!");
    }

}
