package com.example.navviewmodel;


import android.os.Bundle;

import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.navviewmodel.databinding.FragmentDetialBinding;


/**
 * A simple {@link Fragment} subclass.
 */
public class DetialFragment extends Fragment {


    public DetialFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, final ViewGroup container,
                             Bundle savedInstanceState) {
        MyViewModel myViewModel;
        myViewModel = new ViewModelProvider(getActivity()).get(MyViewModel.class);
        FragmentDetialBinding binding;
        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_detial,container,false);
        binding.setData(myViewModel);
        binding.setLifecycleOwner(getActivity());
        binding.button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NavController controller = Navigation.findNavController(v);
                controller.navigate(R.id.action_detialFragment_to_homeFragment);
            }
        });
        return binding.getRoot();

        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_detial, container, false);
    }

}
