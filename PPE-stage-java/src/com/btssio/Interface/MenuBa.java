package com.btssio.Interface;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import com.btssio.controller.Cmenu;

public class MenuBa extends JMenuBar{

		//Menu

	private JMenu m1 = new JMenu("Accueil");
	private JMenu m2 = new JMenu("Eleve");
	private JMenu m3 = new JMenu("Entreprise");

		//MenuItem

	private JMenuItem menuItemListEleve = new JMenuItem("Lister");
	private JMenuItem menuItemEditEleve = new JMenuItem("Editer");
	private JMenuItem menuItemCreateEleve = new JMenuItem("Creer");
	private JMenuItem menuItemListEntr = new JMenuItem("Lister");
	private JMenuItem menuItemEditEntr = new JMenuItem("Editer");
	private JMenuItem menuItemCreateEntr = new JMenuItem("Creer");
	
	public MenuBa() {
		
		//menuItemListEleve.addActionListener(new CMenu());
		//menu.addActionListener(new ClicValiderEditEleve(this));

			//Config Menu, add menuitem and setActionCommand 
			
			//m2

		this.m2.add(menuItemListEleve);
		this.menuItemListEleve.setActionCommand("Liste eleve");
		
		this.m2.add(menuItemEditEleve);
		this.menuItemEditEleve.setActionCommand("Edit eleve");
		

		this.m2.add(menuItemCreateEleve);
		this.menuItemCreateEleve.setActionCommand("Create eleve");
		
		
		//m3
		
		this.m3.add(menuItemListEntr);
		this.menuItemListEntr.setActionCommand("Liste entreprise");
		
		
		this.m3.add(menuItemEditEntr);
		this.menuItemEditEntr.setActionCommand("Edit entreprise");
		
		
		this.m3.add(menuItemCreateEntr);
		this.menuItemCreateEntr.setActionCommand("Create entreprise");
		
		//Menu add action listener

		//m1

		this.m1.addActionListener(this);
		
		//m2

		this.menuItemListEleve.addActionListener(new Cmenu(this));
		this.menuItemEditEleve.addActionListener(new Cmenu(this));
		this.menuItemCreateEleve.addActionListener(new Cmenu(this));

		//m3

		this.menuItemListEntr.addActionListener(new Cmenu(this));
		this.menuItemEditEntr.addActionListener(new Cmenu(this));
		this.menuItemCreateEntr.addActionListener(new Cmenu(this));


			//Ajout label au menu
		this.add(this.m1);
		this.add(this.m2);
		this.add(this.m3);
	}
}
