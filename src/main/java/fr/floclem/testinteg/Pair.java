package fr.floclem.testinteg;

public class Pair {
	public Pair(){
		
	}
	public String isPair(int _nb)
    {
    	String result="";
    	if(_nb%2==0)
    	{
    		result="pair";
    	}
    	else{
    		result=Integer.toString(_nb);
    	}
    	return result;
    }
}
