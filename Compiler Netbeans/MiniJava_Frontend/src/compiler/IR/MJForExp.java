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
public class MJForExp extends MJVisitInitFor {

    private MJExpression exp;

    public MJForExp() {
    }

    public MJForExp(MJExpression exp, MJExpression condition, MJExpression expr, MJStatement block) {
        super(condition, expr, block);
        this.exp = exp;
        
    }

    public MJExpression getExp() {
        return exp;
    }

}
