package com.teachics.ipaddress;
import androidx.appcompat.app.AppCompatActivity;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.text.format.Formatter;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView txtip;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtip = findViewById(R.id.textView);
        WifiManager wifiManager = (WifiManager) getApplicationContext().getSystemService(WIFI_SERVICE);
        String ipAddress = Formatter.formatIpAddress(wifiManager.getConnectionInfo().getIpAddress());
        txtip.setText("Your device IP address " + ipAddress);
    }
}
