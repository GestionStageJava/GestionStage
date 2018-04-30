package com.btssio.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.btssio.Interface.Stagiaire;

public class ControlBtnSupprStagiaire implements ActionListener
{
	Stagiaire dialogStagiaire;
	
	public ControlBtnSupprStagiaire(Stagiaire dialog) 
	{
		// TODO Auto-generated constructor stub
		this.dialogStagiaire = dialog;
	}	

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		//supprime le stagiaire
	}
	
}
