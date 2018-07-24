package com.example.a10305_5.calculator;

        import android.content.Intent;
        import android.nfc.Tag;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.util.Log;
        import android.view.View;
        import android.widget.Button;
        import android.widget.EditText;
        import android.widget.RadioGroup;

        import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    private EditText editText;
    private Button button;
    private RadioGroup radioGroup;
    private String strTemperature;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText=(EditText) findViewById(R.id.editText3);
        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View view) {

                try {
                    strTemperature = editText.getText().toString().trim();
                    if (strTemperature.equals("")) {
                        Log.d("wachirawit", "Have space in blank ");

                    } else {
                        Log.d("wachirawit", "No space =" + strTemperature);
                        Intent intent1 = new Intent(MainActivity.this, Result.class);
                        startActivity(intent1);
                    }
                }catch (Exception e){}


    }
  });

    }}