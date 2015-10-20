/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compiler.IR;

/**
 *
 * @author Thor
 */
public class MJVisitInitFor extends IR {

    private MJExpression condition;
    private MJExpression expr;
    private MJStatement block;

    public MJVisitInitFor() {
    }

    public MJVisitInitFor(MJExpression condition, MJExpression expr, MJStatement block) {
        this.condition = condition;
        this.expr = expr;
        this.block = block;
    }

    public MJExpression getCondition() {
        return condition;
    }

    public MJExpression getExpr() {
        return expr;
    }

    public MJStatement getBlock() {
        return block;
    }

}
