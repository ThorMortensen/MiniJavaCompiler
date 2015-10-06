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
public class MJStatementIncrement extends MJStatement{
        
    MJExpression expr;

    public MJStatementIncrement(MJExpression expr) {
        this.expr = expr;
    }
    
     public MJStatementIncrement() {
    }

    public MJExpression getExpr() {
        return expr;
    }

}
