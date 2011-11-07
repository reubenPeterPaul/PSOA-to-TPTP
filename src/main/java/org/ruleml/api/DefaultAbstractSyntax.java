package org.ruleml.api;

import java.util.*;

/** A straightforward implementation of the interface AbstractSyntax that,
 *  however, should be sufficiently good for most uses.
 */
public class DefaultAbstractSyntax implements AbstractSyntax {

    public static class Document implements AbstractSyntax.Document {
	
	public Document(AbstractSyntax.Base base,
			Iterable<AbstractSyntax.Prefix> prefixes,
			Iterable<AbstractSyntax.Import> imports,
			AbstractSyntax.Group group) {
	    _base = base;
	    _prefixes = prefixes;
	    _imports = imports;
	    _group = group;
	}
	
	/** @return possibly null */
	public AbstractSyntax.Base getBase() {
	    return _base;
	}
	
	/** @return possibly null or empty */
	public Iterable<AbstractSyntax.Prefix> getPrefixes() {
	    return _prefixes;
	}

	/** @return possibly null or empty */
	public Iterable<AbstractSyntax.Import> getImports() {
	    return _imports;
	}

	/** @return possibly null */
	public AbstractSyntax.Group getGroup() {
	    return _group;
	}

	public String toString() {
	    return toString("");
	}

	public String toString(String indent) {
	    
	    return indent + "Document (\n" +
		indent + "\n" +
		toStringIfNonNull(_base,indent,"","\n" + indent + "\n") + 
		iterableToStringIfNonEmpty(_prefixes,indent,"\n" + indent + "\n") +
		
		iterableToStringIfNonEmpty(_imports,indent,"\n" + indent + "\n") +
		toStringIfNonNull(_group,indent,"","\n" + indent + "\n") + 
		indent +")";
	}
	
	
	private AbstractSyntax.Base _base;

	private Iterable<AbstractSyntax.Prefix> _prefixes;
       
	private Iterable<AbstractSyntax.Import> _imports;

	private AbstractSyntax.Group _group;

    } // class Document


    public class Base implements AbstractSyntax.Base {

	public Base(String iri) {
	    _iri = iri;
	}

	public String getIRI() {
	    return _iri;
	}
	

	public String toString() {
	    return toString("");
	}

	public String toString(String indent) {
	    return indent + "Base(<" + _iri + ">)";
	}
	
	private String _iri;
    } // class Base

    public static class Prefix implements AbstractSyntax.Prefix {
	

	public String toString() {
	    return toString("");
	}

	public String toString(String indent) {
	    return null;
	}
	
    } // class Prefix

    /** Shorthands of IRI prefixes. */
    public static class Name implements AbstractSyntax.Name {

	public String toString() {
	    return toString("");
	}

	public String toString(String indent) {
	    return null;
	}
	
    }

    public static class Import implements AbstractSyntax.Import {

	public String toString() {
	    return toString("");
	}

	public String toString(String indent) {
	    return null;
	}
	
    }

    public static class Group implements AbstractSyntax.Group {   

	public String toString() {
	    return toString("");
	}

	public String toString(String indent) {
	    return null;
	}
	 
    }


    public static class Rule implements AbstractSyntax.Rule {

	public String toString() {
	    return toString("");
	}

	public String toString(String indent) {
	    return null;
	}
	
    }

    public static class Clause implements AbstractSyntax.Clause {

	public String toString() {
	    return toString("");
	}

	public String toString(String indent) {
	    return null;
	}
	
    }

    public static class Implies implements AbstractSyntax.Implies {

	public String toString() {
	    return toString("");
	}

	public String toString(String indent) {
	    return null;
	}
	
    }

    public static class Atomic implements AbstractSyntax.Atomic {

	public String toString() {
	    return toString("");
	}

	public String toString(String indent) {
	    return null;
	}
	
    }


    public static class Head implements AbstractSyntax.Head {

	public String toString() {
	    return toString("");
	}

	public String toString(String indent) {
	    return null;
	}
	
    }
    
    public static class Profile implements AbstractSyntax.Profile {

	public String toString() {
	    return toString("");
	}

	public String toString(String indent) {
	    return null;
	}
	
    }
    
    public static class Formula_And implements AbstractSyntax.Formula_And {

	public String toString() {
	    return toString("");
	}

	public String toString(String indent) {
	    return null;
	}
	
    }
    
    public static class Formula_Or implements AbstractSyntax.Formula_Or {

	public String toString() {
	    return toString("");
	}

	public String toString(String indent) {
	    return null;
	}
	
    }
    
    public static class Formula_Exists implements AbstractSyntax.Formula_Exists {

	public String toString() {
	    return toString("");
	}

	public String toString(String indent) {
	    return null;
	}
	
    }
    
    public static class Formula_External implements AbstractSyntax.Formula_External {

	public String toString() {
	    return toString("");
	}

	public String toString(String indent) {
	    return null;
	}
	
    }
    


    public static class Atom implements AbstractSyntax.Atom {

	public String toString() {
	    return toString("");
	}

	public String toString(String indent) {
	    return null;
	}
	
    }

    public static class Equal implements AbstractSyntax.Equal {

	public String toString() {
	    return toString("");
	}

	public String toString(String indent) {
	    return null;
	}
	
    }
    
    public static class Subclass implements AbstractSyntax.Subclass {

	public String toString() {
	    return toString("");
	}

	public String toString(String indent) {
	    return null;
	}
	
    }
    
    public static class Psoa implements AbstractSyntax.Psoa {

	public String toString() {
	    return toString("");
	}

	public String toString(String indent) {
	    return null;
	}
	
    }
    
    public static class Slot implements AbstractSyntax.Slot {

	public String toString() {
	    return toString("");
	}

	public String toString(String indent) {
	    return null;
	}
	
    }
    
    
    
    public static class Tuple implements AbstractSyntax.Tuple {

	public String toString() {
	    return toString("");
	}

	public String toString(String indent) {
	    return null;
	}
	
    }
    
    
    public static class Term implements AbstractSyntax.Term {

	public String toString() {
	    return toString("");
	}

	public String toString(String indent) {
	    return null;
	}
	
    }
    

    public static class Const_Literal implements AbstractSyntax.Const_Literal {

	public String toString() {
	    return toString("");
	}

	public String toString(String indent) {
	    return null;
	}
	
    }
    
    public static class Const_Constshort implements AbstractSyntax.Const_Constshort {

	public String toString() {
	    return toString("");
	}

	public String toString(String indent) {
	    return null;
	}
	
    }
    

    public static class Var implements AbstractSyntax.Var {

	public String toString() {
	    return toString("");
	}

	public String toString(String indent) {
	    return null;
	}
	
    }
    
    public static class Expr implements AbstractSyntax.Expr {

	public String toString() {
	    return toString("");
	}

	public String toString(String indent) {
	    return null;
	}
	
    }
    
    public static class External implements AbstractSyntax.External {

	public String toString() {
	    return toString("");
	}

	public String toString(String indent) {
	    return null;
	}
	
    }

    //               createX methods:

    /** 
     *  @param base can be null
     *  @param prefixes can be null or empty
     *  @param imports can be null or empty
     *  @param group can be null
     */
    public 
	AbstractSyntax.Document 
	createDocument(AbstractSyntax.Base base,
		       Iterable<AbstractSyntax.Prefix> prefixes,
		       Iterable<AbstractSyntax.Import> imports,
		       AbstractSyntax.Group group) {
	return new Document(base,prefixes,imports,group);
    }

    public AbstractSyntax.Base createBase(String iri) {
	return new Base(iri);
    }

    public AbstractSyntax.Prefix createPrefix(AbstractSyntax.Name name, String iri) {
	return null;
    }

    public AbstractSyntax.Name createName(String name) {
	return null;
    }

    public AbstractSyntax.Import createImport(String iri,AbstractSyntax.Profile profile) {
	return null;
    }
    
    public AbstractSyntax.Group createGroup(Iterable<AbstractSyntax.GroupElement> elements) {
	return null;
    }

    /** 
     *  @param vars can be null or empty
     *  @param matrix nonnull
     */
    public AbstractSyntax.Rule createRule(Iterable<AbstractSyntax.Var> vars,AbstractSyntax.Clause matrix) {
	return null;
    }
    
    public AbstractSyntax.Clause createClause(AbstractSyntax.Implies implication) {
	return null;
    }

    public AbstractSyntax.Clause createClause(AbstractSyntax.Atomic formula) {
	return null;
    }

    /**
     *  @param heads can be null or empty
     *  @param condition nonnull
     */
    public AbstractSyntax.Implies createImplies(Iterable<AbstractSyntax.Head> heads, 
				AbstractSyntax.Formula condition) {
	return null;
    } 
    
    /** Creates a rule head by applying an exitential quantifier
     *  over the given variables to the formula.
     *  @param vars can be null or empty
     *  @param matrix nonnull
     */
    public AbstractSyntax.Head createHead(Iterable<AbstractSyntax.Var> vars,
			   AbstractSyntax.Atomic matrix) {
	return null;
    }

    public AbstractSyntax.Profile createProfile(String iri) {
	return null;
    }

    /** Creates conjunction.
     *  @param formulas can be null or empty
     */
    public AbstractSyntax.Formula_And createFormula_And(Iterable<AbstractSyntax.Formula> formulas) {
	return null;
    }

    /** Creates disjunction.
     *  @param formulas can be null or empty
     */
    public AbstractSyntax.Formula_Or createFormula_Or(Iterable<AbstractSyntax.Formula> formulas) {
	return null;
    }

    
    /** Creates existentially quantified formula.
     *  @param vars nonnull and nonempty
     *  @param matrix nonnull
     */
    public AbstractSyntax.Formula_Exists createFormula_Exists(Iterable<AbstractSyntax.Var> vars,
					       AbstractSyntax.Formula matrix) {
	return null;
    }


    public AbstractSyntax.Formula_External createFormula_External(AbstractSyntax.Atom atom) {
	return null;
    }
    
    public AbstractSyntax.Atom createAtom(AbstractSyntax.Psoa term) {
	return null;
    }

    public AbstractSyntax.Equal createEqual(AbstractSyntax.Term lhs,AbstractSyntax.Term rhs) {
	return null;
    }

    public AbstractSyntax.Subclass createSubclass(AbstractSyntax.Term lhs,AbstractSyntax.Term rhs) {
	return null;
    }

    /**
     *  @param object can be null
     *  @param classTerm can be null
     *  @param tuples can be null or empty {
	return null;
    } element tuples can be null or empty
     *  @param slots can be bull or empty
     */
    public AbstractSyntax.Psoa createPsoa(AbstractSyntax.Term object,
			   AbstractSyntax.Term classTerm,
			   Iterable<AbstractSyntax.Tuple> tuples,
			   Iterable<AbstractSyntax.Slot> slots) {
	return null;
    }

    /**
     *  @param terms can be null or empty
     *  @return possibly null
     */
    public AbstractSyntax.Tuple createTuple(Iterable<AbstractSyntax.Term> terms) {
	return null;
    }

    public AbstractSyntax.Slot createSlot(AbstractSyntax.Term name,AbstractSyntax.Term value) {
	return null;
    }

    public AbstractSyntax.Const_Literal createConst_Literal(String literal,AbstractSyntax.Symspace symspace) {
	return null;
    }

    public AbstractSyntax.Const_Constshort createConst_Constshort(String name) {
	return null;
    }
    
    /**
     *  @param name can be null or "" for anonymous variables. 
     */
    public AbstractSyntax.Var createVar(String name) {
	return null;
    }
    

    /** Temporary plug. What is CURIE? */
    public AbstractSyntax.Symspace createSymspace(String value) {
	return null;
    }



    //            Auxilliary methods:
    
    private static String toStringIfNonNull(AbstractSyntax.Construct obj,
					    String indent,
					    String prefix,
					    String trail) {
	return
	    (obj == null)? "": (prefix + obj.toString(indent) + trail);	
    }

    private 
	static 
	String 
	iterableToStringIfNonEmpty(Iterable<? extends AbstractSyntax.Construct> iterable,
				   String indent,
				   String trail) {
	
	if (iterable == null) return "";
	
	String result = "";
	
	Iterator<? extends AbstractSyntax.Construct> iter = 
	    iterable.iterator();
	
	AbstractSyntax.Construct obj = null;
	
	while (iter.hasNext() && (obj == null))
	    obj = iter.next();
	
	if (obj == null) return ""; 

	result += toStringIfNonNull(obj,indent,"","");
	
	while (iter.hasNext())
	    {
		obj = iter.next();
		if (obj != null)
		    result += toStringIfNonNull(obj,indent,"\n","");		
	    };
	
	return result + trail;

    } // iterableToStringIfNonEmpty(Iterable<? extends AbstractSyntax.Construct iterable,

} // class DefaultAbstractSyntax