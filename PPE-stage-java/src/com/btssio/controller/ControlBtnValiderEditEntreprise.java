package com.btssio.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ControlBtnValiderEditEntreprise implements ActionListener 
{
	EditEntreprise dialogEditEntreprise;
	
	public ControlBtnValiderEditEntreprise(EditEntreprise dialog)
	{
		this.dialogEditEntreprise = dialog;
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) 
	{
		//recuperation des infos du "formulaire"
		//met à jour Entreprise
	}
}
