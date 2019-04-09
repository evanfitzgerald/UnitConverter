package com.example.evandfitz.unitconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import java.math.BigDecimal;
import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity implements OnItemSelectedListener
{


    ArrayAdapter<String> Main, Temp, Time, Mass, Volume, Area, Length;

    Spinner spinner1, spinner2, spinner3;

    TextView editText1;
    TextView textView1;

    Double y;

    // units

    BigDecimal Metre = BigDecimal.valueOf(1);
    BigDecimal Kilometre = BigDecimal.valueOf(0.001);
    BigDecimal Centimetre = BigDecimal.valueOf(100);
    BigDecimal Millimetre = BigDecimal.valueOf(1000);
    BigDecimal Micrometre = BigDecimal.valueOf(1000000);
    BigDecimal Nanometre = BigDecimal.valueOf(1000000000);
    BigDecimal Mile = BigDecimal.valueOf(0.000621371);
    BigDecimal Yard = BigDecimal.valueOf(1.09361);
    BigDecimal Foot = BigDecimal.valueOf(3.28084);
    BigDecimal Inch = BigDecimal.valueOf(39.3701);
    BigDecimal LightYear = BigDecimal.valueOf(1.0570008340247E-16);

    BigDecimal MetricTon = BigDecimal.valueOf(0.000001);
    BigDecimal Pound = BigDecimal.valueOf(0.00220462);
    BigDecimal Ounce = BigDecimal.valueOf(0.0352739907);
    BigDecimal Carrat = BigDecimal.valueOf(5);
    BigDecimal Stone = BigDecimal.valueOf(0.000157473);

    BigDecimal CubicKilometre = BigDecimal.valueOf(1E-12);
    BigDecimal USGallon = BigDecimal.valueOf(0.2641721769);
    BigDecimal USPint = BigDecimal.valueOf(2.1133774149);
    BigDecimal USQuart = BigDecimal.valueOf(1.0566887074);
    BigDecimal USCup = BigDecimal.valueOf(4.2267548297);
    BigDecimal USFluidOunce = BigDecimal.valueOf(33.814038638);
    BigDecimal USTeaSpoon = BigDecimal.valueOf(202.88423183);
    BigDecimal USTableSpoon = BigDecimal.valueOf(67.628077276);
    BigDecimal ImperialGallon = BigDecimal.valueOf(0.2199692483);
    BigDecimal ImperialQuart = BigDecimal.valueOf(0.8798769932);
    BigDecimal ImperialPint = BigDecimal.valueOf(1.7597539864);
    BigDecimal ImperialFluidOunce = BigDecimal.valueOf(35.195079728);
    BigDecimal ImperialTableSpoon = BigDecimal.valueOf(56.312127565);
    BigDecimal ImperialTeaSpoon = BigDecimal.valueOf(168.93638269);
    BigDecimal CubicMile = BigDecimal.valueOf(2.399128636E-13);
    BigDecimal CubicYard = BigDecimal.valueOf(0.0013079506);
    BigDecimal CubicFoot = BigDecimal.valueOf(0.0353146667);
    BigDecimal CubicInch = BigDecimal.valueOf(61.023744095);

    BigDecimal Picosecond = BigDecimal.valueOf(1E12);
    BigDecimal Minute = BigDecimal.valueOf(0.0166666667);
    BigDecimal Hour = BigDecimal.valueOf(0.0002777778);
    BigDecimal Day = BigDecimal.valueOf(0.0000115741);
    BigDecimal Week = BigDecimal.valueOf(0.0000016534);
    BigDecimal Month = BigDecimal.valueOf(3.802570537E-7);
    BigDecimal Year = BigDecimal.valueOf(3.168808781E-8);

    BigDecimal SquareCentimetre = BigDecimal.valueOf(10000);
    BigDecimal Hectare = BigDecimal.valueOf(0.0001);
    BigDecimal SquareMile = BigDecimal.valueOf(3.861018768E-7);
    BigDecimal SquareYard = BigDecimal.valueOf(1.1959900463);
    BigDecimal SquareFoot = BigDecimal.valueOf(10.763910417);
    BigDecimal SquareInch = BigDecimal.valueOf(1550.0031);
    BigDecimal Acre = BigDecimal.valueOf(0.0002471054);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = findViewById(R.id.button);
        textView1 = findViewById(R.id.textView);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
               public void onClick(View view) {
                   BigDecimal x = new BigDecimal(editText1.getText().toString());
                   y = 0.0;

                    // calculations
                   switch (spinner2.getSelectedItem().toString()) {
                       case "Kilometre":
                       case "Kilogram":
                       case "Cubic Metre":
                       case "Millisecond":
                           y = x.doubleValue() / Kilometre.doubleValue();
                           break;
                       case "Centimetre":
                           y = x.doubleValue() / Centimetre.doubleValue();
                           break;
                       case "Millimetre":
                       case "Milligram":
                       case "Cubic Centimetre":
                           y = x.doubleValue() / Millimetre.doubleValue();
                           break;
                       case "Micrometre":
                       case "Cubic Millimetre":
                       case "Microsecond":
                       case "Square Millimetre":
                           y = x.doubleValue() / Micrometre.doubleValue();
                           break;
                       case "Nanometre":
                       case "Nanosecond":
                           y = x.doubleValue() / Nanometre.doubleValue();
                           break;
                       case "Mile":
                           y = x.doubleValue() / Mile.doubleValue();
                           break;
                       case "Yard":
                           y = x.doubleValue() / Yard.doubleValue();
                           break;
                       case "Foot":
                           y = x.doubleValue() / Foot.doubleValue();
                           break;
                       case "Inch":
                           y = x.doubleValue() / Inch.doubleValue();
                           break;
                       case "Light Year":
                           y = x.doubleValue() / LightYear.doubleValue();
                           break;
                       case "Metre":
                       case "Gram":
                       case "Litre":
                       case "Second":
                       case "Square Metre":
                           y = x.doubleValue() / Metre.doubleValue();
                           break;
                       case "Metric Ton":
                       case "Square Kilometre":
                           y = x.doubleValue() / MetricTon.doubleValue();
                           break;
                       case "Pound":
                           y = x.doubleValue() / Pound.doubleValue();
                           break;
                       case "Ounce":
                           y = x.doubleValue() / Ounce.doubleValue();
                           break;
                       case "Carrat":
                           y = x.doubleValue() / Carrat.doubleValue();
                           break;
                       case "Stone":
                           y = x.doubleValue() / Stone.doubleValue();
                           break;
                       case "Cubic Kilometre":
                           y = x.doubleValue() / CubicKilometre.doubleValue();
                           break;
                       case "US Gallon":
                           y = x.doubleValue() / USGallon.doubleValue();
                           break;
                       case "US Pint":
                           y = x.doubleValue() / USPint.doubleValue();
                           break;
                       case "US Cup":
                           y = x.doubleValue() / USCup.doubleValue();
                           break;
                       case "US Fluid Ounce":
                           y = x.doubleValue() / USFluidOunce.doubleValue();
                           break;
                       case "US Quart":
                           y = x.doubleValue() / USQuart.doubleValue();
                           break;
                       case "US Table Spoon":
                           y = x.doubleValue() / USTableSpoon.doubleValue();
                           break;
                       case "US Tea Spoon":
                           y = x.doubleValue() / USTeaSpoon.doubleValue();
                           break;
                       case "Imperial Gallon":
                           y = x.doubleValue() / ImperialGallon.doubleValue();
                           break;
                       case "Imperial Fluid Ounce":
                           y = x.doubleValue() / ImperialFluidOunce.doubleValue();
                           break;
                       case "Imperial Pint":
                           y = x.doubleValue() / ImperialPint.doubleValue();
                           break;
                       case "Imperial Quart":
                           y = x.doubleValue() / ImperialQuart.doubleValue();
                           break;
                       case "Imperial Table Spoon":
                           y = x.doubleValue() / ImperialTableSpoon.doubleValue();
                           break;
                       case "Imperial Tea Spoon":
                           y = x.doubleValue() / ImperialTeaSpoon.doubleValue();
                           break;
                       case "Cubic Mile":
                           y = x.doubleValue() / CubicMile.doubleValue();
                           break;
                       case "Cubic Foot":
                           y = x.doubleValue() / CubicFoot.doubleValue();
                           break;
                       case "Cubic Inch":
                           y = x.doubleValue() / CubicInch.doubleValue();
                           break;
                       case "Cubic Yard":
                           y = x.doubleValue() / CubicYard.doubleValue();
                           break;
                       case "Picosecond":
                       case "Square Micrometre":
                           y = x.doubleValue() / Picosecond.doubleValue();
                           break;
                       case "Minute":
                           y = x.doubleValue() / Minute.doubleValue();
                           break;
                       case "Hour":
                           y = x.doubleValue() / Hour.doubleValue();
                           break;
                       case "Day":
                           y = x.doubleValue() / Day.doubleValue();
                           break;
                       case "Week":
                           y = x.doubleValue() / Week.doubleValue();
                           break;
                       case "Month":
                           y = x.doubleValue() / Month.doubleValue();
                           break;
                       case "Year":
                           y = x.doubleValue() / Year.doubleValue();
                           break;
                       case "Square Centimetre":
                           y = x.doubleValue() / SquareCentimetre.doubleValue();
                           break;
                       case "Hectare":
                           y = x.doubleValue() / Hectare.doubleValue();
                           break;
                       case "Square Mile":
                           y = x.doubleValue() / SquareMile.doubleValue();
                           break;
                       case "Square Yard":
                           y = x.doubleValue() / SquareYard.doubleValue();
                           break;
                       case "Square Foot":
                           y = x.doubleValue() / SquareFoot.doubleValue();
                           break;
                       case "Square Inch":
                           y = x.doubleValue() / SquareInch.doubleValue();
                           break;
                       case "Acre":
                           y = x.doubleValue() / Acre.doubleValue();
                           break;
                   }

                    switch (spinner3.getSelectedItem().toString()) {
                        case "Kilometre":
                        case "Kilogram":
                        case "Cubic Metre":
                        case "Millisecond":
                            y *= Kilometre.doubleValue();
                            break;
                        case "Centimetre":
                            y *= Centimetre.doubleValue();
                            break;
                        case "Millimetre":
                        case "Milligram":
                        case "Cubic Centimetre":
                            y *= Millimetre.doubleValue();
                            break;
                        case "Micrometre":
                        case "Cubic Millimetre":
                        case "Microsecond":
                        case "Square Millimetre":
                            y *= Micrometre.doubleValue();
                            break;
                        case "Nanometre":
                        case "Nanosecond":
                            y *=Nanometre.doubleValue();
                            break;
                        case "Mile":
                            y *= Mile.doubleValue();
                            break;
                        case "Yard":
                            y *= Yard.doubleValue();
                            break;
                        case "Foot":
                            y *= Foot.doubleValue();
                            break;
                        case "Inch":
                            y *= Inch.doubleValue();
                            break;
                        case "Light Year":
                            y *= LightYear.doubleValue();
                            break;
                        case "Metre":
                        case "Gram":
                        case "Litre":
                        case "Second":
                        case "Square Metre":
                            y *= Metre.doubleValue();
                            break;
                        case "Metric Ton":
                        case "Square Kilometre":
                            y *= MetricTon.doubleValue();
                            break;
                        case "Pound":
                            y *= Pound.doubleValue();
                            break;
                        case "Ounce":
                            y *= Ounce.doubleValue();
                            break;
                        case "Carrat":
                            y *= Carrat.doubleValue();
                            break;
                        case "Stone":
                            y *= Stone.doubleValue();
                            break;
                        case "Cubic Kilometre":
                            y *= CubicKilometre.doubleValue();
                            break;
                        case "US Gallon":
                            y *= USGallon.doubleValue();
                            break;
                        case "US Pint":
                            y *= USPint.doubleValue();
                            break;
                        case "US Cup":
                            y *= USCup.doubleValue();
                            break;
                        case "US Fluid Ounce":
                            y *= USFluidOunce.doubleValue();
                            break;
                        case "US Quart":
                            y *= USQuart.doubleValue();
                            break;
                        case "US Table Spoon":
                            y *= USTableSpoon.doubleValue();
                            break;
                        case "US Tea Spoon":
                            y *= USTeaSpoon.doubleValue();
                            break;
                        case "Imperial Gallon":
                            y *= ImperialGallon.doubleValue();
                            break;
                        case "Imperial Fluid Ounce":
                            y *= ImperialFluidOunce.doubleValue();
                            break;
                        case "Imperial Pint":
                            y *= ImperialPint.doubleValue();
                            break;
                        case "Imperial Quart":
                            y *= ImperialQuart.doubleValue();
                            break;
                        case "Imperial Table Spoon":
                            y *= ImperialTableSpoon.doubleValue();
                            break;
                        case "Imperial Tea Spoon":
                            y *= ImperialTeaSpoon.doubleValue();
                            break;
                        case "Cubic Mile":
                            y *= CubicMile.doubleValue();
                            break;
                        case "Cubic Foot":
                            y *= CubicFoot.doubleValue();
                            break;
                        case "Cubic Inch":
                            y *= CubicInch.doubleValue();
                            break;
                        case "Cubic Yard":
                            y *= CubicYard.doubleValue();
                            break;
                        case "Picosecond":
                        case "Square Micrometre":
                            y *= Picosecond.doubleValue();
                            break;
                        case "Minute":
                            y *= Minute.doubleValue();
                            break;
                        case "Hour":
                            y *= Hour.doubleValue();
                            break;
                        case "Day":
                            y *= Day.doubleValue();
                            break;
                        case "Week":
                            y *= Week.doubleValue();
                            break;
                        case "Month":
                            y *= Month.doubleValue();
                            break;
                        case "Year":
                            y *= Year.doubleValue();
                            break;
                        case "Square Centimetre":
                            y *= SquareCentimetre.doubleValue();
                            break;
                        case "Hectare":
                            y *= Hectare.doubleValue();
                            break;
                        case "Square Mile":
                            y *= SquareMile.doubleValue();
                            break;
                        case "Square Yard":
                            y *= SquareYard.doubleValue();
                            break;
                        case "Square Foot":
                            y *= SquareFoot.doubleValue();
                            break;
                        case "Square Inch":
                            y *= SquareInch.doubleValue();
                            break;
                        case "Acre":
                            y *= Acre.doubleValue();
                            break;
                }


                    if (spinner2.getSelectedItem().toString().equals("Celsius"))
                    {
                        y = Double.parseDouble(editText1.getText().toString());
                        if (spinner3.getSelectedItem().toString().equals("Fahrenheit"))
                            y = (y * 9/5) + 32;
                        else if (spinner3.getSelectedItem().toString().equals("Kelvin"))
                            y += 273.15;
                    }

                    else if (spinner2.getSelectedItem().toString().equals("Fahrenheit"))
                    {
                        y = Double.parseDouble(editText1.getText().toString());
                        if (spinner3.getSelectedItem().toString().equals("Celsius"))
                            y = (y - 32) * 5/9;
                        else if (spinner3.getSelectedItem().toString().equals("Kelvin"))
                            y = (y - 32) * 5/9 + 273.15;
                    }

                    else if (spinner2.getSelectedItem().toString().equals("Kelvin"))
                    {
                        y = Double.parseDouble(editText1.getText().toString());
                        if (spinner3.getSelectedItem().toString().equals("Celsius"))
                            y -= 273.15;
                        else if (spinner3.getSelectedItem().toString().equals("Fahrenheit"))
                            y = (y - 273.15) * 9/5 + 32;
                    }
                   textView1.setText(String.valueOf(new DecimalFormat(".##########").format(y)));
               }
           });

        //set values
        Main = new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_list_item_1,
                getResources().getStringArray(R.array.Main));
        Main.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        Length = new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_list_item_1,
                getResources().getStringArray(R.array.Length));
        Length.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        Temp = new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_list_item_1,
                getResources().getStringArray(R.array.Temp));
        Temp.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        Time = new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_list_item_1,
                getResources().getStringArray(R.array.Time));
        Time.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        Mass = new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_list_item_1,
                getResources().getStringArray(R.array.Mass));
        Mass.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        Volume = new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_list_item_1,
                getResources().getStringArray(R.array.Vol));
        Volume.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        Area = new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_list_item_1,
                getResources().getStringArray(R.array.Area));
        Area.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);


        // predefine values
        spinner1 = findViewById(R.id.spinner1);
        spinner1.setAdapter(Main);

        spinner2 = findViewById(R.id.spinner2);
        spinner2.setAdapter(Length);

        spinner3 = findViewById(R.id.spinner3);
        spinner3.setAdapter(Length);

        editText1 = findViewById(R.id.editText1);
        editText1.setText("1");

        spinner1.setOnItemSelectedListener(this);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int pos,long id)
    {
        //changes the spinner 2 & 3 when the top one is switched
        switch (spinner1.getSelectedItem().toString()) {
            case "Area":
                spinner2.setAdapter(Area);
                spinner3.setAdapter(Area);
                break;
            case "Length":
                spinner2.setAdapter(Length);
                spinner3.setAdapter(Length);
                break;
            case "Mass":
                spinner2.setAdapter(Mass);
                spinner3.setAdapter(Mass);
                break;
            case "Time":
                spinner2.setAdapter(Time);
                spinner3.setAdapter(Time);
                break;
            case "Temperature":
                spinner2.setAdapter(Temp);
                spinner3.setAdapter(Temp);
                break;
            case "Volume":
                spinner2.setAdapter(Volume);
                spinner3.setAdapter(Volume);
                break;
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> arg0)
    {

    }
}

