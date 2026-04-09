package com.course.structure;
import java.io.*;

public class House extends Building
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
