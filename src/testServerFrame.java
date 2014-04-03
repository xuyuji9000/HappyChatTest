import static org.junit.Assert.*;

import java.sql.Time;

import org.fest.assertions.Description;
import org.fest.swing.fixture.FrameFixture;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.junit.rules.TestWatcher;

import java.lang.Thread;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.*;



public class testServerFrame {
	private FrameFixture frame;
	private static int i = 0;
	
	
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
	//@Test
	//测试的代码
	public void thetry()
	{
		String[] str = getTestCase();
		for (String string : str) {
			System.out.println(string);
		}
		System.out.println(str);
	}
	
	//
	public String getFile(String filePath)
	{
		String fileString = "";
		try {
			File files = new File(filePath);
			// System.out.println(files.getAbsolutePath());
			FileReader fileReader = new FileReader(files);
			BufferedReader read = new BufferedReader(fileReader);
			while (true) {
				String line = read.readLine();
				if (line == null) {
					break;
				}
				fileString += (line);
				// fileString += (line + "\n");
			}
			read.close();
			// System.out.println(fileString);
		} catch (FileNotFoundException e) {
			// TODO 自动生成 catch 块
			e.printStackTrace();
		} catch (IOException e) {
			// TODO 自动生成 catch 块
			e.printStackTrace();
		}

		return fileString;
	}

	
	public void testTxt(String name,String target)
	{
		frame.label(name).requireText(target);
	}
	
	public String[] getTestCase()
	{
		String str = getFile("btnTestInfo.txt");
		String[] testCase = str.split(";");
		return testCase;
		
	}
	
	//get the number of the test cases
	public void getTestCaseCount()
	{
		
		String[] str = getTestCase();
		for (String string : str) {
			i++;
		}
		//return i;
		
	}
	
	@Test
	public void test()
	{
		String[] str = getTestCase();
		for (String string : str) {
			String[] testcase = string.split(",");
			testTxt(testcase[0], testcase[1]);
			System.out.println(string + " : ok" );
		}
		
		
	}
	
	
	
/*
	public static void main(String args[])
	{
		testServerFrame test = new testServerFrame();
		test.setUp();
	}
	*/

}
