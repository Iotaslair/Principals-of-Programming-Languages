package com.company;

import com.company.Boolang.BoolangParser;
import com.company.Prefix.PrefixBaseVisitor;
import com.company.Prefix.PrefixParser;

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

}
