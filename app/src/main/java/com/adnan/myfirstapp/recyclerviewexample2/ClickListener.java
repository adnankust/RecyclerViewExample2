package com.adnan.myfirstapp.recyclerviewexample2;

import android.view.View;

public interface ClickListener<T> {

    void onClick(View view, T data, int position);
}