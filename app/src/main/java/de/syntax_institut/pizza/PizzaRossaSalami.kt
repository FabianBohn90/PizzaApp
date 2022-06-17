package de.syntax_institut.pizza

import android.widget.ImageView
import android.widget.TextView

class PizzaRossaSalami(
    mehl: String,
    wasser: String,
    hefe: String,
    tomatensosze: String,
    val salami: String,
) : PizzaRossa(mehl, wasser, hefe, tomatensosze) {

    override fun bake(imageView: ImageView) {
        imageView.setImageResource(R.drawable.pizza_rossa_salami)
    }

    override fun ingredients(zeile1: TextView, zeile2: TextView, zeile3: TextView) {
        super.ingredients(zeile1, zeile2, zeile3)
        zeile2.text = tomatensosze
        zeile3.text = salami
    }
}