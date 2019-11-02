package com.rizkyarifnur.dicodingandroidbeginner

import android.os.Bundle
import com.rizkyarifnur.dicodingandroidbeginner.model.TourismModel

const val TOURISM_BUNDLE_NAME_KEY = "name"
const val TOURISM_BUNDLE_DESC_KEY = "description"
const val TOURISM_BUNDLE_IMG_KEY = "image"

fun String.shrink(length: Int): String {
    return this.substring(0, length) + "..."
}

fun Bundle.fromTourismModel(data: TourismModel): Bundle {
    this.putString(TOURISM_BUNDLE_NAME_KEY, data.tourismName)
    this.putString(TOURISM_BUNDLE_DESC_KEY, data.tourismDescription)
    this.putString(TOURISM_BUNDLE_IMG_KEY, data.tourismImageUrl)
    return this
}

fun Bundle.toTourismModel(): TourismModel {
    return TourismModel(
        getString(TOURISM_BUNDLE_NAME_KEY, ""),
        getString(TOURISM_BUNDLE_DESC_KEY, ""),
        getString(TOURISM_BUNDLE_IMG_KEY, "")
    )
}