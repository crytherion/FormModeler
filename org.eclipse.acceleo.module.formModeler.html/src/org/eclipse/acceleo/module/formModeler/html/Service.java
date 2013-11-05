package org.eclipse.acceleo.module.formModeler.html;

public class Service {
	private Integer ligne = 0;
	
	public Integer getLigne(Integer contexte) {
		return ligne;
	}
	
	public void setLigne(Integer contexte, Integer ligne) {
		this.ligne = ligne;
	}
}
