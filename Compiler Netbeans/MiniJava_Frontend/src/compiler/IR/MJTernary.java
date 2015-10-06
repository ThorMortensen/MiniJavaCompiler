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
public class MJTernary {

    public MJTernary() {
    }

    public MJTernary(MJExpression condition, ) {
    }

    private MJIdentifier ident_opt;
    private MJExpression condition;

    private MJExpression expr_a;
    private MJExpression expr_b;

    private MJIdentifier ident_a;
    private MJIdentifier ident_b;

    public MJExpression getCondition() {
        return condition;
    }
}
