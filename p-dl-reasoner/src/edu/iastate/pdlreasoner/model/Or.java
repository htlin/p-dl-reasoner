package edu.iastate.pdlreasoner.model;

public class Or extends SetOp {

	protected Or(Concept[] concepts) {
		super(concepts);
	}

	@Override
	public void accept(ConceptVisitor visitor) {
		visitor.visit(this);
	}

	@Override
	public boolean equals(Object obj) {
		return (obj instanceof Or) && super.equals(obj);
	}

	@Override
	public int hashCode() {
		return ~super.hashCode();
	}
	
}