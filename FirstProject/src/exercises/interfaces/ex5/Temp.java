//ExerciseSix
package exercises.interfaces.ex5;

import static util.Print.*;

public interface Temp {
	// Error: cannot assign weaker access to public methods:
	void m1();// ptivate error

	void m2();// procted erro

	void m3();//implies package access

}
