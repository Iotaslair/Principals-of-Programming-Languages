package com.company.Prefix;

public class PrefixVistorReal<Boolean> extends PrefixBaseVisitor<java.lang.Boolean> {

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


}
