package com.example.volleyatoz.Adapter;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.volleyatoz.Model.Model;
import com.example.volleyatoz.R;

import java.util.List;

public class LogAdapter extends  RecyclerView.Adapter<LogAdapter.ViewHolder> {

    private Context context;
    private List<Model> logList;

    public LogAdapter(Context context, List<Model> logList) {
        this.context = context;
        this.logList = logList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.item_log, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Model log = logList.get(position);

        holder.tvDate.setText(log.getDate());
        /*holder.textRating.setText(String.valueOf(log.getDate()));
        holder.textYear.setText(String.valueOf(log.getTotalFAbsent()));
        holder.textYear.setText(String.valueOf(log.getTotalMAbsent()));
        holder.textYear.setText(String.valueOf(log.getTotalMalePresent()));
        holder.textYear.setText(String.valueOf(log.getTotalFemalePresent()));*/
//        holder.textYear.setText(String.valueOf(log.getTotalFAbsent()));

    }

    @Override
    public int getItemCount() {
        return logList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView tvDate, textRating, textYear;

        public ViewHolder(View itemView) {
            super(itemView);

            tvDate = itemView.findViewById(R.id.textView);
            //     textRating = itemView.findViewById(R.id.main_rating);
            //    textYear = itemView.findViewById(R.id.main_year);
        }
    }
}
