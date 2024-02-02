package nl.odido.odidocasino

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button

class WachtwoordFragment : Fragment() {

    companion object {
        fun newInstance() = WachtwoordFragment()
    }

    private lateinit var viewModel: WachtwoordViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_spellen, container, false)
    }


    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(WachtwoordViewModel::class.java)
        // TODO: Maak buttons work
    }
}