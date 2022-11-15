package com.example.ritmentor;

import static com.example.ritmentor.R.*;
import static com.example.ritmentor.R.id.*;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Calendar;

public class StudentDetailsActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    private TextView DOB,YOA;
    String[] branches = { "Select Branch","CSE", "ECE", "EEE", "MECH", "CIVIL"},sections ={"A","B","C"},admission ={"Select Type","Convener quota","Management Quota"},
            genders  = {"Select Your Gender","Male","Female","Other"},blood ={"A RhD positive (A+)","A RhD negative (A-)"
            ,"B RhD positive (B+)","B RhD negative (B-)","O RhD positive (O+)","O RhD negative (O-)","AB RhD positive (AB+)","AB RhD negative (AB-)"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_student_details);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        View decorView = getWindow().getDecorView();
        int uiOptions = View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                | View.SYSTEM_UI_FLAG_FULLSCREEN;
        decorView.setSystemUiVisibility(uiOptions);
        Spinner spin = (Spinner) findViewById(branchSpinner);
        spin.setOnItemSelectedListener(this);
        ArrayAdapter aa = new ArrayAdapter(this, layout.spinner_dropdown_item,branches);
        aa.setDropDownViewResource(layout.spinner_dropdown_item);
        spin.setAdapter(aa);

        Spinner spin1 = (Spinner) findViewById(sectionSpinner);
        spin1.setOnItemSelectedListener(this);
        ArrayAdapter aa1 = new ArrayAdapter(this, layout.spinner_dropdown_item,sections);
        aa1.setDropDownViewResource(layout.spinner_dropdown_item);
        spin1.setAdapter(aa1);

        Spinner spin2 = (Spinner) findViewById(admittedUnderSpinner);
        spin2.setOnItemSelectedListener(this);
        ArrayAdapter aa2 = new ArrayAdapter(this, layout.spinner_dropdown_item,admission);
        aa2.setDropDownViewResource(layout.spinner_dropdown_item);
        spin2.setAdapter(aa2);

        Spinner spin3 = (Spinner) findViewById(genderSpinner);
        spin3.setOnItemSelectedListener(this);
        ArrayAdapter aa3 = new ArrayAdapter(this, layout.spinner_dropdown_item,genders);
        aa3.setDropDownViewResource(layout.spinner_dropdown_item);
        spin3.setAdapter(aa3);

        Spinner spin4 = (Spinner) findViewById(bloodGroupSpinner);
        spin4.setOnItemSelectedListener(this);
        ArrayAdapter aa4 = new ArrayAdapter(this, layout.spinner_dropdown_item,blood);
        aa4.setDropDownViewResource(layout.spinner_dropdown_item);
        spin4.setAdapter(aa4);

        YOA = findViewById(yearOfAdmission);
        YOA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final Calendar c = Calendar.getInstance();

                // on below line we are getting
                // our day, month and year.
                int year = c.get(Calendar.YEAR);
                int month = c.get(Calendar.MONTH);
                int day = c.get(Calendar.DAY_OF_MONTH);

                // on below line we are creating a variable for date picker dialog.
                DatePickerDialog datePickerDialog = new DatePickerDialog(StudentDetailsActivity.this,(view1, year1, monthOfYear, dayOfMonth) -> {
                    YOA.setText(dayOfMonth + "/" + (monthOfYear + 1) + "/" + year1);
                },year, month, day);
                datePickerDialog.show();
            }
        });
        DOB = findViewById(dateOfBirth);
        DOB.setOnClickListener(view -> {

            // on below line we are getting
            // the instance of our calendar.
            final Calendar c = Calendar.getInstance();

            // on below line we are getting
            // our day, month and year.
            int year = c.get(Calendar.YEAR);
            int month = c.get(Calendar.MONTH);
            int day = c.get(Calendar.DAY_OF_MONTH);

            // on below line we are creating a variable for date picker dialog.
            DatePickerDialog datePickerDialog = new DatePickerDialog(StudentDetailsActivity.this,(view1, year1, monthOfYear, dayOfMonth) -> {
                        DOB.setText(dayOfMonth + "/" + (monthOfYear + 1) + "/" + year1);
                    },year, month, day);
            datePickerDialog.show();
        });
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        switch (adapterView.getId()){
            case branchSpinner:
//                Toast.makeText(getApplicationContext(),branches[i] , Toast.LENGTH_SHORT).show();
                break;
            case sectionSpinner:
//                Toast.makeText(getApplicationContext(),sections[i] , Toast.LENGTH_SHORT).show();
                break;
            case admittedUnderSpinner:
//                Toast.makeText(getApplicationContext(),admission[i] , Toast.LENGTH_SHORT).show();
                break;
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}