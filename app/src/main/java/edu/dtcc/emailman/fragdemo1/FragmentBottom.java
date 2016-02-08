package edu.dtcc.emailman.fragdemo1;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/*
 * Created by emailman on 2/7/16
 * for CIS 282
 *
 * Bottom fragment receives two values, calculates results,
 * and writes results into two text fields
 *
 */

public class FragmentBottom extends Fragment {

    // Declare the output fields
    private static TextView txtArea;
    private static TextView txtPerimeter;

    public FragmentBottom() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_bottom, container, false);

        // Get references to the output fields
        txtArea = (TextView) view.findViewById(R.id.txtAreaValue);
        txtPerimeter = (TextView) view.findViewById(R.id.txtPerimeterValue);

        return view;
    }

    public void setClickedText(String height, String width) {

        // Calculate the area and perimeter
        double h = Double.parseDouble(height);
        double w = Double.parseDouble(width);

        double area = h * w;
        double perimeter = 2 * (h + w);

        // Put the calculated values in the output fields
        txtArea.setText(Double.toString(area));
        txtPerimeter.setText(Double.toString(perimeter));
    }
}
