package com.example.ikaros.pokedex;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class Pokedex extends Activity {

    ListView list;
    String[] nombres;
    int[]   sprites = {R.drawable.p001,R.drawable.p002,R.drawable.p003,R.drawable.p004,R.drawable.p005,
                       R.drawable.p006,R.drawable.p007,R.drawable.p008,R.drawable.p009,R.drawable.p010,
                       R.drawable.p011,R.drawable.p012,R.drawable.p013,R.drawable.p014,R.drawable.p015,
                       R.drawable.p016,R.drawable.p017,R.drawable.p018,R.drawable.p019,R.drawable.p020,
                       R.drawable.p001,R.drawable.p001,R.drawable.p001,R.drawable.p001,R.drawable.p001,
                       R.drawable.p001,R.drawable.p001,R.drawable.p001,R.drawable.p001,R.drawable.p001,
                       R.drawable.p001,R.drawable.p001,R.drawable.p001,R.drawable.p001,R.drawable.p001,
                       R.drawable.p001,R.drawable.p001,R.drawable.p001,R.drawable.p001,R.drawable.p001,
                       R.drawable.p001,R.drawable.p001,R.drawable.p001,R.drawable.p001,R.drawable.p001,
                       R.drawable.p001,R.drawable.p001,R.drawable.p001,R.drawable.p001,R.drawable.p001,
                       R.drawable.p001,R.drawable.p001,R.drawable.p001,R.drawable.p001,R.drawable.p001,
                       R.drawable.p001,R.drawable.p001,R.drawable.p001,R.drawable.p001,R.drawable.p001,
                       R.drawable.p001,R.drawable.p001,R.drawable.p001,R.drawable.p001,R.drawable.p001,
                       R.drawable.p001,R.drawable.p001,R.drawable.p001,R.drawable.p001,R.drawable.p001,
                       R.drawable.p001,R.drawable.p001,R.drawable.p001,R.drawable.p001,R.drawable.p001,
                       R.drawable.p001,R.drawable.p001,R.drawable.p001,R.drawable.p001,R.drawable.p001,
                       R.drawable.p001,R.drawable.p001,R.drawable.p001,R.drawable.p001,R.drawable.p001,
                       R.drawable.p001,R.drawable.p001,R.drawable.p001,R.drawable.p001,R.drawable.p001,
                       R.drawable.p001,R.drawable.p001,R.drawable.p001,R.drawable.p001,R.drawable.p001,
                       R.drawable.p001,R.drawable.p001,R.drawable.p001,R.drawable.p001,R.drawable.p001};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pokemon);

        Resources res = getResources();
        nombres = res.getStringArray(R.array.name);

        list = (ListView) findViewById(R.id.PokedexList);

        PokeAdapter adapter = new PokeAdapter(this, nombres, sprites);

        list.setAdapter(adapter);
    }

    private class PokeAdapter extends ArrayAdapter<String>{

        Context context;
        int[] sprite;
        String[] poken;

        PokeAdapter(Context c, String[] namae, int[] pics){

            super(c, R.layout.pokemon, R.id.napo, namae);

            this.context = c;
            this.sprite = pics;
            this.poken = namae;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View row = inflater.inflate(R.layout.pokemon, parent, false);

            ImageView pokemonS = (ImageView) row.findViewById(R.id.fopo);
            TextView pokemonN = (TextView) row.findViewById(R.id.napo);

            pokemonS.setImageResource(sprite[position]);
            pokemonN.setText(poken[position]);

            return row;
        }
    }
}


