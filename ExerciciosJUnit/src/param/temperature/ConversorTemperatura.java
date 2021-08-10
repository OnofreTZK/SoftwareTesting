package param.temperature;


public class ConversorTemperatura{  
  
    public ConversorTemperatura(){ }  
  
    public Temperatura converte(Temperatura temp) throws TempException{  
       if(temp instanceof Celsius) return converteToFahrenheit(temp);  
       else return converteToCelsius(temp);  
    }  
  
    private Temperatura converteToFahrenheit(Temperatura celsius) throws TempException{  
       Fahrenheit f = new Fahrenheit();  
       double cvalue = celsius.getValue();   
       double fvalue = 1.8*cvalue+f.getFREEZE(); // formula 1  
       f.setValue(fvalue);  
       return f;  
    }  
  
    private Temperatura converteToCelsius(Temperatura fahrenheit) throws TempException{  
       Celsius c = new Celsius();  
       double fvalue = fahrenheit.getValue();   
       double cvalue = (5/9)*fvalue-5*fahrenheit.getFREEZE();// formula 2 ?!  
       c.setValue(cvalue);  
       return c;  
    }  
  
}  