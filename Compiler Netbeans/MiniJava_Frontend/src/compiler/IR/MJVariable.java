package compiler.IR;

public class MJVariable extends IR {

	private MJType type;
	private String name;
        private MJExpression[] exp;
	
	public MJVariable(MJType t, String name) {
		this.type = t;
		this.name = name;
	}
        
        public MJVariable(MJType t, String name, MJExpression[] exp) {
                this.type = t;
                this.name = name;
                this.exp = exp;
        }

	public MJType getType() {
		return type;
	}

	public String getName() {
		return name;
	}
        
        public MJExpression getExpression() {
                return exp;
        }
	
}
