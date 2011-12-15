.. PSOA-to-TPTP Converter documentation master file, created by
   sphinx-quickstart on Mon Nov  7 10:16:35 2011.
   You can adapt this file completely to your liking, but it should at least
   contain the root `toctree` directive.

Welcome to PSOA2TPTP Tranlator's documentation!
==================================================

.. toctree::
  :maxdepth: 0

  project-proposal/index

Overview
------------

Knowledge representation is a major phase in semantic web applications, and rule language is a main type of formal languages for knowledge representation. PSOA RuleML is an lately developed rule language which combines the ideas of relational(logic-based) and object-oriented(frame-based) modeling. In order to support reasoning on PSOA RuleML, we are implementing a converter to transform PSOA RuleML documents into TPTP format, which is a widely used format for theorem provers. With this converter, reasoning in PSOA RuleML will be available using Vampire prover. In the implementation, we use Antlr3.0 parser generator to create a parser to transform PSOA RuleML documents into an abstract syntax tree. The PSOA syntax tree is then converted into TPTP-FOF syntax by the converter. Finally, TPTP-format documents are generated using existing TPTP parser library.

Files
----------

`Project Document <../latex/PSOA2TPTPTranslator.pdf>`_
`Project Demo <http://dl.dropbox.com/u/46951970/Demo.zip>`_
