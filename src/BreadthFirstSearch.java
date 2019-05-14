import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirstSearch {
	
	private Node startNode;
	private static int totalExploredNodes = 0;
	
	public BreadthFirstSearch(Node start) {
		this.startNode = start;
	}
	
	public boolean compute() {
		
		
		if(startNode.getBeforeList().isEmpty()) {
			System.out.println("Starting Node is empty");
			return true;
		}
		
		Queue<Node> queue = new LinkedList<>();
		queue.add(this.startNode);
		
		while(!queue.isEmpty() ) {
		
			Node current = queue.remove();
			totalExploredNodes++;
			
			if(current.getBeforeList().isEmpty()) {
				
				System.out.println("Finished");
				System.out.println("Initial Node-> " + startNode.getStringNode());
				System.out.println(current.traceNodeHistory());
				System.out.println("Total Time of Walking: " + current.getTotalTimeOfWalking() + " minutes");
				System.out.println("Total Nodes explored: " + totalExploredNodes);
				System.out.println("Total Nodes created: " + startNode.getTotalCreatedNodes());
				return true;
			}
			else {
				queue.addAll(current.getChildren());
			}
			
		}
		
		return false;
	}

}
