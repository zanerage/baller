package mario.antolovic.baller.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_league.*
import mario.antolovic.baller.Model.Player
import mario.antolovic.baller.R
import mario.antolovic.baller.Utilities.EXTRA_PLAYER

class LeagueActivity : BaseActivity() {


    var player = Player("","")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }

    fun mensClicked (view:View) {
         womensButton.isChecked = false
        coedButton.isChecked = false
        player.league = "mens"
    }
     fun womensClicked (view: View){
      mensBtn.isChecked = false
         coedButton.isChecked = false
         player.league = "womens"
     }
    fun coedClicked (view: View) {
        mensBtn.isChecked = false
        womensButton.isChecked= false
        player.league = "co-ed"

    }
    fun leagueNextClicked(view:View) {
        if (player.league != "") {
            val skillsActivity = Intent(this, SkillsActivity::class.java)
            skillsActivity.putExtra(EXTRA_PLAYER,player)
            startActivity(skillsActivity)
        } else {
            Toast.makeText(this,"Please select a league.",Toast.LENGTH_SHORT).show()
        }

    }



}
