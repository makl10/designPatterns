package ui;

import game.Game;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import arriba.Arriba;
import arriba.GameCatalogue;

public class GameFinderPanel extends JPanel implements ListSelectionListener
{
	private JTable aTable;
	private final GameFinderTableModel aModel;
	
	public GameFinderPanel()
	{
		super();
		setLayout(new BorderLayout());
		
		aModel = new GameFinderTableModel();
		
		GameCatalogue catalogue = Arriba.getInstance().getGameCatalogue();
		
		for(Game game : catalogue)
		{
			aModel.addData(game);
		}
		
		aTable = new JTable(aModel);
		
        aTable.setPreferredScrollableViewportSize(new Dimension(800, 600));
        aTable.setFillsViewportHeight(true);
        
        //For the purposes of this example, better to have a single
        //selection.
        aTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        aTable.getSelectionModel().addListSelectionListener(this);
             
 
        //Create the scroll pane and add the table to it.
        JScrollPane scrollPane = new JScrollPane(aTable);
 
        //Add the scroll pane to this panel.
        add(scrollPane, BorderLayout.CENTER);
	}

	@Override
	public void valueChanged(ListSelectionEvent e) 
	{
		// TODO Auto-generated method stub
		
	}
}
