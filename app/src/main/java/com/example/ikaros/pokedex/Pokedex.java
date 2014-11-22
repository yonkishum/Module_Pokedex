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

import com.example.ikaros.pokedex.R;

public class Pokedex extends Activity {

    ListView list;
    String[] nombres;
    int[]   sprites = {R.drawable.p001,R.drawable.p002,R.drawable.p003,R.drawable.p004,R.drawable.p005,
                       R.drawable.p006,R.drawable.p007,R.drawable.p008,R.drawable.p009,R.drawable.p010,
                       R.drawable.p011,R.drawable.p012,R.drawable.p013,R.drawable.p014,R.drawable.p015,
                       R.drawable.p016,R.drawable.p017,R.drawable.p018,R.drawable.p019,R.drawable.p020,
                       R.drawable.p021,R.drawable.p022,R.drawable.p023,R.drawable.p024,R.drawable.p025,
                       R.drawable.p026,R.drawable.p027,R.drawable.p028,R.drawable.p029,R.drawable.p030,
                       R.drawable.p031,R.drawable.p032,R.drawable.p033,R.drawable.p034,R.drawable.p035,
                       R.drawable.p036,R.drawable.p037,R.drawable.p038,R.drawable.p039,R.drawable.p040,
                       R.drawable.p041,R.drawable.p042,R.drawable.p043,R.drawable.p044,R.drawable.p045,
                       R.drawable.p046,R.drawable.p047,R.drawable.p048,R.drawable.p049,R.drawable.p050,
                       R.drawable.p051,R.drawable.p052,R.drawable.p053,R.drawable.p054,R.drawable.p055,
                       R.drawable.p056,R.drawable.p057,R.drawable.p058,R.drawable.p059,R.drawable.p060,
                       R.drawable.p061,R.drawable.p062,R.drawable.p063,R.drawable.p064,R.drawable.p065,
                       R.drawable.p066,R.drawable.p067,R.drawable.p068,R.drawable.p069,R.drawable.p070,
                       R.drawable.p071,R.drawable.p072,R.drawable.p073,R.drawable.p074,R.drawable.p075,
                       R.drawable.p076,R.drawable.p077,R.drawable.p078,R.drawable.p079,R.drawable.p080,
                       R.drawable.p081,R.drawable.p082,R.drawable.p083,R.drawable.p084,R.drawable.p085,
                       R.drawable.p086,R.drawable.p087,R.drawable.p088,R.drawable.p089,R.drawable.p090,
                       R.drawable.p091,R.drawable.p092,R.drawable.p093,R.drawable.p094,R.drawable.p095,
                       R.drawable.p096,R.drawable.p097,R.drawable.p098,R.drawable.p099,R.drawable.p100,
                       R.drawable.p101,R.drawable.p102,R.drawable.p103,R.drawable.p104,R.drawable.p105,
                       R.drawable.p106,R.drawable.p107,R.drawable.p108,R.drawable.p109,R.drawable.p110,
                       R.drawable.p111,R.drawable.p112,R.drawable.p113,R.drawable.p114,R.drawable.p115,
                       R.drawable.p116,R.drawable.p117,R.drawable.p118,R.drawable.p119,R.drawable.p120,
                       R.drawable.p121,R.drawable.p122,R.drawable.p123,R.drawable.p124,R.drawable.p125,
                       R.drawable.p126,R.drawable.p127,R.drawable.p128,R.drawable.p129,R.drawable.p130,
                       R.drawable.p131,R.drawable.p132,R.drawable.p133,R.drawable.p134,R.drawable.p135,
                       R.drawable.p136,R.drawable.p137,R.drawable.p138,R.drawable.p139,R.drawable.p140,
                       R.drawable.p141,R.drawable.p142,R.drawable.p143,R.drawable.p144,R.drawable.p145,
                       R.drawable.p146,R.drawable.p147,R.drawable.p148,R.drawable.p149,R.drawable.p150,
                       R.drawable.p151};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.vista);

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


