package com.btssio.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControlBtnAnnulerEditEntreprise implements ActionListener
{
	EditEntreprise dialogEditEntreprise;
	
	public ControlBtnAnnulerEditEntreprise(EditEntreprise dialog)
	{
		this.dialogEditEntreprise = dialog;
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		// retour à l'affichage des entreprises
	}
}
