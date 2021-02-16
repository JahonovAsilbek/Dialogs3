package uz.revolution.customdialogtask3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        click.setOnClickListener {
            val beginTransaction = supportFragmentManager.beginTransaction()

            val dialog = CustomDialog.newInstance("Dialog1", "Dialog2")

            dialog.show(beginTransaction, "Dialog")

            dialog.setOnCLick(object : CustomDialog.OnClick {
                override fun onClick(str: String) {
                    Toast.makeText(this@MainActivity, "$str!", Toast.LENGTH_SHORT).show()
                }

            })
        }
    }
}