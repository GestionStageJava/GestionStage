package com.btssio.Interface;

import java.awt.Component;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JPanel;

public class MenuFen extends JFrame {
	
	//Déclaration des variables
	private String title;
	private int height;
	private int width;
	private boolean resize;
	private Component relative;
	
	private JPanel conteneur = new EditEleve(); // Pour les tests, chnger le nom de la classinterface à afficher
	
		//Menu
	private JMenuBar menu = new MenuBa();
	
	//Constructeur de la fenêtre
	public MenuFen(String t, int h, int w, boolean res, Component rel){
		//Affectation 
		this.title = t;
		this.height = h;
		this.width = w;
		this.resize = res;
		this.relative = rel;
		
		//Definition des paramètres de la fenêtre
		setTitle(title);
		setSize(h,w);
		setResizable(res);
		setLocationRelativeTo(rel);
		
		setContentPane(conteneur);
		setJMenuBar(this.menu);
	}
}
