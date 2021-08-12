package banco;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;


public class JunitRunner{

	public static void main(String[] args) {
		
		Result result = JUnitCore.runClasses(ContaTest.class);
	
        for (Failure fail : result.getFailures())
            System.out.println(fail.toString());   
            
        if(result.wasSuccessful())
            System.out.println("Todos os testes OK."); 
		
	}

}