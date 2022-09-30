package com.example.claculator;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		final EditText et = (EditText) findViewById(R.id.et1);
		final Button zero = (Button) findViewById(R.id.zero);
		zero.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				String edit = et.getText().toString();
				Toast.makeText(getApplicationContext(), "you have clicked:0",
						Toast.LENGTH_SHORT).show();
				et.setText(edit + 0);
			}

			private void Text_setText(String edit) {
				// TODO Auto-generated method stub

			}
		});
		final Button one = (Button) findViewById(R.id.one);
		one.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				String edit = et.getText().toString();
				Toast.makeText(getApplicationContext(), "you have clicked:1",
						Toast.LENGTH_SHORT).show();
				et.setText(edit + 1);
			}
		});
		final Button two = (Button) findViewById(R.id.two);
		two.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				String edit = et.getText().toString();
				Toast.makeText(getApplicationContext(), "you have clicked:2",
						Toast.LENGTH_SHORT).show();
				et.setText(edit + 2);
			}
		});
		final Button three = (Button) findViewById(R.id.three);
		three.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				String edit = et.getText().toString();
				Toast.makeText(getApplicationContext(), "you have clicked:3",
						Toast.LENGTH_SHORT).show();
				et.setText(edit + 3);
			}
		});
		final Button four = (Button) findViewById(R.id.four);
		four.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				String edit = et.getText().toString();
				Toast.makeText(getApplicationContext(), "you have clicked:4",
						Toast.LENGTH_SHORT).show();
				et.setText(edit + 4);
			}
		});
		final Button five = (Button) findViewById(R.id.five);
		five.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				String edit = et.getText().toString();
				Toast.makeText(getApplicationContext(), "you have clicked:5",
						Toast.LENGTH_SHORT).show();
				et.setText(edit + 5);
			}
		});
		final Button six = (Button) findViewById(R.id.six);
		six.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				String edit = et.getText().toString();
				Toast.makeText(getApplicationContext(), "you have clicked:6",
						Toast.LENGTH_SHORT).show();
				et.setText(edit + 6);
			}
		});
		final Button seven = (Button) findViewById(R.id.seven);
		seven.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				String edit = et.getText().toString();
				Toast.makeText(getApplicationContext(), "you have clicked:7",
						Toast.LENGTH_SHORT).show();
				et.setText(edit + 7);
			}
		});
		final Button eight = (Button) findViewById(R.id.eight);
		eight.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				String edit = et.getText().toString();
				Toast.makeText(getApplicationContext(), "you have clicked:8",
						Toast.LENGTH_SHORT).show();
				et.setText(edit + 8);
			}
		});
		final Button nine = (Button) findViewById(R.id.nine);
		nine.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				String edit = et.getText().toString();
				Toast.makeText(getApplicationContext(), "you have clicked:9",
						Toast.LENGTH_SHORT).show();
				et.setText(edit + 9);
			}
		});
		final Button plus = (Button) findViewById(R.id.plus);
		plus.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				String edit = et.getText().toString();
				Toast.makeText(getApplicationContext(), "you have clicked:+",
						Toast.LENGTH_SHORT).show();
				et.setText(edit + "+");
			}
		});
		final Button sub = (Button) findViewById(R.id.sub);
		sub.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				String edit = et.getText().toString();
				Toast.makeText(getApplicationContext(), "you have clicked:-",
						Toast.LENGTH_SHORT).show();
				et.setText(edit + "-");
			}
		});
		final Button divide = (Button) findViewById(R.id.divide);
		divide.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				String edit = et.getText().toString();
				Toast.makeText(getApplicationContext(), "you have clicked:%",
						Toast.LENGTH_SHORT).show();
				et.setText(edit + "/");
			}
		});
		final Button multiple = (Button) findViewById(R.id.multiple);
		multiple.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				String edit = et.getText().toString();
				Toast.makeText(getApplicationContext(), "you have clicked:*",
						Toast.LENGTH_SHORT).show();
				et.setText(edit + "*");
			}
		});
		final Button dot = (Button) findViewById(R.id.dot);
		dot.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				String edit = et.getText().toString();
				Toast.makeText(getApplicationContext(), "you have clicked:.",
						Toast.LENGTH_SHORT).show();
				et.setText(edit + "    .");
			}
		});
		final EditText ans = (EditText) findViewById(R.id.et2);
		final Button equal = (Button) findViewById(R.id.equal);
		equal.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				int edit = Integer.parseInt(et.getText().toString());
				int a = edit;
				Toast.makeText(getApplicationContext(), "you have clicked:=",
						Toast.LENGTH_SHORT).show();
				ans.setText(String.valueOf(a));

			}
		});
	}

}