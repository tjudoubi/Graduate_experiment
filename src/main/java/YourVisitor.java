import org.antlr.v4.runtime.misc.Interval;

import java.util.ArrayList;

public class YourVisitor extends ECMAScriptBaseVisitor {
    public static int id = 0;
    class Node{
        String interval;
        int id;
        String type_;
    };
    ArrayList<Node> list = new ArrayList<>();
    @Override public Object  visitProgram(ECMAScriptParser.ProgramContext ctx) {
        Node node = new Node();
        node.interval = ctx.getSourceInterval().toString();
        node.type_ = "program";
        node.id = id;
        id += 1;
        list.add(node);
        return super.visitProgram(ctx);
    }

    @Override public Object  visitSourceElements(ECMAScriptParser.SourceElementsContext ctx) {
        Node node = new Node();
        node.interval = ctx.getSourceInterval().toString();
        node.type_ = "SourceElements";
        node.id = id;
        id += 1;
        list.add(node);
        return super.visitSourceElements(ctx);
    }

    @Override public Object  visitSourceElement(ECMAScriptParser.SourceElementContext ctx) {
        Node node = new Node();
        node.interval = ctx.getSourceInterval().toString();
        node.type_ = "SourceElement";
        node.id = id;
        id += 1;
        list.add(node);
        return super.visitSourceElement(ctx);
    }

    @Override public Object  visitStatement(ECMAScriptParser.StatementContext ctx) {
        Node node = new Node();
        node.interval = ctx.getSourceInterval().toString();
        node.type_ = "SourceElement";
        node.id = id;
        id += 1;
        list.add(node);
        return super.visitStatement(ctx);
    }

    @Override public Object  visitBlock(ECMAScriptParser.BlockContext ctx) {
        Node node = new Node();
        node.interval = ctx.getSourceInterval().toString();
        node.type_ = "Block";
        node.id = id;
        id += 1;
        list.add(node);
        return super.visitBlock(ctx);
    }

    @Override public Object  visitStatementList(ECMAScriptParser.StatementListContext ctx) {
        Node node = new Node();
        node.interval = ctx.getSourceInterval().toString();
        node.type_ = "StatementList";
        node.id = id;
        id += 1;
        list.add(node);
        return super.visitStatementList(ctx);
    }

    @Override public Object visitVariableStatement(ECMAScriptParser.VariableStatementContext ctx) {
        Node node = new Node();
        node.interval = ctx.getSourceInterval().toString();
        node.type_ = "VariableStatement";
        node.id = id;
        id += 1;
        list.add(node);
        return super.visitVariableStatement(ctx);
    }

    @Override public Object visitVariableDeclarationList(ECMAScriptParser.VariableDeclarationListContext ctx) {
        Node node = new Node();
        node.interval = ctx.getSourceInterval().toString();
        node.type_ = "VariableDeclarationList";
        node.id = id;
        id += 1;
        list.add(node);
        return super.visitVariableDeclarationList(ctx);
    }

    @Override public Object visitVariableDeclaration(ECMAScriptParser.VariableDeclarationContext ctx) {
        Node node = new Node();
        node.interval = ctx.getSourceInterval().toString();
        node.type_ = "VariableDeclaration";
        node.id = id;
        id += 1;
        list.add(node);
        return super.visitVariableDeclaration(ctx);
    }

    @Override public Object visitInitialiser(ECMAScriptParser.InitialiserContext ctx) {
        Node node = new Node();
        node.interval = ctx.getSourceInterval().toString();
        node.type_ = "Initialiser";
        node.id = id;
        id += 1;
        list.add(node);
        return super.visitInitialiser(ctx);
    }

    @Override public Object visitEmptyStatement(ECMAScriptParser.EmptyStatementContext ctx) {
        Node node = new Node();
        node.interval = ctx.getSourceInterval().toString();
        node.type_ = "EmptyStatement";
        node.id = id;
        id += 1;
        list.add(node);
        return super.visitEmptyStatement(ctx);
    }

    @Override public Object visitExpressionStatement(ECMAScriptParser.ExpressionStatementContext ctx) {
        Node node = new Node();
        node.interval = ctx.getSourceInterval().toString();
        node.type_ = "ExpressionStatement";
        node.id = id;
        id += 1;
        list.add(node);
        return super.visitExpressionStatement(ctx);
    }

    @Override public Object visitIfStatement(ECMAScriptParser.IfStatementContext ctx) {
        Node node = new Node();
        node.interval = ctx.getSourceInterval().toString();
        node.type_ = "IfStatement";
        node.id = id;
        id += 1;
        list.add(node);
        return super.visitIfStatement(ctx);
    }

    @Override public Object visitDoStatement(ECMAScriptParser.DoStatementContext ctx) {
        Node node = new Node();
        node.interval = ctx.getSourceInterval().toString();
        node.type_ = "DoStatement";
        node.id = id;
        id += 1;
        list.add(node);
        return super.visitDoStatement(ctx);
    }

    @Override public Object visitWhileStatement(ECMAScriptParser.WhileStatementContext ctx) {
        Node node = new Node();
        node.interval = ctx.getSourceInterval().toString();
        node.type_ = "WhileStatement";
        node.id = id;
        id += 1;
        list.add(node);
        return super.visitWhileStatement(ctx);
    }

    @Override public Object visitForStatement(ECMAScriptParser.ForStatementContext ctx) {
        Node node = new Node();
        node.interval = ctx.getSourceInterval().toString();
        node.type_ = "ForStatement";
        node.id = id;
        id += 1;
        list.add(node);
        return super.visitForStatement(ctx);
    }

    @Override public Object visitForVarStatement(ECMAScriptParser.ForVarStatementContext ctx) {
        Node node = new Node();
        node.interval = ctx.getSourceInterval().toString();
        node.type_ = "ForVarStatement";
        node.id = id;
        id += 1;
        list.add(node);
        return super.visitForVarStatement(ctx);
    }

    @Override public Object visitForLetStatement(ECMAScriptParser.ForLetStatementContext ctx) {
        Node node = new Node();
        node.interval = ctx.getSourceInterval().toString();
        node.type_ = "ForLetStatement";
        node.id = id;
        id += 1;
        list.add(node);
        return super.visitForLetStatement(ctx);
    }

    @Override public Object visitForInStatement(ECMAScriptParser.ForInStatementContext ctx) {
        Node node = new Node();
        node.interval = ctx.getSourceInterval().toString();
        node.type_ = "ForInStatement";
        node.id = id;
        id += 1;
        list.add(node);
        return super.visitForInStatement(ctx);
    }

    @Override public Object visitForVarInStatement(ECMAScriptParser.ForVarInStatementContext ctx) {
        Node node = new Node();
        node.interval = ctx.getSourceInterval().toString();
        node.type_ = "ForVarInStatement";
        node.id = id;
        id += 1;
        list.add(node);
        return super.visitForVarInStatement(ctx);
    }

    @Override public Object visitForLetInStatement(ECMAScriptParser.ForLetInStatementContext ctx) {
        Node node = new Node();
        node.interval = ctx.getSourceInterval().toString();
        node.type_ = "ForLetInStatement";
        node.id = id;
        id += 1;
        list.add(node);
        return super.visitForLetInStatement(ctx);
    }

    @Override public Object visitContinueStatement(ECMAScriptParser.ContinueStatementContext ctx) {
        Node node = new Node();
        node.interval = ctx.getSourceInterval().toString();
        node.type_ = "ContinueStatement";
        node.id = id;
        id += 1;
        list.add(node);
        return super.visitContinueStatement(ctx);
    }

    @Override public Object visitBreakStatement(ECMAScriptParser.BreakStatementContext ctx) {
        Node node = new Node();
        node.interval = ctx.getSourceInterval().toString();
        node.type_ = "BreakStatement";
        node.id = id;
        id += 1;
        list.add(node);
        return super.visitBreakStatement(ctx);
    }

    @Override public Object visitReturnStatement(ECMAScriptParser.ReturnStatementContext ctx) {
        Node node = new Node();
        node.interval = ctx.getSourceInterval().toString();
        node.type_ = "ReturnStatement";
        node.id = id;
        id += 1;
        list.add(node);
        return super.visitReturnStatement(ctx);
    }

    @Override public Object visitWithStatement(ECMAScriptParser.WithStatementContext ctx) {
        Node node = new Node();
        node.interval = ctx.getSourceInterval().toString();
        node.type_ = "WithStatement";
        node.id = id;
        id += 1;
        list.add(node);
        return super.visitWithStatement(ctx);
    }

    @Override public Object visitSwitchStatement(ECMAScriptParser.SwitchStatementContext ctx) {
        Node node = new Node();
        node.interval = ctx.getSourceInterval().toString();
        node.type_ = "SwitchStatement";
        node.id = id;
        id += 1;
        list.add(node);
        return super.visitSwitchStatement(ctx);
    }

    @Override public Object visitCaseBlock(ECMAScriptParser.CaseBlockContext ctx) {
        Node node = new Node();
        node.interval = ctx.getSourceInterval().toString();
        node.type_ = "CaseBlock";
        node.id = id;
        id += 1;
        list.add(node);
        return super.visitCaseBlock(ctx);
    }

    @Override public Object visitCaseClauses(ECMAScriptParser.CaseClausesContext ctx) {
        Node node = new Node();
        node.interval = ctx.getSourceInterval().toString();
        node.type_ = "CaseClauses";
        node.id = id;
        id += 1;
        list.add(node);
        return super.visitCaseClauses(ctx);
    }

    @Override public Object visitCaseClause(ECMAScriptParser.CaseClauseContext ctx) {
        Node node = new Node();
        node.interval = ctx.getSourceInterval().toString();
        node.type_ = "CaseClause";
        node.id = id;
        id += 1;
        list.add(node);
        return super.visitCaseClause(ctx);
    }

    @Override public Object visitDefaultClause(ECMAScriptParser.DefaultClauseContext ctx) {
        Node node = new Node();
        node.interval = ctx.getSourceInterval().toString();
        node.type_ = "DefaultClause";
        node.id = id;
        id += 1;
        list.add(node);
        return super.visitDefaultClause(ctx);
    }

    @Override public Object visitLabelledStatement(ECMAScriptParser.LabelledStatementContext ctx) {
        Node node = new Node();
        node.interval = ctx.getSourceInterval().toString();
        node.type_ = "LabelledStatement";
        node.id = id;
        id += 1;
        list.add(node);
        return super.visitLabelledStatement(ctx);
    }

    @Override public Object visitThrowStatement(ECMAScriptParser.ThrowStatementContext ctx) {
        Node node = new Node();
        node.interval = ctx.getSourceInterval().toString();
        node.type_ = "ThrowStatement";
        node.id = id;
        id += 1;
        list.add(node);
        return super.visitThrowStatement(ctx);
    }

    @Override public Object visitTryStatement(ECMAScriptParser.TryStatementContext ctx) {
        Node node = new Node();
        node.interval = ctx.getSourceInterval().toString();
        node.type_ = "TryStatement";
        node.id = id;
        id += 1;
        list.add(node);
        return super.visitTryStatement(ctx);
    }

    @Override public Object visitCatchProduction(ECMAScriptParser.CatchProductionContext ctx) {
        Node node = new Node();
        node.interval = ctx.getSourceInterval().toString();
        node.type_ = "CatchProduction";
        node.id = id;
        id += 1;
        list.add(node);
        return super.visitCatchProduction(ctx);
    }

    @Override public Object visitFinallyProduction(ECMAScriptParser.FinallyProductionContext ctx) {
        Node node = new Node();
        node.interval = ctx.getSourceInterval().toString();
        node.type_ = "FinallyProduction";
        node.id = id;
        id += 1;
        list.add(node);
        return super.visitFinallyProduction(ctx);
    }

    @Override public Object visitDebuggerStatement(ECMAScriptParser.DebuggerStatementContext ctx) {
        Node node = new Node();
        node.interval = ctx.getSourceInterval().toString();
        node.type_ = "DebuggerStatement";
        node.id = id;
        id += 1;
        list.add(node);
        return super.visitDebuggerStatement(ctx);
    }

    @Override public Object visitFunctionDeclaration(ECMAScriptParser.FunctionDeclarationContext ctx) {
        Node node = new Node();
        node.interval = ctx.getSourceInterval().toString();
        node.type_ = "FunctionDeclaration";
        node.id = id;
        id += 1;
        list.add(node);
        return super.visitFunctionDeclaration(ctx);
    }

    @Override public Object visitFormalParameterList(ECMAScriptParser.FormalParameterListContext ctx) {
        Node node = new Node();
        node.interval = ctx.getSourceInterval().toString();
        node.type_ = "FormalParameterList";
        node.id = id;
        id += 1;
        list.add(node);
        return super.visitFormalParameterList(ctx);
    }

    @Override public Object visitFunctionBody(ECMAScriptParser.FunctionBodyContext ctx) {
        Node node = new Node();
        node.interval = ctx.getSourceInterval().toString();
        node.type_ = "FunctionBody";
        node.id = id;
        id += 1;
        list.add(node);
        return super.visitFunctionBody(ctx);
    }

    @Override public Object visitArrayLiteral(ECMAScriptParser.ArrayLiteralContext ctx) {
        Node node = new Node();
        node.interval = ctx.getSourceInterval().toString();
        node.type_ = "ArrayLiteral";
        node.id = id;
        id += 1;
        list.add(node);
        return super.visitArrayLiteral(ctx);
    }

    @Override public Object visitElementList(ECMAScriptParser.ElementListContext ctx) {
        Node node = new Node();
        node.interval = ctx.getSourceInterval().toString();
        node.type_ = "ElementList";
        node.id = id;
        id += 1;
        list.add(node);
        return super.visitElementList(ctx);
    }

    @Override public Object visitElision(ECMAScriptParser.ElisionContext ctx) {
        Node node = new Node();
        node.interval = ctx.getSourceInterval().toString();
        node.type_ = "Elision";
        node.id = id;
        id += 1;
        list.add(node);
        return super.visitElision(ctx);
    }

    @Override public Object visitObjectLiteral(ECMAScriptParser.ObjectLiteralContext ctx) {
        Node node = new Node();
        node.interval = ctx.getSourceInterval().toString();
        node.type_ = "ObjectLiteral";
        node.id = id;
        id += 1;
        list.add(node);
        return super.visitObjectLiteral(ctx);
    }

    @Override public Object visitPropertyNameAndValueList(ECMAScriptParser.PropertyNameAndValueListContext ctx) {
        Node node = new Node();
        node.interval = ctx.getSourceInterval().toString();
        node.type_ = "PropertyNameAndValueList";
        node.id = id;
        id += 1;
        list.add(node);
        return super.visitPropertyNameAndValueList(ctx);
    }

    @Override public Object visitPropertyExpressionAssignment(ECMAScriptParser.PropertyExpressionAssignmentContext ctx) {
        Node node = new Node();
        node.interval = ctx.getSourceInterval().toString();
        node.type_ = "PropertyExpressionAssignment";
        node.id = id;
        id += 1;
        list.add(node);
        return super.visitPropertyExpressionAssignment(ctx);
    }

    @Override public Object visitPropertyGetter(ECMAScriptParser.PropertyGetterContext ctx) {
        Node node = new Node();
        node.interval = ctx.getSourceInterval().toString();
        node.type_ = "PropertyGetter";
        node.id = id;
        id += 1;
        list.add(node);
        return super.visitPropertyGetter(ctx);
    }

    @Override public Object visitPropertySetter(ECMAScriptParser.PropertySetterContext ctx) {
        Node node = new Node();
        node.interval = ctx.getSourceInterval().toString();
        node.type_ = "PropertySetter";
        node.id = id;
        id += 1;
        list.add(node);
        return super.visitPropertySetter(ctx);
    }

    @Override public Object visitPropertyName(ECMAScriptParser.PropertyNameContext ctx) {
        Node node = new Node();
        node.interval = ctx.getSourceInterval().toString();
        node.type_ = "PropertyName";
        node.id = id;
        id += 1;
        list.add(node);
        return super.visitPropertyName(ctx);
    }

    @Override public Object visitPropertySetParameterList(ECMAScriptParser.PropertySetParameterListContext ctx) {
        Node node = new Node();
        node.interval = ctx.getSourceInterval().toString();
        node.type_ = "PropertySetParameterList";
        node.id = id;
        id += 1;
        list.add(node);
        return super.visitPropertySetParameterList(ctx);
    }

    @Override public Object visitArguments(ECMAScriptParser.ArgumentsContext ctx) {
        Node node = new Node();
        node.interval = ctx.getSourceInterval().toString();
        node.type_ = "Arguments";
        node.id = id;
        id += 1;
        list.add(node);
        return super.visitArguments(ctx);
    }

    @Override public Object visitArgumentList(ECMAScriptParser.ArgumentListContext ctx) {
        Node node = new Node();
        node.interval = ctx.getSourceInterval().toString();
        node.type_ = "ArgumentList";
        node.id = id;
        id += 1;
        list.add(node);
        return super.visitArgumentList(ctx);
    }

    @Override public Object visitExpressionSequence(ECMAScriptParser.ExpressionSequenceContext ctx) {
        Node node = new Node();
        node.interval = ctx.getSourceInterval().toString();
        node.type_ = "ExpressionSequence";
        node.id = id;
        id += 1;
        list.add(node);
        return super.visitExpressionSequence(ctx);
    }

    @Override public Object visitTernaryExpression(ECMAScriptParser.TernaryExpressionContext ctx) {
        Node node = new Node();
        node.interval = ctx.getSourceInterval().toString();
        node.type_ = "TernaryExpression";
        node.id = id;
        id += 1;
        list.add(node);
        return super.visitTernaryExpression(ctx);
    }

    @Override public Object visitLogicalAndExpression(ECMAScriptParser.LogicalAndExpressionContext ctx) {
        Node node = new Node();
        node.interval = ctx.getSourceInterval().toString();
        node.type_ = "LogicalAndExpression";
        node.id = id;
        id += 1;
        list.add(node);
        return super.visitLogicalAndExpression(ctx);
    }

    @Override public Object visitPreIncrementExpression(ECMAScriptParser.PreIncrementExpressionContext ctx) {
        Node node = new Node();
        node.interval = ctx.getSourceInterval().toString();
        node.type_ = "PreIncrementExpression";
        node.id = id;
        id += 1;
        list.add(node);
        return super.visitPreIncrementExpression(ctx);
    }

    @Override public Object visitObjectLiteralExpression(ECMAScriptParser.ObjectLiteralExpressionContext ctx) {
        Node node = new Node();
        node.interval = ctx.getSourceInterval().toString();
        node.type_ = "ObjectLiteralExpression";
        node.id = id;
        id += 1;
        list.add(node);
        return super.visitObjectLiteralExpression(ctx);
    }

    @Override public Object visitInExpression(ECMAScriptParser.InExpressionContext ctx) { Node node = new Node();
        node.interval = ctx.getSourceInterval().toString();
        node.type_ = "InExpression";
        node.id = id;
        id += 1;
        list.add(node);
        return super.visitInExpression(ctx);
    }

    @Override public Object visitLogicalOrExpression(ECMAScriptParser.LogicalOrExpressionContext ctx) {
        Node node = new Node();
        node.interval = ctx.getSourceInterval().toString();
        node.type_ = "LogicalOrExpression";
        node.id = id;
        id += 1;
        list.add(node);
        return super.visitLogicalOrExpression(ctx);
    }

    @Override public Object visitNotExpression(ECMAScriptParser.NotExpressionContext ctx) {
        Node node = new Node();
        node.interval = ctx.getSourceInterval().toString();
        node.type_ = "NotExpression";
        node.id = id;
        id += 1;
        list.add(node);
        return super.visitNotExpression(ctx);
    }

    @Override public Object visitPreDecreaseExpression(ECMAScriptParser.PreDecreaseExpressionContext ctx) {
        Node node = new Node();
        node.interval = ctx.getSourceInterval().toString();
        node.type_ = "PreDecreaseExpression";
        node.id = id;
        id += 1;
        list.add(node);
        return super.visitPreDecreaseExpression(ctx);
    }

    @Override public Object visitArgumentsExpression(ECMAScriptParser.ArgumentsExpressionContext ctx) {
        Node node = new Node();
        node.interval = ctx.getSourceInterval().toString();
        node.type_ = "ArgumentsExpression";
        node.id = id;
        id += 1;
        list.add(node);
        return super.visitArgumentsExpression(ctx);
    }

    @Override public Object visitThisExpression(ECMAScriptParser.ThisExpressionContext ctx) {
        Node node = new Node();
        node.interval = ctx.getSourceInterval().toString();
        node.type_ = "ThisExpression";
        node.id = id;
        id += 1;
        list.add(node);
        return super.visitThisExpression(ctx);
    }

    @Override public Object visitFunctionExpression(ECMAScriptParser.FunctionExpressionContext ctx) {
        Node node = new Node();
        node.interval = ctx.getSourceInterval().toString();
        node.type_ = "FunctionExpression";
        node.id = id;
        id += 1;
        list.add(node);
        return super.visitFunctionExpression(ctx);
    }

    @Override public Object visitUnaryMinusExpression(ECMAScriptParser.UnaryMinusExpressionContext ctx) {
        Node node = new Node();
        node.interval = ctx.getSourceInterval().toString();
        node.type_ = "UnaryMinusExpression";
        node.id = id;
        id += 1;
        list.add(node);
        return super.visitUnaryMinusExpression(ctx);
    }

    @Override public Object visitAssignmentExpression(ECMAScriptParser.AssignmentExpressionContext ctx) {
        Node node = new Node();
        node.interval = ctx.getSourceInterval().toString();
        node.type_ = "AssignmentExpression";
        node.id = id;
        id += 1;
        list.add(node);
        return super.visitAssignmentExpression(ctx);
    }

    @Override public Object visitPostDecreaseExpression(ECMAScriptParser.PostDecreaseExpressionContext ctx) {         Node node = new Node();
        node.interval = ctx.getSourceInterval().toString();
        node.type_ = "PostDecreaseExpression";
        node.id = id;
        id += 1;
        list.add(node);
        return super.visitPostDecreaseExpression(ctx);
    }

    @Override public Object visitTypeofExpression(ECMAScriptParser.TypeofExpressionContext ctx) {         Node node = new Node();
        node.interval = ctx.getSourceInterval().toString();
        node.type_ = "TypeofExpression";
        node.id = id;
        id += 1;
        list.add(node);
        return super.visitTypeofExpression(ctx);
    }

    @Override public Object visitInstanceofExpression(ECMAScriptParser.InstanceofExpressionContext ctx) {         Node node = new Node();
        node.interval = ctx.getSourceInterval().toString();
        node.type_ = "InstanceofExpression";
        node.id = id;
        id += 1;
        list.add(node);
        return super.visitInstanceofExpression(ctx);
    }

    @Override public Object visitUnaryPlusExpression(ECMAScriptParser.UnaryPlusExpressionContext ctx) {         Node node = new Node();
        node.interval = ctx.getSourceInterval().toString();
        node.type_ = "UnaryPlusExpression";
        node.id = id;
        id += 1;
        list.add(node);
        return super.visitUnaryPlusExpression(ctx);
    }

    @Override public Object visitDeleteExpression(ECMAScriptParser.DeleteExpressionContext ctx) {
        Node node = new Node();
        node.interval = ctx.getSourceInterval().toString();
        node.type_ = "DeleteExpression";
        node.id = id;
        id += 1;
        list.add(node);
        return super.visitDeleteExpression(ctx);
    }

    @Override public Object visitEqualityExpression(ECMAScriptParser.EqualityExpressionContext ctx) {
        Node node = new Node();
        node.interval = ctx.getSourceInterval().toString();
        node.type_ = "EqualityExpression";
        node.id = id;
        id += 1;
        list.add(node);
        return super.visitEqualityExpression(ctx);
    }

    @Override public Object visitBitXOrExpression(ECMAScriptParser.BitXOrExpressionContext ctx) {
        Node node = new Node();
        node.interval = ctx.getSourceInterval().toString();
        node.type_ = "BitXOrExpression";
        node.id = id;
        id += 1;
        list.add(node);
        return super.visitBitXOrExpression(ctx);
    }

    @Override public Object visitMultiplicativeExpression(ECMAScriptParser.MultiplicativeExpressionContext ctx) {         Node node = new Node();
        node.interval = ctx.getSourceInterval().toString();
        node.type_ = "MultiplicativeExpression";
        node.id = id;
        id += 1;
        list.add(node);
        return super.visitMultiplicativeExpression(ctx);
    }

    @Override public Object visitBitShiftExpression(ECMAScriptParser.BitShiftExpressionContext ctx) {
        Node node = new Node();
        node.interval = ctx.getSourceInterval().toString();
        node.type_ = "BitShiftExpression";
        node.id = id;
        id += 1;
        list.add(node);
        return super.visitBitShiftExpression(ctx);
    }

    @Override public Object visitParenthesizedExpression(ECMAScriptParser.ParenthesizedExpressionContext ctx) {
        Node node = new Node();
        node.interval = ctx.getSourceInterval().toString();
        node.type_ = "ParenthesizedExpression";
        node.id = id;
        id += 1;
        list.add(node);
        return super.visitParenthesizedExpression(ctx);
    }

    @Override public Object visitAdditiveExpression(ECMAScriptParser.AdditiveExpressionContext ctx) {
        Node node = new Node();
        node.interval = ctx.getSourceInterval().toString();
        node.type_ = "AdditiveExpression";
        node.id = id;
        id += 1;
        list.add(node);
        return super.visitAdditiveExpression(ctx);
    }

    @Override public Object visitRelationalExpression(ECMAScriptParser.RelationalExpressionContext ctx) {
        Node node = new Node();
        node.interval = ctx.getSourceInterval().toString();
        node.type_ = "RelationalExpression";
        node.id = id;
        id += 1;
        list.add(node);
        return super.visitRelationalExpression(ctx);
    }

    @Override public Object visitPostIncrementExpression(ECMAScriptParser.PostIncrementExpressionContext ctx) {
        Node node = new Node();
        node.interval = ctx.getSourceInterval().toString();
        node.type_ = "PostIncrementExpression";
        node.id = id;
        id += 1;
        list.add(node);
        return super.visitPostIncrementExpression(ctx);
    }

    @Override public Object visitBitNotExpression(ECMAScriptParser.BitNotExpressionContext ctx) {
        Node node = new Node();
        node.interval = ctx.getSourceInterval().toString();
        node.type_ = "BitNotExpression";
        node.id = id;
        id += 1;
        list.add(node);
        return super.visitBitNotExpression(ctx);
    }

    @Override public Object visitNewExpression(ECMAScriptParser.NewExpressionContext ctx) {
        Node node = new Node();
        node.interval = ctx.getSourceInterval().toString();
        node.type_ = "NewExpression";
        node.id = id;
        id += 1;
        list.add(node);
        return super.visitNewExpression(ctx);
    }

    @Override public Object visitLiteralExpression(ECMAScriptParser.LiteralExpressionContext ctx) {
        Node node = new Node();
        node.interval = ctx.getSourceInterval().toString();
        node.type_ = "LiteralExpression";
        node.id = id;
        id += 1;
        list.add(node);
        return super.visitLiteralExpression(ctx);
    }

    @Override public Object visitArrayLiteralExpression(ECMAScriptParser.ArrayLiteralExpressionContext ctx) {
        Node node = new Node();
        node.interval = ctx.getSourceInterval().toString();
        node.type_ = "ArrayLiteralExpression";
        node.id = id;
        id += 1;
        list.add(node);
        return super.visitArrayLiteralExpression(ctx);
    }

    @Override public Object visitMemberDotExpression(ECMAScriptParser.MemberDotExpressionContext ctx) {
        Node node = new Node();
        node.interval = ctx.getSourceInterval().toString();
        node.type_ = "MemberDotExpression";
        node.id = id;
        id += 1;
        list.add(node);
        return super.visitMemberDotExpression(ctx);
    }

    @Override public Object visitMemberIndexExpression(ECMAScriptParser.MemberIndexExpressionContext ctx) {
        Node node = new Node();
        node.interval = ctx.getSourceInterval().toString();
        node.type_ = "MemberIndexExpression";
        node.id = id;
        id += 1;
        list.add(node);
        return super.visitMemberIndexExpression(ctx);
    }

    @Override public Object visitIdentifierExpression(ECMAScriptParser.IdentifierExpressionContext ctx) {
        Node node = new Node();
        node.interval = ctx.getSourceInterval().toString();
        node.type_ = "IdentifierExpression";
        node.id = id;
        id += 1;
        list.add(node);
        return super.visitIdentifierExpression(ctx);
    }

    @Override public Object visitBitAndExpression(ECMAScriptParser.BitAndExpressionContext ctx) {
        Node node = new Node();
        node.interval = ctx.getSourceInterval().toString();
        node.type_ = "BitAndExpression";
        node.id = id;
        id += 1;
        list.add(node);
        return super.visitBitAndExpression(ctx);
    }

    @Override public Object visitBitOrExpression(ECMAScriptParser.BitOrExpressionContext ctx) {
        Node node = new Node();
        node.interval = ctx.getSourceInterval().toString();
        node.type_ = "BitOrExpression";
        node.id = id;
        id += 1;
        list.add(node);
        return super.visitBitOrExpression(ctx);
    }

    @Override public Object visitAssignmentOperatorExpression(ECMAScriptParser.AssignmentOperatorExpressionContext ctx) {
        Node node = new Node();
        node.interval = ctx.getSourceInterval().toString();
        node.type_ = "AssignmentOperatorExpression";
        node.id = id;
        id += 1;
        list.add(node);
        return super.visitAssignmentOperatorExpression(ctx);
    }

    @Override public Object visitVoidExpression(ECMAScriptParser.VoidExpressionContext ctx) {
        Node node = new Node();
        node.interval = ctx.getSourceInterval().toString();
        node.type_ = "VoidExpression";
        node.id = id;
        id += 1;
        list.add(node);
        return super.visitVoidExpression(ctx);
    }

    @Override public Object visitAssignmentOperator(ECMAScriptParser.AssignmentOperatorContext ctx) {
        Node node = new Node();
        node.interval = ctx.getSourceInterval().toString();
        node.type_ = "AssignmentOperator";
        node.id = id;
        id += 1;
        list.add(node);
        return super.visitAssignmentOperator(ctx);
    }

    @Override public Object visitLiteral(ECMAScriptParser.LiteralContext ctx) {
        Node node = new Node();
        node.interval = ctx.getSourceInterval().toString();
        node.type_ = "Literal";
        node.id = id;
        id += 1;
        list.add(node);
        return super.visitLiteral(ctx);
    }

    @Override public Object visitNumericLiteral(ECMAScriptParser.NumericLiteralContext ctx) {
        Node node = new Node();
        node.interval = ctx.getSourceInterval().toString();
        node.type_ = "NumericLiteral";
        node.id = id;
        id += 1;
        list.add(node);
        return super.visitNumericLiteral(ctx);
    }

    @Override public Object visitIdentifierName(ECMAScriptParser.IdentifierNameContext ctx) {
        Node node = new Node();
        node.interval = ctx.getSourceInterval().toString();
        node.type_ = "IdentifierName";
        node.id = id;
        id += 1;
        list.add(node);
        return super.visitIdentifierName(ctx);
    }

    @Override public Object visitReservedWord(ECMAScriptParser.ReservedWordContext ctx) {
        Node node = new Node();
        node.interval = ctx.getSourceInterval().toString();
        node.type_ = "ReservedWord";
        node.id = id;
        id += 1;
        list.add(node);
        return super.visitReservedWord(ctx);
    }

    @Override public Object visitKeyword(ECMAScriptParser.KeywordContext ctx) {
        Node node = new Node();
        node.interval = ctx.getSourceInterval().toString();
        node.type_ = "Keyword";
        node.id = id;
        id += 1;
        list.add(node);
        return super.visitKeyword(ctx);
    }

    @Override public Object visitFutureReservedWord(ECMAScriptParser.FutureReservedWordContext ctx) {
        Node node = new Node();
        node.interval = ctx.getSourceInterval().toString();
        node.type_ = "FutureReservedWord";
        node.id = id;
        id += 1;
        list.add(node);
        return super.visitFutureReservedWord(ctx);
    }

    @Override public Object visitGetter(ECMAScriptParser.GetterContext ctx) {
        Node node = new Node();
        node.interval = ctx.getSourceInterval().toString();
        node.type_ = "Getter";
        node.id = id;
        id += 1;
        list.add(node);
        return super.visitGetter(ctx);
    }

    @Override public Object visitSetter(ECMAScriptParser.SetterContext ctx) {
        Node node = new Node();
        node.interval = ctx.getSourceInterval().toString();
        node.type_ = "Setter";
        node.id = id;
        id += 1;
        list.add(node);
        return super.visitSetter(ctx);
    }

    @Override public Object visitEos(ECMAScriptParser.EosContext ctx) {
        Node node = new Node();
        node.interval = ctx.getSourceInterval().toString();
        node.type_ = "Eos";
        node.id = id;
        id += 1;
        list.add(node);
        return super.visitEos(ctx);
    }

    @Override public Object visitEof(ECMAScriptParser.EofContext ctx) {
        Node node = new Node();
        node.interval = ctx.getSourceInterval().toString();
        node.type_ = "Eof";
        node.id = id;
        id += 1;
        list.add(node);
        return super.visitEof(ctx);
    }
}
