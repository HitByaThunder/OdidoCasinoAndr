package nl.odido.odidocasino

import android.os.Bundle
import android.os.Handler
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import kotlin.random.Random
import android.graphics.Matrix


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [freespin.newInstance] factory method to
 * create an instance of this fragment.
 */
class freespin : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_freespin, container, false)

        view.findViewById<Button>(R.id.draai).setOnClickListener(){
            val min = 3
            val max = 6





            var matrix: Matrix =  Matrix();
            var img =  view.findViewById<ImageView>(R.id.wheel)

            var rotate = 0F
            var sec = Random.nextInt(min, max)

            fun rotateWheel() {
                val handler = Handler()
                handler.postDelayed({
                    rotate += 90F
                    sec -= 1
                    if (rotate == 360f) {
                        rotate = 0F
                    }
                    view.findViewById<ImageView>(R.id.wheel).rotation = rotate

                    if (sec > 0) {
                        rotateWheel() // Schedule the next rotation
                    }
                }, 1000)
            }

// Call the function to start the rotation
            rotateWheel()











        }

        return view
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment freespin.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            freespin().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}