package com.btssio.Interface;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MenuBa extends JMenuBar{
		//Menu
	private JMenu m1 = new JMenu();
	private JMenu m2 = new JMenu();
	private JMenu m3 = new JMenu();
	private JMenuItem menuItemListEleve = new JMenuItem("Lister");
	private JMenuItem menuItemEditEleve = new JMenuItem("Editer");
	private JMenuItem menuItemCreateEleve = new JMenuItem("Creer");
	private JMenuItem menuItemListEntr = new JMenuItem("Lister");
	private JMenuItem menuItemEditEntr = new JMenuItem("Editer");
	private JMenuItem menuItemCreateEntr = new JMenuItem("Creer");
	
	public MenuBa() {
		
		//menuItemListEleve.addActionListener(new Class());
		//menu.addActionListener(new ClicValiderEditEleve(this));
			//Config Menu
			//m1
		this.m1.setText("Accueil");
			//m2
		this.m2.setText("Eleve");
		this.m2.add(menuItemListEleve);
		this.m2.add(menuItemEditEleve);
		this.m2.add(menuItemCreateEleve);
			//m3
		this.m3.setText("Entreprise");
		this.m3.add(menuItemListEntr);
		this.m3.add(menuItemEditEntr);
		this.m3.add(menuItemCreateEntr);
			//Ajout label au menu
		this.add(this.m1);
		this.add(this.m2);
		this.add(this.m3);
	}
}
