package ru.trening.searchexample;

import androidx.appcompat.app.AppCompatActivity;

import android.app.SearchManager;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent intent = getIntent();

        if (Intent.ACTION_SEARCH.equals(intent.getAction())) {
            //Берем строку запроса из экстры
            String query = intent.getStringExtra(SearchManager.QUERY);
            //Выполняем поиск
            Log.i("TAG", query);
        }
    }
}
