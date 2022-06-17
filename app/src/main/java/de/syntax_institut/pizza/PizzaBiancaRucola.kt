package de.syntax_institut.pizza

import android.widget.ImageView
import android.widget.TextView

class PizzaBiancaRucola(
    mehl: String,
    wasser: String,
    hefe: String,
    ricotta: String,
    val rucola: String,
) : PizzaBianca(mehl, wasser, hefe, ricotta) {

    override fun bake(imageView: ImageView) {
        imageView.setImageResource(R.drawable.pizza_bianca_rucola)
    }

    override fun ingredients(zeile1: TextView, zeile2: TextView, zeile3: TextView) {
        super.ingredients(zeile1, zeile2, zeile3)
        zeile2.text = ricotta
        zeile3.text = rucola
    }
}