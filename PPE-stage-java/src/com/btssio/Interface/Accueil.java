package com.btssio.Interface;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Accueil extends JPanel{
	
		//Composant
	private JLabel l1 = new JLabel("Bienvenue sur l'interface d'utilisation de Gestion de Stage");
	private JButton b1 = new JButton("Gestion des Elèves");
	private JButton b2 = new JButton("Gestion des Entreprises");
	//private JTextField texte = new JTextField("Entrez qlqc");
	//private JComboBox<String> combo = new JComboBox<String>();

	public Accueil() {
		//Ajout de données dans combobox
		//combo.addItem("La vie");
		//combo.addItem("La mort");
		
		//Ajout des composants dans le conteneur
		this.add(l1);
		this.add(b1);
		this.add(b2);
		//this.add(texte);
		//this.add(combo);
	}
}
