package param.temperature;


public interface Temperatura{  
    
	public double getValue();  
      
    public void setValue(double value) throws TempException;  
      
    public double getFREEZE();  
      
    public double getBOIL();  
      
    public double getZEROABSOLUTO();  
}  