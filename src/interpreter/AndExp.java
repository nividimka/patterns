package interpreter;

public class AndExp implements BooleanExp {
	private BooleanExp operand1, operand2;
 
	public AndExp(BooleanExp operand1, BooleanExp operand2) {
		super();
		this.operand1 = operand1;
		this.operand2 = operand2;
	}
 
	public boolean Evaluate(Context c) {
		return operand1.Evaluate(c) && operand2.Evaluate(c);
	}
 
	public BooleanExp Replace(String str, BooleanExp exp) {
		return new AndExp(operand1.Replace(str, exp), operand2.Replace(str, exp));
	}
 
	public BooleanExp Copy() {
		return new AndExp(operand1.Copy(), operand2.Copy());
	}
}