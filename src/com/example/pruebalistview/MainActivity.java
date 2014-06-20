package com.example.pruebalistview;

import Objetos.TipoDatos;
import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;


public class MainActivity extends Activity {
	
	TipoDatos[] datos =new TipoDatos[]{new TipoDatos("Titulo1","subtitulo1"),new TipoDatos("Titulo2","subtotulo2"),new TipoDatos("Titulo3","Subtotulo3"),new TipoDatos("Titulo4","Subtorulo4")};
	

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Levanto el listView
        ListView Lista =(ListView) findViewById(R.id.listView1);

        AdapterTitulos adapter = new AdapterTitulos(this);
        // delclaro adaptador
        Lista.setAdapter(adapter);
       
        }
    class  AdapterTitulos extends ArrayAdapter<TipoDatos>{

    	Activity context;
    	
    	public AdapterTitulos(Activity context){
    		super(context,R.layout.titulo_listas,datos);
    		this.context=context;
       		}
    	@Override
    	public View getView(int position, View convertView, ViewGroup parent) {
    		LayoutInflater inflador= context.getLayoutInflater();
    		View item =inflador.inflate(R.layout.titulo_listas, null);
    		
    		TextView titulo= (TextView) findViewById(R.id.txtV_Titulo);
    		TextView subtitulo= (TextView) findViewById(R.id.txtV_Subtitulo);
    		        		
    		titulo.setText(datos[position].getTitulo());
    		subtitulo.setText(datos[position].getSubTitulo());
    		return item;
    	}
        
        
    }


   

}
