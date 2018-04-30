package com.btssio.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.btssio.Interface.ListStagiaire;

public class ControlBtnGestionStagiaireAccueil implements ActionListener
{
	ListStagiaire dialogListEleve;
	
	public ControlBtnGestionStagiaireAccueil(ListStagiaire dialog) 
	{
		this.dialogListEleve = dialog;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		//afficher la liste des stagiaires
		this.dialogListEleve = new ListStagiaire();
	}

}
