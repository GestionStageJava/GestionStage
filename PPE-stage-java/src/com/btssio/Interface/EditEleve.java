package com.btssio.Interface;

import java.awt.LayoutManager;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class EditEleve extends JPanel{
	
	private JTextField jt1 = new JTextField("Nom");
	private JTextField jt2 = new JTextField("Prenom");
	private JTextField jt3 = new JTextField("Addresse");
	private JTextField jt4 = new JTextField("Lieu du Stage");
	private JTextField jt5 = new JTextField("Date du Satge");
	
	private JButton valid = new JButton("Valider");
	private JButton cancel = new JButton("Annuler");
	
	public EditEleve() {
		this.add(jt1);
		this.add(jt2);
		this.add(jt3);
		this.add(jt4);
		this.add(jt5);
		
		//valid.addActionListener(new ClicValiderEditEleve(this));
		//annuler...
		
		this.add(valid);
		this.add(cancel);
	}

}
