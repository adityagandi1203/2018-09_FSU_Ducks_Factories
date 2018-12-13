
/**
 * Class: Object-Oriented Design and Analysis
 * Professor: Orlando Montalvo
 * Assignment: HW 11
 * Date: 2018-11-28
 */
package HW11.edu.fitchburgstate.csc7400.duckpond.behaviors.swim;
/*
 * class that deal with swim behaviour
 */
public class SwimBehaviourFactory 
{
	/*
	 * @param display text
	 * @return instance
	 */
	public static SwimBehavior swimBe(String be)
	{
		return new SimpleSwim(be);
	}
}
