package pg02;

public class MovimientoBola extends Thread {
	private Board board;
	private Ball ball;
	public MovimientoBola(Ball ball, Board board) {
		this.ball = ball;
		this.board = board;
	}
	
	public void run() {
		try {
			while (true) {
				this.ball.move();
				
				board.repaint();
				
				Thread.sleep(10);
			}
		} catch (InterruptedException a) {
			return;
		}
	}	

}
