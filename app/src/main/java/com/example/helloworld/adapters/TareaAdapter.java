package com.example.helloworld.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.helloworld.R;
import com.example.helloworld.entities.Anime;
import com.example.helloworld.entities.Tareas;
import com.squareup.picasso.Picasso;

import java.util.List;

public class TareaAdapter extends RecyclerView.Adapter<TareaAdapter.PalabraViewHolder>{

    List<Tareas> tareas;

    public TareaAdapter(List<Tareas> tareas) {

        this.tareas = tareas;
    }

    @Override
    public PalabraViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.itemtarea,parent,false);

        return new PalabraViewHolder(view);
    }

    @Override
    public void onBindViewHolder(TareaAdapter.PalabraViewHolder holder, int position) {

        View view = holder.itemView;
        Tareas tarea = tareas.get(position);

        TextView tvid = view.findViewById(R.id.tvId);
        TextView tvasig = view.findViewById(R.id.tvassig);
        TextView tvdate = view.findViewById(R.id.tvdate);
        TextView tvdone = view.findViewById(R.id.tvisdone);
        TextView tvdescrip = view.findViewById(R.id.tvdescription);


        tvid.setText(tarea.id);
        tvasig.setText(tarea.assigned);
        tvdate.setText(tarea.date);
        tvdone.setText(tarea.isDone);
        tvdescrip.setText(tarea.description);



    }

    @Override
    public int getItemCount() {
        return tareas.size();
    }

    public  class PalabraViewHolder extends RecyclerView.ViewHolder {

        public PalabraViewHolder(View itemView) {
            super(itemView);
        }
    }

}
