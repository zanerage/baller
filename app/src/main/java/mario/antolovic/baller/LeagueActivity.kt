package mario.antolovic.baller

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class LeagueActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }

    fun leagueNextClicked(view:View) {
        val skillsActivity = Intent(this,SkillsActivity::class.java)
        startActivity(skillsActivity)
    }

}
