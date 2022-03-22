package fi;

public class Svecw implements College {
	String[] departments;

	@Override
	public void setDepts(String[] depts) {
		departments = depts;
	}

	@Override
	public int getNofStds() {
		int NofStds = 1000;
		return NofStds;
	}

}
