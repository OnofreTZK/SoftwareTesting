package param.temperature;

public class Fahrenheit implements Temperatura{  
	  
    private double value;  
  
    private final double FREEZE = 32;  
  
    private final double BOIL = 212;  
  
    private final double ZEROABSOLUTO = -459.4;  
  
    public Fahrenheit(){ }  
  
    public double getValue(){   
       return value;  
    }  
  
    public void setValue(double value) throws TempException{  
       if(value < ZEROABSOLUTO) throw new TempException("Não há temperatura abaixo do zero absoluto");  
       else this.value = value;  
    }  
  
    public double getFREEZE(){ return FREEZE;}  
  
    public double getBOIL(){ return BOIL;}  
  
    public double getZEROABSOLUTO(){ return ZEROABSOLUTO;}  
  
    public String toString(){  
       return getValue()+" F";  
    }  
  
    public boolean equals(Object other){  
       if(other instanceof Fahrenheit)     
        return (((Fahrenheit) other).getValue() == getValue());  
       else return false;  
    }  
}