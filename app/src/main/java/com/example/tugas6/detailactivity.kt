package com.example.tugas6

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activitydetail.*


class detailactivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activitydetail)
        var intentThatStartedThisActivity = getIntent()
        if (intentThatStartedThisActivity.hasExtra(Intent.EXTRA_TEXT)) {
            var foto = intentThatStartedThisActivity.getIntExtra(Intent.EXTRA_TEXT, 0)
            var nama =
                intentThatStartedThisActivity.getStringExtra(Intent.EXTRA_TITLE)
            var detail =
                intentThatStartedThisActivity.getStringExtra(Intent.EXTRA_TEMPLATE)
            image_detail.setImageResource(foto)
            tv_name_detail.text = nama
            tv_desc_detail.text = detail
        }}

}
