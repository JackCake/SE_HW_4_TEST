package test;
import static org.junit.Assert.*;
import org.junit.Test;
import letterGrade.LetterGrade;
public class LetterGradeTest {
	LetterGrade letterGrade = new LetterGrade();
	@Test
	public void testCharX() {
		assertEquals('X', letterGrade.scoreConvertToLetter(-5));
		assertEquals('X', letterGrade.scoreConvertToLetter(105));
	}	
	@Test
	public void testCharA() {
		assertEquals('A', letterGrade.scoreConvertToLetter(95));
	}
	@Test
	public void testCharB() {
		assertEquals('B', letterGrade.scoreConvertToLetter(85));
	}
	@Test
	public void testCharC() {
		assertEquals('C', letterGrade.scoreConvertToLetter(75));
	}
	@Test
	public void testCharD() {
		assertEquals('D', letterGrade.scoreConvertToLetter(65));
	}	
	@Test
	public void testCharF() {
		assertEquals('F', letterGrade.scoreConvertToLetter(55));
	}
	@Test
	public void testMain() {
		letterGrade.main(null);
	}
}
