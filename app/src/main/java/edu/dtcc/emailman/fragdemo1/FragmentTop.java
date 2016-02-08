package edu.dtcc.emailman.fragdemo1;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

/**
 * Top fragment to handle two edit fields and a button
 */

public class FragmentTop extends Fragment {

    // Declare the edit text fields
    private static EditText etHeight;
    private static EditText etWidth;

    public FragmentTop() {
        // Required empty public constructor
    }

    // Define an interface
    public interface TopFragListener {
        void createClick(String height, String width);
    }

    // Declare an interface object
    TopFragListener activityComnmander;

    // Handler called when fragment is attached to the activity
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

        // Initialize the interface object
        try {
            activityComnmander = (TopFragListener) context;
        }
        catch (ClassCastException e) {
            throw new ClassCastException(context.toString());
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_top, container, false);

        // Get references to the two edit text fields
        etHeight = (EditText) view.findViewById(R.id.etHeight);
        etWidth = (EditText) view.findViewById(R.id.etWidth);

        // Get a reference to the button
        final Button btnCalculate = (Button) view.findViewById(R.id.btnCalc);

        // Define the button listener
        btnCalculate.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        buttonClicked(view);
                    }
                }
        );

        return view;
    }

    // Method to handle the button click
    public void buttonClicked(View view) {
        activityComnmander.createClick(etHeight.getText().toString(),
                etWidth.getText().toString());
    }
}
