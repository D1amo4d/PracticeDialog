package com.example.practicedialog

import android.annotation.SuppressLint
import android.app.Dialog
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.view.Window
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnDialog1 = findViewById<Button>(R.id.btn_dialog1)
        val btnDialog2 = findViewById<Button>(R.id.btn_dialog2)

        btnDialog1.setOnClickListener {
            val message: String? = "Are you soure you want to log out"
            showCustomDialogBox1(message)

        }

        btnDialog2.setOnClickListener {
            val mssage2: String? = "Hopana fansera gero u nayt"
            showCustomDialogBox2(mssage2)
        }
    }

    private fun showCustomDialogBox2(mssage2: String?) {
        //Нужно докончить второй диоалоговое окно но уже сделать
        // в другом виде кода !
    }

    private fun showCustomDialogBox1(message: String?) {
        val dialog = Dialog(this)
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE)
        dialog.setCancelable(false)
        dialog.setContentView(R.layout.diaolog_desing)
        dialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        
        val btnOk = findViewById<Button>(R.id.btn_ok)
        val btnNo = findViewById<Button>(R.id.btn_no)
        val textV = findViewById<TextView>(R.id.text_view)

        textV.text = message
        btnOk.setOnClickListener {
            dialog.dismiss()
        }

        btnNo.setOnClickListener {
    
        }
        dialog.show()
    }
}
