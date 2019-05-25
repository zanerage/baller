package mario.antolovic.baller.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_league.*
import mario.antolovic.baller.Utilities.EXTRA_LEAGUE
import mario.antolovic.baller.R

class LeagueActivity : BaseActivity() {

    var selectedLeague = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }

    fun mensClicked (view:View) {
         womensButton.isChecked = false
        coedButton.isChecked = false
        selectedLeague = "mens"
    }
     fun womensClicked (view: View){
      mensBtn.isChecked = false
         coedButton.isChecked = false
         selectedLeague = "womens"
     }
    fun coedClicked (view: View) {
        mensBtn.isChecked = false
        womensButton.isChecked= false
        selectedLeague = "co-ed"

    }
    fun leagueNextClicked(view:View) {
        if (selectedLeague != "") {
            val skillsActivity = Intent(this, SkillsActivity::class.java)
            skillsActivity.putExtra(EXTRA_LEAGUE, selectedLeague)
            startActivity(skillsActivity)
        } else {
            Toast.makeText(this,"Please select a league.",Toast.LENGTH_SHORT).show()
        }

    }



}
