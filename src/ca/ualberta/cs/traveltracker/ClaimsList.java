package ca.ualberta.cs.traveltracker;

import java.util.ArrayList;
import java.util.Collection;

public class ClaimsList 
{
	
	protected ArrayList<Claims> claimsList;
	
	public ClaimsList()
	{
		claimsList = new ArrayList<Claims>();
	}
	
	public Collection<Claims> getClaims()
	{
		return claimsList;
	}
	
	public void addClaims(Claims claim)
	{
		claimsList.add(claim);
	}
	
	public void deleteClaims(Claims claim)
	{
		claimsList.remove(claim);
	}
	
}
