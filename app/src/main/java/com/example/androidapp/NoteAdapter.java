package com.example.androidapp;

import android.content.Context;
import android.provider.ContactsContract;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class NoteAdapter extends ArrayAdapter<note>{
    public NoteAdapter(Context context, List<note> notes){
        super(context,0,notes);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        note note = getItem(position);
        if(convertView == null)
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.edit_cell,parent,false);

        TextView title = convertView.findViewById(R.id.cellTitle);
        RadioGroup button1 = convertView.findViewById(R.id.buttonId);
        RadioGroup button2 = convertView.findViewById(R.id.buttonId1);

        title.setText(note.getTitle());


        return super.getView(position, convertView, parent);
    }
}
