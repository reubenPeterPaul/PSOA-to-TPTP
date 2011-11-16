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
	public Iterable<AbstractSyntax.Import> getImports() {package org.ruleml.api;

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
	    return indent + "Base(<" + _iri + ">)";  //add newline !!
	}
	
	private String _iri;
	
    } // class Base

    public static class Prefix implements AbstractSyntax.Prefix {
	
	public Prefix(AbstractSystax.Name name, String iri){
		_name = name;
		_iri = iri;
	}
	
	public AbstractSystax.Name getName(){
		return _name;
	}
	
	public String getIRI(){
		return _iri;
	}

	public String toString() {
	    return toString("");
	}

	public String toString(String indent) {
	    return indent + "Prefix(" + _name.toString(indent) + indent + " <" + _iri + ">)" ; //add newline!!!
	}
	
	private AbstractSystax.Name _name;
	private String _iri;	
	
    } // class Prefix

    /** Shorthands of IRI prefixes. */
    public static class Name implements AbstractSyntax.Name {
	
	public Name(String shortIRI){							//confused with parameter type String
		_shortIRI = shortIRI;
	}
	
	public String toString() {
	    return toString("");
	}

	public String toString(String indent) {
	    return indent + _shortIRI;
	} 
	
	private String _shortIRI;
	} // class Name

    public static class Import implements AbstractSyntax.Import {
	
	public Import(String iri, AbstractSyntax.Profile profile){
		_iri = iri;
		_profile = profile;
	}
	
	public String getIRI(){
		return _iri;
	}
	
	public AbstractSyntax.Profile getProfile(){
		return _profile;
	}


	public String toString() {
	    return toString("");
	}

	public String toString(String indent) {
	    String result = indent + "Import(<" + _iri + ">" +
	
		indent + toStringIfNonNull(_profile,indent,"",indent) + " )";  // is this correct !!!!!!!!!!!
		
		return result;
	
	}
	
	private String _iri;
	private AbstractSyntax.Profile _profile;
	
	} // class Import

    public static class Group implements AbstractSyntax.Group {   

	/** @param groupElement may be null */
	public Group(Iterable<? extends AbstractSystax.GroupElement> groupElement){
		_groupElement = new LinkedList<AbstractSyntax.GroupElement>();
		if (groupElement != null)
			for (AbstractSyntax.GroupElement grElement : groupElement)
				_groupElement.addLast(grElement);
	}  
	
	public Collection<? extends AbstractSyntax.GroupElement> getGroupElement(){
		return _groupElement;
	}

	public String toString() {
	    return toString("");
	}

	public String toString(String indent) {
		String result = indent + "Group";
		if (_groupElement.isEmpty())
			return result + " ()";
		result += "\n" + indent + " (\n"; 
		for (AbstractSyntax.GroupElement ge : _groupElement)
			result += indent + "\n" + ge.toString(indent + "  ") + "\n";
		result += "\n" + indent + " )";
	    return result;
	}
	 
	private LinkedList<AbstractSyntax.GroupElement> _groupElement;
	
	} // class Group

	public static class GroupElement implements AbstractSyntax.GroupElement{
	
	public AbstractSyntax.Rule asRule(){
		assert this instanceof AbstractSyntax.Rule;
		return (AbstractSyntax.Rule)_content;
	}
		
	public AbstractSyntax.Group asGroup(){
		assert instanceof AbstractSyntax.Group;
		return (AbstractSyntax.Group)this;
	}
	
	public String toString() {
	    return toString("");
	}
	
	public abstract String toString(String indent);
		
	} // class GroupElement


    public static class Rule implements AbstractSyntax.Rule {
	
	/** @param variables may be null 
	 *  @param matrix must be nonnull 
	 */
	public Rule(Iterable<AbstractSyntax.Var> variables, AbstractSyntax.Clause matrix){
		_variables = new LinkedList<AbstractSyntax.Var>();
		if (variables != null)
		for(AbstractSyntax.Var var : variables)
			_variables.addLast(var);
		_clause = matrix;
	}
	
	public Collection<AbstractSyntax.Var> getVariables(){
		return _variables;
	}
	
	public AbstractSyntax.Caluse getClause(){
		return _clause;
	}

	public String toString() {
	    return toString("");
	}

	public String toString(String indent) {
		Set<AbstractSyntax.Var> vars = getClause().variables();
		if (!vars.isEmpty()){
			String result = indent + "Forall";	
			for (Set<AbstractSyntax.Var> v : vars)
				result += v.toString("") + " ";
			result += "\n" + indent + " (\n" + getClause().toString(indent + "   ") +
						  "\n" + indent + " )";
			return result;
		}
	    else
			return getClause().toString(indent);
	}
	
	private LinkedList<AbstractSyntax.Var> _variables;
	private AbstractSyntax.Caluse _clause;
	
	} //  class Rule

    public static class Clause implements AbstractSyntax.Clause {
		
	public AbstractSyntax.Implies asImplies(){
		assert this instanceof AbstractSyntax.Implies;
		return (AbstractSyntax.Implies)this;
	}
		
	public AbstractSyntax.Atomic asAtomic(){
		assert this instanceof AbstractSyntax.Atomic;
		return (AbstractSyntax.Atomic)this;
	}


	public String toString() {
	    return toString("");
	}
	public abstract String toString(String indent);
/*
	public String toString(String indent) {
		if (isImplies())
			return asImplies().toString(indent);
			
		return asAtomic().toString(indent);
	}
	
	private Object _content;
*/		
	}  // class Clause
	

    public static class Implies implements AbstractSyntax.Implies {

	public Implies(Iterable<? extends AbstractSyntax.Head> head, AbstractSyntax.Formula formula){
		assert head != null;
		assert head.iterator().hasNext();
		_head = new LinkedList();
		for (AbstractSyntax.Head h : head)
			_head.addLast(h);
		_body = body;
	}
	
	public Collection<? extends AbstractSyntax.Head> getHead(){
		return _head;
	}
	
	public AbstractSyntax.Formula getBody(){
		return _body;
	}
	
	/** The set of all free variables. */
	public Set<AbstractSyntax.Var> variables(){
		TreeSet<AbstractSyntax.Var> result = new TreeSet<AbstractSyntax.Var>();
		if (_body != null) result.addAll(_body.variables());
		for (AbstractSyntax.Head h : _head)
			result.addAll(_head.variables());
		return result;
	}

	public String toString() {
	    return toString("");
	}

	public String toString(String indent) {
		String result = "";

		if (_head.size() > 1){
			result += indent + "And\n" + indent + " (\n";
			for (AbstractSyntax.Head h : _head)
				result += "\n" + indent + h.toString(indent + "  ");
		
			result += "\n" + indent + " )";
		}

		else{
			assert _head.size() == 1;
			result += _head.get(0).toString(indent);
		}
		
		if (_body != null){
			result += " :-\n" + _body.toString(indent + "  ");
		}
		
		return result;
	}
	
	private LinkedList<AbstractSyntax.Head> _head;
	private AbstractSyntax.Formula _body;

	} // class Implies


    public static class Atomic implements AbstractSyntax.Atomic {
		
	public boolean isAtom(){
		return _content instanceof AbstractSyntax.Atom;
	}
	
	public AbstractSyntax.Atom asAtom(){
		assert instanceof AbstractSyntax.Atom;
		return (AbstractSyntax.Atom)this; //could be return (AbstractSyntax.Atom)this;
	}
	
	public AbstractSyntax.Equal asEqual(){
		assert this instanceof AbstractSyntax.Equal;
		return (AbstractSyntax.Equal)this;
	}
	
	public AbstractSyntax.Subclass asSubclass(){
		assert this instanceof AbstractSyntax.Subclass;
		return (AbstractSyntax.Subclass)_content;
	}
									
	public abstract Set<AbstractSyntax.Var> variables();


	public String toString() {
	    return toString("");
	}

	public abstract String toString(String indent);
	
    }


    public static class Head implements AbstractSyntax.Head {
	
	public Head(Iterable<AbstractSyntax.Var> variables, AbstractSyntax.Atomic matrix) {
	    _variables = new LinkedList<AbstractSyntax.Var>();
	    if (variables != null)
		for (AbstractSyntax.Var var : variables)	
		    _variables.addLast(var);
	    _atomic = matrix;
	}

	public Collection<AbstractSyntax.Var> getVariables() {
	    return _variables;
	}

	public AbstractSyntax.Atomic getAtomic() {
	    return _atomic;
	}


	public String toString() {
	    return toString("");
	}

	public String toString(String indent) {
	    Set<AbstractSyntax.Var> vars = getAtomic().variables();
	    if (!vars.isEmpty())
		{
		    String result = indent + "Exists ";
		    for (AbstractSyntax.Var v : vars) 
				result += v.toString("") + " ";
		    result += "\n" + indent + " (\n" + 
					  getAtomic().toString(indent + "   ") + 
                      "\n" + indent + " )";
		    return result;
		}
	    else
			return getAtomic().toString(indent);

	} // toStringInPresSyntax(String indent)


	private LinkedList<AbstractSyntax.Var> _variables;	
	private AbstractSyntax.Atomic _atomic;
	
	} // class Head
    

    public static class Profile implements AbstractSyntax.Profile {

	public Profile(String iri){
		_iri = iri;
	}

	public String toString() {
	    return toString("");
	}

	public String toString(String indent) {
	    return indent + " <" + _iri + ">";
	}
	
	private String _iri;
	
	} // class Profile
    


	public static class Formula implements AbstractSyntax.Profile {
		
	public AbstractSyntax.Formula_And asAndFormula() {
	    assert this instanceof Formula_And;
	    return (Formula_And)this;
	}
	
	public AbstractSyntax.Formula_Or asOrFormula() {
	    assert this instanceof Formula_Or;
	    return (Formula_Or)this;
	}

	public AbstractSyntax.Formula_Exists asExistsFormula() {
	    assert this instanceof Formula_Exists;
	    return (Formula_Exists)this;
	}

	public AbstractSyntax.Atomic asAtomic() {
	    assert this instanceof Atomic;
	    return (Atomic)this;
	}
	
	/** <b>pre:</b> <code>this instanceof External</code> */
	public AbstractSyntax.Formula_External asExternalFormula() {
	    assert this instanceof Formula_External;
	    return (Formula_External)this;
	}	

	/** The set of all free variables in the formula. */
	public abstract Set<AbstractSyntax.Var> variables();
	
	public String toString() {
	    return toString("");
	}

	public abstract String toString(String indent);
	
	} // class Formula


    public static class Formula_And implements AbstractSyntax.Formula_And {

	/** @param formulas can be null or an empty sequence */
	public Formula_And(Iterable<? extends AbstractSyntax.Formula> formulas){
		_formulas = new LinkedList<AbstractSyntax.Formula>();
		if(formulas != null)
		for (AbstractSyntax.Formula form : formulas )
			_formulas.addLast(form);
	}
	
	public Collection<? extends AbstractSyntax.Formula> getFormulas(){
		return _formulas;
	}
	
	public Set<AbstractsSyntax.Var> variables(){
		TreeSet<AbstractSyntax.Var> result = new TreeSet<AbstractSyntax.Var>();
		for (AbstractSyntax.Formula f : _formulas)
			result.addAll(f.variables());
		return result;
	}

	public String toString() {
	    return toString("");
	}

	public String toString(String indent) {
	public String toString(String indent) {
		String result = indent + "And\n" + indent + " (";
		// if formulas are empty
//		if (_formulas.isEmpty())
//			return result + ")";

		for (AbstractSyntax.Formula f : formulas)
			result += "\n" + f.toString(indent + "  ");
		result += "\n" + indent + " )";
		return result;
	}
	
	private LinkedList<AbstractSyntax.Formula> _formulas;
	
	} // class Formula_And
    
    public static class Formula_Or implements AbstractSyntax.Formula_Or {

	/** @param formulas can be null or an empty sequence */
	public Formula_Or(Iterable<? extends AbstractSyntax.Formula> formulas){
		_formulas = new LinkedList<AbstractSyntax.Formula>();
		if ( formulas != null)
		for (AbstractSyntax.Formula form : formulas)
			_formulas.addLast(form);
	}
	
	public Collection<? extends AbstractSyntax.Formula> getFormulas(){
		return _formulas;
	}
	
	public Set<AbstractSyntax.Var> variables(){
		TreeSet<AbstractSyntax.Set> result = new TreeSet<AbstractSyntax.Var>();
		for (AbstractSyntax.Formula f : _formulas)
			result.addAll(f.variables());
		return result;
	}

	public String toString() {
	    return toString("");
	}

	public String toString(String indent) {
		String result = indent + "Or\n" + indent + " (";
		// if formulas are empty
//		if (_formulas.isEmpty())
//			return result + ")";

		for (AbstractFormula.Formula f : _formulas)
			result += "\n" + indent + f.toString(indent + "  ");
		result += "\n" + indent + " )";
		return result;
	}
	
	private LinkedList<AbstractSyntax.Formula> _formulas;
	
	} // class Formula_Or
	

	/** @param variables must be nonempty				
	 *  @param matrix			
	 */    
    public static class Formula_Exists implements AbstractSyntax.Formula_Exists {

	public Formula_Exists(Iterable<AbstractSyntax.Var> variables, AbstractSyntax.Formula matrix){
		assert variables != null;
		assert variables.iterator().hasNext();
		_variables = new LinkedList<AbstractSyntax.Var>();
		for (AbstractSyntax.Var var : variables)
			_variables.addLast(var);
			_formula = matrix;
	}
	
	/** @return non-empty sequence */	
	public Collection<AbstractSyntax.Var> getVariables(){
		return _variables;
	}
	
	public AbstractSyntax.Formula getFormula(){
		return _formula;
	}

	/** The set of all free variables in the formula. */	
	public Set<AbstractSyntax.Var> variables(){
		Set<AbstractSyntax.Var> result = _formula.variables();
		result.removeAll(_variables);
		return result;				// returns free variables by removing existentially quantified variables
	}

	public String toString() {
	    return toString("");
	}

	public String toString(String indent) {
		String result = indent + "Exists ";
		for (AbstractSyntax.Var v : _variables)
			result += v.getName() + " ";
		result += "\n" +  indent + " (" + _formula.toString(indent + "  ") + indent + "\n" + indent + " )";
		return result;
	}
	
	private LinkedList<AbstractSyntax.Var> _variables;
	private AbstractSyntax.Formula _formula;
	
	} // class Formula_Exists
    
    public static class Formula_External implements AbstractSyntax.Formula_External {

	public Formula_External(AbstractSyntax.Atom atom){
		_atom = atom;
	}
	
	public AbstractSyntax.Atom getContent(){
		return _atom;
	}

	public Set<AbstractSyntax.Var> variables(){
		return _atom.variables();
	}

	public String toString() {
	    return toString("");
	}

	public String toString(String indent) {
	    return indent + "External( "+  _atom.toString(indent) + ")";
	}
	
	private AbstractSyntax.Atom _atom;

	} // class Formula_External
    


    public static class Atom implements AbstractSyntax.Atom {

	public Atom(AbstractSyntax.Psoa term){
		_term = term;
	}
	
	public AbstractSyntax.Psoa getPsoa(){
		return _term;
	}
	
	public Set<AbstractSyntax.Var> variables(){
		return _term.variables();
	}	

	public String toString() {
	    return toString("");
	}

	public String toString(String indent) {
		return indent + _term.toString(indent);
	}

	private AbstractSyntax.Psoa _term;
		
	} // class Atom


    public static class Equal implements AbstractSyntax.Equal {

	/** @param lhs must be nonnull
	 *  @param rhs must be nonnull
	 */
	public Equal(AbstractsSyntax.Term lhs, AbstractSyntax.Term rhs){
		assert lhs  != null;
		assert rhs != null;
		_lhs = lhs;
		_rhs = rhs;
	}
	
	public AbstractSyntax.Term getLeft(){
		return _lhs;
	}
	
	public AbstractSyntax.Term getRight(){
		return _rhs;
	}
	
	public Set<AbstractSyntax.Var> variables(){
		Set<AbstractSyntax.Var> result = _lhs.variables();
		result.allAll(_rhs.variables());
		return result;
	}

	public String toString() {
	    return toString("");
	}

	public String toString(String indent) {
		return indent + _lhs.toString("") + " = " + _rhs.toString("");
	}
	
	private AbstractSyntax.Term _lhs;
	private AbstractSyntax.Term _rhs;
	
	} // class Equal
	
	
    
    public static class Subclass implements AbstractSyntax.Subclass {

	/** @param lhs must be nonnull
	 *  @param rhs must be nonnull
	 */
	public Subclass(AbstractSyntax.Term lhs, AbstractSyntax.Term rhs){
		assert lhs != null;
		assert rhs != null;
		_lhs = lhs;
		_rhs = rhs;
	}
	
	public AbstractSyntax.Term getSubclass(){
		return _lhs;
	}
	
	public AbstractSyntax.Term getSuperclass(){
		return _rhs;
	}
	
	public Set<AbstractSyntax.Var> variables(){
		Set<AbstractSyntax.Var> result = _lhs.variables();
		result.addAll(_rhs.variables());
		return result;
	}

	public String toString() {
	    return toString("");
	}

	public String toString(String indent) {
		String result = indent + _lhs.toString("") + " ## " + _rhs.toString("");
		return result;
	}
	
	private AbstractSyntax.Term _lhs;
	private AbstractSyntax.Term _rhs;
	
	} // class Subclass
    
    public static class Psoa implements AbstractSyntax.Psoa {
	
	public Psoa(AbstractSyntax.Term object, AbstractSyntax.Term classTerm,
				Iterable<AbstractSyntax.Tuple> tuples,
				Iterable<AbstractSyntax.Slot> slots){	
					assert object != null;
					assert classTerm != null;
					_object = instance;
					_classTerm = classTerm;
					
					_tuples = new LinkedList<AbstractSyntax.Tuple>();
	    			if (tuples != null)
						for (AbstractSyntax.Tuple tup : tuples)	
		    			_tuples.addLast(tup);

					_slots = new LinkedList<AbstractSyntax.Slot>();
	    			if (slots != null)
						for (AbstractSyntax.Slot slot : slots)	
		    			_slots.addLast(slot);

				}

	public AbstractSyntax.Term getInstance(){
		return _object;
	}
  
	public AbstractSyntax.Term getClassExpr(){
		return _classTerm;
	}
  
	public AbstractSyntax.Tuple getPositionalAtom(){
		return _tuples;
	}
	
	public AbstractSyntax.Slot getSlottedAtom(){
		return _slots;
	}
	
	public Set<AbstractSyntax.Var> variables(){
		HashSet<AbstractSyntax.Var> result = new HashSet<AbstractSyntax.Var>();
//		Set<AbstractSyntax.Var> result = _instance.variables();
//		result = _instance.variables();
		result.addAll(_object.variables());
		result.addAll(_classTerm.variables());
	    
	    if (_tuples != null)
		for (AbstractSyntax.Tuple tp : _tuples)
		    result.addAll(tp.variables());

	    if (_slots != null)
		for (AbstractSyntax.Slot sl : _slots)
		    result.addAll(sl.variables());
		
//		result.addAll(_positionalatom.variables());
//		result.addAll(_slottedatom.variables());
		return result;
	}
	

	public String toString() {
	    return toString("");
	}

	public String toString(String indent) {
	    String result = indent + _object.toString("") + " # " + _classTerm.toString("") + indent + " (";

		result += iterableToStringIfNonEmpty(_tuples,indent,"" + indent + "") +
				  iterableToStringIfNonEmpty(_slots,indent,"" + indent + "") + 
				  ")";

		return result;
	}
	
	private AbstractSyntax.Term _object;
	private AbstractSyntax.Term _classTerm;
	private LinkedList<AbstractSyntax.Tuple> _tuples;
	private LinkedList<AbstractSyntax.Slot> _slots;
	
	} // class Psoa
    


    public static class Slot implements AbstractSyntax.Slot {

	public Slot(AbstractSyntax.Term name, AbstractSyntax.Term value){
		assert name != null;
		assert value != null;
		_name = name;
		_value = value;
	}
	
	public AbstractSyntax.Term getName(){
		return _name;
	}
	
	public AbstractSyntax.Term getValue(){
		return _value;
	}
	
	//compareTo method in rif bld !! why!!
	
	public Set<AbstractSyntax.Var> variables(){
		Set<AbstractSyntax.Var> result = _name.variables();
	    result.addAll(_value.variables());
	    return result;
	}

	public String toString() {
	    return toString("");
	}

	public String toString(String indent) {
	    String result = indent + _name.toString(indent) + " -> " + _value.toString(indent);
		return result;
	}
	
	private AbstractSyntax.Term _name;
	private AbstractSyntax.Term _value;
	
	} // class Slot
    
    
    
    public static class Tuple implements AbstractSyntax.Tuple {

	public Tuple(Iterable<? extends AbstractSyntax.Term> terms){
		_terms = new LinkedList<AbstractSyntax.Term>();
	    if (terms != null)
			for (AbstractSyntax.Term term : terms)	
		    	_terms.addLast(term);
	}

	public Collection<? extends AbstractSyntax.Term> getArguments(){
		return _terms;
	}
	
	public Set<AbstractSyntax.Var> variables(){
		TreeSet<AbstractSyntax.Var> result = new TreeSet<AbstractSyntax.Var>();
	    for (AbstractSyntax.Term tm : _terms)
			result.addAll(tm.variables());
	    return result;

	}

	public String toString() {
	    return toString("");
	}

	public String toString(String indent) {
	    String result = indent + " [ ";
		
		for (AbstractSyntax.Term t : _terms)
			result += t.toString("") + " ";

	    return result + ")";

	}
	
	private LinkedList<AbstractSyntax.Term> _terms;
	
	} // class Tuple
    
    
    public static class Term implements AbstractSyntax.Term {

	public AbstractSyntax.Const asConst() {
	    return (AbstractSyntax.Const)this;
	}
			
	public AbstractSyntax.asVar(){
		return (AbstractSyntax.Var)this;
	}
	
	public AbstractSyntax.asExpr(){
		return (AbstractSyntax.Expr)this;
	}
	
	public AbstractSyntax.asExternal(){
		return (AbstractSyntax.External)this;
	}

	public abstract Set<AbstractSyntax.Var> variables();
	
//	public Set<AbstractSyntax.Var> variables(){
//		return _content.variables();
//	}

	public String toString() {
	    return toString("");
	}

//	public String toString(String indent) {
//	    return null;
//	}
	public abstract String toString(String indent);
	
	} // class Term
    
	public static class Const implements AbstractSyntax.Const{
		
	public AbstractSyntax.Const_Literal asConstLiteral(){
		assert this instanceof AbstractSyntax.Const_Literal;
		return (AbstractSyntax.Const_Literal)this;
	}

	public AbstractSyntax.Const_Constshort asConstshort(){
		assert this instanceof AbstractSyntax.Const_Constshort;
		return (AbstractSyntax.Const_Constshort)this;
	}

	public abstract Set<AbstractSyntax.Var> variables();
		
	public String toString() {
	    return toString("");
	}

	public abstract String toString(String indent);

	} // Class Const

    public static class Const_Literal implements AbstractSyntax.Const_Literal {

	public Const_Literal(String literal, AbstractSyntax.Symspace symspace){
		assert literal != null;	// is this right here without implementing Const interface !!
		_literal = literal;
		_symspace = symspace;
	}

	public getLiteral(){
		return _literal;
	}

	public AbstractSyntax.Symspace getSymspace(){
		return _symspace;
	}
	public Set<AbstractSyntax.Var> variables(){
		reutrn new TreeSet<AbstractSyntax.Var>();	// not sure about it
	}

	public String toString() {
	    return toString("");
	}

	public String toString(String indent) {
		return indent + "\"" + _literal + "\"" + "^^" + _symspace.toString(indent);
	}

	private String _literal;
	private AbstractSyntax.Symspace _symspace;	
	
    }
    
    public static class Const_Constshort implements AbstractSyntax.Const_Constshort {
	
	public Const_Constshort(String name){
		_name = name;		
	}
	
	public String getConstshort(){
		return _name;
	}

	public Set<AbstractSyntax.Var> variables(){
		reutrn new TreeSet<AbstractSyntax.Var>();	// not sure about it
	}	

	public String toString() {
	    return toString("");
	}

	public String toString(String indent) {
	    return indent + _name;
	}
	
	private String _name;
	
	} // class Const_Constshort
    

    public static class Var implements AbstractSyntax.Var {

	public Var(String name){
		assert name != null;
		_name = name;
	}
	
	public String getName(){
		return _name;
	}
		
	public Set<AbstractSyntax.Var> variables() {
	    TreeSet<AbstractSyntax.Var> result = new TreeSet<AbstractSyntax.Var>();
	    result.add(this);
	    return result;
	}

	public String toString() {
	    return toString("");
	}

	public String toString(String indent) {
		return indent + "?" + _name;
	}
	
	private String _name;
		
	} // class Var


    public static class Symspace implements AbstractSyntax.Symspace {
	
	public Symspace(String value){
		_value = value;
	}
	
	public String getValue(){
		return _value;
	}
	
	public Set<Var> variables(){
		reutrn new TreeSet<AbstractSyntax.Var>();	// not sure about it
	}

	public String toString() {
	    return toString("");
	}

	public String toString(String indent) {
	    return indent + _value;
	}
	
	private String _value;
	
	} // class Symspace



    
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
	return new Prefix(name,iri);
    }

    public AbstractSyntax.Name createName(String name) {
	return new Name(name);
    }

    public AbstractSyntax.Import createImport(String iri,AbstractSyntax.Profile profile) {
	return new Import(iri,profile);
    }
    
    public AbstractSyntax.Group createGroup(Iterable<AbstractSyntax.GroupElement> elements) {
	return new Group(elements);
    }

    /** 
     *  @param vars can be null or empty
     *  @param matrix nonnull
     */
    public AbstractSyntax.Rule createRule(Iterable<AbstractSyntax.Var> vars,AbstractSyntax.Clause matrix) {
	return new Rule(vars,matrix);
    }
    
    public AbstractSyntax.Clause createClause(AbstractSyntax.Implies implication) {
	return new Clause(implication);
    }

    public AbstractSyntax.Clause createClause(AbstractSyntax.Atomic formula) {
	return new Clause(formula);
    }

    /**
     *  @param heads can be null or empty
     *  @param condition nonnull
     */
    public AbstractSyntax.Implies createImplies(Iterable<AbstractSyntax.Head> heads, 
				AbstractSyntax.Formula condition) {
	return new Implies(heads,condition);
    } 
    
    /** Creates a rule head by applying an exitential quantifier
     *  over the given variables to the formula.
     *  @param vars can be null or empty
     *  @param matrix nonnull
     */
    public AbstractSyntax.Head createHead(Iterable<AbstractSyntax.Var> vars,
			   AbstractSyntax.Atomic matrix) {
	return new Head(vars,matrix);
    }

    public AbstractSyntax.Profile createProfile(String iri) {
	return new Profile(iri);
    }

    /** Creates conjunction.
     *  @param formulas can be null or empty
     */
    public AbstractSyntax.Formula_And createFormula_And(Iterable<AbstractSyntax.Formula> formulas) {
	return new Formula_And(formulas);
    }

    /** Creates disjunction.
     *  @param formulas can be null or empty
     */
    public AbstractSyntax.Formula_Or createFormula_Or(Iterable<AbstractSyntax.Formula> formulas) {
	return new Formula_Or(formulas);
    }

    
    /** Creates existentially quantified formula.
     *  @param vars nonnull and nonempty
     *  @param matrix nonnull
     */
    public AbstractSyntax.Formula_Exists createFormula_Exists(Iterable<AbstractSyntax.Var> vars,
					       AbstractSyntax.Formula matrix) {
	return Formula_Exists(vars,matrix);
    }


    public AbstractSyntax.Formula_External createFormula_External(AbstractSyntax.Atom atom) {
	return new Formula_External(atom);
    }
    
    public AbstractSyntax.Atom createAtom(AbstractSyntax.Psoa term) {
	return new Atom(term);
    }

    public AbstractSyntax.Equal createEqual(AbstractSyntax.Term lhs,AbstractSyntax.Term rhs) {
	return new Equal(lhs,rhs);
    }

    public AbstractSyntax.Subclass createSubclass(AbstractSyntax.Term lhs,AbstractSyntax.Term rhs) {
	return new Subclass(lhs,rhs);
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
	return new Psoa(object,classTerm,tuples,slots);
    }

    /**
     *  @param terms can be null or empty
     *  @return possibly null
     */
    public AbstractSyntax.Tuple createTuple(Iterable<AbstractSyntax.Term> terms) {
	return new Tuple(terms);
    }

    public AbstractSyntax.Slot createSlot(AbstractSyntax.Term name,AbstractSyntax.Term value) {
	return new Slot(name,value);
    }

    public AbstractSyntax.Const_Literal createConst_Literal(String literal,AbstractSyntax.Symspace symspace) {
	return new Const_Literal(literal,symspace);
    }

    public AbstractSyntax.Const_Constshort createConst_Constshort(String name) {
	return new Const_Constshort(name);
    }
    
    /**
     *  @param name can be null or "" for anonymous variables. 
     */
    public AbstractSyntax.Var createVar(String name) {
	return new Var(name);
    }
    

    /** Temporary plug. What is CURIE? */
    public AbstractSyntax.Symspace createSymspace(String value) {
	return new Symspace(value);
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