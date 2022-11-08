package exercises.control;

import static util.Print.*;

public class ExerciseTwentyOne {
	/*
	 * static void m() { for (int i = 1; i <= 100; i++) if (i == 99) return;//
	 * break! else print(i); }
	 */

	public static void main(String[] args) {
		// m();
		int i = 0;
		outer: for (; true;) {
			inner: for (; i < 10; i++) {
				print("i = " + i);
				if (i == 2) {
					print("continue");
					continue;
				}
				if (i == 3) {
					print("break");
					i++;
					break;// нет выполняется ШАГ(i++)
				}
				if (i == 7) {
					print("continue outer");
					i++;
					continue outer;// также не выполняется ШАГ(i++)
				}
				if (i == 8) {
					print("break outer");
					break outer;//завершение внутреннего цикла
				}
				for (int k = 0; k < 5; k++)
					if (k == 3) {
						print("continue inner");
						continue inner;
					}
			}
		}
		print("end!");
	}

}
