public class Bulle {

	private static int ID = 0;
	
    private double x;
    private double y;
    private double z;
    private int id;
    
    public Bulle(double x, double y, double z){
    	this.x = x;
    	this.y = y;
    	this.z = z;
    	this.id = ID;
    	
    	ID = ID + 1;
    }
    
    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }
    public double getZ(){
        return z;
    }
    
    public int getId(){
    	return id;
    }

    public void setX(double x){
        this.x = x;
    }
    public void setY(double y){
        this.y = y;
    }
    public void setZ(double z){
        this.z = z;
    }

    public double computeDistance(Bulle other){
    	
    	//sqrt[(Xa-Xb)²+(Ya-Yb)²+(Za-Zb)²]
    	return Math.sqrt(	Math.pow(x-other.getX(),2)+
    						Math.pow(y-other.getY(),2)+
    						Math.pow(z-other.getZ(),2)
    					);    	
    }
    
	public String toString(){
		return x + " " + y + " " + z;
	}
}
