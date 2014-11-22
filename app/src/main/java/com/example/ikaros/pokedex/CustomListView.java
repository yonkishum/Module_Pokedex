package com.example.ikaros.pokedex;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomListView extends ArrayAdapter<String>{

	private final Activity context;
	private final String[] pokema;
	private final Integer[] idpic;

	public CustomListView(Activity context, String[] pokema, Integer[] idpic){
		super(context, R.layout.pokemon, pokema);
		this.context = context;
		this.pokema = pokema;
		this.idpic = idpic;
	}


	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		return super.getView(position, convertView, parent);
	}
}
