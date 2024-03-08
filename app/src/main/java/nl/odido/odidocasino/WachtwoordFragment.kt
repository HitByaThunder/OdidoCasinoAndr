package nl.odido.odidocasino

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation

class WachtwoordFragment : Fragment() {

    companion object {
        fun newInstance() = WachtwoordFragment()
    }

    private lateinit var viewModel: WachtwoordViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_spellen, container, false)

        view.findViewById<Button>(R.id.gratis_spin_knop).setOnClickListener() {
            Navigation.findNavController(view).navigate(R.id.ply_freespin)
        }
        view.findViewById<Button>(R.id.settingsbttn).setOnClickListener() {
            Navigation.findNavController(view).navigate(R.id.instelling)
        }
        view.findViewById<Button>(R.id.poker_spelen).setOnClickListener() {
            Navigation.findNavController(view).navigate(R.id.naarPoker)
        }

        return view
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(WachtwoordViewModel::class.java)
        // TODO: Use the ViewModel
    }

}