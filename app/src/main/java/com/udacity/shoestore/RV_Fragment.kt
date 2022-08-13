package com.udacity.shoestore

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import com.udacity.shoestore.R.color
import com.udacity.shoestore.models.AppF_ActivityViewModel

class RV_Fragment : Fragment() {

    lateinit  var appF_ActivityViewModel:AppF_ActivityViewModel
    lateinit var linear:LinearLayout



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        appF_ActivityViewModel= ViewModelProviders.of(this).get(AppF_ActivityViewModel::class.java)

        return inflater.inflate(R.layout.fragment_r_v_, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        linear=view.findViewById(R.id.LinearLayout)
    //    Log.i("Hello","Shoe was called")

        var btn :Button =view.findViewById(R.id.hbd)
        btn.setOnClickListener {
        }
    }


    fun CreatTextView(name:String){
        val valueTV = TextView(context)
        valueTV.text = "Name"
        valueTV.id = 5
        valueTV.setTextColor(color.purple_200)
        valueTV.textSize= 39.0f
        valueTV.layoutParams = LinearLayout.LayoutParams(
            LinearLayout.LayoutParams.MATCH_PARENT,
            LinearLayout.LayoutParams.WRAP_CONTENT
        )
        (linear ).addView(valueTV)
    }




}