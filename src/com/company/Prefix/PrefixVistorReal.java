package com.company.Prefix;

import java.util.HashMap;

public class PrefixVistorReal<Data> extends PrefixBaseVisitor<com.company.Prefix.Data> {

    HashMap<String, com.company.Prefix.Data> symbolTable = new HashMap<String, com.company.Prefix.Data>();
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
        symbolTable.put(ctx.varname.getText(), value);

        return value;
    }

    @Override
    public com.company.Prefix.Data visitVariablename(PrefixParser.VariablenameContext ctx) {

        if (symbolTable.containsKey(ctx.varname.getText())) {
            return symbolTable.get(ctx.varname.getText());
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

        if (ctx.variabledeclaration() != null) {
            String varName = ctx.variabledeclaration().value.getText();
            if (symbolTable.containsKey(varName)) {
                return symbolTable.get(varName);
            }
        }

        return visitChildren(ctx);
    }


}
