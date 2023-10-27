package com.algaworks.erp.controller;

import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

@Named
@SessionScoped
public class GestaoEmpresasBean implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private static Integer NUMERO = 0;
	
	public GestaoEmpresasBean() {
		NUMERO++;
	}
	
	public Integer getNumero() {
		return NUMERO;
	}

}
