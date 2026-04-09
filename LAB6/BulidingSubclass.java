package com.course.structure;
import java.io.*;
import java.util.Scanner;

class Building
{
	private double squarefoot;
	private int stories;
	void setBuild(double sqf,int st)
	{
		squarefoot=sqf;
		stories=st;
	}
	double getSq()
	{	return squarefoot;}
	int getStory()
	{	return stories;}
}
 class House extends Building
 {
 	private int nbedrooms;
 	private int nbaths;
	void setHouse(double sqf,int st,int nbed,int nbath)
	{
		super.setBuild(sqf,st);
		nbedrooms=nbed;
		nbaths=nbath;
	}
	int getBed()
	{	return nbedrooms;}
	int getBath()
	{	return nbaths;}
}

 class School extends Building
 {
 	private int nclasses;
 	private String gradelevel;
	void setSchool(double sqf,int st,int ncl,String grad)
	{
		super.setBuild(sqf,st);
		nclasses=ncl;
		gradelevel=grad;
	}
	int getnClass()
	{	return nclasses;}
	String getGradelvl()
	{	return gradelevel;}
}
