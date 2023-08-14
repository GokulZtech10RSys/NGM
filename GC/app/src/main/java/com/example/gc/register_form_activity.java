
	 
	/*
	 *	This content is generated from the API File Info.
	 *	(Alt+Shift+Ctrl+I).
	 *
	 *	@desc 		
	 *	@file 		register_form
	 *	@date 		Thursday 03rd of August 2023 04:53:24 AM
	 *	@title 		Page 1
	 *	@author 	
	 *	@keywords 	
	 *	@generator 	Export Kit v1.3.figma
	 *
	 */


package com.example.gc;;

import android.app.Activity;
	import android.content.Intent;
	import android.os.Bundle;


import android.view.View;
	import android.widget.Button;
	import android.widget.EditText;
	import android.widget.TextView;
import android.widget.ImageView;

public class register_form_activity extends Activity {


	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.register_form);


		View _bg__register_form_ek2 = (View) findViewById(R.id._bg__home_page_ek2);
		EditText email = (EditText) findViewById(R.id.emailEditText);
		EditText phone_number = (EditText) findViewById(R.id.phoneEditText);
		TextView new_password = (EditText) findViewById(R.id.newPasswordEditText);
		EditText confirm_password = (EditText) findViewById(R.id.confirmPasswordEditText);
		Button register = (Button) findViewById(R.id.register);
		TextView already_have_an_account_login = (TextView) findViewById(R.id.already_have_an_account_login);
		EditText name = (EditText) findViewById(R.id.nameEditText);
		ImageView pngtree_keep_our_city_clean_png_png_image_6099580_2 = (ImageView) findViewById(R.id.pngtree_keep_our_city_clean_png_png_image_6099580_2);
	
		
		//custom code goes here


		already_have_an_account_login.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				// Code to navigate to the next activity or fragment
				Intent intent = new Intent(register_form_activity.this, login_activity.class); // Change to your next activity
				startActivity(intent);
			}
		});


	}
}
	
	