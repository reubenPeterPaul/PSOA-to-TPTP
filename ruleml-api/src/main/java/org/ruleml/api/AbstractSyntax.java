package org.ruleml.api;


/** Instances of this interface are factories for abstract syntax objects;
 *  the nested interfaces represent various abstract syntax constructs.
 */
public interface AbstractSyntax {

	/** Common interface for all abstract syntax constructs. */
	public interface Construct {

		/** Renders the object in the presentation syntax.
		 *  @return toString("")
		 */
		public String toString();

		/** Renders the object in the presentation syntax with 
		 *  the specified base indentation. 
		 */
		public String toString(String indent);

	} // interface Construcrt

	public interface Document extends Construct {

		/** @return possibly null */
		public Base getBase();

		/** @return possibly null or empty */
		public Iterable<Prefix> getPrefixes();

		/** @return possibly null or empty */
		public Iterable<Import> getImports(); 

		/** @return possibly null */
		public Group getGroup();

	} // interface Document


	public interface Base extends Construct {

		public String getIRI();

	}

	public interface Prefix extends Construct {
	}

	/** Shorthands of IRI prefixes. */
	public interface Name extends Construct {
	}

	public interface Import extends Construct {
	}

	public interface Group extends GroupElement {
	}

	/** Common base for Group and Rule. */
	public interface GroupElement extends Construct {
	}

	public interface Rule extends GroupElement {
	}

	public interface Clause extends Construct {
	}

	public interface Implies extends Construct {
	}

	public interface Atomic extends Formula {
	}


	public interface Head extends Construct {
	}

	public interface Profile extends Construct {
	}

	public interface Formula extends Construct {
	}

	public interface Formula_And extends Formula {
	}

	public interface Formula_Or extends Formula {
	}

	public interface Formula_Exists extends Formula {
	}

	public interface Formula_External extends Formula {
	}



	public interface Atom extends Atomic {
	}

	public interface Equal extends Atomic {
	}

	public interface Subclass extends Atomic {
	}

	public interface Psoa extends Expr {
	}

	public interface Slot extends Construct {
	}



	public interface Tuple extends Construct {
	}


	public interface Term extends Construct {
	}


	public interface Const extends Term {
	}

	public interface Const_Literal extends Const {
	}

	public interface Const_Constshort extends Const {
	}


	public interface Var extends Term {
	}

	public interface Expr extends Term {
	}

	public interface External extends Term {
	}

	public interface Symspace extends Construct {
	}

	//               createX methods:

		/** 
		 *  @param base can be null
		 *  @param prefixes can be null or empty
		 *  @param imports can be null or empty
		 *  @param group can be null
		 */
		 public Document createDocument(Base base,
				 Iterable<Prefix> prefixes,
				 Iterable<Import> imports,
				 Group group);

		 public Base createBase(String iri);

		 public Prefix createPrefix(Name name, String iri);

		 public Name createName(String name);

		 public Import createImport(String iri,Profile profile);

		 public Group createGroup(Iterable<GroupElement> elements);

		 /** 
		  *  @param vars can be null or empty
		  *  @param matrix nonnull
		  */
		 public Rule createRule(Iterable<Var> vars,Clause matrix);

		 public Clause createClause(Implies implication);

		 public Clause createClause(Atomic formula);

		 /**
		  *  @param heads can be null or empty
		  *  @param condition nonnull
		  */
		 public Implies createImplies(Iterable<Head> heads, 
				 Formula condition); 

		 /** Creates a rule head by applying an exitential quantifier
		  *  over the given variables to the formula.
		  *  @param vars can be null or empty
		  *  @param matrix nonnull
		  */
		 public Head createHead(Iterable<Var> vars,
				 Atomic matrix);

		 public Profile createProfile(String iri);

		 /** Creates conjunction.
		  *  @param formulas can be null or empty
		  */
		 public Formula_And createFormula_And(Iterable<Formula> formulas);

		 /** Creates disjunction.
		  *  @param formulas can be null or empty
		  */
		 public Formula_Or createFormula_Or(Iterable<Formula> formulas);


		 /** Creates existentially quantified formula.
		  *  @param vars nonnull and nonempty
		  *  @param matrix nonnull
		  */
		 public Formula_Exists createFormula_Exists(Iterable<Var> vars,
				 Formula matrix);


		 public Formula_External createFormula_External(Atom atom);

		 public Atom createAtom(Psoa term);

		 public Equal createEqual(Term lhs,Term rhs);

		 public Subclass createSubclass(Term lhs,Term rhs);

		 /**
		  *  @param object can be null
		  *  @param classTerm can be null
		  *  @param tuples can be null or empty; element tuples can be null or empty
		  *  @param slots can be bull or empty
		  */
		 public Psoa createPsoa(Term object,
				 Term classTerm,
				 Iterable<Tuple> tuples,
				 Iterable<Slot> slots);

		 /**
		  *  @param terms can be null or empty
		  *  @return possibly null
		  */
		 public Tuple createTuple(Iterable<Term> terms);

		 public Slot createSlot(Term name,Term value);

		 public Const_Literal createConst_Literal(String literal,Symspace symspace);

		 public Const_Constshort createConst_Constshort(String name);

		 /**
		  *  @param name can be null or "" for anonymous variables. 
		  */
		 public Var createVar(String name);

		 /** Temporary plug. What is CURIE? */
		 public Symspace createSymspace(String value);


} // interface AbstractSyntax