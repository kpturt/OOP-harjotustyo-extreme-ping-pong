package PongPacket;

public class Points extends GameLogic {
	protected int scoreP1 = 0;
	protected int scoreCPU = 0;

	public void updateScoreP1(){
			scoreP1 += 1;
	}
	public void updateScoreCPU(){
			scoreCPU += 1;
	}
	public int returnScoreP1(){
			return scoreP1;
		}
	public int returnScoreCPU(){
		return scoreCPU;
	}

	public void restartPoints() {
		scoreP1 = 0;
		scoreCPU = 0;
	}
}