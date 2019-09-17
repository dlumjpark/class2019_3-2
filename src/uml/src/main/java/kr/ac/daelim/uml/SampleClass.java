package kr.ac.daelim.uml;

public class SampleClass {
	public static SampleClass sample;
	public static SampleClass getInstance()
	{
		if(sample == null)
			sample = new SampleClass();
		return sample;
	}
	public void SamplePrint()
	{
		System.out.println("Hello World!!!!");
	}	
}
