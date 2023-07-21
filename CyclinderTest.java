class Cyclinder{
    private double radius;
	private double height;
	public double getradius(){
		return radius;
	}
	public void setradius(double r){
		if(r>0) radius=r;
		else radius=0;
	}
	public double getheight(){
		return height;
	}
    public void setheight(double h){
          	if(h>0) height=h;
            else height=0;			
	}
	public double lidArea(){
	    return Math.PI*radius*radius;
	
	}
	public double circumference()
	{
	    return 2*Math.PI*radius;
	}
	public double volume()
	{
	    return lidArea()*height;
	}
	public double totalArea()
	{
	    return 2*lidArea()+circumference()*height;
	}
	public String toString(){
		return "radius ="+getradius() + "\n"+"height ="+getheight();
	}	
}
   class CyclinderTest{
        public static void main(String[] args){
		 Cyclinder c=new Cyclinder();
		 c.setradius(7);
		 c.setheight(10.8);
		System.out.println("Area = "+c.lidArea());
		System.out.println("Circumference = "+ c.circumference());
		System.out.println("Volume = "+c.volume());
		System.out.println("TotalArea = "+ c.totalArea());
		System.out.println("Details:"+"\n"+ c);
		
		//System.out.println("radius = "+ c.getradius());
		//System.out.println("Height = "+ c.getheight());
		 
        }
	}	
	