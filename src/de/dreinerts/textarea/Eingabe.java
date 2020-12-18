package de.dreinerts.textarea;

import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class Eingabe implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Eingabe() {
		// TODO Auto-generated constructor stub
	}

	public String getStrText() {
		return strText;
	}

	public void setStrText(String strText) {
		this.strText = strText;
	}

	private String strText;
	
}
