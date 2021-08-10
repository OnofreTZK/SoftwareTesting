package param.temperature;


public class Celsius implements Temperatura{  
  
    private double value;  
  
    private final double FREEZE = 0;  
  
    private final double BOIL = 100;  
  
    private final double ZEROABSOLUTO = -273;  
  
    public Celsius(){ }  
  
    public double getValue(){   
       return value;  
    }  
  
    public void setValue(double value) throws TempException{  
       if(value <= ZEROABSOLUTO) throw new TempException("Não há temperatura abaixo do zero absoluto");  
       else this.value = value;  
    }  
  
    public double getFREEZE(){ return FREEZE;}  
  
    public double getBOIL(){ return BOIL;}  
  
    public double getZEROABSOLUTO(){ return ZEROABSOLUTO;}  
  
    public String toString(){  
       return getValue()+" C";  
    }  
  
    public boolean equals(Object other){  
       if(other instanceof Celsius)    
        return (((Celsius) other).getValue() == getValue());  
       else return false;  
    }  
} 