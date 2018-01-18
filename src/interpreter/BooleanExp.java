package interpreter;

public interface BooleanExp {
	boolean Evaluate(Context c);
 
	BooleanExp Replace(String str, BooleanExp exp);
 
	BooleanExp Copy();
}