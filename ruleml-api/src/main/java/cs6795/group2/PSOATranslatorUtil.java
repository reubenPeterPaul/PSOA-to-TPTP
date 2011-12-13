package cs6795.group2;

import java.util.ArrayList;
import java.util.List;


public class PSOATranslatorUtil {
	public static final String Hash = "#";
	public static final String Period = ".";
	public static final String Comma = ", ";
	public static final String Amp = " & ";
	public static final String Member = "Member";
	public static final String TupTerm = "Tupterm";
	public static final String SlotTerm = "Sloterm";
	public static final String Hypothesis = "hypothesis";
	public static final String Axiom = "axiom";
	public static final String FOF = "fof";
	
	public static boolean isNull(Object o) 
	{ 
		return o==null;
	}
	
	public static int counter = 1;
	public static String randomOID() {
		return "int:oid"+counter++;
	}
	
	public static String psoaTerm(String type, List<String> tuples, List<String> slots) {
		return psoaTerm(randomOID(),type, tuples,slots);
	}
	
	public static String psoaTerm(String oid, String type, List<String> tuples, List<String> slots) {
		if (oid == null) {
			oid = randomOID();
		}
		StringBuilder sb = member(oid,type);
		if (tuples.isEmpty() && slots.isEmpty()) {
			return sb.toString();
		}
		
		for(String s : tuples) {
			sb.append(amp(tuple(oid, s)));
		}
		
		for (String t : slots) {
			sb.append(amp(slot(oid, t)));
		}
		return sb.toString();
	}
	
	public static StringBuilder parenthesize(StringBuilder b) {
		StringBuilder c = builder("(");
		c.append(b);
		c.append(")");
		return c;
	}
	
	public static StringBuilder fofSentence(StringBuilder b) {
		return builder(FOF).append(parenthesize(b)).append(Period);
	}
	
	public static StringBuilder member(String oid, String type) {
		return builder(Member).append(parenthesize(builder(oid).append(Comma).append(type)));
	}
	
	public static StringBuilder tuple(String oid, String term) {
		return builder(TupTerm).append(parenthesize(builder(oid).append(Comma).append(term)));
	}
	
	public static StringBuilder slot(String oid, String term) {
		return builder(SlotTerm).append(parenthesize(builder(oid).append(Comma).append(term)));
	}
	
	public static StringBuilder amp(StringBuilder b) {
		return new StringBuilder(Amp).append(b);
	}
	
	public static void collectTerm(StringBuilder b, String term) {
		if (b.length() > 0) {
			b.append(Comma).append(term);
		} else {
			b.append(term);
		}
		
	}
	
	public static void collectTerms(StringBuilder b, String...strings) {
		for(String s : strings) {
			collectTerm(b, s);
		}
	}
	
	public static StringBuilder hypothesis(StringBuilder b) {
		return parenthesize(builder(randomFactId()).append(Comma).append(Hypothesis).append(Comma).append(b));
	}
	
	public static StringBuilder axiom(StringBuilder b) {
		return parenthesize(builder(randomRuleId()).append(Comma).append(Axiom).append(Comma).append(b));
	}
	
	public static int factCounter = 1;
	public static String randomFactId() {
		return "fact"+factCounter++;
	}
	
	public static int ruleCounter = 1;
	public static String randomRuleId() {
		return "rule"+ruleCounter++;
	}
	
	public static StringBuilder builder() { return builder(""); }
	public static StringBuilder builder(String s) { return new StringBuilder(s); }
	
	public static <T> List<T> list() {
		return new ArrayList<T>();
	}
}
