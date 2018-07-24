package com.example.yuka.countrybook


import android.app.Activity
import android.content.Intent
import android.content.res.Configuration
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.GridLayout


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 *
 */
class MainFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
//        activity is nullable
        val gridLayout = activity!!.findViewById<GridLayout>(R.id.country_id)
        for (i in 0 until gridLayout.childCount){
            val imageBtn = gridLayout.getChildAt(i)
            imageBtn.setOnClickListener { view ->

                if(resources.configuration.orientation == Configuration.ORIENTATION_PORTRAIT){
                    val intent = Intent(activity, DetailsActivity::class.java)
                    intent.putExtra("name", imageBtn.tag.toString())
                    startActivity(intent)

                } else {
                    val detailFrag = activity!!.supportFragmentManager.findFragmentById(R.id.detail_fragment) as DetailsFragment
                    detailFrag.setDetails(imageBtn.tag.toString())

                }


            }
        }
    }


}
