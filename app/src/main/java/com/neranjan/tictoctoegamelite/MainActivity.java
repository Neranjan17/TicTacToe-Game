package com.neranjan.tictoctoegamelite;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Boolean userTurn;
    Random random = new Random();


    Button btn1;
    Button btn2;
    Button btn3;
    Button btn4;
    Button btn5;
    Button btn6;
    Button btn7;
    Button btn8;
    Button btn9;
    TextView txtTurn;
    TextView restartBtn;

    String nowIsX = "Now it's your turn";
    String nowIsO = "Now it's my turn";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtTurn = findViewById(R.id.txtTurn);
        restartBtn = findViewById(R.id.txtRestartBtn);

        btn1 = findViewById(R.id.but1);
        btn2 = findViewById(R.id.but2);
        btn3 = findViewById(R.id.but3);
        btn4 = findViewById(R.id.but4);
        btn5 = findViewById(R.id.but5);
        btn6 = findViewById(R.id.but6);
        btn7 = findViewById(R.id.but7);
        btn8 = findViewById(R.id.but8);
        btn9 = findViewById(R.id.but9);


        loadGame(); //set ot defolt & set Tos

        clickT();


        restartBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                loadGame();
                clickT();
            }
        });


    }


    public void clickT() {

            if (userTurn.equals(true)) {

                click9Btn();

            }else if (userTurn.equals(false)) {


                autoPlay();
                oWin();

            }


    }







    public void autoPlay() {


        // Chek to Win Chans for O

        if (btn1.getText().equals("") && btn2.getText().equals("O") && btn3.getText().equals("O")) {

            btn1.setText("O");
            userTurn=true;
            txtTurn.setText(nowIsX);

        }else if (btn4.getText().equals("") && btn5.getText().equals("O") && btn6.getText().equals("O")) {

            btn4.setText("O");
            userTurn=true;
            txtTurn.setText(nowIsX);

        }else if (btn7.getText().equals("") && btn8.getText().equals("O") && btn9.getText().equals("O")) {

            btn7.setText("O");
            userTurn=true;
            txtTurn.setText(nowIsX);

        }else if (btn1.getText().equals("") && btn4.getText().equals("O") && btn7.getText().equals("O")) {

            btn1.setText("O");
            userTurn=true;
            txtTurn.setText(nowIsX);

        }else if (btn2.getText().equals("") && btn5.getText().equals("O") && btn8.getText().equals("O")) {

            btn2.setText("O");
            userTurn=true;
            txtTurn.setText(nowIsX);

        }else if (btn3.getText().equals("") && btn6.getText().equals("O") && btn9.getText().equals("O")) {

            btn3.setText("O");
            userTurn=true;
            txtTurn.setText(nowIsX);

        }else if (btn1.getText().equals("") && btn5.getText().equals("O") && btn9.getText().equals("O")) {

            btn1.setText("O");
            userTurn=true;
            txtTurn.setText(nowIsX);

        }else if (btn3.getText().equals("") && btn5.getText().equals("O") && btn7.getText().equals("O")) {

            btn3.setText("O");
            userTurn=true;
            txtTurn.setText(nowIsX);

        }//end _OO



        else if (btn1.getText().equals("O") && btn2.getText().equals("") && btn3.getText().equals("O")) {

            btn2.setText("O");
            userTurn=true;
            txtTurn.setText(nowIsX);

        }else if (btn4.getText().equals("O") && btn5.getText().equals("") && btn6.getText().equals("O")) {

            btn8.setText("O");
            userTurn=true;
            txtTurn.setText(nowIsX);

        }else if (btn7.getText().equals("O") && btn8.getText().equals("") && btn9.getText().equals("O")) {

            btn9.setText("O");
            userTurn=true;
            txtTurn.setText(nowIsX);

        }else if (btn1.getText().equals("O") && btn4.getText().equals("") && btn7.getText().equals("O")) {

            btn4.setText("O");
            userTurn=true;
            txtTurn.setText(nowIsX);

        }else if (btn2.getText().equals("O") && btn5.getText().equals("") && btn8.getText().equals("O")) {

            btn5.setText("O");
            userTurn=true;
            txtTurn.setText(nowIsX);

        }else if (btn3.getText().equals("O") && btn6.getText().equals("") && btn9.getText().equals("O")) {

            btn6.setText("O");
            userTurn=true;
            txtTurn.setText(nowIsX);

        }else if (btn1.getText().equals("O") && btn5.getText().equals("") && btn9.getText().equals("O")) {

            btn5.setText("O");
            userTurn=true;
            txtTurn.setText(nowIsX);

        }else if (btn3.getText().equals("O") && btn5.getText().equals("") && btn7.getText().equals("O")) {

            btn5.setText("O");
            userTurn=true;
            txtTurn.setText(nowIsX);

        }//End O_O



        else if (btn1.getText().equals("O") && btn2.getText().equals("O") && btn3.getText().equals("")) {

            btn3.setText("O");
            userTurn=true;
            txtTurn.setText(nowIsX);

        }else if (btn4.getText().equals("O") && btn5.getText().equals("O") && btn6.getText().equals("")) {

            btn6.setText("O");
            userTurn=true;
            txtTurn.setText(nowIsX);

        }else if (btn7.getText().equals("O") && btn8.getText().equals("O") && btn9.getText().equals("")) {

            btn9.setText("O");
            userTurn=true;
            txtTurn.setText(nowIsX);

        }else if (btn1.getText().equals("O") && btn4.getText().equals("O") && btn7.getText().equals("")) {

            btn7.setText("O");
            userTurn=true;
            txtTurn.setText(nowIsX);

        }else if (btn2.getText().equals("O") && btn5.getText().equals("O") && btn8.getText().equals("")) {

            btn8.setText("O");
            userTurn=true;
            txtTurn.setText(nowIsX);

        }else if (btn3.getText().equals("O") && btn6.getText().equals("O") && btn9.getText().equals("")) {

            btn9.setText("O");
            userTurn=true;
            txtTurn.setText(nowIsX);

        }else if (btn1.getText().equals("O") && btn5.getText().equals("O") && btn9.getText().equals("")) {

            btn9.setText("O");
            userTurn=true;
            txtTurn.setText(nowIsX);

        }else if (btn3.getText().equals("O") && btn5.getText().equals("O") && btn7.getText().equals("")) {

            btn7.setText("O");
            userTurn=true;
            txtTurn.setText(nowIsX);

        }//End OO_




        // Bloc to Win Chans for X





        else if (btn1.getText().equals("") && btn2.getText().equals("X") && btn3.getText().equals("X")) {

            btn1.setText("O");
            userTurn=true;
            txtTurn.setText(nowIsX);

        }else if (btn4.getText().equals("") && btn5.getText().equals("X") && btn6.getText().equals("X")) {

            btn4.setText("O");
            userTurn=true;
            txtTurn.setText(nowIsX);

        }else if (btn7.getText().equals("") && btn8.getText().equals("X") && btn9.getText().equals("X")) {

            btn7.setText("O");
            userTurn=true;
            txtTurn.setText(nowIsX);

        }else if (btn1.getText().equals("") && btn4.getText().equals("X") && btn7.getText().equals("X")) {

            btn1.setText("O");
            userTurn=true;
            txtTurn.setText(nowIsX);

        }else if (btn2.getText().equals("") && btn5.getText().equals("X") && btn8.getText().equals("X")) {

            btn2.setText("O");
            userTurn=true;
            txtTurn.setText(nowIsX);

        }else if (btn3.getText().equals("") && btn6.getText().equals("X") && btn9.getText().equals("X")) {

            btn3.setText("O");
            userTurn=true;
            txtTurn.setText(nowIsX);

        }else if (btn1.getText().equals("") && btn5.getText().equals("X") && btn9.getText().equals("X")) {

            btn1.setText("O");
            userTurn=true;
            txtTurn.setText(nowIsX);

        }else if (btn3.getText().equals("") && btn5.getText().equals("X") && btn7.getText().equals("X")) {

            btn3.setText("O");
            userTurn=true;
            txtTurn.setText(nowIsX);

        }//end _XX



        else if (btn1.getText().equals("X") && btn2.getText().equals("") && btn3.getText().equals("X")) {

            btn2.setText("O");
            userTurn=true;
            txtTurn.setText(nowIsX);

        }else if (btn4.getText().equals("X") && btn5.getText().equals("") && btn6.getText().equals("X")) {

            btn8.setText("O");
            userTurn=true;
            txtTurn.setText(nowIsX);

        }else if (btn7.getText().equals("X") && btn8.getText().equals("") && btn9.getText().equals("X")) {

            btn9.setText("O");
            userTurn=true;
            txtTurn.setText(nowIsX);

        }else if (btn1.getText().equals("X") && btn4.getText().equals("") && btn7.getText().equals("X")) {

            btn4.setText("O");
            userTurn=true;
            txtTurn.setText(nowIsX);

        }else if (btn2.getText().equals("X") && btn5.getText().equals("") && btn8.getText().equals("X")) {

            btn5.setText("O");
            userTurn=true;
            txtTurn.setText(nowIsX);

        }else if (btn3.getText().equals("X") && btn6.getText().equals("") && btn9.getText().equals("X")) {

            btn6.setText("O");
            userTurn=true;
            txtTurn.setText(nowIsX);

        }else if (btn1.getText().equals("X") && btn5.getText().equals("") && btn9.getText().equals("X")) {

            btn5.setText("O");
            userTurn=true;
            txtTurn.setText(nowIsX);

        }else if (btn3.getText().equals("X") && btn5.getText().equals("") && btn7.getText().equals("X")) {

            btn5.setText("O");
            userTurn=true;
            txtTurn.setText(nowIsX);

        }//End X_X



        else if (btn1.getText().equals("X") && btn2.getText().equals("X") && btn3.getText().equals("")) {

            btn3.setText("O");
            userTurn=true;
            txtTurn.setText(nowIsX);

        }else if (btn4.getText().equals("X") && btn5.getText().equals("X") && btn6.getText().equals("")) {

            btn6.setText("O");
            userTurn=true;
            txtTurn.setText(nowIsX);

        }else if (btn7.getText().equals("X") && btn8.getText().equals("X") && btn9.getText().equals("")) {

            btn9.setText("O");
            userTurn=true;
            txtTurn.setText(nowIsX);

        }else if (btn1.getText().equals("X") && btn4.getText().equals("X") && btn7.getText().equals("")) {

            btn7.setText("O");
            userTurn=true;
            txtTurn.setText(nowIsX);

        }else if (btn2.getText().equals("X") && btn5.getText().equals("X") && btn8.getText().equals("")) {

            btn8.setText("O");
            userTurn=true;
            txtTurn.setText(nowIsX);

        }else if (btn3.getText().equals("X") && btn6.getText().equals("X") && btn9.getText().equals("")) {

            btn9.setText("O");
            userTurn=true;
            txtTurn.setText(nowIsX);

        }else if (btn1.getText().equals("X") && btn5.getText().equals("X") && btn9.getText().equals("")) {

            btn9.setText("O");
            userTurn=true;
            txtTurn.setText(nowIsX);

        }else if (btn3.getText().equals("X") && btn5.getText().equals("X") && btn7.getText().equals("")) {

            btn7.setText("O");
            userTurn=true;
            txtTurn.setText(nowIsX);

        }//End XX_



        else {

            switch (random.nextInt(9)){

                case 0:

                    if (btn1.getText().equals("")) {

                        btn1.setText("O");
                        userTurn=true;
                        txtTurn.setText(nowIsX);



                    }else {
                        autoPlay();
                    }
                    break;

                case 1:
                    if (btn2.getText().equals("")) {

                        btn2.setText("O");
                        userTurn=true;
                        txtTurn.setText(nowIsX);



                    }else {
                        autoPlay();
                    }
                    break;

                case 2:
                    if (btn3.getText().equals("")) {

                        btn3.setText("O");
                        userTurn=true;
                        txtTurn.setText(nowIsX);



                    }else {
                        autoPlay();
                    }
                    break;

                case 3:
                    if (btn4.getText().equals("")) {

                        btn4.setText("O");
                        userTurn=true;
                        txtTurn.setText(nowIsX);



                    }else {
                        autoPlay();
                    }
                    break;

                case 4:
                    if (btn5.getText().equals("")) {

                        btn5.setText("O");
                        userTurn=true;
                        txtTurn.setText(nowIsX);



                    }else {
                        autoPlay();
                    }
                    break;

                case 5:
                    if (btn6.getText().equals("")) {

                        btn6.setText("O");
                        userTurn=true;
                        txtTurn.setText(nowIsX);



                    }else {
                        autoPlay();
                    }
                    break;

                case 6:
                    if (btn7.getText().equals("")) {

                        btn7.setText("O");
                        userTurn=true;
                        txtTurn.setText(nowIsX);



                    }else {
                        autoPlay();
                    }
                    break;

                case 7:
                    if (btn8.getText().equals("")) {

                        btn8.setText("O");
                        userTurn=true;
                        txtTurn.setText(nowIsX);



                    }else {
                        autoPlay();
                    }
                    break;

                case 8:
                    if (btn9.getText().equals("")) {

                        btn9.setText("O");
                        userTurn=true;
                        txtTurn.setText(nowIsX);



                    }else {
                        autoPlay();
                    }
                    break;


            }

        }


    }
    public void click9Btn () {

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (btn1.getText().equals(""))  {

                    btn1.setText("X");
                    userTurn=false;
                    txtTurn.setText(nowIsO);

                    xWin();

                }
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (btn2.getText().equals(""))  {

                    btn2.setText("X");
                    userTurn=false;
                    txtTurn.setText(nowIsO);

                    xWin();
                }
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (btn3.getText().equals(""))  {

                    btn3.setText("X");
                    userTurn=false;
                    txtTurn.setText(nowIsO);

                    xWin();
                }
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (btn4.getText().equals(""))  {

                    btn4.setText("X");
                    userTurn=false;
                    txtTurn.setText(nowIsO);

                    xWin();
                }
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (btn5.getText().equals(""))  {

                    btn5.setText("X");
                    userTurn=false;
                    txtTurn.setText(nowIsO);

                    xWin();
                }
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (btn6.getText().equals(""))  {

                    btn6.setText("X");
                    userTurn=false;
                    txtTurn.setText(nowIsO);

                    xWin();
                }
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (btn7.getText().equals(""))  {

                    btn7.setText("X");
                    userTurn=false;
                    txtTurn.setText(nowIsO);

                    xWin();
                }
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (btn8.getText().equals(""))  {

                    btn8.setText("X");
                    userTurn=false;
                    txtTurn.setText(nowIsO);

                    xWin();
                }
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (btn9.getText().equals(""))  {

                    btn9.setText("X");
                    userTurn=false;
                    txtTurn.setText(nowIsO);

                    xWin();
                }
            }
        });
    }


    public void xWin() {

        if (btn1.getText().equals("X") && btn2.getText().equals("X") && btn3.getText().equals("X")) {

            btn1.setBackgroundColor(Color.GREEN);
            btn2.setBackgroundColor(Color.GREEN);
            btn3.setBackgroundColor(Color.GREEN);
            gameOver(1);

        }else if (btn4.getText().equals("X") && btn5.getText().equals("X") && btn6.getText().equals("X")) {

            btn4.setBackgroundColor(Color.GREEN);
            btn5.setBackgroundColor(Color.GREEN);
            btn6.setBackgroundColor(Color.GREEN);
            gameOver(1);

        }else if (btn7.getText().equals("X") && btn8.getText().equals("X") && btn9.getText().equals("X")) {

            btn7.setBackgroundColor(Color.GREEN);
            btn8.setBackgroundColor(Color.GREEN);
            btn9.setBackgroundColor(Color.GREEN);
            gameOver(1);

        }else if (btn1.getText().equals("X") && btn4.getText().equals("X") && btn7.getText().equals("X")) {

            btn1.setBackgroundColor(Color.GREEN);
            btn4.setBackgroundColor(Color.GREEN);
            btn7.setBackgroundColor(Color.GREEN);
            gameOver(1);

        }else if (btn2.getText().equals("X") && btn5.getText().equals("X") && btn8.getText().equals("X")) {

            btn2.setBackgroundColor(Color.GREEN);
            btn5.setBackgroundColor(Color.GREEN);
            btn8.setBackgroundColor(Color.GREEN);
            gameOver(1);

        }else if (btn3.getText().equals("X") && btn6.getText().equals("X") && btn9.getText().equals("X")) {

            btn3.setBackgroundColor(Color.GREEN);
            btn6.setBackgroundColor(Color.GREEN);
            btn9.setBackgroundColor(Color.GREEN);
            gameOver(1);

        }else if (btn1.getText().equals("X") && btn5.getText().equals("X") && btn9.getText().equals("X")) {

            btn1.setBackgroundColor(Color.GREEN);
            btn5.setBackgroundColor(Color.GREEN);
            btn9.setBackgroundColor(Color.GREEN);
            gameOver(1);

        }else if (btn3.getText().equals("X") && btn5.getText().equals("X") && btn7.getText().equals("X")) {

            btn3.setBackgroundColor(Color.GREEN);
            btn5.setBackgroundColor(Color.GREEN);
            btn7.setBackgroundColor(Color.GREEN);
            gameOver(1);

        }else {

            gameDrow();

        }



    }
    public void oWin() {

        if (btn1.getText().equals("O") && btn2.getText().equals("O") && btn3.getText().equals("O")) {

            btn1.setBackgroundColor(Color.GREEN);
            btn2.setBackgroundColor(Color.GREEN);
            btn3.setBackgroundColor(Color.GREEN);
            gameOver(2);

        }else if (btn4.getText().equals("O") && btn5.getText().equals("O") && btn6.getText().equals("O")) {

            btn4.setBackgroundColor(Color.GREEN);
            btn5.setBackgroundColor(Color.GREEN);
            btn6.setBackgroundColor(Color.GREEN);
            gameOver(2);

        }else if (btn7.getText().equals("O") && btn8.getText().equals("O") && btn9.getText().equals("O")) {

            btn7.setBackgroundColor(Color.GREEN);
            btn8.setBackgroundColor(Color.GREEN);
            btn9.setBackgroundColor(Color.GREEN);
            gameOver(2);

        }else if (btn1.getText().equals("O") && btn4.getText().equals("O") && btn7.getText().equals("O")) {

            btn1.setBackgroundColor(Color.GREEN);
            btn4.setBackgroundColor(Color.GREEN);
            btn7.setBackgroundColor(Color.GREEN);
            gameOver(2);

        }else if (btn2.getText().equals("O") && btn5.getText().equals("O") && btn8.getText().equals("O")) {

            btn2.setBackgroundColor(Color.GREEN);
            btn5.setBackgroundColor(Color.GREEN);
            btn8.setBackgroundColor(Color.GREEN);
            gameOver(2);

        }else if (btn3.getText().equals("O") && btn6.getText().equals("O") && btn9.getText().equals("O")) {

            btn3.setBackgroundColor(Color.GREEN);
            btn6.setBackgroundColor(Color.GREEN);
            btn9.setBackgroundColor(Color.GREEN);
            gameOver(2);

        }else if (btn1.getText().equals("O") && btn5.getText().equals("O") && btn9.getText().equals("O")) {

            btn1.setBackgroundColor(Color.GREEN);
            btn5.setBackgroundColor(Color.GREEN);
            btn9.setBackgroundColor(Color.GREEN);
            gameOver(2);

        }else if (btn3.getText().equals("O") && btn5.getText().equals("O") && btn7.getText().equals("O")) {

            btn3.setBackgroundColor(Color.GREEN);
            btn5.setBackgroundColor(Color.GREEN);
            btn7.setBackgroundColor(Color.GREEN);
            gameOver(2);

        }else {

            gameDrow();

        }


    }

    public void gameDrow() {
        if ( (!btn1.getText().equals("")) && (!btn2.getText().equals("")) && (!btn3.getText().equals(""))
                && (!btn4.getText().equals("")) && (!btn5.getText().equals("")) && (!btn6.getText().equals(""))
                && (!btn7.getText().equals("")) && (!btn8.getText().equals("")) && (!btn9.getText().equals(""))   )
        {
            gameOver(0);

        }else {
            clickT();
        }
    }
    public void gameOver(int s) {


        btn1.setEnabled(false);
        btn2.setEnabled(false);
        btn3.setEnabled(false);
        btn4.setEnabled(false);
        btn5.setEnabled(false);
        btn6.setEnabled(false);
        btn7.setEnabled(false);
        btn8.setEnabled(false);
        btn9.setEnabled(false);

        btn1.setTextColor(Color.WHITE);
        btn2.setTextColor(Color.WHITE);
        btn3.setTextColor(Color.WHITE);
        btn4.setTextColor(Color.WHITE);
        btn5.setTextColor(Color.WHITE);
        btn6.setTextColor(Color.WHITE);
        btn7.setTextColor(Color.WHITE);
        btn8.setTextColor(Color.WHITE);
        btn9.setTextColor(Color.WHITE);



        switch (s) {
            case 1:

                txtTurn.setText("You Win !!");
                txtTurn.setTextColor(Color.YELLOW);

                break;
            case 2:

                txtTurn.setText("You Lost !!");
                txtTurn.setTextColor(Color.rgb(245, 68, 36));


                break;
            case 0:

                txtTurn.setText("Game Drow !!");
                txtTurn.setTextColor(Color.GREEN);


                break;
        }


        txtTurn.setTextSize(40);

        restartBtn.setTextSize(20);
        restartBtn.setTextColor(Color.rgb(183, 111, 47));

    }

    public void loadGame(){

        int []btnColors = {130,80,164};

        btn1.setBackgroundColor(Color.rgb( btnColors[0],btnColors[1],btnColors[2] ));
        btn2.setBackgroundColor(Color.rgb( btnColors[0],btnColors[1],btnColors[2] ));
        btn3.setBackgroundColor(Color.rgb( btnColors[0],btnColors[1],btnColors[2] ));
        btn4.setBackgroundColor(Color.rgb( btnColors[0],btnColors[1],btnColors[2] ));
        btn5.setBackgroundColor(Color.rgb( btnColors[0],btnColors[1],btnColors[2] ));
        btn6.setBackgroundColor(Color.rgb( btnColors[0],btnColors[1],btnColors[2] ));
        btn7.setBackgroundColor(Color.rgb( btnColors[0],btnColors[1],btnColors[2] ));
        btn8.setBackgroundColor(Color.rgb( btnColors[0],btnColors[1],btnColors[2] ));
        btn9.setBackgroundColor(Color.rgb( btnColors[0],btnColors[1],btnColors[2] ));

        btn1.setText("");
        btn2.setText("");
        btn3.setText("");
        btn4.setText("");
        btn5.setText("");
        btn6.setText("");
        btn7.setText("");
        btn8.setText("");
        btn9.setText("");

        btn1.setEnabled(true);
        btn2.setEnabled(true);
        btn3.setEnabled(true);
        btn4.setEnabled(true);
        btn5.setEnabled(true);
        btn6.setEnabled(true);
        btn7.setEnabled(true);
        btn8.setEnabled(true);
        btn9.setEnabled(true);


        txtTurn.setTextColor(Color.rgb(185, 174, 205));
        txtTurn.setTextSize(34);


        restartBtn.setTextSize(16);
        restartBtn.setTextColor(Color.rgb(117, 38, 14));

        fastTurn();

    }
    public void fastTurn() {

        if (random.nextInt(2) == 0) {

            userTurn = true;
            txtTurn.setText(nowIsX);

        }else {
            userTurn = false;
            txtTurn.setText(nowIsO);
        }

    }



}//End class