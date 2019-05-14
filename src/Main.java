
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("BFS-Search Algorithm");
		Node startNode = new Node(STATE.BEFORE_BRIDGE);
		
		BreadthFirstSearch bfs = new BreadthFirstSearch(startNode);
		
		long startTimer = System.currentTimeMillis();
		long stopTimer,totalTimer;
		
		bfs.compute();
		
		stopTimer = System.currentTimeMillis();
		totalTimer = stopTimer - startTimer;
		System.out.println("Runtime Timer: " + totalTimer + " milliseconds");
		
	}

}
