//Inheritance

class Car{
    public void start(){
	System.out.println("Car is started");
	}
	public void accelarate(){
	System.out.println("Car is Accelarate");
	}
	public void changeGear(){
	System.out.println("Changing Gear Manually");
	}
}	
class LuxuaryCar extends Car{
    public void changeGear(){
	System.out.println("Changing Gear Automatically");//method overriding
	}
	public void playMovie(){
		System.out.println("LuxuaryCar showing Movie");
	}
	public static void main(String args[]){
	    car lc=new LuxuaryCar();\\Dynamic method disbatch
		lc.playMovie();
		lc.changeGear();
		}
	}
	