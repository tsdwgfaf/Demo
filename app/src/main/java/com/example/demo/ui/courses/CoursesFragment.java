package com.example.demo.ui.courses;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.demo.R;

public class CoursesFragment extends Fragment {

    private CoursesViewModel coursesViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        coursesViewModel =
                new ViewModelProvider(this).get(CoursesViewModel.class);
        View root = inflater.inflate(R.layout.fragment_courses, container, false);
        return root;
    }

}