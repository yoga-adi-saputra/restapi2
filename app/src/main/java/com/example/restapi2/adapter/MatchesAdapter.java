package com.example.restapi2.adapter;


import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.restapi2.R;
import com.example.restapi2.model.MatchesItem;
import com.example.restapi2.utils.DateConverter;

import java.util.List;

public class MatchesAdapter extends RecyclerView.Adapter<MatchesAdapter.MatchViewHolder> {
    private Context mtcx;
    private List<MatchesItem> matchesItemList;
    DateConverter dc = new DateConverter();

    public MatchesAdapter(Context mtcx, List<MatchesItem> matchesItemList) {
        this.mtcx = mtcx;
        this.matchesItemList = matchesItemList;
    }

    public List<MatchesItem> getMatchesItemList() {
        return matchesItemList;
    }

    public void setMatchesItemList(List<MatchesItem> matchesItemList) {
        this.matchesItemList = matchesItemList;
    }

    @NonNull
    @Override
    public MatchViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(this.mtcx).inflate(R.layout.matches_item, parent, false);
        return new MatchViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MatchViewHolder holder, int position) {
        MatchesItem matchesItem = getMatchesItemList().get(position);
        holder.tvGroupInfo.setText(matchesItem.getGroup().toString().toUpperCase());
        holder.tvDateInfo.setText(dc.UtcToLocal(matchesItem.getUtcDate()));
        holder.tvHomeName.setText(matchesItem.getHomeTeam().getName());
        holder.tvAwayName.setText(matchesItem.getAwayTeam().getName());
        holder.tvHomeScore.setText((matchesItem.getStatus().equals("SCHEDULED") ? "-" : String.valueOf(matchesItem.getScore().getFullTime().getHomeTeam())));
        holder.tvAwayScore.setText((matchesItem.getStatus().equals("SCHEDULED") ? "-" : String.valueOf(matchesItem.getScore().getFullTime().getAwayTeam())));
    }

    @Override
    public int getItemCount() {
        return matchesItemList.size();
    }

    public class MatchViewHolder extends RecyclerView.ViewHolder {
        private TextView tvGroupInfo, tvDateInfo, tvHomeName, tvAwayName, tvHomeScore, tvAwayScore;
        public MatchViewHolder(@NonNull View itemView) {
            super(itemView);
            tvGroupInfo = itemView.findViewById(R.id.tvGroupInfo);
            tvDateInfo = itemView.findViewById(R.id.tvDateInfo);
            tvHomeName = itemView.findViewById(R.id.tvHomeName);
            tvAwayName = itemView.findViewById(R.id.tvAwayName);
            tvHomeScore = itemView.findViewById(R.id.tvHomeScore);
            tvAwayScore = itemView.findViewById(R.id.tvAwayScore);

        }
    }
}
