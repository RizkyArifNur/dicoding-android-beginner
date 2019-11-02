package com.rizkyarifnur.dicodingandroidbeginner

import android.os.Bundle
import android.text.method.LinkMovementMethod
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_about.*

class AboutActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)
        loadImage()
        setLink()
    }

    private fun loadImage() {
        Glide.with(this)
            .load("https://www.dicoding.com/images/small/avatar/20180515111843051086beb6282e5ae2729675959e3f30.JPG")
            .into(img_my_photo)
    }

    private fun setLink() {
        tv_my_email.movementMethod = LinkMovementMethod.getInstance()
        tv_my_github.movementMethod = LinkMovementMethod.getInstance()
        tv_my_linkedin.movementMethod = LinkMovementMethod.getInstance()
    }
}
