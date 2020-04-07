package com.company.Prefix;

import java.util.HashMap;
import java.util.Stack;

public class PrefixVistorReal extends PrefixBaseVisitor<com.company.Prefix.Data> {

    HashMap<String, Stack<com.company.Prefix.Data>> symbolTable = new HashMap<String, Stack<com.company.Prefix.Data>>();
    DataFactory dataFactory = new DataFactory();

    @Override
    public com.company.Prefix.Data visitExpr(PrefixParser.ExprContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public com.company.Prefix.Data visitAnd(PrefixParser.AndContext ctx) {
        if (ctx.val() != null) {
            return dataFactory.newData(visitVal(ctx.leftval).getBoolData() && visitExpr(ctx.rightexpr).getBoolData());
        } else if (ctx.leftexpr != null) {
            return dataFactory.newData(visitExpr(ctx.leftexpr).getBoolData() && visitExpr(ctx.rightexpr).getBoolData());
        }
        return visitChildren(ctx);
    }

    @Override
    public com.company.Prefix.Data visitOr(PrefixParser.OrContext ctx) {
        if (ctx.val() != null) {
            return dataFactory.newData(visitVal(ctx.leftval).getBoolData() || visitExpr(ctx.rightexpr).getBoolData());
        } else if (ctx.leftexpr != null) {
            return dataFactory.newData(visitExpr(ctx.leftexpr).getBoolData() || visitExpr(ctx.rightexpr).getBoolData());
        }
        return visitChildren(ctx);
    }

    @Override
    public com.company.Prefix.Data visitVal(PrefixParser.ValContext ctx) {
        if (ctx.TRUE() != null) {
            return dataFactory.newData(true);
        } else if (ctx.FALSE() != null) {
            return dataFactory.newData(false);
        } else {
            System.out.println("There is an error in visitVal");
            return null;
        }
    }

    @Override
    public com.company.Prefix.Data visitNot(PrefixParser.NotContext ctx) {
        return dataFactory.newData(!(visitExpr(ctx.expr()).getBoolData()));
    }

    @Override
    public com.company.Prefix.Data visitBooleanvalue(PrefixParser.BooleanvalueContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public com.company.Prefix.Data visitIfstatement(PrefixParser.IfstatementContext ctx) {
        com.company.Prefix.Data value;
        if (visitBooleanvalue(ctx.ifsection).getBoolData()) {
            value = visitExpr(ctx.thensection);
        } else {
            value = visitExpr(ctx.elsesection);
        }
        return value;
    }

    @Override
    public com.company.Prefix.Data visitVariabledeclaration(PrefixParser.VariabledeclarationContext ctx) {

        com.company.Prefix.Data value = visitData(ctx.value);
        Stack<com.company.Prefix.Data> tempStack = new Stack<>();
        if(symbolTable.get(ctx.varname.getText()) != null) {
            tempStack = symbolTable.get(ctx.varname.getText());
        }
        tempStack.push(value);
        symbolTable.put(ctx.varname.getText(), tempStack);
        System.out.println("Assigned " + ctx.varname.getText() + " to " + value);

        return visitExpr(ctx.run);
    }

    @Override
    public com.company.Prefix.Data visitVariablename(PrefixParser.VariablenameContext ctx) {
        if (symbolTable.containsKey(ctx.varname.getText())) {
            System.out.println("Returning value of " + ctx.varname.getText());
            return symbolTable.get(ctx.varname.getText()).pop();
        } else {
            System.out.println("Could not find this variable in the symbol table " + ctx.varname.getText());
            return null;
        }
    }

    @Override
    public com.company.Prefix.Data visitInteger(PrefixParser.IntegerContext ctx) {
        return dataFactory.newData(Integer.parseInt(ctx.intvalue.getText()));
    }

    @Override
    public com.company.Prefix.Data visitData(PrefixParser.DataContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public com.company.Prefix.Data visitIntegervalue(PrefixParser.IntegervalueContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public com.company.Prefix.Data visitAdd(PrefixParser.AddContext ctx) {
        return dataFactory.newData(visitData(ctx.left).getIntData() + visitData(ctx.right).getIntData());
    }

    @Override
    public com.company.Prefix.Data visitSubtract(PrefixParser.SubtractContext ctx) {
        return dataFactory.newData(visitData(ctx.left).getIntData() - visitData(ctx.right).getIntData());
    }

    @Override
    public com.company.Prefix.Data visitMultiply(PrefixParser.MultiplyContext ctx) {
        return dataFactory.newData(visitData(ctx.left).getIntData() * visitData(ctx.right).getIntData());
    }


}
