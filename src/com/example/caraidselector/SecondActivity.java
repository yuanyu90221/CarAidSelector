package com.example.caraidselector;

import com.example.caraidselector.models.CarType;
import com.example.caraidselector.models.CustomObj;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class SecondActivity extends Activity implements OnClickListener{
    TextView rent_current_name,rt_from, rt_to, pay_tp_txt;
    ImageView tp_image;
    Button goback;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_second);
		rent_current_name = (TextView) findViewById(R.id.rent_current_name);
		tp_image = (ImageView) findViewById(R.id.tp_image);
		rt_from = (TextView) findViewById(R.id.rt_from);
		rt_to = (TextView) findViewById(R.id.rt_to);
		pay_tp_txt = (TextView) findViewById(R.id.pay_tp_txt);
		goback = (Button) findViewById(R.id.goback);
		goback.setOnClickListener(this);
 		Intent it = this.getIntent();
		if(it != null){
			CustomObj co = null;
			co = (CustomObj) this.getIntent().getSerializableExtra("customObj");
			if(co!= null){
				rent_current_name.setText(co.getRent_name());
				rt_from.setText(co.getRent_from().getAreaName());
				rt_to.setText(co.getRent_to().getAreaName());
				pay_tp_txt.setText(co.getPaytp().getTypeName());
				CarType carTp = co.getCartp();
				int id = carTp.getId();
				switch(id){
					case 0:
						tp_image.setImageDrawable(getResources().getDrawable(R.drawable.motorcycle));
						tp_image.setVisibility(View.VISIBLE);
						break;
					case 1:
						tp_image.setImageDrawable(getResources().getDrawable(R.drawable.sports_car));
						tp_image.setVisibility(View.VISIBLE);
						break;
					case 2:
						tp_image.setImageDrawable(getResources().getDrawable(R.drawable.suv));
						tp_image.setVisibility(View.VISIBLE);
						break;
					case 3:
						tp_image.setImageDrawable(getResources().getDrawable(R.drawable.bens));
						tp_image.setVisibility(View.VISIBLE);
						break;
				}
			}
		}
		
	}
	@Override
	public void onClick(View v) {
		if(v.getId()==R.id.goback){
			finish();
		}
	}
	

	
}
