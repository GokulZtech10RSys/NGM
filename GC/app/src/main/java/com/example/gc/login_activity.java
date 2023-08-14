
	 
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

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.ImageView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.Map;

	public class login_activity extends Activity {
		private RequestQueue mRequestQueue;
		private View _bg__login_ek2;
		private TextView login_ek3;
		private EditText email;
		private EditText password;
		private Button login;
		private TextView don_t_have_an_account_signup;
		private TextView forget_password;
		private ImageView pngtree_keep_our_city_clean_png_png_image_6099580_1;

		ProgressDialog pDialog;


		@Override
		public void onCreate(Bundle savedInstanceState) {

			super.onCreate(savedInstanceState);
			setContentView(R.layout.login);


			_bg__login_ek2 = (View) findViewById(R.id._bg__home_page_ek2);
			login_ek3 = (TextView) findViewById(R.id.login_ek3);
			EditText emailEditText = findViewById(R.id.emailEditText);
			EditText passwordEditText = findViewById(R.id.passwordEditText);
			Button loginButton = findViewById(R.id.loginButton);
			don_t_have_an_account_signup = (TextView) findViewById(R.id.don_t_have_an_account_signup);
			forget_password = (TextView) findViewById(R.id.forget_password);
			pngtree_keep_our_city_clean_png_png_image_6099580_1 = (ImageView) findViewById(R.id.pngtree_keep_our_city_clean_png_png_image_6099580_1);

			getUser();
			//custom code goes here

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
					Intent intent = new Intent(login_activity.this, home_page_activity.class); // Change to your next activity
					startActivity(intent);
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

		private void getUser() {
			pDialog = ProgressDialog.show(login_activity.this, "", "Wait...", false, false);

			StringRequest stringRequest = new StringRequest(Request.Method.GET,
					"https://test-itht.onrender.com/v1/api/register", new Response.Listener<String>() {
				@Override
				public void onResponse(String response) {
					try {
						pDialog.dismiss();
						JSONObject jsonObject = new JSONObject(response);

					} catch (JSONException e) {
						e.printStackTrace();
					}

				}
			},
					new Response.ErrorListener() {
						@Override
						public void onErrorResponse(VolleyError error) {
							pDialog.dismiss();
							Toast.makeText(login_activity.this, "something_went_wrong", Toast.LENGTH_SHORT).show();
						}
					});

			RequestQueue requestQueue = Volley.newRequestQueue(login_activity.this);
			requestQueue.add(stringRequest);
		}
}
	
	