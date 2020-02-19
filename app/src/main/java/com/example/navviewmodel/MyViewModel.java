package com.example.navviewmodel;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MyViewModel extends ViewModel {
    public MutableLiveData<Integer> getNumber() {
        if (number == null){
            number = new MutableLiveData<>();
            number.setValue(0);
        }
        return number;
    }

    private MutableLiveData<Integer> number;

    public void add(int n){
        number.setValue(number.getValue() + n);
        if (number.getValue()<0){
            number.setValue(0);
        }
    }
}
