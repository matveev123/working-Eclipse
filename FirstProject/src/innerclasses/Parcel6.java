package innerclasses;

import static util.Print.*;

public class Parcel6 {
	private void iternalTracking(boolean b) {
		if (b) {
			class TrackingSleep {
				private String id;

				TrackingSleep(String s) {
					id = s;
				}

				String getSleep() {
					return id;
				}
			}
			TrackingSleep ts = new TrackingSleep("sleep");
			String string = ts.getSleep();
		}
			//! out of scope!Can't us here!
		   //TrackingSleep ts = new TrackingSleep("sleep2");	
	}

	void track() {
		iternalTracking(true);
	}

	public static void main(String[] args) {
		Parcel6 p = new Parcel6();
		p.track();

	}

}
