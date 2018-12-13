
/**
 * Class: Object-Oriented Design and Analysis
 * Professor: Orlando Montalvo
 * Assignment: HW 11
 * Date: 2018-11-28
 */
package HW11.edu.fitchburgstate.csc7400.duckpond.behaviors.quack;
//quack behaviour for the factory
public class QuackBehaviourFactory 
{
	public Qtype type;
	/*
	 * @parm is  a string which has sound
	 * @return is a instance QB
	 */
	public static QuackBehavior QuackBe(Qtype type)
	{QuackBehavior QB=null;
		
		
		if(type!=null && type.equals(Qtype.SQUEAK))
		{
			QB=new Squeak();
		}
		else if(type!=null && type.equals(Qtype.QUACK))
		{
			QB=new DuckQuack();
		}
		else
		{
			QB=new CannotQuack();
		}
		return QB;
	}

}
