package com.example.edittext_view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment

@Suppress("DEPRECATION")
class ShowData:Fragment() {
    private var rootView: View? = null
    private var name: TextView? = null
    private var password: TextView? = null
    private var email: TextView? = null
    private var contact: TextView? = null
    private var country : TextView? = null
    private var dataEntered1: String? = null
    private var dataEntered2: String? = null
    private var dataEntered3: String? = null
    private var dataEntered4: String? = null
    private var dataEntered5: String? = null
    private var fragmentActionListener: FragmentActionListener? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        rootView = inflater.inflate(R.layout.fragment_show, container, false)
        initUI()
        return rootView
    }
    private fun initUI(){
        name = rootView?.findViewById(R.id.textView1) as TextView
        password =rootView?.findViewById(R.id.textView2) as TextView
        email =rootView?.findViewById(R.id.textView3) as TextView
        contact = rootView?.findViewById(R.id.textView4) as TextView
        country = rootView?.findViewById(R.id.textView5) as TextView
    }
    fun setFragmentActionListener(fragmentActionListener: FragmentActionListener?) {
        this.fragmentActionListener = fragmentActionListener
    }
    @Deprecated("Deprecated in Java")
    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        dataEntered1 = fragmentActionListener?.getName()
        dataEntered2 = fragmentActionListener?.getPassword()
        dataEntered3 = fragmentActionListener?.getEmail()
        dataEntered4 = fragmentActionListener?.getCountry()
        dataEntered5 = fragmentActionListener?.getMobileNo()
    }
    override fun onResume() {
        super.onResume()
        name?.text = "dataEntered1"
        password?.text = "dataEntered2"
        email?.text = "dataEntered3"
        contact?.text ="dataEntered5"
        country?.text = "dataEntered4"
    }
}