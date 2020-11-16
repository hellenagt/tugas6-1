package com.example.tugas6

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val data = createFac()
        rv_list_main.layoutManager = LinearLayoutManager(this)
        rv_list_main.setHasFixedSize(true)
        rv_list_main.adapter = foodadapter (data, { onItem: data -> onItemClicked(onItem) })
    }
    private fun onItemClicked(onItem: data) {
        val showDetailActivityIntent = Intent(this, detailactivity::class.java)
        showDetailActivityIntent.putExtra(Intent.EXTRA_TEXT, onItem.foto)
        showDetailActivityIntent.putExtra(Intent.EXTRA_TITLE, onItem.nama)
        showDetailActivityIntent.putExtra(Intent.EXTRA_TEMPLATE, onItem.detail)
        startActivity(showDetailActivityIntent)
    }
    private fun createFac(): List<data> {
        val rvList = ArrayList<data>()
        rvList.add(
            data(
                R.drawable.xie,
                "Xie Xie Boba",
                "Xie Xie Boba merupakan salah satu minuman boba brown sugar yang cukup terkenal di Surabaya. Xie Xie Boba memiliki varian rasa yang beragam, seperti original, mocca, caramel, matcha dan lainnya. Harganya mulai dari 12 ribu saja. Cabangnya di Surabaya sudah lumayan banyak salah satu nya di  Jl. Kendung No. 49, Sememi, Benowo, Surabaya."

            )
        )
        rvList.add(
            data(
                R.drawable.jasuke,
                "Jagung Nyumi",
                "Jagung Nyumi merupakan pelopor jajanan jagung susu keju pertama yang menggunakan keju mozarilla. Jagung Nyumi ini memiliki varian mozarilla maupun non mozarilla, dengan berbagai toping yang ada membuat jajanan ini semakin banyak digemari. Harganya mulai dari 9 ribu saja. Jajanan ini dapat didapatkan di eras Wasabi Gayungsari Timur\n" +
                        "jln. Gayungsari Timur Blok MGO 01 Gayungan Surabaya."

            )
        )
        rvList.add(
            data(
                R.drawable.roti,
                "Ohayou!",
                "Ohayou! merupakan produk makanan yang menjadikan roti bercita rasa susu hokkaido serta berisi keju mozarella hokkaido khas Jepang sebagai menu utamanya. Harganya berkisar mulai dari 15 ribu saja. Outlet yang tersedia di Surabaya salah satunya yaitu di Pakuwon Mall Surabaya. "
            )
        )
        rvList.add(
            data(
                R.drawable.force,
                "Fore Coffee",
                "Fore Coffee, salah satu coffee shop kekinian yang lagi berkembang dan memiliki banyak outlet di Surabaya. Harga yang dibandrol mulai dari 20 ribuan. Salah satu outlet yang tersedia di Surabaya yaitu di Pakuwon Mall, Lantai 2, Food Society Jl. Puncak Indah Lontar No. 2, Wiyung, Surabaya. "
            )
        )
        rvList.add(
            data(
                R.drawable.street,
                "Street Boba",
                "Street Boba juga salah satu minuman boba yang terkenal. Harga yang di pasang mulai dari 20 ribuan. Street Boba punya tujuh menu lezat dengan varian topping. Topping yang dihadirkan bukan hanya boba, melainkan ada grass jelly yang kenyal. Menu yang dihadirkan di Street Boba antara lain Shibuya Fresh Milk, Harajuku Milk Tea, Namba Kawaiipon, Hokkaido Choco, Tokyo Locama, Osaka Saida, dan Kyoto Tiramioishii. Salah satu cabang yang ada di Surabaya yaitu di Jl. Tunjungan No 82A (sebrang Hotel Majapahit), Surabaya"
            )
        )
        rvList.add(
            data(
                R.drawable.yogurt,
                "Yougurtland",
                "Yougurtland merupakan brand yougurt ternama. Disajikan dari hasil olahan Yogurt diproses dari susu sapi terbaik di Dunia, yang memiliki keaslian rasa dari Yogurt tersebut. Berbagai macam toping dihadirkan dari saus hingga buah buahan segar, termasuk granola, chocolate bites, cookies dan jelly sebagai tambahan bahan topping untuk frozen yogurt. Cabangnya di Surabaya dapat ditemukan di di Pakuwon Trade Center (PTC) dan East Coast Center 2 (ECC 2). Harganya berkisar mulai dari 28 ribu."
            )
        )
        return rvList
    }
}
