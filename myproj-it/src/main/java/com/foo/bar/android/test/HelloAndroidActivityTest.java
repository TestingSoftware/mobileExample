package com.foo.bar.android.test;

import android.test.ActivityInstrumentationTestCase2;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.myproject.*;
import org.myproject.R;

import com.jayway.android.robotium.solo.Solo;

public class HelloAndroidActivityTest extends ActivityInstrumentationTestCase2<HelloAndroidActivity> {

	Solo solo;
	
    public HelloAndroidActivityTest() {
        super(HelloAndroidActivity.class); 
    }

	protected void setUp() throws Exception {
		super.setUp();
		solo= new Solo(getInstrumentation(), getActivity());
	}

	public void testDisplay1(){
			
		float firstNumber = 100;
		float secondNumber = 5;
		float resutl = firstNumber * secondNumber;
			
		EditText Uno = (EditText)solo.getView(R.id.editText1);
		solo.enterText(Uno, String.valueOf(firstNumber));
			
		EditText Dos = (EditText)solo.getView(R.id.editText2);
		solo.enterText(Dos, String.valueOf(secondNumber));
			
		Button mult = (Button)solo.getView(R.id.button1);
		solo.clickOnView(mult);
			
		assertTrue(solo.searchText(String.valueOf(resutl)));
			
		TextView strResult = (TextView) solo.getView(R.id.textView3);
		assertEquals(String.valueOf(resutl), strResult.getText().toString());
	
	}
	
	public void testDisplay2(){			
		
		float firstNumber = 13;
		float secondNumber = 7;
		float resutl = firstNumber * secondNumber;
			
		EditText Uno = (EditText)solo.getView(R.id.editText1);
		solo.enterText(Uno, String.valueOf(firstNumber));
			
		EditText Dos = (EditText)solo.getView(R.id.editText2);
		solo.enterText(Dos, String.valueOf(secondNumber));
			
		Button mult = (Button)solo.getView(R.id.button1);
		solo.clickOnView(mult);					
					
		//assertEquals(String.valueOf(resutl), String.valueOf(50));
		
	}
	
	protected void tearDown() throws Exception {
		solo.finishOpenedActivities();
	}
	
}

