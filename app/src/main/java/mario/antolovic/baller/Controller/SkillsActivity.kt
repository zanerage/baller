package mario.antolovic.baller.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_skills.*
import mario.antolovic.baller.Utilities.EXTRA_LEAGUE
import mario.antolovic.baller.R
import mario.antolovic.baller.Utilities.EXTRA_SKILL

class SkillsActivity : BaseActivity() {
     var league = ""
    var skill = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skills)
        league = intent.getStringExtra(EXTRA_LEAGUE)

        }
    fun beginerClicked (view:View) {
        baller_button.isChecked = false
        skill = "beginner"
    }
    fun ballerClicked (view:View) {
        beg_button.isChecked = false
        skill = "baller"

    }

    fun skillClicked (view:View) {
        if (skill != "") {
            val finishActivity = Intent(this,FinalActivity::class.java)
            finishActivity.putExtra(EXTRA_LEAGUE,league)
            finishActivity.putExtra(EXTRA_SKILL,skill)
            startActivity(finishActivity)
        } else {
            Toast.makeText(this,"Please select a skill level",Toast.LENGTH_SHORT).show()
        }

    }

}
