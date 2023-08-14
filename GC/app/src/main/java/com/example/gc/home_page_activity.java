
	 
	/*
	 *	This content is generated from the API File Info.
	 *	(Alt+Shift+Ctrl+I).
	 *
	 *	@desc 		
	 *	@file 		home_page
	 *	@date 		Friday 04th of August 2023 03:39:21 AM
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
import android.net.Uri;
import android.os.Bundle;


import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class home_page_activity extends Activity {

	
	private View _bg__home_page_ek2;
	private View rectangle_7;
	private ImageView arrow_1;
	private ImageView home_outline_removebg_preview_1;
	private ImageView settings;
	private ImageView people;
	private ImageView grid;
	private ImageView images_removebg_preview_1;
	private ImageView rectangle_8;
	private TextView hello_user;
	private ImageView scrap_rate_image;
	private ImageView rubbish_container_for_organic_waste_icon_recycle_vector_15577088_removebg_preview_1;
	private ImageView _251_2519834_delivery_rider_delivery_order_png_1;
	private ImageView _633ffb0f40a99666d4743bf3_recycle_reduce_reuse_green_logo_sign_removebg_preview_1;
	private ImageView video;
	private ImageView camera_1;
	private ImageView _297_2973999_pretentious_process_clipart_the_recycling_social_studies_recycling_factory_clipart_removebg_preview_1;
	private ImageView whatsapp;
	private TextView any_complaints;
	private TextView drop_your_trash;
	private TextView recycling_videos;
	private TextView trash_box;
	private TextView scrap_rate;
	private TextView your_recycle_orders;

	@SuppressLint("MissingInflatedId")
	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.home_page);


		_bg__home_page_ek2 = (View) findViewById(R.id._bg__home_page_ek2);
		rectangle_7 = (View) findViewById(R.id.rectangle_7);
		arrow_1 = (ImageView) findViewById(R.id.arrow_1);
		home_outline_removebg_preview_1 = (ImageView) findViewById(R.id.home_outline_removebg_preview_1);

		settings = (ImageView) findViewById(R.id.settings);
		people = (ImageView) findViewById(R.id.people);
		grid= (ImageView) findViewById(R.id.grid);

		images_removebg_preview_1 = (ImageView) findViewById(R.id.images_removebg_preview_1);
		rectangle_8 = (ImageView) findViewById(R.id.rectangle_8);
		hello_user = (TextView) findViewById(R.id.hello_user);
		scrap_rate_image =findViewById(R.id.scrap_rate_image);
		rubbish_container_for_organic_waste_icon_recycle_vector_15577088_removebg_preview_1 = (ImageView) findViewById(R.id.rubbish_container_for_organic_waste_icon_recycle_vector_15577088_removebg_preview_1);
		_251_2519834_delivery_rider_delivery_order_png_1 = (ImageView) findViewById(R.id._251_2519834_delivery_rider_delivery_order_png_1);
		_633ffb0f40a99666d4743bf3_recycle_reduce_reuse_green_logo_sign_removebg_preview_1 = (ImageView) findViewById(R.id._633ffb0f40a99666d4743bf3_recycle_reduce_reuse_green_logo_sign_removebg_preview_1);

		video = (ImageView) findViewById(R.id.video);
		camera_1 = (ImageView) findViewById(R.id.camera_1);

		_297_2973999_pretentious_process_clipart_the_recycling_social_studies_recycling_factory_clipart_removebg_preview_1 = (ImageView) findViewById(R.id._297_2973999_pretentious_process_clipart_the_recycling_social_studies_recycling_factory_clipart_removebg_preview_1);
		whatsapp = (ImageView) findViewById(R.id.whatsapp);

		any_complaints = (TextView) findViewById(R.id.any_complaints);
		drop_your_trash = (TextView) findViewById(R.id.drop_your_trash);
		recycling_videos = (TextView) findViewById(R.id.recycling_videos);
		trash_box = (TextView) findViewById(R.id.trash_box);
		scrap_rate = (TextView) findViewById(R.id.scrap_rate);
		your_recycle_orders = (TextView) findViewById(R.id.your_recycle_orders);


		//custom code goes here

		scrap_rate_image.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				// Code to navigate to the next activity or fragment
				Intent intent = new Intent(home_page_activity.this, scrap_rates_activity.class); // Change to your next activity
				startActivity(intent);
			}
		});

		camera_1.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				// Code to navigate to the next activity or fragment
				Intent intent = new Intent(home_page_activity.this, trash_box_activity.class); // Change to your next activity
				startActivity(intent);
			}
		});

		_297_2973999_pretentious_process_clipart_the_recycling_social_studies_recycling_factory_clipart_removebg_preview_1.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				// Code to navigate to the next activity or fragment
				Intent intent = new Intent(home_page_activity.this, drop_your_trash_activity.class); // Change to your next activity
				startActivity(intent);
			}
		});

		settings.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				// Code to navigate to the next activity or fragment
				Intent intent = new Intent(home_page_activity.this, setting_activity.class); // Change to your next activity
				startActivity(intent);
			}
		});

		people.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				// Code to navigate to the next activity or fragment
				Intent intent = new Intent(home_page_activity.this, prefile_activity.class); // Change to your next activity
				startActivity(intent);
			}
		});

		grid.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				// Code to navigate to the next activity or fragment
				Intent intent = new Intent(home_page_activity.this, scrap_rates_activity.class); // Change to your next activity
				startActivity(intent);
			}
		});


		video.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {
				Intent intent = new Intent();
				intent.setAction(Intent.ACTION_VIEW);
				intent.addCategory(Intent.CATEGORY_BROWSABLE);
				intent.setData(Uri.parse("https://www.youtube.com/watch?v=4JDGFNoY-rQ"));
				startActivity(intent);
			}
		});


	}
}
	
	