package com.btssio.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.btssio.Interface.EditStagiaire;

public class ControlBtnValiderEditStagiaire implements ActionListener 
{
	EditStagiaire dialogEditStagiaire;
	
	public ControlBtnValiderEditStagiaire(EditStagiaire dialog)
	{
		this.dialogEditStagiaire = dialog;
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) 
	{
		//recuperation des infos du "formulaire"
		//met à jour Stagiaire
	}
}
