package innerclasses.controller;

import static util.Print.*;

import java.util.*;

public class Controller {
	// no constructor!

	private List<Event> eventList = new ArrayList<Event>();

	public void addEvent(Event e) {//for rerun in class Restart and Bell
		eventList.add(e);
	}

	public void run() {
		while (eventList.size() > 0) {
			for (Event e : new ArrayList<Event>(eventList)) {
				if (e.ready()) {
					System.out.println(e);
					e.action();
					eventList.remove(e);
				}

			}
		}
	}

}
