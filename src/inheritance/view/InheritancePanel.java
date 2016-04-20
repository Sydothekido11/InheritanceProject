package inheritance.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import inheritance.controller.InheritanceController;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SpringLayout;

public class InheritancePanel extends JPanel
{

	private InheritanceController baseController;
	private SpringLayout baseLayout;
	
	private JTextArea chatTextViewer;
	private JButton sortButton;
	
	private InheritanceFrame baseFrame;
	
	public InheritancePanel(InheritanceController baseController)
	{
		baseLayout = new SpringLayout();
		this.baseController = baseController;
		
		chatTextViewer = new JTextArea(10, 25);
		sortButton = new JButton();
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.add(chatTextViewer);
		this.add(sortButton);
		chatTextViewer.setText(baseController.showFoodLevels());
	}
	
	private void setupLayout()
	{
		
	}
	
	private void setupListeners()
	{
		sortButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				baseController.insertionSort();
				
				chatTextViewer.setText(baseController.showFoodLevels());
			}
			
			
		});
	}
}
