package inheritencepractice;

import java.util.ArrayList;
import java.util.List;

public class Trainee extends Person {
	private double bursary;
	private List<String> subjectsLearned = new ArrayList<>();

	public double getBursary() {
		return bursary;
	}

	public void setBursary(double bursary) {
		this.bursary = bursary;
	}

	public List<String> getSubjectsLearned() {
		return subjectsLearned;
	}

	public void setSubjectsLearned(List<String> subjectsLearned) {
		this.subjectsLearned = subjectsLearned;
	}
}
