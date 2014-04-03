import static org.junit.Assert.*;
import java.sql.Time;

import org.fest.assertions.Description;
import org.fest.swing.fixture.FrameFixture;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.junit.rules.TestWatcher;

import java.lang.Thread;
import java.io.File;
import java.util.regex.*;



public class testServerFrame {
	private FrameFixture frame;
	
	@Before
	public void setUp()
	{
		frame = new FrameFixture(new ServerFrame());
		frame.show();
	}
	
	@After
	public void tearDown()
	{
		frame.cleanUp();
	}
	
//	@Test
//	public void testServerFrame() {
//		setUp();
//		Thread thread = new Thread();
//		try{
//			Thread.sleep(1000);
//		}catch(InterruptedException e)
//		{
//			return;
//		}
//
//		tearDown();
//		
//		fail("Not yet implemented");
//	}
	
	public String getFile(String filePath)
	{
		String str = "";
		str = (new WordFilter()).getFile(filePath);
		return str;
	}
//	public String[] process(String filePath)
//	{
//		
//		
//	}
//	
	
	
	
//	@Test
//	public void testBtn2(){
//		frame.button("btn2").click();
//	}
	
	
//	public static void main(String args[])
//	{
//		testServerFrame test = new testServerFrame();
//		test.setUp();
//	}

}
