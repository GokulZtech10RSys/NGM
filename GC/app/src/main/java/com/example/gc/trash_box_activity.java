
	 
	/*
	 *	This content is generated from the API File Info.
	 *	(Alt+Shift+Ctrl+I).
	 *
	 *	@desc 		
	 *	@file 		trash_box
	 *	@date 		Monday 07th of August 2023 04:56:42 AM
	 *	@title 		Page 1
	 *	@author 	
	 *	@keywords 	
	 *	@generator 	Export Kit v1.3.figma
	 *
	 */
	

package com.example.gc;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;


import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class trash_box_activity extends Activity {


	private View rectangle_7;
	private ImageView arrow_1;
	private TextView trash_box_ek3;
	private ImageView images_removebg_preview_1;
	private ImageView istockphoto_1168520360_612x612_removebg_preview_1;
	private ImageView home;
	private ImageView settings;
	private ImageView people;
	private ImageView grid;
	private TextView a_bin_that_holds_rubbish_until_it_is_collected_;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.trash_box);


		rectangle_7 = (View) findViewById(R.id.rectangle_7);
		arrow_1 = (ImageView) findViewById(R.id.arrow_1);
		trash_box_ek3 = (TextView) findViewById(R.id.trash_box_ek3);
		images_removebg_preview_1 = (ImageView) findViewById(R.id.images_removebg_preview_1);
		istockphoto_1168520360_612x612_removebg_preview_1 = (ImageView) findViewById(R.id.istockphoto_1168520360_612x612_removebg_preview_1);

		home = (ImageView) findViewById(R.id.home);
		settings = (ImageView) findViewById(R.id.settings);
		people = (ImageView) findViewById(R.id.people);
		grid = (ImageView) findViewById(R.id.grid);

		a_bin_that_holds_rubbish_until_it_is_collected_ = (TextView) findViewById(R.id.a_bin_that_holds_rubbish_until_it_is_collected_);
	
		
		//custom code goes here

		home.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				// Code to navigate to the next activity or fragment
				Intent intent = new Intent(trash_box_activity.this, home_page_activity.class); // Change to your next activity
				startActivity(intent);
			}
		});


		settings.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				// Code to navigate to the next activity or fragment
				Intent intent = new Intent(trash_box_activity.this, setting_activity.class); // Change to your next activity
				startActivity(intent);
			}
		});

		people.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				// Code to navigate to the next activity or fragment
				Intent intent = new Intent(trash_box_activity.this, prefile_activity.class); // Change to your next activity
				startActivity(intent);
			}
		});

		grid.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				// Code to navigate to the next activity or fragment
				Intent intent = new Intent(trash_box_activity.this, scrap_rates_activity.class); // Change to your next activity
				startActivity(intent);
			}
		});


	
	}
}
	
	