
public class main {

	public static void main(String[] args) {
		Problem problem1 = new Problem();
		System.out.println("Given an array of integers, return the largest gap between the sorted elements of the array");
		int problem1Input[] = {9, 4, 26, 26, 0, 0, 5, 20, 6, 25, 5};
		System.out.println("problem 1 solution: " + problem1.solve(problem1Input));
		
		int problem2Input[] = {14, 13, 7, 1, 4, 12, 3, 7, 7, 12, 11, 5, 7};
		System.out.println("problem 2 solution: " + problem1.solve(problem2Input));
		
		int problem3Input[] = {13, 3, 8, 5, 5, 2, 13, 6, 14, 2, 11, 4, 10, 8, 1, 9};
		System.out.println("problem 3 solution: " + problem1.solve(problem3Input));

	}

}
