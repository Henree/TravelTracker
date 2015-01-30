package ca.ualberta.cs.traveltracker;

import java.util.ArrayList;
import java.util.Collection;

public class ExpenseList 
{
	
	protected ArrayList<Expenses> expenseList;
	
	public ExpenseList()
	{
		expenseList = new ArrayList<Expenses>();
	}
	
	public Collection<Expenses> getExpense()
	{
		return expenseList;
	}
	
	public void addExpense(Expenses expense)
	{
		expenseList.add(expense);
	}
	
	public void deleteExpense(Expenses expense)
	{
		expenseList.remove(expense);
	}
}
