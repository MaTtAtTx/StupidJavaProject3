package stupid.controller;

import stupid.model.ThirdStupid;
import stupid.vew.StupidDisplay;
import java.util.List;
import java.util.ArrayList;

public class StupidController
{
	private StupidDisplay popup;
	private List<ThirdStupid> testList;
	
	public StupidController()
	{
		popup = new StupidDisplay();
		testList = new ArrayList<ThirdStupid>();
	}
	
	public void start()
	{
		ThirdStupid tester = new ThirdStupid("Tom", 0);
		ThirdStupid forEachTest1 = new ThirdStupid("Test1", 0);
		ThirdStupid forEachTest2 = new ThirdStupid("Test2", 0);
		popup.displayText(tester.toString());
		
		testList.add(forEachTest1);
		testList.add(forEachTest2);
		forEachList();
		
		ifStuffTest(tester);
	}
	
	private void forEachList()
	{		
		for(ThirdStupid current : testList)
		{
			popup.displayText(current.getName());
			String newName = popup.getResponse("What should my new new name be?");
			current.setName(newName);
			popup.displayText(current.getName());		
		}
	}
	
	private void ifStuffTest(ThirdStupid currentTest) 
	{
		int sAge = 0;
		String ageTest = popup.getResponse("What age would you like for the test?");
		while (!isValidInteger(ageTest))
		{
			ageTest = popup.getResponse("Please type an integer. What would you like the age to be?");
		}	
		sAge = Integer.parseInt(ageTest);
		
		while (sAge >= 75 && sAge < 122)
		{
			ageTest = popup.getResponse("That age is far too old for my liking. Please type a new age.");
			while (!isValidInteger(ageTest))
			{
				ageTest = popup.getResponse("Please type an integer. What would you like the age to be?");
			}
			sAge = Integer.parseInt(ageTest);
		}
		
		if (sAge > 0 && sAge != 17 && sAge != 13)
		{
			if (sAge == 122)
			{
				popup.displayText(sAge + " is the oldest age a human has ever lived.");
			}
			else if (sAge > 122)
			{
				popup.displayText(sAge + " is probably not a vaild human age because the oldest recorded human age is 122 years old.");
			}
			else
			{	
			popup.displayText(sAge + " is a valid human age.");
			}
		}
		else if (sAge < 0)
		{
			if (sAge <= -1000)
			{
				popup.displayText("Human ages must 0 or greater, and " + sAge + " is far below 0.");
			}	
			else
			{
			popup.displayText(sAge + " isn't a valid human age.");
			}
		}
		if (sAge == 0)
		{
			popup.displayText(sAge + " is the age a human is from when they are born until they turn 1.");
		}
		if (sAge == 17)
		{
			popup.displayText(sAge + " is my favorite number so it is a good age.");
		}
		if (sAge == 13)
		{
			popup.displayText(sAge + " is almost my favorite number.");
		}
	}
	
	// Helper methods
	private boolean isValidInteger(String sampleInt)
	{
		boolean valid = false;

		try
		{
			Integer.parseInt(sampleInt);
			valid = true;
		}
		catch (NumberFormatException error)
		{
			popup.displayText("Only integer values are valid: " + sampleInt + " is not.");
		}

		return valid;
	}

	private boolean isValidDouble(String sampleDouble)
	{
		boolean valid = false;

		// Try and catch test a primitive (this one double) is actually a double and if it's not it catches
		// it instead of crashing your program
		try
		{
			Double.parseDouble(sampleDouble);
			valid = true;
		}
		catch (NumberFormatException error)
		{
			popup.displayText("Only double values are valid: " + sampleDouble + " is not.");
		}

		return valid;
	}

	private boolean isValidBoolean(String sampleBoolean)
	{
		boolean valid = false;

		try
		{
			Boolean.parseBoolean(sampleBoolean);
			valid = true;
		}
		catch (NumberFormatException error)
		{
			popup.displayText("Only boolean values are valid: " + sampleBoolean + " is not.");
		}

		return valid;
	}
}
