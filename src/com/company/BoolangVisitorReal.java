package com.company;

import com.company.gen.BoolangBaseVisitor;
import com.company.gen.BoolangParser;

public class BoolangVisitorReal<Boolean> extends BoolangBaseVisitor<java.lang.Boolean> {
    @Override
    public java.lang.Boolean visitExpr(BoolangParser.ExprContext ctx) {
//        if (ctx.or() != null) {
//            return visitOr(ctx.or());
//        }
//        if (ctx.not() != null) {
//            return !visitNot(ctx.not());
//        }
//        if(ctx.and() != null){
//            return visitAnd(ctx.and());
//        }
//        if (ctx.val() != null) {
//            return visitVal(ctx.val());
//        }
        return visitChildren(ctx);
    }

    @Override
    public java.lang.Boolean visitAnd(BoolangParser.AndContext ctx) {
        if (ctx.val() != null) {
            return visitVal(ctx.leftval) && visitExpr(ctx.rightexpr);
        } else if (ctx.leftexpr != null) {
            return visitExpr(ctx.leftexpr) && visitExpr(ctx.rightexpr);
        }
        return visitChildren(ctx);
    }


    @Override
    public java.lang.Boolean visitOr(BoolangParser.OrContext ctx) {
        if (ctx.val() != null) {
            return visitVal(ctx.leftval) || visitExpr(ctx.rightexpr);
        } else if (ctx.leftexpr != null) {
            return visitExpr(ctx.leftexpr) || visitExpr(ctx.rightexpr);
        }
        return visitChildren(ctx);
    }

    @Override
    public java.lang.Boolean visitVal(BoolangParser.ValContext ctx) {
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
    public java.lang.Boolean visitNot(BoolangParser.NotContext ctx) {
        return !visitExpr(ctx.expr());
    }


}
