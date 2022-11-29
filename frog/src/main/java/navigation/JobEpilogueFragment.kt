package navigation

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_job_epilogue.*
import kr.co.ky.kozoltime.R
import kr.co.ky.office.OfficeActivity

class JobEpilogueFragment : Fragment(){
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var view = LayoutInflater.from(activity).inflate(R.layout.fragment_job_epilogue,container,false)
        return view


    }

    override fun onStart() {
        super.onStart()

        office_btn.setOnClickListener{
            val intent = Intent(activity, OfficeActivity::class.java)
            startActivity(intent)
        }
    }
}