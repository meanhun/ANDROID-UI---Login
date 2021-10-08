package com.meanhun;


import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;


import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    CheckBox check_save;
    Button btn_login;
    TextView forgot_password;
    EditText input_phone, input_password;
    ImageButton imb_fb,imb_tw,imb_ld,imb_go;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addControls();
        addEvent();
        Typeface typeface = Typeface.createFromAsset(getAssets(),"font/customfont.otf");
        forgot_password.setTypeface(typeface);
        input_phone.setTypeface(typeface);
        input_password.setTypeface(typeface);
    }

    private void addEvent() {
        //Sự kiện kiểm tra 2 input login
        checknullInput();
        //Sự kiện nhấn nút đăng nhập
        eVentbuttonOnclick();
        //Sự kiện lưu thông tin tài khoản - mật khẩu
        eVentCheckSave();
        //sự kiện imgButton
        eVentImgOnclick();
    }
    //event create new acccount from xml
    public void createNewAccount(View view) {
        Toast.makeText(MainActivity.this, "Bạn đã nhấn đăng kí tài khoản", Toast.LENGTH_SHORT).show();
    }
    //event onclick checkbox save info from xml
    public void forgot_password(View view) {
        Toast.makeText(MainActivity.this, "Bạn đã nhấn cấp lại mật khẩu", Toast.LENGTH_SHORT).show();
    }
    //line 38
    private void eVentCheckSave() {
        if (check_save.isChecked()){
            Toast.makeText(MainActivity.this, "Bạn đã chọn lưu thông tin đăng nhập", Toast.LENGTH_SHORT).show();
        }
    }
    //line 36
    private void eVentbuttonOnclick() {
        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Đã nhấn đăng nhập", Toast.LENGTH_SHORT).show();
            }
        });
    }
    //line 34
    private void checknullInput() {
        input_phone.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                if (input_phone.getText().toString().matches("")) {
                    input_phone.setCompoundDrawablesWithIntrinsicBounds(null, null,
                            ContextCompat.getDrawable(getApplicationContext(), R.drawable.nocheck), null);
                }else{
                    input_phone.setCompoundDrawablesWithIntrinsicBounds(null, null,
                            ContextCompat.getDrawable(getApplicationContext(), R.drawable.ischecked), null);
                }
            }
        });
        input_password.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                if (input_password.getText().toString().matches("")) {
                    input_password.setCompoundDrawablesWithIntrinsicBounds(null, null,
                            ContextCompat.getDrawable(getApplicationContext(), R.drawable.nocheck), null);
                }else{
                    input_password.setCompoundDrawablesWithIntrinsicBounds(null, null,
                            ContextCompat.getDrawable(getApplicationContext(), R.drawable.ischecked), null);
                }
            }
        });
    }

    private void addControls() {
        //textView onclick
        forgot_password = findViewById(R.id.forgot_password);
        // button login
        btn_login = findViewById(R.id.btn_Login);
        //edittext
        input_phone = findViewById(R.id.input_phone);
        input_password = findViewById(R.id.input_password);
        //check button
        check_save = findViewById(R.id.check_save);
        //image button
        imb_fb = findViewById(R.id.img_fb);
        imb_tw = findViewById(R.id.img_tw);
        imb_ld = findViewById(R.id.img_ld);
        imb_go = findViewById(R.id.img_go);
    }

    //Line 40
    private void eVentImgOnclick() {
        imb_fb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Chúng tôi chưa cấp phép cho Facebook!", Toast.LENGTH_SHORT).show();
            }
        });
        imb_tw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Chúng tôi chưa cấp phép cho twitter!", Toast.LENGTH_SHORT).show();
            }
        });
        imb_go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Chúng tôi chưa cấp phép cho google!", Toast.LENGTH_SHORT).show();
            }
        });
        imb_ld.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Chúng tôi chưa cấp phép cho linkedin!", Toast.LENGTH_SHORT).show();
            }
        });
    }


}