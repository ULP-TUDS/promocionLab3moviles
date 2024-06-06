package com.miapp.asistencia.ui.asistencia;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.miapp.asistencia.databinding.FragmentAsistenciaBinding;
import com.miapp.asistencia.databinding.FragmentHomeBinding;

public class AsistenciaFragment extends Fragment {

    private FragmentAsistenciaBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        AsistenciaViewModel homeViewModel =
                new ViewModelProvider(this).get(AsistenciaViewModel.class);

        binding = FragmentAsistenciaBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textHome;
        homeViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}