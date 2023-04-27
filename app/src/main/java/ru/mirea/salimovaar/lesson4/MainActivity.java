package ru.mirea.salimovaar.lesson4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import ru.mirea.salimovaar.lesson4.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        binding.textView.setText("Мой номер по списку No 23");
        binding.button.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Log.d(MainActivity.class.getSimpleName(),"onClickListener");
        }
    });
    }
}