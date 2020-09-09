package com.example.automoviles;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //Array de articulos
    private String Automovil [] = {"Toyota", "Mazda", "Chevrolet", "Nissan", "Renault",
            "Suzuki", "Kia"};

    //Array para mostrar los elementos de los articulos
    private String Valor [] = {"$58.459.667", "$55.989.600", "$65.900.000", "$76.800.000", "$80.000.000", "$60.890.700", "$59.459.900"};
    private String Total_automovil [] = {"30", "57", "65", "7", "35", "70", "50"};


    private TextView automovil;
    private ListView valor;
    private ListView total_automovil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //variables asociadas al layout
        automovil = (TextView)findViewById(R.id.resultado);
        valor =(ListView)findViewById(R.id.listview);
        total_automovil =(ListView)findViewById(R.id.listview);

        //Funcion arrayadapter en el listview
        ArrayAdapter<String> listar = new ArrayAdapter<String> (this, android.R.layout
                .simple_list_item_1, Automovil);
        valor.setAdapter(listar);

        total_automovil.setOnItemClickListener(new AdapterView.OnItemClickListener(){

            public void onItemClick(AdapterView parent, View view, int position, long id) {
                automovil.setText (" Valor: " + Valor[position] + "\n" + " Disponibles: "  + Total_automovil[position]);
            }
        });
    }
}
