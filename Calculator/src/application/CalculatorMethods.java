package application;

import java.util.ArrayList;

public class CalculatorMethods
{
	private static double currentValue=0;
	private static ArrayList<Double> memory;

	public CalculatorMethods()
	{
		this.currentValue = currentValue;
	    memory = new ArrayList<Double>();
	}

	public static void addMemory(double op)
	{
		if(memory.size() == 10)
		{
			memory.remove(0);
			memory.add(op);
			memory.add(currentValue);
		}
	        
		else
		{
			memory.add(op);
		}
	}

	public static void printMemory()
	{
	  for(int i = 0; i < memory.size(); i++)
	  {
	     System.out.println(memory.get(i));        
	  }
	}
	public static void setCurrentValue(double op)
	{
		double num = Double.valueOf(op);
        currentValue = num;
	}
	
	public static double getCurrentValue()
	{
	  return currentValue;
	}

	public static double addition(double op2)
	{
		setCurrentValue(currentValue);
        currentValue = currentValue + op2;
        return currentValue;
	}

	public static double subtraction(double op2)
	{
		setCurrentValue(currentValue);
        currentValue -= op2;
        return currentValue;
	}

	public static double division(double op2)
	{
		setCurrentValue(currentValue);
		if(op2!=0)
		{
			currentValue /= op2;
		}
		else
		{
			System.out.print("Error");
		}
			return currentValue;
	}

	public static double multiplication(double op2)
	{
		setCurrentValue(currentValue);
		currentValue*= op2;
		return currentValue;
	}

	public static double exponential(double op2)
	{
		setCurrentValue(currentValue);
		currentValue= Math.pow(currentValue, op2);
		return currentValue;
	}

	public static double squareRoot(double op)
	{
		if(currentValue>=0)
		{
		  setCurrentValue(currentValue);
		  currentValue= Math.sqrt(currentValue);
	    }
	
		else
		{
		  throw new IllegalArgumentException("ERROR");
		}
		return currentValue;
	        
	}
	public static double cos(double op1) 
	{
		setCurrentValue(currentValue);
    	currentValue = Math.cos(op1);
    	return currentValue;
    }
	
	public static double tan(double op1) 
	{
		setCurrentValue(currentValue);
    	currentValue = Math.tan(op1);
    	return currentValue;
    }
	
	public static double sin(double op1)
	{
		setCurrentValue(currentValue);
    	currentValue = Math.sin(op1);
    	return currentValue;
    }
	
	public static double log(double base) 
	{
		if(currentValue>0 && (base>0 && base != 1))
		{
            setCurrentValue(currentValue);
            currentValue = Math.log(currentValue)/Math.log(base);
        }
        else
        {
            System.out.println("ERROR");
        }
		return currentValue;
	}
	
	public static void memClear()
	{
		for(int i=0; i<memory.size(); i++)
		{
			memory.remove(i);
		}
	}
	
	public static void memStore(double op1)
	{
		memory.add(op1);
	}
	
	public String toString()
	{
		return "= " + currentValue;
	}
}
