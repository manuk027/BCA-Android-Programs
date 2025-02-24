package com.example.user.myapplication02;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {
EditText editText;
Button button;
TextView textView;
String result;
@Override
protected void onCreate(Bundle savedInstanceState) {
super.onCreate(savedInstanceState);
setContentView(R.layout.activity_main);
editText=(EditText)findViewById(R.id.et1);
button =(Button)findViewById(R.id.bt1);
textView=(TextView)findViewById(R.id.tv2);
button.setOnClickListener(new View.OnClickListener()
{
@Override
public void onClick(View v) {
String number = editText.getText().toString();
int n = Integer.parseInt(number);
result = "";
for (int i = 1; i <= 10; i++) {
result += n + "" + "*" + i + "" + "=" + "" + n * i + "\n";
textView.setText(result);
}
}
});
}
}
