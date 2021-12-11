package com.example.restapi2.ui;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.restapi2.R;
import com.example.restapi2.adapter.MatchesAdapter;
import com.example.restapi2.model.MatchesList;
import com.example.restapi2.viewmodel.MatchesViewModel;


public class HomeFragment extends Fragment {
    private MatchesViewModel matchesViewModel;
    private MatchesAdapter adapter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false);
    }

    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        final RecyclerView rv = view.findViewById(R.id.matchesRv);
        rv.setLayoutManager(new LinearLayoutManager(getActivity()));
        matchesViewModel = new ViewModelProvider(getActivity()).get(MatchesViewModel.class);
        matchesViewModel.getMatchesList().observe(getViewLifecycleOwner(), new Observer<MatchesList>() {
            @Override
            public void onChanged(MatchesList matchesList) {
                adapter = new MatchesAdapter(getActivity(), matchesList.getMatches());
                adapter.notifyDataSetChanged();
                rv.setAdapter(adapter);
                if (matchesList.getCount() < 1) {
                    Toast.makeText(getActivity(), "No Champions League Matches Scheduled!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}