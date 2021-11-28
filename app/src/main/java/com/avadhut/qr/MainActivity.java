package com.avadhut.qr;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button ScanBtn1;
    public static TextView scantext;
    public static TextView MyLink;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        scantext = (TextView) findViewById(R.id.scantext);
        ScanBtn1 = (Button) findViewById(R.id.ScanButton);

        ScanBtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), ScannerView.class));
            }
        });

        scantext.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View view) {
                String url = scantext.getText().toString();
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);

//             //   int[] arr = new int[2];
//                String ContainNo = "1,2,3,4,5,6,7,8,8";
//                int a = Integer.parseInt((ContainNo));
////                if ((scantext.toString() != ContainNo)) {
////                    startActivity(i);
////                } else {
////                    Toast.makeText(MainActivity.this, "Could Not Find Link", Toast.LENGTH_SHORT).show();
////                }
//
//                if (url.contains(a)) {
//                    Toast.makeText(MainActivity.this, "Could Not Find Link", Toast.LENGTH_SHORT).show();
//                } else {
//                    startActivity(i);
//                }
            }
        });
    }
}
//this link is when we click go button we pass uri to browser
//https://stackoverflow.com/questions/2201917/how-can-i-open-a-url-in-androids-web-browser-from-my-application

//below link when on click of textview we directly go to browser page
//https://stackoverflow.com/questions/43025993/how-do-i-open-a-browser-on-clicking-a-text-link-in-textview