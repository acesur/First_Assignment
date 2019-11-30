package com.example.first_assignment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText etAdult,etChildren,etRooms;
    private TextView tvCheckIn,tvCheckOut,tvTotal,tvLocation,tvRoomType,tvTotalRoom,tvServiceC,tvVat,tvOutputCheckIn,tvOutputCheckOut;
    private Button btnCalculate;
    private Boolean d1,d2;
    private Spinner spinLocation,spinRoom;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
