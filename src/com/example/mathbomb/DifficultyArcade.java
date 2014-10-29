package com.example.mathbomb;

import android.app.Activity;
import android.content.Intent;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ToggleButton;

public class DifficultyArcade extends Activity {
    
   @Override
   public void onCreate(Bundle savedInstanceState) {
       super.onCreate(savedInstanceState);
       setContentView(R.layout.difficulty_arcade);
       
    // Dashboard sound button
       Button easy = (Button) findViewById(R.id.easy);
        
       // Dashboard classic button
       Button medium = (Button) findViewById(R.id.medium);
        
       // Dashboard arcade button
       Button hard= (Button) findViewById(R.id.hard);
       
       // Listening to easy button click
       easy.setOnClickListener(new View.OnClickListener() {
            
           @Override
           public void onClick(View view) {
        	   Intent easy= new Intent("in.robotix.robotixapp.NOTICEBOARD");
   	           startActivity(easy);		
           }
       });
       
       // Listening to classic button click
       medium.setOnClickListener(new View.OnClickListener() {
            
           @Override
           public void onClick(View view) {
        	   Intent medium = new Intent("in.robotix.robotixapp.NOTICEBOARD");
   	           startActivity(medium);		
           }
       });
       
       // Listening to classic button click
       hard.setOnClickListener(new View.OnClickListener() {
            
           @Override
           public void onClick(View view) {
        	   Intent hard = new Intent("in.robotix.robotixapp.NOTICEBOARD");
   	           startActivity(hard);		
           }
       });
   }
}