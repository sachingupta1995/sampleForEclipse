package FirstPackage;


public interface FirstInterface{

	public Integer add(Integer input1,Integer intput2);
	public Integer sub(Integer input1,Integer input2);
	public Integer mul(Integer input1,Integer input2);
	public Integer div(Integer input1,Integer input2);
	public default  Integer addSub(Integer in1,Integer in2){
		return in1+in2+in1-in2;
		//Use default to implement the function 
	}
	
}
