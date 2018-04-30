package com.btssio.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.btssio.Interface.Stagiaire;

public class ControlBtnAjoutStagiaire implements ActionListener
{
	Stagiaire stagiaire;
	
	public ControlBtnAjoutStagiaire(Stagiaire leStagiaire)
	{
		this.stagiaire = leStagiaire;
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) 
	{
		//ajout du nouveau stagiaire
	}
}
