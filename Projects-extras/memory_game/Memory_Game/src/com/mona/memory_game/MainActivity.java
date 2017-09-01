package com.mona.memory_game;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends Activity implements OnClickListener{

	private int attempts = 0;
	private boolean isFirstRow = true;
	ArrayList<ImageButton> btns = new ArrayList<ImageButton>();
	List<Integer> images1 = new ArrayList<Integer>();
	List<Integer> images2 = new ArrayList<Integer>();
	ImageButton b;
	private int lastImages = 0;
	TextView scoreBoard;
	private int score = 0;
	private final int TIME =  500;
	
    @SuppressLint("NewApi") @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        images1.add(R.drawable.ic_next);
        images1.add(R.drawable.ic_play);
        images1.add(R.drawable.ic_play_pressed);
        images1.add(R.drawable.ic_player_close);
        images1.add(R.drawable.ic_player_open);
        images2.add(R.drawable.ic_next);
        images2.add(R.drawable.ic_play);
        images2.add(R.drawable.ic_play_pressed);
        images2.add(R.drawable.ic_player_close);
        images2.add(R.drawable.ic_player_open);
        
        btns.add((ImageButton) findViewById(R.id.btn1));
        btns.add((ImageButton) findViewById(R.id.btn2));        
        btns.add((ImageButton) findViewById(R.id.btn3));
        btns.add((ImageButton) findViewById(R.id.btn4));
        btns.add((ImageButton) findViewById(R.id.btn5));
        btns.add((ImageButton) findViewById(R.id.btn6));
        btns.add((ImageButton) findViewById(R.id.btn7));
        btns.add((ImageButton) findViewById(R.id.btn8));
        btns.add((ImageButton) findViewById(R.id.btn9));
        btns.add((ImageButton) findViewById(R.id.btn10));
        scoreBoard = (TextView) findViewById(R.id.txt);
        scoreBoard.setText("Score : "+0);
        //editText.setEnabled(false);
        for(ImageButton btn : btns)
        {
        	btn.setOnClickListener((android.view.View.OnClickListener) this);
        }
        startSession();
        Handler handler = new Handler(); 
        handler.postDelayed(new Runnable() { 
             public void run() { 
                  resetSession(); 
             } 
        }, 2000); 
        
    }
    
    private void startSession()
    {
    	Collections.shuffle(images1);
    	for(int count = 0; count < 5 ; count ++)
    	{
    		btns.get(count).setBackgroundResource(images1.get(count));
    	}
    	Collections.shuffle(images2);
    	for(int count = 5; count < 10 ; count ++)
    	{
    		btns.get(count).setBackgroundResource(images2.get(count-5));
    	}
    }

    private void resetSession()
    {
    	for(int count = 0; count < 10; count ++)
    	{
    		btns.get(count).setBackgroundResource(R.drawable.ic_unknown);
    	}
    }

	@Override
	public void onClick(View arg0) {
		//Toast.makeText(getApplicationContext(), arg0.getId(), 5000).show();;
		int index = 0 ;
		switch (arg0.getId()) {
		case R.id.btn1:
			index = 0;
			break;
		case R.id.btn2:
			index = 1;
			break;
		case R.id.btn3:
			index = 2;
			break;
		case R.id.btn4:
			index = 3;
			break;
		case R.id.btn5:
			index = 4;
			break;
		case R.id.btn6:
			index = 5;
			break;
		case R.id.btn7:
			index = 6;
			break;
		case R.id.btn8:
			index = 7;
			break;
		case R.id.btn9:
			index = 8;
			break;
		case R.id.btn10:
			index = 9;
			break;
			
		default:
			break;
		}
		
		Log.d("hakdsj", index+"");
		if(arg0.getId() == R.id.btn1 || arg0.getId() == R.id.btn2 || arg0.getId() == R.id.btn3 || arg0.getId() == R.id.btn4 || arg0.getId() == R.id.btn5)
		{
			if(!isFirstRow)
				{
				Toast.makeText(getApplicationContext(), "Wrong Attempt", TIME).show();;
					return;
				}
				
			
			lastImages = images1.get(index);
			btns.get(index).setBackgroundResource(images1.get(index));
			isFirstRow  = false;
			attempts++;
		}
		else if(arg0.getId() == R.id.btn6 || arg0.getId() == R.id.btn7 || arg0.getId() == R.id.btn8 || arg0.getId() == R.id.btn9 || arg0.getId() == R.id.btn10)
		{
			if(attempts == 0)
			{
				Toast.makeText(getApplicationContext(), "Sorry, you can't press second row button first", TIME).show();
				return;
			}
			else
			{
				if(!isFirstRow)
				{
					if(lastImages == images2.get(index-5))
					{
						scoreBoard.setText("Score : "+(++score));
						btns.get(index).setBackgroundResource(images2.get(index-5));
						attempts++;
						if(attempts == 10)
						{
						  Handler handler = new Handler(); 
					        handler.postDelayed(new Runnable() { 
					             public void run() { 
					                  restartGame();
					             } 
					        }, 100);
						}
					}
					else
					{
						scoreBoard.setText("Score : "+(--score));
						attempts = 0;
						resetSession();
						
					}
					isFirstRow = true;
				}
				else
				{
					Toast.makeText(getApplicationContext(), "Wrong Attempt", TIME).show();
					return;
				}
			}
			
		}
		
	}
	
	private void restartGame()
	{
		AlertDialog.Builder alertDialog11 = new AlertDialog.Builder(
				MainActivity.this);
		alertDialog11.setTitle("You Won");
		alertDialog11.setMessage("Your score is "+score);
		alertDialog11.setIcon(R.drawable.ic_launcher);
		alertDialog11.setNegativeButton("Cancel", null);
		alertDialog11.setPositiveButton("Restart", 
				new DialogInterface.OnClickListener()
				{

					@Override
					public void onClick(DialogInterface dialog, int which) {
						Intent startIntent = new Intent(getApplicationContext(), MainActivity.class);
						startIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);        
						getApplicationContext().startActivity(startIntent);
						((Activity)MainActivity.this).finish();
					}
			
				});
		alertDialog11.show();
	}
}
