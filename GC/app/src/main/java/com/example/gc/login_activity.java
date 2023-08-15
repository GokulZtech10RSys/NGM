
	 
	/*
	 *	This content is generated from the API File Info.
	 *	(Alt+Shift+Ctrl+I).
	 *
	 *	@desc 		
	 *	@file 		login
	 *	@date 		Thursday 03rd of August 2023 04:30:33 AM
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
import android.app.ProgressDialog;
import com.example.gc.model.login;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.ImageView;
import android.widget.Toast;
import java.util.*;
import com.android.volley.RequestQueue;
import com.example.gc.model.loginResponse;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

	public class login_activity extends Activity {
		private RequestQueue mRequestQueue;
		private View _bg__login_ek2;
		private TextView login_ek3;
		private EditText email;
		private EditText password;
		private Button login;
		private TextView don_t_have_an_account_signup;
		private TextView forget_password;

		private EditText passwordEditText;
		private ImageView pngtree_keep_our_city_clean_png_png_image_6099580_1;

		ProgressDialog pDialog;

		APIInterface apiInterface;

		private EditText emailEditText;

		@Override
		public void onCreate(Bundle savedInstanceState) {

			super.onCreate(savedInstanceState);
			setContentView(R.layout.login);
			apiInterface = APIClient.getClient().create(APIInterface.class);

			_bg__login_ek2 = (View) findViewById(R.id._bg__home_page_ek2);
			login_ek3 = (TextView) findViewById(R.id.login_ek3);
			emailEditText = findViewById(R.id.emailEditText);
			passwordEditText = findViewById(R.id.passwordEditText);
			Button loginButton = findViewById(R.id.loginButton);
			don_t_have_an_account_signup = (TextView) findViewById(R.id.don_t_have_an_account_signup);
			forget_password = (TextView) findViewById(R.id.forget_password);
			pngtree_keep_our_city_clean_png_png_image_6099580_1 = (ImageView) findViewById(R.id.pngtree_keep_our_city_clean_png_png_image_6099580_1);

			// login api call

			don_t_have_an_account_signup.setOnClickListener(new View.OnClickListener() {
				public void onClick(View v) {
					// Code to navigate to the next activity or fragment
					Intent intent = new Intent(login_activity.this, register_form_activity.class); // Change to your next activity
					startActivity(intent);
				}
			});


			loginButton.setOnClickListener(new View.OnClickListener() {
				public void onClick(View v) {
					// Code to navigate to the next activity or fragment

					loginResponse loginresponse = callloginapi();
					if(loginresponse.bool == true && loginresponse.status_code ==200){
						Intent intent = new Intent(login_activity.this, home_page_activity.class); // Change to your next activity
						intent.putExtra("username",loginresponse.userName);
						startActivity(intent);
					}else{
						Toast.makeText(login_activity.this, loginresponse.message , Toast.LENGTH_SHORT).show();
					}
//
				}
			});

			forget_password.setOnClickListener(new View.OnClickListener() {
				public void onClick(View v) {
					// Code to navigate to the next activity or fragment
					Intent intent = new Intent(login_activity.this, email_Activity.class); // Change to your next activity
					startActivity(intent);
				}
			});


		}


		private loginResponse callloginapi() {

			final loginResponse[] respdata = {null};
			login obj = new login(Integer.parseInt(emailEditText.getText().toString()), passwordEditText.getText().toString());
			Call<loginResponse> call = apiInterface.loginUser(obj);
			call.enqueue(new Callback<loginResponse>() {
				@Override
				public void onResponse(Call<loginResponse> call, Response<loginResponse> response) {
					respdata[0] = response.body();
				}
				@Override
				public void onFailure(Call<loginResponse> call, Throwable t) {
					Toast.makeText(login_activity.this, "Network Failed", Toast.LENGTH_SHORT).show();
				}
			});
			return respdata[0];
		}
	}




	