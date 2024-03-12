package Sakshi;
// Interface eg
public class AustralianTraffic implements CentralTraffic,ContinentialTraffic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//created obj for AustralianTraffic class to implement methods present in CentralTraffic interface
		CentralTraffic a = new AustralianTraffic();
		a.redStop();
		a.greenGo();
		a.FlashYellow();
		
		AustralianTraffic b = new AustralianTraffic();
		b.walkonsymbol();
		
		ContinentialTraffic c = new AustralianTraffic();
		c.TrainSymbol();
		
	}

	@Override
	public void greenGo() {
		// TODO Auto-generated method stub
		//code
		System.out.println("green");
	}

	@Override
	public void redStop() {
		// TODO Auto-generated method stub
		//code
		System.out.println("red");
	}
	

	@Override
	public void FlashYellow() {
		// TODO Auto-generated method stub
		//code
		System.out.println("yellow");
	}

	public void walkonsymbol() 
	{
		System.out.println("walking");	
	}
	
	public void TrainSymbol() 
	{
		System.out.println("TrainSymbol");	
	}
	
	
}
