
	 
	/*
	 *	This content is generated from the API File Info.
	 *	(Alt+Shift+Ctrl+I).
	 *
	 *	@desc 		
	 *	@file 		getstart
	 *	@date 		Wednesday 02nd of August 2023 12:17:12 PM
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
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class getstart_activity extends Activity {

	
	private View _bg__getstart_ek2;
	private ImageView png_transparent_rubbish_bins_waste_paper_baskets_bin_bag_garbage_miscellaneous_waste_garbage_truck_removebg_preview_1;
	private TextView garbage_waste;
	private View ellipse_1;
	private TextView get_start;

	private Button get_start_btn;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.getstart);

		
		_bg__getstart_ek2 = (View) findViewById(R.id._bg__getstart_ek2);
		png_transparent_rubbish_bins_waste_paper_baskets_bin_bag_garbage_miscellaneous_waste_garbage_truck_removebg_preview_1 = (ImageView) findViewById(R.id.png_transparent_rubbish_bins_waste_paper_baskets_bin_bag_garbage_miscellaneous_waste_garbage_truck_removebg_preview_1);
		garbage_waste = (TextView) findViewById(R.id.garbage_waste);
//		ellipse_1 = (View) findViewById(R.id.ellipse_1);
		get_start_btn = (Button) findViewById(R.id.get_start_btn);
		//custom code goes here
		OnBtnClick(get_start_btn);
	}
	public void OnBtnClick(Button btn){
		btn.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				Intent intent=new Intent(getstart_activity.this,login_activity.class);
				startActivity(intent);
			}
		});
	}
}
	
	