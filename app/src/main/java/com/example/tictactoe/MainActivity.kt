package com.example.tictactoe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private lateinit var btn1: Button;
    private lateinit var btn2: Button;
    private lateinit var btn3: Button;
    private lateinit var btn4: Button;
    private lateinit var btn5: Button;
    private lateinit var btn6: Button;
    private lateinit var btn7: Button;
    private lateinit var btn8: Button;
    private lateinit var btn9: Button;
    private var flag = 0;
    private var count = 0;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initButtons();

    }

    private fun initButtons() {
        btn1 = findViewById(R.id.btn1)
        btn2 = findViewById(R.id.btn2)
        btn3 = findViewById(R.id.btn3)
        btn4 = findViewById(R.id.btn4)
        btn5 = findViewById(R.id.btn5)
        btn6 = findViewById(R.id.btn6)
        btn7 = findViewById(R.id.btn7)
        btn8 = findViewById(R.id.btn8)
        btn9 = findViewById(R.id.btn9)

    }

    fun checkBtn(view: View) {
        var currentBtnClicked = view as Button;

        if (currentBtnClicked.text == "") {
            count++
            if (flag == 0) {
                currentBtnClicked.text = "X"
                flag = 1
            } else {
                currentBtnClicked.text = "0"
                flag = 0
            }

            val bt1 = btn1.text.toString()
            val bt2 = btn2.text.toString()
            val bt3 = btn3.text.toString()
            val bt4 = btn4.text.toString()
            val bt5 = btn5.text.toString()
            val bt6 = btn6.text.toString()
            val bt7 = btn7.text.toString()
            val bt8 = btn8.text.toString()
            val bt9 = btn9.text.toString()

            // logic to check winning condition (8 conditions)
            if (bt1 == bt2 && bt2 == bt3 && bt3 != "") {
                Toast.makeText(this, "Winner is: $bt1", Toast.LENGTH_LONG).show()
                newGame()
            } else if (bt4 == bt5 && bt5 == bt6 && bt6 != "") {
                Toast.makeText(this, "Winner is: $bt4", Toast.LENGTH_LONG).show()
                newGame()
            } else if (bt7 == bt8 && bt8 == bt9 && bt9 != "") {
                Toast.makeText(this, "Winner is: $bt9", Toast.LENGTH_LONG).show()
                newGame()
            } else if (bt1 == bt4 && bt4 == bt7 && bt7 != "") {
                Toast.makeText(this, "Winner is: $bt4", Toast.LENGTH_LONG).show()
                newGame()
            } else if (bt2 == bt5 && bt5 == bt8 && bt8 != "") {
                Toast.makeText(this, "Winner is: $bt2", Toast.LENGTH_LONG).show()
                newGame()
            } else if (bt3 == bt6 && bt6 == bt9 && bt9 != "") {
                Toast.makeText(this, "Winner is: $bt9", Toast.LENGTH_LONG).show()
                newGame()
            } else if (bt1 == bt5 && bt5 == bt9 && bt9 != "") {
                Toast.makeText(this, "Winner is: $bt9", Toast.LENGTH_LONG).show()
                newGame()
            } else if (bt4 == bt5 && bt5 == bt6 && bt6 != "") {
                Toast.makeText(this, "Winner is: $bt4", Toast.LENGTH_LONG).show()
                newGame()
            } else if (bt3 == bt5 && bt5 == bt7 && bt7 != "") {
                Toast.makeText(this, "Winner is: $bt7", Toast.LENGTH_LONG).show()
                newGame()
            } else if (count == 9) {
                Toast.makeText(this, "Match is a draw! Play again!!", Toast.LENGTH_LONG).show()
                newGame()
            }
        }
    }
    fun newGame() {
        btn1.text = ""
        btn2.text = ""
        btn3.text = ""
        btn4.text = ""
        btn5.text = ""
        btn6.text = ""
        btn7.text = ""
        btn8.text = ""
        btn9.text = ""
        flag = 0
        count = 0
    }
}