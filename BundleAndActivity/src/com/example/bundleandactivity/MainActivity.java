package com.example.bundleandactivity;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {
	 private EditText name,password;
	 private Button login,reset;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }
    
	private void initView() {
		name = (EditText) findViewById(R.id.name);
		password = (EditText) findViewById(R.id.pas);
		login = (Button) findViewById(R.id.login);
		reset = (Button) findViewById(R.id.reset);
		
		login.setOnClickListener(loginView);
		reset.setOnClickListener(resetView);
	}
	
	private View.OnClickListener loginView =new View.OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			String names = name.getText().toString();
			String passwords = password.getText().toString();
			
			Intent intent = new Intent(MainActivity.this ,BundleActivity.class);
			
			//创建一个Bundle，用来在Activity间传递数据
			Bundle bundle = new Bundle();
			//用putString(String key, string value);来传递值，key为关键字，value为传递的值  
			bundle.putString("name", names);
			bundle.putString("password", passwords);
			//将要传递的值附加到intent上
			intent.putExtras(bundle);
			//启动intent
			startActivity(intent);
		}
	};
	private View.OnClickListener resetView= new View.OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			name.setText(" ");
			password.setText("");
		}
	};

}
