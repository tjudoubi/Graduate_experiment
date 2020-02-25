import org.antlr.v4.runtime.misc.Interval;

import java.util.ArrayList;

public class MyVisitor extends ECMAScriptBaseVisitor {
    ArrayList<Interval> intervals = new ArrayList<>();
    ArrayList<Interval> interval_sss = new ArrayList<>();
    ArrayList<String> texts = new ArrayList<>();  // assign的右侧部分代码
    ArrayList<Interval> intervals_if = new ArrayList<>(); // if 语句的intervals
    ArrayList<String> texts_if = new ArrayList<>(); // if 语句的代码



//    @Override
//    public Object visitProgram(ECMAScriptParser.ProgramContext ctx) {
//        return super.visitProgram(ctx);
//    }

    @Override
    public Object visitIfStatement(ECMAScriptParser.IfStatementContext ctx) {
        interval_sss.add(ctx.getSourceInterval());

        ECMAScriptParser.ExpressionSequenceContext es = ctx.expressionSequence();
        texts_if.add(es.start.getInputStream().getText(new Interval(es.start.getStartIndex(),es.stop.getStopIndex())));
        return super.visitIfStatement(ctx);
    }

    @Override
    public Object visitInitialiser(ECMAScriptParser.InitialiserContext ctx) {
        interval_sss.add(ctx.getSourceInterval());


        ECMAScriptParser.SingleExpressionContext se = ctx.singleExpression();
        intervals.add(se.getSourceInterval());
        texts.add(se.start.getInputStream().getText(new Interval(se.start.getStartIndex(), se.stop.getStopIndex())));
        return super.visitInitialiser(ctx);
    }

    @Override
    public Object visitProgram(ECMAScriptParser.ProgramContext ctx){
        interval_sss.add(ctx.getSourceInterval());

        intervals.add(ctx.getSourceInterval());
        //texts.add(se.start.getInputStream().getText(new Interval(se.start.getStartIndex(), se.stop.getStopIndex())));
        return super.visitChildren(ctx);
    }
    @Override
    public Object visitAssignmentExpression(ECMAScriptParser.AssignmentExpressionContext ctx) {
        interval_sss.add(ctx.getSourceInterval());


        ECMAScriptParser.SingleExpressionContext se = ctx.singleExpression().get(1);
        intervals.add(se.getSourceInterval());
        texts.add(se.start.getInputStream().getText(new Interval(se.start.getStartIndex(), se.stop.getStopIndex())));
        return super.visitAssignmentExpression(ctx);
    }

    @Override
    public Object visitSourceElement(ECMAScriptParser.SourceElementContext ctx){
        interval_sss.add(ctx.getSourceInterval());

        return super.visitSourceElement(ctx);
    }
}
