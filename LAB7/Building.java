package com.course.structure;
import java.io.*;

public class Building
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