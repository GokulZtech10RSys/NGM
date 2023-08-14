
	 
	/*
	 *	This content is generated from the API File Info.
	 *	(Alt+Shift+Ctrl+I).
	 *
	 *	@desc 		
	 *	@file 		drop_your_trash
	 *	@date 		Monday 07th of August 2023 04:56:25 AM
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
import android.widget.TextView;
import android.widget.ImageView;

public class drop_your_trash_activity extends Activity {

	
	private View _bg__drop_your_trash_ek2;
	private View rectangle_7;
	private TextView _4_archieve_eco_tech_private_limited;
	private TextView recycling_center_in_chennai__tamil_nadu_address__14__velachery_rd__dhadeswaram_nagar__velachery__chennai__tamil_nadu_600042_phone__078455_61376;
	private ImageView images_removebg_preview_1;
	private ImageView arrow_1;
	private TextView drop_your_trash_ek3;
	private ImageView home;
	private ImageView settings;
	private ImageView people;
	private ImageView grid;
	private TextView _1_attai_company;
	private TextView recycling_center_in_chennai__tamil_nadu;
	private TextView address__28__deva_raja_st__tambaram_west__tambaram__chennai__tamil_nadu_600045__phone__094441_33058;
	private TextView _2_global_waste_recyclers_limited;
	private TextView recycling_center_in_chennai__tamil_nadu_address__saravana_complex__iiird_floor__200__peters_road__royapettah__chennai__tamil_nadu_600014_phone__044_2841_3401;
	private TextView _3_sree_e_waste_recycling_in_chennai;
	private TextView bottle___can_redemption_center_in_chennai__address__no__5__11th_st__ashtalakshmi_nagar__vanagaram__chennai__tamil_nadu_600116_phone__073581_82559;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.drop_your_trash);

		
		_bg__drop_your_trash_ek2 = (View) findViewById(R.id._bg__drop_your_trash_ek2);
		rectangle_7 = (View) findViewById(R.id.rectangle_7);
		_4_archieve_eco_tech_private_limited = (TextView) findViewById(R.id._4_archieve_eco_tech_private_limited);
		recycling_center_in_chennai__tamil_nadu_address__14__velachery_rd__dhadeswaram_nagar__velachery__chennai__tamil_nadu_600042_phone__078455_61376 = (TextView) findViewById(R.id.recycling_center_in_chennai__tamil_nadu_address__14__velachery_rd__dhadeswaram_nagar__velachery__chennai__tamil_nadu_600042_phone__078455_61376);
		images_removebg_preview_1 = (ImageView) findViewById(R.id.images_removebg_preview_1);
		arrow_1 = (ImageView) findViewById(R.id.arrow_1);
		drop_your_trash_ek3 = (TextView) findViewById(R.id.drop_your_trash_ek3);

		home = (ImageView) findViewById(R.id.home);
		settings = (ImageView) findViewById(R.id.settings);
		people = (ImageView) findViewById(R.id.people);
		grid = (ImageView) findViewById(R.id.grid);

		_1_attai_company = (TextView) findViewById(R.id._1_attai_company);
		recycling_center_in_chennai__tamil_nadu = (TextView) findViewById(R.id.recycling_center_in_chennai__tamil_nadu);
		address__28__deva_raja_st__tambaram_west__tambaram__chennai__tamil_nadu_600045__phone__094441_33058 = (TextView) findViewById(R.id.address__28__deva_raja_st__tambaram_west__tambaram__chennai__tamil_nadu_600045__phone__094441_33058);
		_2_global_waste_recyclers_limited = (TextView) findViewById(R.id._2_global_waste_recyclers_limited);
		recycling_center_in_chennai__tamil_nadu_address__saravana_complex__iiird_floor__200__peters_road__royapettah__chennai__tamil_nadu_600014_phone__044_2841_3401 = (TextView) findViewById(R.id.recycling_center_in_chennai__tamil_nadu_address__saravana_complex__iiird_floor__200__peters_road__royapettah__chennai__tamil_nadu_600014_phone__044_2841_3401);
		_3_sree_e_waste_recycling_in_chennai = (TextView) findViewById(R.id._3_sree_e_waste_recycling_in_chennai);
		bottle___can_redemption_center_in_chennai__address__no__5__11th_st__ashtalakshmi_nagar__vanagaram__chennai__tamil_nadu_600116_phone__073581_82559 = (TextView) findViewById(R.id.bottle___can_redemption_center_in_chennai__address__no__5__11th_st__ashtalakshmi_nagar__vanagaram__chennai__tamil_nadu_600116_phone__073581_82559);
	
		
		//custom code goes here

		people.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				// Code to navigate to the next activity or fragment
				Intent intent = new Intent(drop_your_trash_activity.this, prefile_activity.class); // Change to your next activity
				startActivity(intent);
			}
		});

		settings.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				// Code to navigate to the next activity or fragment
				Intent intent = new Intent(drop_your_trash_activity.this, setting_activity.class); // Change to your next activity
				startActivity(intent);
			}
		});


		home.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				// Code to navigate to the next activity or fragment
				Intent intent = new Intent(drop_your_trash_activity.this, home_page_activity.class); // Change to your next activity
				startActivity(intent);
			}
		});


		grid.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				// Code to navigate to the next activity or fragment
				Intent intent = new Intent(drop_your_trash_activity.this, scrap_rates_activity.class); // Change to your next activity
				startActivity(intent);
			}
		});
	
	}
}
	
	