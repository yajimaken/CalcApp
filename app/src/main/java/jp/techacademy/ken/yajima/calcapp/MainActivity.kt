package jp.techacademy.ken.yajima.calcapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.app.AlertDialog
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() ,View.OnClickListener{

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener(this)
        button2.setOnClickListener(this)
        button3.setOnClickListener(this)
        button4.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        var a=editText1.text.toString().toDouble()
        var b=editText2.text.toString().toDouble()
        val intent=Intent(this,SumActivity::class.java)


        when(v.id) {


            R.id.button -> if (editText1.text.isEmpty() || editText2.text.isEmpty()) {
                showAlertDialog()
            } else {
                intent.putExtra("VALUE", a + b)
            }
            R.id.button2 -> if (editText1.text.isEmpty() || editText2.text.isEmpty()) {
                showAlertDialog()
            } else {
                intent.putExtra("VALUE", a - b)
            }
            R.id.button3 -> if (editText1.text.isEmpty() || editText2.text.isEmpty()) {
                showAlertDialog()
            } else {
                intent.putExtra("VALUE", a * b)
            }
            R.id.button4 -> if(editText1.text.isEmpty() || editText2.text.isEmpty()){
                showAlertDialog()
            }else{intent.putExtra("VALUE", a/b)}

        }
        startActivity(intent)
    }
    private fun showAlertDialog(){
        val alertDialogBuilder=AlertDialog.Builder(this)
        alertDialogBuilder.setTitle("注意")
        alertDialogBuilder.setMessage("数字が入力されていません")

        alertDialogBuilder.setPositiveButton("OK"){_,_ ->

        }
    }
    private fun showAlertDialog0(){
        val alertDialogBuilder=AlertDialog.Builder(this)
        alertDialogBuilder.setTitle("注意")
        alertDialogBuilder.setMessage("0で割ることはできません")

        alertDialogBuilder.setPositiveButton("OK"){_,_ ->
            Log.d("Log","b")
0
        }
    }
}
