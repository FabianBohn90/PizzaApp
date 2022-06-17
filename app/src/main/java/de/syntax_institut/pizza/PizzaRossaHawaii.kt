package de.syntax_institut.pizza

import android.widget.ImageView
import android.widget.TextView

class PizzaRossaHawaii(
    mehl: String,
    wasser: String,
    hefe: String,
    tomatensosze: String,
    val schinken: String,
    val annanas: String
) : PizzaRossa(mehl, wasser, hefe, tomatensosze) {

    override fun bake(imageView: ImageView) {
        imageView.setImageResource(R.drawable.pizza_rossa_hawaii)
    }

    override fun ingredients(zeile1: TextView, zeile2: TextView, zeile3: TextView) {
        super.ingredients(zeile1, zeile2, zeile3)
        val zutaten3 = "$schinken $annanas"
        zeile2.text = tomatensosze
        zeile3.text = zutaten3
    }
}