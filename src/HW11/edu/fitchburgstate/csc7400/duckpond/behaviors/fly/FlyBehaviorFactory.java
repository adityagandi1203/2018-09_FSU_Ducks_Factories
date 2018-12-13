/**
 * Class: Object-Oriented Design and Analysis
 * Professor: Orlando Montalvo
 * Assignment: HW 11
 * Date: 2018-11-28
 */

package HW11.edu.fitchburgstate.csc7400.duckpond.behaviors.fly;
/*
 * created fly factories  for behaviours
 */
public class FlyBehaviorFactory 

{
	/*
	 * 
	 * @param is text to display
	 * @return instance of the class
	 */
	public static FlyingBehavior FlyBehavior(String t)
	{
		FlyingBehavior f=null;
		if(t!=null)
		{
			f=new SimpleFly(t);
			
		}
		else
		{
			f=new CannotFly();
		}
		return f;
	}

}
