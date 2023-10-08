package com.example.latihan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var tv:TextView
    private lateinit var binding:ActivityMainBinding
//    private lateinit var binding: Button
//    private lateinit var binding2: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tv = findViewById(R.id.textView2)

        val username = intent.getParcelableExtra<User>("User")?.username
        val password = intent.getParcelableExtra<User>("User")?.password

        tv.text = "Username : $username and Password : $password"

        val btnImplicit: Button = findViewById(R.id.btn_implicit)
        btnImplicit.setOnClickListener(this)

        //fragment

//        binding = findViewById(R.id.btn_fragment1)
//        binding2 = findViewById(R.id.btn_fragment2)
//        binding.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when(v.id){
//            R.id.btn_fragment1 ->{
//                var intent = Intent(this@MainActivity,Fragment_1::class.java)
//                startActivity(intent)
//            }
//            R.id.btn_fragment2 ->{
//                var intent = Intent(this@MainActivity,Fragment_2::class.java)
//                startActivity(intent)
//            }
            R.id.btn_implicit -> {
//                val message = "halo tes"
//                val intent = Intent()
//                intent.action = Intent.ACTION_SEND
//                intent.putExtra(Intent.EXTRA_TEXT, message)
//                intent.type = "text/plain"
//                startActivity(intent)

                val intent = Intent()
                intent.putExtra("history", "Anda sudah login")
                setResult(RESULT_OK, intent)
                finish()
            }
        }
    }
}