
public class Node {

	public int Value;
    public String Name;
    Node Parent;
    public int Alpha;
    public int Beta;
    
    
    
    public int getBeta() {
		return Beta;
	}


	public void setBeta(int beta) {
		Beta = beta;
	}


	public int getAlpha() {
		return Alpha;
	}


	public void setAlpha(int alpha) {
		Alpha = alpha;
	}

	
    Node(String Name)
    {
    	this.Name=Name;
    }
    
    
    public String getName()
    {
    	return Name;
    }
    
    public void setValue(int Value)
    {
    	this.Value = Value;
    }
    
    public int getValue()
    {
    	return Value;
    }
    
    public void setName(String Name)
    {
    	this.Name=Name;
    }
    
 }
   
