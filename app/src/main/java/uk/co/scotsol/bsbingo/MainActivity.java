package uk.co.scotsol.bsbingo;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        getBS();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void getBS() {
        Resources res = getResources();
        String[] bslist = new String[10];
        int i = new int[];
        i = 1;
        bslist = res.getStringArray(R.array.bs_list);
        System.out.print(blist[i]);
    }

    public void a1_click(View view) {
        // Do something in response to button click

    }
}
