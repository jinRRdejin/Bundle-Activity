package com.example.bundleandactivity;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class BundleActivity extends MainActivity{
	
	
	private TextView shoNwame, showPass;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.bundle_activity);
		
		setTitle("你输入的用户名和密码");
		shoNwame = (TextView) findViewById(R.id.show_name);
		showPass = (TextView) findViewById(R.id.shwo_pass);
		
		//定义一个Bundle，取出intent中附加的数据
		Bundle bundle =getIntent().getExtras();
		//通过name与passwo关键字取出用户名与密码
		
		String getname = bundle.getString("name");
		String getpassword = bundle.getString("password");
		
		shoNwame.setText(getname);
		showPass.setText(getpassword);
		
		TextView btn = (TextView) findViewById(R.id.back);
		btn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				
				finish();
			}
		});
	}

}
