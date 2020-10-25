package com.example.lab1attempt3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /** Eactly this type of comments is needed to create javadocs
     * The min function finds and returns
     * a minimal of two integers.
     * @param a is the first integer to compare
     * @param b is the second integer to compare
     * @return returns the minimum
     */
    public int min(int a, int b) {
        if (a > b) return b;
        else return a;
    }

    /**
     * The max function finds and returns
     * the maximum of two integers inserted
     * @param a is the first integer to compare
     * @param b is the second integer to compare
     * @return this statement returns the maximum
     */
    public int max(int a, int b) {
        if (a > b) return a;
        else return b;
    }
}
