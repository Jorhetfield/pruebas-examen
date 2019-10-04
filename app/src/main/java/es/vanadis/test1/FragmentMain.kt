package es.vanadis.test1

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import es.vanadis.test1.model.Enemigo
import kotlinx.android.synthetic.main.fragment_fragment_main.*

class FragmentMain : Fragment() {
    private var enemies: MutableList<Enemigo> = mutableListOf()
    lateinit var enemy: Enemigo
    private lateinit var enemiesAdapter: EnemiesAdapter
    var nombre: String = ""
    var edad: String = ""
    var ofensa: String = ""

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_fragment_main, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)





        addEnemy.setOnClickListener {
            Toast.makeText(context, "aniadir", Toast.LENGTH_SHORT).show()
            nombre = name.text.toString()
            edad = age.text.toString()
            ofensa = offense.text.toString()
            enemy = Enemigo(nombre, edad, ofensa)
            enemies.add(enemy)
            enemiesAdapter.notifyDataSetChanged()

            Log.d("textos", "$nombre $edad $ofensa ${enemies.size}")
//            view.findNavController().navigate(R.id.action_fragmentMain2_to_fragmentUers2)
        }

        val linearLayoutManager = LinearLayoutManager(context)
        recyclerView.layoutManager = linearLayoutManager
        enemiesAdapter = EnemiesAdapter(
            enemies
        ){
            view.apply {
                setOnClickListener{
                    Toast.makeText(context,"kkkkkkkk",Toast.LENGTH_SHORT).show()
                }
            }
        }


        recyclerView.adapter = enemiesAdapter





    }

}
