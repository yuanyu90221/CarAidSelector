package com.example.caraidselector;

import com.example.caraidselector.constant.IntentConstant;
import com.example.caraidselector.models.AreaType;
import com.example.caraidselector.models.CarType;
import com.example.caraidselector.models.CustomObj;
import com.example.caraidselector.models.PayType;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Spinner;

public class MainActivity extends Activity implements OnClickListener,android.view.View.OnClickListener{
    Button submit;
    EditText input;
    Spinner rentTp, rentStOp, rentEdOp;
    RadioGroup payTp;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);   
	}

	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
		submit = (Button) findViewById(R.id.submit);
		submit.setOnClickListener(this);
		input = (EditText) findViewById(R.id.input_name);
		rentTp = (Spinner) findViewById(R.id.rentTp); 
		rentStOp = (Spinner) findViewById(R.id.rentStOp);
		rentEdOp = (Spinner) findViewById(R.id.rentEdOp);
		payTp = (RadioGroup)findViewById(R.id.payTp);
		AlertDialog.Builder bdr = new AlertDialog.Builder(this);
	        bdr.setMessage("歡迎來到無本租車\n" // 加入文字訊息
	        				+"請按返回鍵關閉交談窗!");
	        bdr.setTitle("專業租車");        // 加入標題                  
	        bdr.setIcon(R.drawable.rent_logo_small); // 加入圖示
	      
	        bdr.setCancelable(true);   // 允許按返回鍵關閉交談窗
	        bdr.setPositiveButton("了解", this);  // 加入否定按鈕
	        bdr.show();
	   
	    refreshAll();
	}

	@Override
	public void onClick(DialogInterface dialog, int which) {
		if(which == DialogInterface.BUTTON_POSITIVE){
			dialog.cancel();
		}
		
	}

	@Override
	public void onClick(View v) {
		if(v.getId()==R.id.submit){
			String rent_name = input.getText().toString().replaceAll("\\s","");
			int payType = payTp.getCheckedRadioButtonId();
			int rentType = rentTp.getSelectedItemPosition();
			int rentFrom = rentStOp.getSelectedItemPosition();
			int rentTo = rentEdOp.getSelectedItemPosition();
			if(rent_name.length() > 0){
				PayType pay_tp = PayType.CASH;
				switch(payType){
					case R.id.cash:
						pay_tp = PayType.CASH;
						break;
					case R.id.credit_card:
						pay_tp = PayType.CREDIT;
						break;
				}
				CarType carTp = CarType.getTypeFromId(rentType);
				AreaType rent_from = AreaType.getTypeFromId(rentFrom);
				AreaType rent_to = AreaType.getTypeFromId(rentTo);
				CustomObj co = new CustomObj(rent_name,pay_tp,carTp, rent_from, rent_to);
				Intent it = new Intent(this, SecondActivity.class);
				Bundle bundle = new Bundle();
				bundle.putSerializable(IntentConstant.CUSTOM_OBJ, co);
				it.putExtras(bundle);
				startActivity(it);
			}
			else{
				input.setText("");
				input.setHint("please enter Name");
			}
		}
	}

	public void refreshAll(){
		input.setText("");
		rentTp.setSelection(0);
		rentStOp.setSelection(0);
		rentEdOp.setSelection(0);
	}
	

	
}
