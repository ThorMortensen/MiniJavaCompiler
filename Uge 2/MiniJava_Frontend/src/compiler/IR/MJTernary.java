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
public class MJTernary extends MJStatement{
    
    
	private MJExpression condition_a;
	private MJExpression condition_b;
	private MJExpression condition_c;
        
	private MJBlock ifBlock;

	public MJTernary() {}
	
	public MJExpression getCondition() {
		return condition_a;
	}

	public MJBlock getIfBlock() {
		return ifBlock;
	}

	public MJTernary(MJExpression condition, MJBlock ifBlock) {
	//	this.condition = condition;
		this.ifBlock = ifBlock;
	}

    
}
