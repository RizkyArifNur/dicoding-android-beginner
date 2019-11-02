package com.rizkyarifnur.dicodingandroidbeginner

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_detail.*

class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        if(intent.extras != null){
            val tourismItem = intent.extras!!.toTourismModel()
            tv_tourism_name.text = tourismItem.tourismName
            tv_tourism_desc.text = tourismItem.tourismDescription
            Glide.with(this).load(tourismItem.tourismImageUrl).into(img_tourism_photo)
        }
    }
}
