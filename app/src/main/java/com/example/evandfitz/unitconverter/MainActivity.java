package com.example.evandfitz.unitconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements OnItemSelectedListener
{

    ArrayAdapter<String> Main, Temp, Time, Mass, Volume, Area, Length;

    Spinner spinner1, spinner2, spinner3;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //set values
        Main = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_list_item_1,
                getResources().getStringArray(R.array.Main));
        Main.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        Temp = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_list_item_1,
                getResources().getStringArray(R.array.Temp));
        Temp.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        Time = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_list_item_1,
                getResources().getStringArray(R.array.Time));
        Time.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        Mass = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_list_item_1,
                getResources().getStringArray(R.array.Mass));
        Mass.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        Volume = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_list_item_1,
                getResources().getStringArray(R.array.Vol));
        Volume.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        Area = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_list_item_1,
                getResources().getStringArray(R.array.Area));
        Area.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        Length = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_list_item_1,
                getResources().getStringArray(R.array.Length));
        Length.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner1 = (Spinner) findViewById(R.id.spinner1);
        spinner1.setAdapter(Main);

        spinner2 = (Spinner) findViewById(R.id.spinner2);
        spinner2.setAdapter(Length);

        spinner3 = (Spinner) findViewById(R.id.spinner3);
        spinner3.setAdapter(Length);

        spinner1.setOnItemSelectedListener(this);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int pos,long id)
    {
        if(spinner1.getSelectedItem().toString().equals("Area"))
        {
            spinner2.setAdapter(Area);
            spinner3.setAdapter(Area);
        }
        else if (spinner1.getSelectedItem().toString().equals("Length"))
        {
            spinner2.setAdapter(Length);
            spinner3.setAdapter(Length);
        }
        else if (spinner1.getSelectedItem().toString().equals("Mass"))
        {
            spinner2.setAdapter(Mass);
            spinner3.setAdapter(Mass);
        }
        else if (spinner1.getSelectedItem().toString().equals("Time"))
        {
            spinner2.setAdapter(Time);
            spinner3.setAdapter(Time);
        }
        else if (spinner1.getSelectedItem().toString().equals("Temperature"))
        {
            spinner2.setAdapter(Temp);
            spinner3.setAdapter(Temp);
        }
        else if (spinner1.getSelectedItem().toString().equals("Volume"))
        {
            spinner2.setAdapter(Volume);
            spinner3.setAdapter(Volume);
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> arg0)
    {

    }


}
