package com.example.mathbomb;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.LinearInterpolator;
import android.view.animation.TranslateAnimation;
import android.widget.Button;

public class ClassicEasy extends Activity {
	 @Override
	    public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.easy);

	        //new GetUrl().execute(20);

	        // Test XML Files
	        //testXMLFiles();

	         Button ButtonOne = (Button) findViewById(R.id.btnOne);
	        
	         
	       ButtonOne.setOnClickListener(new View.OnClickListener() {
	            @Override
	            public void onClick(View v) {
	            	v.setVisibility(View.GONE);
	            	 Intent easy= new Intent("in.robotix.robotixapp.NOTICEBOARD");
	     	           startActivity(easy);	
	                // TODO: DO something!
	            }
	        });
	 }
}

	      /*   ObjectAnimator horizontalAnimator = ObjectAnimator.ofInt(new ButtonAnimatorHelper(ButtonOne), "marginLeft", 0, 600);

	        horizontalAnimator.setDuration(2000);
	        horizontalAnimator.setRepeatCount(ValueAnimator.INFINITE);
	        horizontalAnimator.setRepeatMode(ValueAnimator.REVERSE);
	        horizontalAnimator.setInterpolator(new LinearInterpolator());

	        horizontalAnimator.start();
	 }

	    

	    /**
	     * Helper class for button animation
	     */
//	   private static class ButtonAnimatorHelper {
//
//	        final Button mButton;
//	        /**
//	         * Default constructor
//	         * @param speakButton
//	         */
//	       public ButtonAnimatorHelper(final Button button) {
//	            mButton = button;
//	        }
//
//	        public void setMarginLeft(final int margin) {
//	            final ViewGroup.MarginLayoutParams params = (ViewGroup.MarginLayoutParams) mButton.getLayoutParams();
//
//	            params.leftMargin = margin;
//
//	            mButton.setLayoutParams(params);
//	        }
//	    }
	


