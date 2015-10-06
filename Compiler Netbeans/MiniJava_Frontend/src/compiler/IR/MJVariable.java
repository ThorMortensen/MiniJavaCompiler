package compiler.IR;

public class MJVariable extends IR {

	private MJType type;
	private String name;
        private MJExpression[] exp;
        private MJExpression expr;
        private MJStatement statem;
	
	public MJVariable(MJType t, String name) {
		this.type = t;
		this.name = name;
	}
        
        public MJVariable(MJType t, String name, MJExpression[] exp) {
                this.type = t;
                this.name = name;
                this.exp = exp;
        }
        
        public MJVariable(MJType t, String name, MJExpression expr) {
                this.type = t;
                this.name = name;
                this.expr = expr;
        }
        
        public MJVariable(MJType t, String name, MJStatement statem) {
                this.type = t;
                this.name = name;
                this.statem = statem;
        }

	public MJType getType() {
		return type;
	}

	public String getName() {
		return name;
	}
        
        public MJExpression[] getExpression() {
                return exp;
        }
        
        public MJExpression getExpr() {
                return expr;
        }
        
        public MJStatement getStatem() {
                return statem;
        }
	
}
