package com.course.structure;

class Building
{
	private double squarefoot;
	private int stories;
	public void setBuild(double sqf,int st)
	{
		squarefoot=sqf;
		stories=st;
	}
	public double getSq()
	{	return squarefoot;}
	public int getStory()
	{	return stories;}
}
class House extends Building
 {
 	private int nbedrooms;
 	private int nbaths;
	public void setHouse(double sqf,int st,int nbed,int nbath)
	{
		super.setBuild(sqf,st);
		nbedrooms=nbed;
		nbaths=nbath;
	}
	public int getBed()
	{	return nbedrooms;}
	public int getBath()
	{	return nbaths;}
}

class School extends Building
 {
 	private int nclasses;
 	private String gradelevel;
	public void setSchool(double sqf,int st,int ncl,String grad)
	{
		super.setBuild(sqf,st);
		nclasses=ncl;
		gradelevel=grad;
	}
	public int getnClass()
	{	return nclasses;}
	public String getGradelvl()
	{	return gradelevel;}
}
