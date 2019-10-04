package es.vanadis.test1

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import es.vanadis.test1.model.Enemigo

class EnemiesAdapter(
    private val items: MutableList<Enemigo>,
    private val listener: (Enemigo) -> Unit
) : RecyclerView.Adapter<EnemiesHolder>() {

    override fun onBindViewHolder(
        enemiesHolder: EnemiesHolder,
        position: Int
    ) {
        items[position].apply { enemiesHolder.bind(this) { listener(it) } }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EnemiesHolder {
        val inflatedView = parent.inflate(R.layout.enemy_row, false)

        return EnemiesHolder(inflatedView)
    }

    override fun getItemCount(): Int = items.size



}


