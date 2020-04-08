package com.abc.resepnusantara.ui.Ayam;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class AyamViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public AyamViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is ayam fragment");
    }

    public LiveData<String> getText() { return mText; }
}