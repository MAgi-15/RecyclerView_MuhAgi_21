package com.example.recyclerview_muhagi_21

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    companion object{
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val superheroList = listOf<Superhero>(
            Superhero(
                R.drawable.antmen,
                "Ant-Man",
                "lorem lipsum lorem lipsum"
            ),
            Superhero(
                R.drawable.captain,
                "Captain-America",
                "lorem lipsum lorem lipsum"
            ),
            Superhero(
                R.drawable.hulk,
                "Hulk",
                "lorem lipsum lorem lipsum"
            ),
            Superhero(
                R.drawable.marvel,
                "Captain-Marvel",
                "lorem lipsum lorem lipsum"
            ),
            Superhero(
                R.drawable.nubela,
                "Nubela",
                "lorem lipsum lorem lipsum"
            ),
            Superhero(
                R.drawable.gemora,
                "Gemora",
                "lorem lipsum lorem lipsum"
            ),
            Superhero(
                R.drawable.hawkeye,
                "Hawkeye",
                "lorem lipsum lorem lipsum"
            ),
            Superhero(
                R.drawable.ironman,
                "Iron-Man",
                "lorem lipsum lorem lipsum"
            ),
            Superhero(
                R.drawable.loki,
                "Loki",
                "lorem lipsum lorem lipsum"
            ),
            Superhero(
                R.drawable.panther,
                "Panther",
                "lorem lipsum lorem lipsum"
            ),
            Superhero(
                R.drawable.spiderman,
                "Spider-Man",
                "lorem lipsum lorem lipsum"
            )
        )
        val reyciclerView = findViewById<RecyclerView>(R.id.rv_hero)
        reyciclerView.layoutManager = LinearLayoutManager(this)
        reyciclerView.setHasFixedSize(true)
        reyciclerView.adapter = SuperheroAdapter(this, superheroList) {

            val intent = Intent (this, DetailSuperheroActivity::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)

        }
    }
}