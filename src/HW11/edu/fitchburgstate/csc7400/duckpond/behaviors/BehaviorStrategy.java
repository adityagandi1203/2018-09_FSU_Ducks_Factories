/**
 * Class: Object-Oriented Design and Analysis
 * Professor: Orlando Montalvo
 * Assignment: HW 11
 * Date: 2018-11-28
 */

package HW11.edu.fitchburgstate.csc7400.duckpond.behaviors;

import HW11.edu.fitchburgstate.csc7400.duckpond.behaviors.fly.FlyBehaviorFactory;
import HW11.edu.fitchburgstate.csc7400.duckpond.behaviors.fly.FlyingBehavior;
import HW11.edu.fitchburgstate.csc7400.duckpond.behaviors.quack.Qtype;
import HW11.edu.fitchburgstate.csc7400.duckpond.behaviors.quack.QuackBehavior;
import HW11.edu.fitchburgstate.csc7400.duckpond.behaviors.quack.QuackBehaviourFactory;
import HW11.edu.fitchburgstate.csc7400.duckpond.behaviors.swim.SwimBehavior;
import HW11.edu.fitchburgstate.csc7400.duckpond.behaviors.swim.SwimBehaviourFactory;

public class BehaviorStrategy 
{
	/*
	 * store types of behaviour
	 */
	public String flyb;
	public Qtype quackb;
	public String swimb;
	
	 /**  
	* Returns the flying behavior
	  */
	 public FlyingBehavior getFlyBehavior()
	 {
		 return FlyBehaviorFactory.FlyBehavior(this.flyb);
	 }

	 /**
	  * Returns the quacking behavior
	  */
	 public QuackBehavior getQuackBehavior()
	 {
		 return QuackBehaviourFactory.QuackBe(quackb);
	 } 

	 /**
	  * Returns the swimming behavior
	  */
	 public SwimBehavior getSwimBehavior()
	 {
		 return SwimBehaviourFactory.swimBe(swimb);
	 }
	 /*
	  * Intialize the behaviour variables with values
	  * @param  flyb text to discribe behavior 
	  * 
	  * @param swimb discribe swim behaviour
	  * @param  quqckb to discribe duck sound
	  */
	 public static BehaviorStrategy behavior(String flyb,String swimb,Qtype quackb)
	 {
		 BehaviorStrategy bs=new BehaviorStrategy();
		 bs.flyb=flyb;
		 bs.quackb=quackb;
		 bs.swimb=swimb;
		 return bs;
		 
	 }
}
