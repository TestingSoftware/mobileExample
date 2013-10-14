package org.myproject;

import android.app.Activity;
import android.os.Bundle;
import android.text.Editable;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class HelloAndroidActivity extends Activity {

	EditText FirstValue;
	EditText SecondValue;
	TextView Result;
	Button Calculate;
	float num1 , num2;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FirstValue= (EditText) findViewById(R.id.editText1);
		SecondValue = (EditText) findViewById(R.id.editText2);
		Result = (TextView) findViewById(R.id.textView3);
		Result.setText("0.00");
		Calculate = (Button) findViewById(R.id.button1);
		
		//Adding listener to button
				Calculate.setOnClickListener(new View.OnClickListener() {
								
					public void onClick(View v) {
						// TODO Auto-generated method stub
						
					}
				});
				Calculate.setOnClickListener(new View.OnClickListener() {
				public void onClick(View v) {
				//Getting first & second values and passing to show result
				showResult(FirstValue.getText(), SecondValue.getText());
				}
				});
    }
    
    protected void showResult(Editable first, Editable second){
		float num1 = Float.parseFloat(first.toString());
		float num2 = Float.parseFloat(second.toString());
		float result = num1 * num2;
		Result.setText(String.valueOf(result));
	}

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
	// Inflate the menu; this adds items to the action bar if it is present.
	getMenuInflater().inflate(org.myproject.R.menu.main, menu);
	return true;
    }

}

