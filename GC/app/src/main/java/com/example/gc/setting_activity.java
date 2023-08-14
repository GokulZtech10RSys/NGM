
	 
	/*
	 *	This content is generated from the API File Info.
	 *	(Alt+Shift+Ctrl+I).
	 *
	 *	@desc 		
	 *	@file 		setting
	 *	@date 		Wednesday 09th of August 2023 04:09:29 AM
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

public class setting_activity extends Activity {

	
	private View _bg__setting_ek2;
	private View rectangle_7;
	private ImageView arrow_1;
	private ImageView images_removebg_preview_1;
	private ImageView home;
	private ImageView settings;
	private ImageView people;
	private ImageView grid;
	private TextView chennai;
	private ImageView location_vector_icon_removebg_preview_1;
	private TextView user1234_gmail_com;
	private ImageView _3178158_removebg_preview_1;
	private TextView __919123456789;
	private ImageView _455705_removebg_preview_1;
	private TextView setting_ek3;
	private TextView user_name_1234;
	private ImageView __help_90683_1;
	private TextView help;
	private ImageView images_removebg_preview_2;
	private TextView send_feedback;
	private TextView logout;

	@SuppressLint("MissingInflatedId")
	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.setting);

		
		_bg__setting_ek2 = (View) findViewById(R.id._bg__setting_ek2);
		rectangle_7 = (View) findViewById(R.id.rectangle_7);
		arrow_1 = (ImageView) findViewById(R.id.arrow_1);
		images_removebg_preview_1 = (ImageView) findViewById(R.id.images_removebg_preview_1);

		home = (ImageView) findViewById(R.id.home);
		settings = (ImageView) findViewById(R.id.settings);
		people = (ImageView) findViewById(R.id.people);
		grid = (ImageView) findViewById(R.id.grid);

		chennai = (TextView) findViewById(R.id.chennai);
		location_vector_icon_removebg_preview_1 = (ImageView) findViewById(R.id.location_vector_icon_removebg_preview_1);
		user1234_gmail_com = (TextView) findViewById(R.id.user1234_gmail_com);
		_3178158_removebg_preview_1 = (ImageView) findViewById(R.id._3178158_removebg_preview_1);
		__919123456789 = (TextView) findViewById(R.id.__919123456789);
		_455705_removebg_preview_1 = (ImageView) findViewById(R.id._455705_removebg_preview_1);
		setting_ek3 = (TextView) findViewById(R.id.setting_ek3);
		user_name_1234 = (TextView) findViewById(R.id.user_name_1234);
		__help_90683_1 = (ImageView) findViewById(R.id.__help_90683_1);
		help = (TextView) findViewById(R.id.help);
		images_removebg_preview_2 = (ImageView) findViewById(R.id.images_removebg_preview_2);
		send_feedback = (TextView) findViewById(R.id.send_feedback);

		logout = (TextView) findViewById(R.id.logout);
	
		
		//custom code goes here

		home.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				// Code to navigate to the next activity or fragment
				Intent intent = new Intent(setting_activity.this, home_page_activity.class); // Change to your next activity
				startActivity(intent);
			}
		});

		people.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				// Code to navigate to the next activity or fragment
				Intent intent = new Intent(setting_activity.this, prefile_activity.class); // Change to your next activity
				startActivity(intent);
			}
		});

		grid.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				// Code to navigate to the next activity or fragment
				Intent intent = new Intent(setting_activity.this, scrap_rates_activity.class); // Change to your next activity
				startActivity(intent);
			}
		});


	}
}
	
	