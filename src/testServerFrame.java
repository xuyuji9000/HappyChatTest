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
	

	
	public String getFile(String filePath)
	{
		String str = "";
		str = (new WordFilter()).getFile(filePath);
		return str;
	}

	
	public void testTxt(String name,String target)
	{
		frame.label(name).requireText(target);
	}
	
	@Test
	public void test1()
	{
		
		testTxt("name", "服务器名称:");
		
	}
	
	@Test
	public void test2()
	{
		testTxt("protpcol", "访问协议:");
	}
/*
	public static void main(String args[])
	{
		testServerFrame test = new testServerFrame();
		test.setUp();
	}
	*/

}
