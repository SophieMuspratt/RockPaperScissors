package rockPaperScissors;

import static org.junit.Assert.*;

import org.junit.Test;

public class RockPaperScissorsTest {
	
	private RockPaperScissors game = new RockPaperScissors();

	@Test
	public void rockBeatsScissorsPlayer1() {
		game.playerOneChoice("Rock");
		game.playerTwoChoice("Scissors");
		assertEquals(1, game.getWinner());
	}
	
	@Test
	public void rockBeatsScissorsPlayer2() {
		game.playerOneChoice("Scissors");
		game.playerTwoChoice("Rock");
		assertEquals(2, game.getWinner());
	}
	
	@Test
	public void scissorsBeatsPaperPlayer1() {
		game.playerOneChoice("Scissors");
		game.playerTwoChoice("Paper");
		assertEquals(1, game.getWinner());
	}
	
	@Test
	public void scissorsBeatsPaperPlayer2() {
		game.playerOneChoice("Paper");
		game.playerTwoChoice("Scissors");
		assertEquals(2, game.getWinner());
	}
	
	@Test
	public void paperBeatsRockPlayer1() {
		game.playerOneChoice("Paper");
		game.playerTwoChoice("Rock");
		assertEquals(1, game.getWinner());
	}
	
	@Test
	public void paperBeatsRockPlayer2() {
		game.playerOneChoice("Rock");
		game.playerTwoChoice("Paper");
		assertEquals(2, game.getWinner());
	}
	
	@Test
	public void bothRockResultInDraw() {
		game.playerOneChoice("Rock");
		game.playerTwoChoice("Rock");
		assertEquals(0, game.getWinner());
	}
	
	@Test
	public void bothPaperResultInDraw() {
		game.playerOneChoice("Paper");
		game.playerTwoChoice("Paper");
		assertEquals(0, game.getWinner());
	}
	
	@Test
	public void bothScissorsResultInDraw() {
		game.playerOneChoice("Scissors");
		game.playerTwoChoice("Scissors");
		assertEquals(0, game.getWinner());
	}


}
