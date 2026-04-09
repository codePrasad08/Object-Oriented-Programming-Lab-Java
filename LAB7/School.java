package com.course.structure;
import java.io.*;

public class School extends Building
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
