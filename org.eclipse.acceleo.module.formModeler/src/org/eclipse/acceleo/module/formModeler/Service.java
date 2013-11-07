package org.eclipse.acceleo.module.formModeler;


public class Service {
	private Integer ligne = 0;
	
	public Integer getLigne(String contexte) {
		return ligne;
	}
	
	public void setLigne(String contexte, Integer ligne) {
		this.ligne = ligne;
	}
}
