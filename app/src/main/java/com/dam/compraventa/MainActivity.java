package com.dam.compraventa;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity {
    private TextView mostrarPorcentaje;
    private TextView domicilio;
    private TextView mostrarCategoria;


    private EditText titulo;
    private EditText description;
    private EditText email;
    private EditText price;
    private EditText domicilioText;

    private SeekBar seekBarDiscount;

    private Switch switchEnvio;

    private CheckBox retiroPersona;
    private CheckBox termsAndConditions;

    private Spinner spinnerCategory;

    private Button categoryButton;
    private Button publicar;

    private static Boolean emailValido(String email) {
        String regex = "^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    private static Boolean fieldValidos(List<String> fields) {
        String regex = "^[a-zA-Z0-9.,\n ]+$";

        Pattern pattern = Pattern.compile(regex);

        for (String field : fields)
        {
            Matcher matcher = pattern.matcher(field);
            if(!matcher.matches()) {
                return false;
            }
        }
        return true;
    }
    private static Boolean validPrice(String price) {
        String regex = "^[0-9]+,?[0-9]{0,2}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(price);
        System.out.println(matcher.matches() + " " + price);
        return matcher.matches() && Integer.parseInt(price,10) > 0;
    }

    private void showToast(String title) {
        Toast toast = Toast.makeText(getApplicationContext(), title, Toast.LENGTH_LONG);
        toast.show();
    }

    private void validarCampos(String title, String desc, String email, String price, String category, Boolean domicilioSelected, String domicilio, Boolean descuentoSelected, int descuento){
        Boolean error = false;
        Boolean errorMail = false;
        Boolean errorPrice = false;
        Boolean errorDescuento = false;

        List<String> fields = new ArrayList<String>();

        fields.add(title);

        if(!desc.isEmpty()){
            fields.add(desc);
        }

        if(domicilioSelected){
            fields.add(domicilio);
        }

        errorPrice = !validPrice(price);

        error = !fieldValidos(fields);

        errorMail = email.isEmpty() ? false : !emailValido(email);

        if(descuentoSelected && descuento == 0){
            errorDescuento = true;
        }

        if(error){
            showToast("Complete los campos obligatorios y no utilice caracteres especiales");
        }else if(errorMail){
            showToast("El correo ingresado es invalido");
        } else if(errorDescuento){
            showToast("El descuento debe ser mayor al 0%");
        }  else if(errorPrice){
            showToast("Ingrese un precio valido");
        } else {
            showToast("Producto publicado con exito");
        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);

        domicilio = (TextView) findViewById(R.id.addressTitle);
        mostrarPorcentaje = (TextView)findViewById(R.id.percentage);
        mostrarCategoria = (TextView)findViewById(R.id.category);

        titulo = (EditText) findViewById(R.id.editTextTitle);
        description = (EditText) findViewById(R.id.editTextDesc);
        email = (EditText) findViewById(R.id.editTextMail);
        price = (EditText) findViewById(R.id.editTextPrice);
        domicilioText = (EditText) findViewById(R.id.editTextAddress);

        seekBarDiscount = (SeekBar)findViewById(R.id.seekBarDiscount);

        switchEnvio = (Switch) findViewById(R.id.switchDiscount);

        retiroPersona = (CheckBox) findViewById(R.id.checkBoxInPerson);
        termsAndConditions = (CheckBox) findViewById(R.id.checkBoxTerms);

        // spinnerCategory = (Spinner) findViewById(R.id.spinnerCategory);
        categoryButton = (Button) findViewById(R.id.categoryButton);
        publicar = (Button) findViewById(R.id.button);

//        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.category, R.layout.custom_spinner );
//        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//        spinnerCategory.setAdapter(adapter);

        categoryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i2 = new Intent(MainActivity.this,CategoriaRecycler.class);
                startActivityForResult(i2,1);
            }
        });

        switchEnvio.setOnCheckedChangeListener(
                new CompoundButton.OnCheckedChangeListener() {
                    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                        if (isChecked) {
                            mostrarPorcentaje.setVisibility(View.VISIBLE);
                            seekBarDiscount.setVisibility(View.VISIBLE);
                        } else {
                            mostrarPorcentaje.setVisibility(View.GONE);
                            seekBarDiscount.setVisibility(View.GONE);
                        }
                    }
                });

        mostrarPorcentaje.setVisibility(View.GONE);
        mostrarPorcentaje.setText("0%");

        seekBarDiscount.setVisibility(View.GONE);
        seekBarDiscount.setProgress(0);
        seekBarDiscount.setMax(100);
        seekBarDiscount.setOnSeekBarChangeListener(
                new SeekBar.OnSeekBarChangeListener() {
                    @Override
                    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                        mostrarPorcentaje.setText(String.valueOf(progress)+" %");
                    }

                    @Override
                    public void onStartTrackingTouch(SeekBar seekBar) {

                    }

                    @Override
                    public void onStopTrackingTouch(SeekBar seekBar) {

                    }
                    //hace un llamado  cuando se toca la perilla
                });

        domicilio.setVisibility(View.GONE);
        domicilioText.setVisibility(View.GONE);

        retiroPersona.setOnCheckedChangeListener(
                new CompoundButton.OnCheckedChangeListener() {
                    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                        if (isChecked) {
                            domicilio.setVisibility(View.VISIBLE);
                            domicilioText.setVisibility(View.VISIBLE);
                        } else {
                            domicilio.setVisibility(View.GONE);
                            domicilioText.setVisibility(View.GONE);
                        }
                    }
                });

        termsAndConditions.setOnCheckedChangeListener(
                new CompoundButton.OnCheckedChangeListener() {
                    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                        if (isChecked) {
                            publicar.setEnabled(true);
                            publicar.setAlpha(1f);
                        } else {
                            publicar.setEnabled(false);
                            publicar.setAlpha(.5f);
                        }
                    }
                });

        publicar.setAlpha(.5f);
        publicar.setEnabled(false);
        publicar.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        validarCampos(
                                titulo.getText().toString(),
                                description.getText().toString(),
                                email.getText().toString(),
                                price.getText().toString(),
                                spinnerCategory.getSelectedItem().toString(),
                                retiroPersona.isChecked(),
                                domicilioText.getText().toString(),
                                switchEnvio.isChecked(),
                                seekBarDiscount.getProgress()

                        );
                    }
                });
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
            if(resultCode==Activity.RESULT_OK){
                mostrarCategoria.setText(data.getExtras().get("CAT_NAME").toString());
                mostrarCategoria.setBackgroundColor(Color.parseColor(data.getExtras().get("CAT_BCOLOR").toString()));
                /*
                for (String unaClave : data.getExtras().keySet()){
                    System.out.println("HOLAAAAAAA");
                    System.out.println(data.getExtras().get(unaClave).toString());
                    description.setText(data.getExtras().get(unaClave).toString());
                }
                */
                //, cat.getName());
                //i1.putExtra("CAT_BCOLOR", cat.getColour());
            }
    }
}