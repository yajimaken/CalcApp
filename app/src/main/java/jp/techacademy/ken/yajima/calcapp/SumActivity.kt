package jp.techacademy.ken.yajima.calcapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_sum.*

class SumActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sum)

        val value1=intent.getIntExtra("VALUE",0)

        textView.text="$value1"




    }
}
