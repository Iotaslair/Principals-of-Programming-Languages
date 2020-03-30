package com.company.Prefix;

import java.util.HashMap;

public class PrefixVistorReal<Boolean> extends PrefixBaseVisitor<java.lang.Boolean> {

    HashMap<String, java.lang.Boolean> symbolTable = new HashMap<>();

    @Override
    public java.lang.Boolean visitExpr(PrefixParser.ExprContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public java.lang.Boolean visitAnd(PrefixParser.AndContext ctx) {
        if (ctx.val() != null) {
            return visitVal(ctx.leftval) && visitExpr(ctx.rightexpr);
        } else if (ctx.leftexpr != null) {
            return visitExpr(ctx.leftexpr) && visitExpr(ctx.rightexpr);
        }
        return visitChildren(ctx);
    }


    @Override
    public java.lang.Boolean visitOr(PrefixParser.OrContext ctx) {
        if (ctx.val() != null) {
            return visitVal(ctx.leftval) || visitExpr(ctx.rightexpr);
        } else if (ctx.leftexpr != null) {
            return visitExpr(ctx.leftexpr) || visitExpr(ctx.rightexpr);
        }
        return visitChildren(ctx);
    }

    @Override
    public java.lang.Boolean visitVal(PrefixParser.ValContext ctx) {
        if (ctx.TRUE() != null) {
            return true;
        } else if (ctx.FALSE() != null) {
            return false;
        } else {
            System.out.println("There is an error in visitVal");
            return false;
        }
    }

    @Override
    public java.lang.Boolean visitNot(PrefixParser.NotContext ctx) {
        return !visitExpr(ctx.expr());
    }

    @Override
    public java.lang.Boolean visitBooleanvalue(PrefixParser.BooleanvalueContext ctx) {

        if (ctx.variable() != null) {
            String varName = ctx.variable().value.getText();
            if (symbolTable.containsKey(varName)) {
                return symbolTable.get(varName);
            }
        }

        return visitChildren(ctx);
    }

    @Override
    public java.lang.Boolean visitIfstatement(PrefixParser.IfstatementContext ctx) {
        boolean value;
        if (visitBooleanvalue(ctx.ifsection)) {
            value = visitExpr(ctx.thensection);
        } else {
            value = visitExpr(ctx.elsesection);
        }
        return value;
    }

    @Override
    public java.lang.Boolean visitVariable(PrefixParser.VariableContext ctx) {

        boolean value = visitBooleanvalue(ctx.value);
        symbolTable.put(ctx.varname.getText(), value);

        return value;
//        return visitChildren(ctx);
    }

    @Override
    public java.lang.Boolean visitVariablename(PrefixParser.VariablenameContext ctx) {

        if (symbolTable.containsKey(ctx.varname.getText())) {
            java.lang.Boolean result = symbolTable.get(ctx.varname.getText());
            return result;
        } else {
            System.out.println("Could not find this variable in the symbol table " + ctx.varname.getText());
            return false;
        }
    }


}
