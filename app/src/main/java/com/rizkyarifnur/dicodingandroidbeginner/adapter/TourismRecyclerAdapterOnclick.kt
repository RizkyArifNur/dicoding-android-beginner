package com.rizkyarifnur.dicodingandroidbeginner.adapter

import android.view.View
import com.bumptech.glide.Glide
import com.rizkyarifnur.dicodingandroidbeginner.R
import com.rizkyarifnur.dicodingandroidbeginner.model.TourismModel
import com.rizkyarifnur.dicodingandroidbeginner.shrink
import kotlinx.android.synthetic.main.item_tourism.view.*

class TourismRecyclerAdapterOnclick(onItemClick: (TourismModel) -> Unit) :
    BaseRecyclerOnClickAdapter<TourismModel>(R.layout.item_tourism, onItemClick) {

    override fun onBindView(holderView: View, position: Int, holder: ViewHolder) {
        super.onBindView(holderView, position, holder)
        val currentItem = items[position]
        val tourismPhotoUrl = currentItem.tourismImageUrl
        holderView.tv_tourism_name_rv.text = currentItem.tourismName
        holderView.tv_tourism_desc_rv.text = currentItem.tourismDescription.shrink(80)
        Glide.with(holder.itemView).load(tourismPhotoUrl).into(holderView.img_tourism_photo_rv)
    }
}