//17130832/1
package com.example.week8lecture;

import android.content.res.Configuration;
import android.os.Bundle;

import androidx.fragment.app.FragmentActivity;

public class DetailsActivity extends FragmentActivity {

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        if(getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE){
            finish();
            return;
        }

        if(savedInstanceState == null){
            DetailsFragment details = new DetailsFragment();
            details.setArguments(getIntent().getExtras());
            getSupportFragmentManager().beginTransaction().add(android.R.id.content, details).commit();
        }
    }
}
