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
public class MJfor extends MJStatement {

    public MJfor() {
    }

    public MJStatement getState() {
        return state;
    }

    private MJExpression condition;
    private MJExpression expr;
    private MJStatement block;
    private MJVariable var;
    private MJStatement state;

    public MJfor(MJVariable var, MJExpression condition, MJExpression expr, MJStatement block) {
        this.condition = condition;
        this.expr = expr;
        this.block = block;
        this.var = var;
        this.state = null;
    }
    
    public MJfor(MJStatement var2, MJExpression condition, MJExpression expr, MJStatement block) {
        this.condition = condition;
        this.expr = expr;
        this.block = block;
        this.var = var;
        this.state = var2;
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

    public MJVariable getVar() {
        return var;
    }

}
