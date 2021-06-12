package com.example.tiktoctoe;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements  View.OnClickListener {

    Button button_1;
    Button button_2;
    Button button_3;
    Button button_4;
    Button button_5;
    Button button_6;
    Button button_7;
    Button button_8;
    Button button_9;

    TextView textView;


    int player_x = 0;
    int player_o = 1;

    int chance = player_x;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button_1 = findViewById(R.id.btn_1);
        button_2 = findViewById(R.id.btn_2);
        button_3 = findViewById(R.id.btn_3);
        button_4 = findViewById(R.id.btn_4);
        button_5 = findViewById(R.id.btn_5);
        button_6 = findViewById(R.id.btn_6);
        button_7 = findViewById(R.id.btn_7);
        button_8 = findViewById(R.id.btn_8);
        button_9 = findViewById(R.id.btn_9);

        textView = findViewById(R.id.textview);

        textView.setText("Player X");

        button_1.setOnClickListener(this);
        button_2.setOnClickListener(this);
        button_3.setOnClickListener(this);
        button_4.setOnClickListener(this);
        button_5.setOnClickListener(this);
        button_6.setOnClickListener(this);
        button_7.setOnClickListener(this);
        button_8.setOnClickListener(this);
        button_9.setOnClickListener(this);

    }

    @Override
    public void onClick(View view)
    {
        Button button = findViewById(view.getId());

        if(!button.getText().toString().equals(""))
        {
            return;
        }

        if(chance == player_x)
        {
            button.setText("X");
            chance = player_o;
            textView.setText("Player O");
        }else
            {
            button.setText("O");
            chance = player_x;
            textView.setText("Player X");
        }

        if(     button_1.getText().toString().equals("X") &&
                button_2.getText().toString().equals("X") &&
                button_3.getText().toString().equals("X") ||

                button_4.getText().toString().equals("X") &&
                        button_5.getText().toString().equals("X") &&
                        button_6.getText().toString().equals("X") ||

                button_7.getText().toString().equals("X") &&
                        button_8.getText().toString().equals("X") &&
                        button_9.getText().toString().equals("X") ||

                button_1.getText().toString().equals("X") &&
                        button_4.getText().toString().equals("X") &&
                        button_7.getText().toString().equals("X") ||

                button_2.getText().toString().equals("X") &&
                        button_5.getText().toString().equals("X") &&
                        button_8.getText().toString().equals("X") ||

                button_3.getText().toString().equals("X") &&
                        button_6.getText().toString().equals("X") &&
                        button_9.getText().toString().equals("X") ||

                button_1.getText().toString().equals("X") &&
                        button_5.getText().toString().equals("X") &&
                        button_9.getText().toString().equals("X") ||

                button_3.getText().toString().equals("X") &&
                        button_5.getText().toString().equals("X") &&
                        button_7.getText().toString().equals("X")
        )
        {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);

            builder.setMessage("Player X won")
                    .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            dialogInterface.dismiss();
                            button_1.setText("");
                            button_2.setText("");
                            button_3.setText("");
                            button_4.setText("");
                            button_5.setText("");
                            button_6.setText("");
                            button_7.setText("");
                            button_8.setText("");
                            button_9.setText("");
                            chance = player_x;
                        }
                    });

            AlertDialog dialog = builder.create();

            dialog.setTitle("Congratulation");
            dialog.show();
            return;

        }

        if(     button_1.getText().toString().equals("O") &&
                button_2.getText().toString().equals("O") &&
                button_3.getText().toString().equals("O") ||

                button_4.getText().toString().equals("O") &&
                        button_5.getText().toString().equals("O") &&
                        button_6.getText().toString().equals("O") ||

                button_7.getText().toString().equals("O") &&
                        button_8.getText().toString().equals("O") &&
                        button_9.getText().toString().equals("O") ||

                button_1.getText().toString().equals("O") &&
                        button_4.getText().toString().equals("O") &&
                        button_7.getText().toString().equals("O") ||

                button_2.getText().toString().equals("O") &&
                        button_5.getText().toString().equals("O") &&
                        button_8.getText().toString().equals("O") ||

                button_3.getText().toString().equals("O") &&
                        button_6.getText().toString().equals("O") &&
                        button_9.getText().toString().equals("O") ||

                button_1.getText().toString().equals("O") &&
                        button_5.getText().toString().equals("O") &&
                        button_9.getText().toString().equals("O") ||

                button_3.getText().toString().equals("O") &&
                        button_5.getText().toString().equals("O") &&
                        button_7.getText().toString().equals("O")
        )
        {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);

            builder.setMessage("Player O won")
                    .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            dialogInterface.dismiss();
                            button_1.setText("");
                            button_2.setText("");
                            button_3.setText("");
                            button_4.setText("");
                            button_5.setText("");
                            button_6.setText("");
                            button_7.setText("");
                            button_8.setText("");
                            button_9.setText("");
                            chance = player_x;
                        }
                    });

            AlertDialog dialog = builder.create();

            dialog.setTitle("Congratulation");
            dialog.show();
            return;

        }

        if( !button_1.getText().toString().equals("") &&
                !button_2.getText().toString().equals("") &&
                !button_3.getText().toString().equals("") &&
                !button_4.getText().toString().equals("") &&
                !button_5.getText().toString().equals("") &&
                !button_6.getText().toString().equals("") &&
                !button_7.getText().toString().equals("") &&
                !button_8.getText().toString().equals("") &&
                !button_9.getText().toString().equals(""))
        {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);

            builder.setMessage("Match Draw")
                    .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            dialogInterface.dismiss();
                            button_1.setText("");
                            button_2.setText("");
                            button_3.setText("");
                            button_4.setText("");
                            button_5.setText("");
                            button_6.setText("");
                            button_7.setText("");
                            button_8.setText("");
                            button_9.setText("");
                            chance = player_x;
                        }
                    });

            AlertDialog dialog = builder.create();

            dialog.setTitle("Draw");
            dialog.show();
            return;
        }


    }
}
