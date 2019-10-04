package es.vanadis.test1

import android.util.Log
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import es.vanadis.test1.model.Enemigo
import kotlinx.android.synthetic.main.enemy_row.view.*

class EnemiesHolder(v: View) : RecyclerView.ViewHolder(v) {
    private var view: View = v
    private var item: Enemigo? = null
    private lateinit var listener: (Enemigo) -> Unit

    init {
        v.setOnClickListener {
            item?.let {
                Log.d("Product Clicked:","$it")
                listener(it)
            }
        }
    }

    fun bind(item: Enemigo, listener: (Enemigo) -> Unit) {
        this.item = item
        this.listener = listener

        view.textView.text = item.nombre
        view.textView2.text = item.edad
    }

}