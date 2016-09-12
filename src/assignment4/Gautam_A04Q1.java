package assignment4;

public class Gautam_A04Q1
{
    public static class Shape 
    {
    	protected String name;
    	protected double area,volume,height,radius;
    }

    public static class Cylinder extends Shape
    { 	
    	public Cylinder(double radius,double height)
    	{
    		this.radius = radius;
    		this.height = height;
    		name = "cylinder";
    	}	
    	public double getArea()
    	{
    		area = 2*Math.PI*radius*height+2*Math.PI*Math.pow(radius, 2);
    		return area;		
    	}
    	public double getVolume()
    	{
    		volume = Math.PI*Math.pow(radius, 2)*height;
			return volume;
    	}
    	
    	public double getRadius()
    	{
    		return radius;
    	}
    	public void setRadius(double radius)
    	{
    		this.radius = radius;
    	}
    	
    	public double getHeight()
    	{
    		return height;
    	}
    	public void setHeight(double height)
    	{
    		this.height = height;
    	}
    	
    	public String toString()
    	{
    		return "A "+name+ " of radius "+radius +", area "+getArea()+", and volume "+ getVolume(); 				
    	}
        
    }
    
    
    public static class Cone extends Shape
    {
    	public Cone(double radius,double height)
    	{
    		this.radius = radius;
    		this.height = height;
    		name = "cone";
    	}
    	
    	public double getArea()
    	{
    		area = Math.PI*radius*(radius+Math.sqrt((Math.pow(height, 2)+Math.pow(radius, 2))));
    		return area;		
    	}
    	public double getVolume()
    	{
    		volume = Math.PI*Math.pow(radius, 2)*(height/3);
			return volume;
    	}
    	
    	public double getRadius()
    	{
    		return radius;
    	}
    	public void setRadius(double radius)
    	{
    		this.radius = radius;
    	}
    	
    	public double getHeight()
    	{
    		return height;
    	}
    	public void setHeight(double height)
    	{
    		this.height = height;
    	}
    	
    	public String toString()
    	{
    		return "A "+name+ " of radius "+radius +", area "+ getArea() +", and volume "+ getVolume(); 				
    	}
    }    
    
    public static void main(String[] args)
    {   
    	Cylinder cy1 = new Cylinder(2, 3);
    	Cylinder cy2 = new Cylinder(5, 6);
    	Cone co1 = new Cone(4, 6);
    	Cone co2 = new Cone(3, 6);
    	System.out.println(cy1+"\n"+cy2+"\n"+co1+"\n"+co2);
    	cy1.setRadius(8.6);
    	cy2.setRadius(4.5);
    	co1.setRadius(5.4);
    	co2.setRadius(4);
    	System.out.println(cy1+"\n"+cy2+"\n"+co1+"\n"+co2);
    	
    }
}