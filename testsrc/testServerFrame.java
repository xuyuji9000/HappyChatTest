import static org.junit.Assert.*;
import org.fest.swing.fixture.FrameFixture;
import org.junit.Test;


public class testServerFrame {
	private static FrameFixture frame;
	@Test
	public static void showTheFrame() {
		frame = new FrameFixture(new ServerFrame());
		frame.show();
//		fail("Not yet implemented");
	}
	public static void tearDown()
	{
		frame.cleanUp();
	}
	public static void test()
	{
		frame.textBox("btn1").click();
	}

}
