/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compiler.IR;

/**
 *
 *
 */
public class MJStatementDecrement extends MJStatement {
    
    MJExpression expr;

    public MJStatementDecrement(MJExpression expr) {
        this.expr = expr;
    }
    
     public MJStatementDecrement() {
    }

    public MJExpression getExpr() {
        return expr;
    }

}
