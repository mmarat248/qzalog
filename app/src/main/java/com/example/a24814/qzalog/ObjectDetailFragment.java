package com.example.a24814.qzalog;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.a24814.qzalog.models.Objects;

import java.util.ArrayList;
import java.util.List;


public class ObjectDetailFragment extends Fragment {

    private final String TAG = "ObjectDetailFragment";

    private ObjectDetailFragment fragment;

    private List<Objects> objects = new ArrayList<Objects>();;

    private View view;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        fragment = this;
        view = inflater.inflate(R.layout.activity_object_detail,
                container, false);


        return view;
    }

    private void initView(){

    }

    public void backendResponse(Boolean isUploaded){

    }




}
