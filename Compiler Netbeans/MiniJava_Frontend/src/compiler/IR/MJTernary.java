/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compiler.IR;

//public class MJIf extends MJStatement {
//
//    private MJExpression condition;
//    private MJBlock ifBlock;
//
//    public MJIf() {
//    }
//
//    public MJExpression getCondition() {
//        return condition;
//    }
//
//    public MJBlock getIfBlock() {
//        return ifBlock;
//    }
//
//    public MJIf(MJExpression condition, MJBlock ifBlock) {
//        this.condition = condition;
//        this.ifBlock = ifBlock;
//    }
//
//}
/**
 *
 * @author Thor
 */
public class MJTernary extends MJStatement {

    public MJIdentifierClass getIdent_opt() {
        return ident_opt;
    }

    public MJExpression getExpr_a() {
        return expr_a;
    }

    public MJExpression getExpr_b() {
        return expr_b;
    }

    public MJIdentifierClass getIdent_a() {
        return ident_a;
    }

    public MJIdentifierClass getIdent_b() {
        return ident_b;
    }

    private MJIdentifierClass ident_opt;
    private MJExpression condition;

    private MJExpression expr_a;
    private MJExpression expr_b;

    private MJIdentifierClass ident_a;
    private MJIdentifierClass ident_b;

    public MJTernary() {
    }

    public MJTernary(MJExpression condition, Object lhs, Object rhs) {
        this.ident_opt = null;
        
        if (lhs instanceof MJExpression) {
            this.expr_a = (MJExpression) lhs;
        } else if (lhs instanceof MJIdentifierClass ) {
            this.ident_a = (MJIdentifierClass) lhs;
        }else {
            System.err.println("tanerry error Motherfucker");// new Exception("Wrong input asshole");
            System.exit(0);
        }

        if (rhs instanceof MJExpression) {
            this.expr_b = (MJExpression) rhs;
        } else if (rhs instanceof MJIdentifierClass ) {
            this.ident_b = (MJIdentifierClass) rhs;
        }else {
            System.err.println("tanerry error Motherfucker");// new Exception("Wrong input asshole");
            System.exit(0);
        }
    }

    public MJTernary(MJIdentifierClass ident_opt, MJExpression condition, Object lhs, Object rhs) {
        this.ident_opt = ident_opt;

        if (lhs instanceof MJExpression) {
            this.expr_a = (MJExpression) lhs;
        } else {
            this.ident_a = (MJIdentifierClass) lhs;
        }

        if (rhs instanceof MJExpression) {
            this.expr_b = (MJExpression) rhs;
        } else {
            this.ident_b = (MJIdentifierClass) rhs;
        }
    }


    public MJExpression getCondition() {
        return condition;
    }
}
