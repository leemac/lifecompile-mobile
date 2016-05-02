package com.tinycore.lifecompile.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.tinycore.lifecompile.R;
import com.tinycore.lifecompile.models.Note;

import java.util.ArrayList;

public class NoteListAdapter extends ArrayAdapter<Note> {
    public NoteListAdapter(Context context, ArrayList<Note> users) {
        super(context, 0, users);

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Get the data item for this position
        Note garden = getItem(position);
        // Check if an existing view is being reused, otherwise inflate the view
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.row_note, parent, false);
        }

        TextView textViewName = (TextView) convertView.findViewById(R.id.noteContent);
        textViewName.setText(garden.Content);

        return convertView;
    }
}