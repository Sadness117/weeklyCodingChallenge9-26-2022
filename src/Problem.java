import java.util.TreeSet;

public class Problem {
	public Problem() {
		
	}
	public int solve(int []array) {
		TreeSet<Integer> ordered = new TreeSet<>();
		int result = 0;
		int comparitor = 0;
		int i = 0;
		for(int num: array) {
			ordered.add(num);
		}
		for(int num: ordered) {
			if(i == 0) {
				comparitor = num;
				i++;
			}else {
				
				int subtracted = num - comparitor;
				if(subtracted> result) {
					result = subtracted;
				
				}
			}
			comparitor = num;
		}
		return result;
		
	}
}
