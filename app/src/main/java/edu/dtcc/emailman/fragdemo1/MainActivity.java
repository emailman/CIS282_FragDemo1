package edu.dtcc.emailman.fragdemo1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity
                            implements FragmentTop.TopFragListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    // This is the interface we are forced to implement
    public void createClick(String height, String width) {

        // Create a reference to the bottom fragment
        FragmentBottom fragmentBottom =
                (FragmentBottom) getSupportFragmentManager().findFragmentById(R.id.fragment2);

        // Call the method in the bottom fragment to put the results there
        fragmentBottom.setClickedText(height, width);
    }
}
