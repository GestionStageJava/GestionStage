package com.btssio.Interface;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MenuBa extends JMenuBar{
		//Menu
	private JMenu m1 = new JMenu();
	private JMenu m2 = new JMenu();
	private JMenu m3 = new JMenu();
	private JMenuItem miel = new JMenuItem("Lister");
	private JMenuItem miee = new JMenuItem("Editer");
	private JMenuItem miec = new JMenuItem("Creer");
	private JMenuItem mientl = new JMenuItem("Lister");
	private JMenuItem miente = new JMenuItem("Editer");
	private JMenuItem mientc = new JMenuItem("Creer");
	
	public MenuBa() {
			//Config Menu
			//m1
		this.m1.setText("Accueil");
			//m2
		this.m2.setText("Eleve");
		this.m2.add(miel);
		this.m2.add(miee);
		this.m2.add(miec);
			//m3
		this.m3.setText("Entreprise");
		this.m3.add(mientl);
		this.m3.add(miente);
		this.m3.add(mientc);
			//Ajout label au menu
		this.add(this.m1);
		this.add(this.m2);
		this.add(this.m3);
	}
}
