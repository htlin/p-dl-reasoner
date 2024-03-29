package edu.iastate.pdlreasoner.model;

import java.net.URI;

public class DLPackage {
	
	private URI m_URI;

	protected DLPackage(URI uri) {
		m_URI = uri;
	}
	
	public URI getURI() {
		return m_URI;
	}
	
	@Override
	public String toString() {
		return m_URI.toString();
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof DLPackage)) return false;
		DLPackage other = (DLPackage) obj;
		return m_URI.equals(other.m_URI);
	}
	
	@Override
	public int hashCode() {
		return m_URI.hashCode();
	}
	
}
