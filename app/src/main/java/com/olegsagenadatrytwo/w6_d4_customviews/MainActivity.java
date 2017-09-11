package com.olegsagenadatrytwo.w6_d4_customviews;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    CustomPieGraph pieChartView;
    CustomButton btnCustom;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pieChartView = (CustomPieGraph) findViewById(R.id.pie_chart);
        btnCustom = (CustomButton) findViewById(R.id.btnCustom);
        float[] datapoints = {450, 1230, 200, 400};
        pieChartView.setDataPoints(datapoints);
        btnCustom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "This is a Custom View extending from Button", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
