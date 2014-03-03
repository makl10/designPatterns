package ui;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JComboBox;
import javax.swing.JPanel;

/**
 * @author Marc
 * This is the view panel, it holds the comboBox to select different panels to be displayed. It takes care of creating and managing these panels as well as all cross panel calls.
 *
 */
public class ViewPanel extends JPanel implements ItemListener
{
	private JPanel aCards;
	
	final static String GAMEFINDERPANEL = "Game Finder";
	
	/**
	 * Simple constructor.
	 */
	public ViewPanel()
	{
		createViewPanel();
	}
	
	/**
	 *  Creates the card panel and the various other panels which will populate the card panel.
	 */
	public void createViewPanel()
	{
//		Set the layout
		this.setLayout(new BorderLayout());
		
//		Create the comboBox and the various items associated with it.
		JPanel comboBoxPane = new JPanel();
		String[] comboBoxItemns = { GAMEFINDERPANEL };
		JComboBox cb = new JComboBox(comboBoxItemns);
		cb.setEditable(false);
		cb.addItemListener(this);
		comboBoxPane.add(cb);
		
//		The Game finder panel.
		final GameFinderPanel aGameFinderPanel = new GameFinderPanel();
		
//		Initiates the cards and adds the various panels.
		aCards = new JPanel(new CardLayout());
		aCards.add(aGameFinderPanel, GAMEFINDERPANEL);
		
		add(comboBoxPane, BorderLayout.PAGE_START);
		add(aCards, BorderLayout.CENTER);
	}

	@Override
	public void itemStateChanged(ItemEvent pEvent)
	{
		CardLayout cl = (CardLayout) (aCards.getLayout());
		cl.show(aCards, (String) pEvent.getItem());
	}
}
