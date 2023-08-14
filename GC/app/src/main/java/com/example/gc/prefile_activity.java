
	 
	/*
	 *	This content is generated from the API File Info.
	 *	(Alt+Shift+Ctrl+I).
	 *
	 *	@desc 		
	 *	@file 		prefile
	 *	@date 		Saturday 05th of August 2023 10:37:14 AM
	 *	@title 		Page 1
	 *	@author 	
	 *	@keywords 	
	 *	@generator 	Export Kit v1.3.figma
	 *
	 */
package com.example.gc;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;


import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class prefile_activity extends Activity {

	
	private View _bg__prefile_ek2;
	private ImageView arrow_1;
	private View rectangle_7;
	private ImageView images_removebg_preview_1;
	private ImageView _3178158_removebg_preview_1;
	private ImageView _455705_removebg_preview_1;
	private ImageView location_vector_icon_removebg_preview_1;
	private TextView user_name;

	private TextView __919123456789;
	private TextView user1234_gmail_com;
	private TextView chennai;
	private ImageView home;
	private ImageView settings;
	private ImageView people;
	private ImageView grid;
	private TextView profile;

	@SuppressLint("MissingInflatedId")
	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.prefile);


		arrow_1 = (ImageView) findViewById(R.id.arrow_1);
		rectangle_7 = (View) findViewById(R.id.rectangle_7);
		images_removebg_preview_1 = (ImageView) findViewById(R.id.images_removebg_preview_1);
		_3178158_removebg_preview_1 = (ImageView) findViewById(R.id._3178158_removebg_preview_1);
		_455705_removebg_preview_1 = (ImageView) findViewById(R.id._455705_removebg_preview_1);
		location_vector_icon_removebg_preview_1 = (ImageView) findViewById(R.id.location_vector_icon_removebg_preview_1);
		user_name = (TextView) findViewById(R.id.user_name);
		__919123456789 = (TextView) findViewById(R.id.__919123456789);
		user1234_gmail_com = (TextView) findViewById(R.id.user1234_gmail_com);
		chennai = (TextView) findViewById(R.id.chennai);

		home = (ImageView) findViewById(R.id.home);
		settings = (ImageView) findViewById(R.id.settings);
		people = (ImageView) findViewById(R.id.people);
		grid = (ImageView) findViewById(R.id.grid);

		profile = (TextView) findViewById(R.id.profile);
	
		
		//custom code goes here


		home.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				// Code to navigate to the next activity or fragment
				Intent intent = new Intent(prefile_activity.this, home_page_activity.class); // Change to your next activity
				startActivity(intent);
			}
		});

		grid.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				// Code to navigate to the next activity or fragment
				Intent intent = new Intent(prefile_activity.this, scrap_rates_activity.class); // Change to your next activity
				startActivity(intent);
			}
		});

		settings.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				// Code to navigate to the next activity or fragment
				Intent intent = new Intent(prefile_activity.this, setting_activity.class); // Change to your next activity
				startActivity(intent);
			}
		});
	
	}
}
	
	