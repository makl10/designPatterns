package ui;

import game.Game;

import java.util.Vector;

import javax.swing.table.AbstractTableModel;

public class GameFinderTableModel extends AbstractTableModel
{
	private String[] aColumnNames = { "Name", "Genre", "MetaScore" };
	
	private Vector[] aData = { new Vector<String>(), new Vector<String>(), new Vector<Integer>() };

	@Override
	public int getRowCount() 
	{
		return aData[0].size();
	}

	@Override
	public int getColumnCount() 
	{
		return aColumnNames.length;
	}

	@Override
	public Object getValueAt(int pRowIndex, int pColumnIndex)
	{
		return aData[pColumnIndex].get(pRowIndex);
	}
	
	@Override
	public String getColumnName(int pCol)
	{
		return aColumnNames[pCol];
	}
	
	@Override
	public Class getColumnClass(int pC)
	{
		return getValueAt(0, pC).getClass();
	}
	
	@Override
	public void setValueAt(Object pValue, int pRow, int pCol)
	{
		aData[pCol].set(pRow, pValue);
		
		fireTableDataChanged();
	}
	
	
	/**
	 * @param pGame to be added.
	 * Adds a game to the model.
	 */
	public void addData(Game pGame)
	{
		aData[0].add(pGame.getName());
		aData[1].add(pGame.getGenre());
		aData[2].add(pGame.getMetascore());
	}
	
}
