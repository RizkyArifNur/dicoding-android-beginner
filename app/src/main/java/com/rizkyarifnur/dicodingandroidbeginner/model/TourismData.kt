package com.rizkyarifnur.dicodingandroidbeginner.model

import android.content.res.Resources
import com.rizkyarifnur.dicodingandroidbeginner.R

class TourismData(res: Resources) {
    private var names: Array<String> = arrayOf()

    private var descriptions: Array<String> = arrayOf()

    private val imageUrls = arrayOf(
        "https://cdn.idntimes.com/content-images/post/20190312/1-karimunjawa-fadil-bappe-97434b92cae281a42c5738b63e2bda4b.jpg",
        "https://cdn.idntimes.com/content-images/post/20190312/xbalmaulana-43e63bdbc7993f707e462817b9314282.jpg",
        "https://cdn.idntimes.com/content-images/post/20190312/3-benteng-okakurnia-8c553417ac19ae9582a71250bc8a9e72.jpg",
        "https://cdn.idntimes.com/content-images/post/20190313/air-lautnya-jernih-651d21f496ac7a66ebf915a4b151d23c.jpg",
        "https://cdn.idntimes.com/content-images/post/20190312/5-punuk-aarpr-defcc9acbf44d4871bb0e2bae9fe9c5b.jpg",
        "https://cdn.idntimes.com/content-images/post/20190312/6-hutan-sreni-anaafifah-6c93b2f9a895b52b553c770e407fe619.jpg",
        "https://cdn.idntimes.com/content-images/post/20190312/7-goa-aldieljovi-9a96a19f7983bffebda3b88fee42f8a0.jpg",
        "https://cdn.idntimes.com/content-images/post/20190312/8-pungkruk-v-921da9044f81987485f8b90b581965cd.jpg",
        "https://cdn.idntimes.com/content-images/post/20190312/9-bukit-bejagan-mahfud-safrudin21-cfb837d87c8480aabda916540baede3b.jpg",
        "https://i.pinimg.com/originals/59/b3/87/59b387536cbb0cd0226b331a3d2447f4.jpg"
    )

    init {
        names = res.getStringArray(R.array.tourismNames)
        descriptions = res.getStringArray(R.array.tourismDescriptions)
    }


    fun getContents() : ArrayList<TourismModel> {
        val contents = arrayListOf<TourismModel>()
        for (index in names.indices) {
            val tourismModel = TourismModel(
                names[index],
                descriptions[index],
                imageUrls[index]
            )
            contents.add(tourismModel)
        }
        return contents

    }


}